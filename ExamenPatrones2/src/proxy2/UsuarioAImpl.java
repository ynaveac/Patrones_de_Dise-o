package proxy2;

public class UsuarioAImpl implements IUsuario{
	
    @Override
    public  Usuario validarAcceso(String api){
    	
        Usuario user = new Usuario("SCex");
        
        if (api.equals(user.getapi()) ) {
        	
            return user;
            
        } else {
        	
        	user = null;
        	return user;
            
        }
		
    }

}
