package proxy2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextField;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UsuarioProxy implements IUsuario{

    private IUsuario UsuarioAcceso;
    private final static Logger LOGGER = Logger.getLogger(UsuarioProxy.class.getName());
	public int fa=0;
	public int emp=0;

    public UsuarioProxy(IUsuario usuario) {
        this.UsuarioAcceso = usuario;
        
    }

    @Override
    public Usuario validarAcceso(String api){

    	
        LOGGER.info("============= Acceso de VAlidacion hacia la API : " + api + " ============= ");
       
        
        HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

		//ArrayList<Post> model = new ArrayList<Post>();	
			
			final HttpRequest requestPosts = HttpRequest.newBuilder().GET().uri(URI.create("https://examenpatrones3-default-rtdb.firebaseio.com/SCex.json")).build();
				
			try {
				final HttpResponse<String> response = httpClient.send(requestPosts, HttpResponse.BodyHandlers.ofString());
				
				List<Post_proxy> posts = convertirObjeto(response.body(), new TypeReference<List<Post_proxy>>() {} );
			
				
				posts.stream().forEach(item -> {
					//System.out.println(item.getExclusion());
					
					String Valor = item.getExclusion();
					
					if (Valor.equals("FFAA")) {
						fa = fa + Integer.parseInt(item.getPension());
					}
					
					if (Valor.equals("Empleado")) {
						emp = emp + Integer.parseInt(item.getPension());
					}

				});	
				
				
			
				System.out.println("FFAA :" + fa);
				System.out.println("Empleados : " + emp);

				
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				Logger.getLogger(UsuarioProxy.class.getName()).log(Level.SEVERE, null, e);
			}
			
        api = String.valueOf(fa);
        return UsuarioAcceso.validarAcceso(api);
        //return null;

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
