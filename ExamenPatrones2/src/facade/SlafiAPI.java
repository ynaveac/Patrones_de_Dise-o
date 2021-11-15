package facade;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;



public class SlafiAPI {
	
	private HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

	public ArrayList<Post> model = new ArrayList<Post>();
	
	public ArrayList<Post> buscarAPI( String api ) {
		
		
		System.out.println("============= API SLAFI =================");
		
		final HttpRequest requestPosts = HttpRequest.newBuilder().GET().uri(URI.create("https://examenpatrones-b1d3b-default-rtdb.firebaseio.com/Slafi.json")).build();
			
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
