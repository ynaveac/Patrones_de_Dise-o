package proxy;

import java.util.logging.Logger;

public class UsuarioProxy implements IUsuario{

    private IUsuario UsuarioAcceso;
    private final static Logger LOGGER = Logger.getLogger(UsuarioProxy.class.getName());

    public UsuarioProxy(IUsuario usuario) {
        this.UsuarioAcceso = usuario;
    }

    @Override
    public Usuario validarAcceso(String usuario, String clave) {
        LOGGER.info("============= Acceso de VAlidacion para el usuario : " + usuario + " ============= ");
        UsuarioAcceso = new UsuarioAImpl();
        return UsuarioAcceso.validarAcceso(usuario, clave);

    }
	
}
