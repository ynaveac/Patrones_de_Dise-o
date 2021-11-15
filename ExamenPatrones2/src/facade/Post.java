package facade;

import java.io.Serializable;
import java.util.ArrayList;


public class Post implements Serializable{
	
	private String afp;
	private String apellido;
	private String contribucion;
	private String edad;
	private String nombre;
	private String pension;
	
	
	
	
	public Post(String afp, String apellido, String contribucion, String edad, String nombre, String pension) {
		super();
		this.afp = afp;
		this.apellido = apellido;
		this.contribucion = contribucion;
		this.edad = edad;
		this.nombre = nombre;
		this.pension = pension;
	}
	
	public Post() {
		
	}
	
	@Override
	public String toString() {
		return "Post [afp=" + afp + ", apellido=" + apellido + ", contribucion=" + contribucion + ", edad=" + edad
				+ ", nombre=" + nombre + ", pension=" + pension + "]";
	}

	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		this.afp = afp;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getContribucion() {
		return contribucion;
	}
	public void setContribucion(String contribucion) {
		this.contribucion = contribucion;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPension() {
		return pension;
	}
	public void setPension(String pension) {
		this.pension = pension;
	}


	
	
}
