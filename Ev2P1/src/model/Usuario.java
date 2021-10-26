package model;

public class Usuario {
	private String email;
	private String clave;
	
    public Usuario(String email, String clave) {
        this.email = email;
        this.clave = clave;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getclave() {
        return clave;
    }

    public void setclave(String clave) {
        this.clave = clave;
    }

 
}