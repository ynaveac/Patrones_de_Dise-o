package inter.impl;

import inter.IUsuario;
import model.Usuario;

public class UsuarioAImpl implements IUsuario{
	
    @Override
    public  Usuario validarAcceso(String email, String clave){
    	
        Usuario user = new Usuario("yonathan@iplacex.cl", "1234");
        
        //System.out.println(email);

        if (email == user.getemail() && clave == user.getclave()) {
        	
            return user;
            
        } else {
        	
        	user = null;
        	return user;
            
        }
		
    }

}
