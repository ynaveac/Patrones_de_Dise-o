package proxy;

public class Usuario {
	private String usuario;
	private String clave;
	
    public Usuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getusuario() {
        return usuario;
    }

    public void setusuario(String usuario) {
        this.usuario = usuario;
    }

    public String getclave() {
        return clave;
    }

    public void setclave(String clave) {
        this.clave = clave;
    }


 
}