package proxy;

import java.util.logging.Logger;

import inter.IUsuario;
import inter.impl.UsuarioAImpl;
import model.Usuario;

public class UsuarioProxy implements IUsuario{

    private IUsuario UsuarioAcceso;
    private final static Logger LOGGER = Logger.getLogger(UsuarioProxy.class.getName());

    public UsuarioProxy(IUsuario usuario) {
        this.UsuarioAcceso = usuario;
    }

    @Override
    public Usuario validarAcceso(String email, String clave) {
        LOGGER.info("============= Acceso de VAlidacion para el usuario : " + email + " ============= ");
        UsuarioAcceso = new UsuarioAImpl();
        return UsuarioAcceso.validarAcceso(email, clave);

    }
	
}
