package factory;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import facade.Post;
import facade.SlafiAPI;

public class SipenAPI implements IConexion{

	@Override
	public ArrayList<Post> conectar() {
		System.out.println("Conexión Establecida en Api Sipen");
		
		HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

		ArrayList<Post> model = new ArrayList<Post>();	
			
			final HttpRequest requestPosts = HttpRequest.newBuilder().GET().uri(URI.create("https://examenpatrones2-default-rtdb.firebaseio.com/Sipen.json")).build();
				
			try {
				final HttpResponse<String> response = httpClient.send(requestPosts, HttpResponse.BodyHandlers.ofString());
				
				List<Post> posts = convertirObjeto(response.body(), new TypeReference<List<Post>>() {} );
			
				
				posts.stream().forEach(item -> {
					
					Post data = new Post( item.getAfp(), item.getApellido(), item.getContribucion(), item.getEdad(),  item.getNombre(), item.getPension() );
					
					model.add(data);

				});	
				
				System.out.println(model);
				

				return model;
				
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				Logger.getLogger(SlafiAPI.class.getName()).log(Level.SEVERE, null, e);
			}
			
		return null;
	
	}
	
	final ObjectMapper mapper = new ObjectMapper();
	
	public <T> T convertirObjeto(final String json, final TypeReference<T> reference) {
		
		try {
			return this.mapper.readValue(json, reference);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

}
