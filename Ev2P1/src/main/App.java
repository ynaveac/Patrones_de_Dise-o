package main;

import inter.IUsuario;
import inter.impl.UsuarioAImpl;
import model.Usuario;
import proxy.UsuarioProxy;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        IUsuario usuarioProxy = new UsuarioProxy( new UsuarioAImpl());
        
        Usuario user = usuarioProxy.validarAcceso("yonathan@iplacex.cl", "123s4");
        
        
        //System.out.println(user.getemail());
        
       
        if (user != null) {
            System.out.println(" ============= Acceso al Sistema ===============");
            System.out.println(" Bienvenido Usuario : " + user.getemail());
        } else {
            System.out.println(" ============= Acceso al Sistema ===============");
            System.out.println(" Acceso Denegado ");
        }
		
	}

}
