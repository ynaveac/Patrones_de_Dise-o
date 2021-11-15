package proxy;

public class UsuarioAImpl implements IUsuario{
	
    @Override
    public  Usuario validarAcceso(String usuario, String clave){
    	
        Usuario user = new Usuario("Admin", "Admin");
        
        //System.out.println(usuario);
        //System.out.println(clave);
        
        if (usuario.equals(user.getusuario())  && clave.equals(user.getclave()) ) {
        	
            return user;
            
        } else {
        	
        	user = null;
        	return user;
            
        }
		
    }

}
