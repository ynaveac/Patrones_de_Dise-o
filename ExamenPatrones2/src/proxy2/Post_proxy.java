package proxy2;

import java.io.Serializable;
import java.util.ArrayList;


public class Post_proxy implements Serializable{
	
	private String afp;
	private String apellido;
	private String edad;
	private String exclusion;
	private String nombre;
	private String pension;
	private String contribucion;
	
	public Post_proxy() {
		
	}

	
	
	
	@Override
	public String toString() {
		return "Post [afp=" + afp + ", apellido=" + apellido + ", edad=" + edad + ", exclusion=" + exclusion
				+ ", nombre=" + nombre + ", pension=" + pension + "]";
	}




	public String getContribucion() {
		return contribucion;
	}




	public void setContribucion(String contribucion) {
		this.contribucion = contribucion;
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

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getExclusion() {
		return exclusion;
	}

	public void setExclusion(String exclusion) {
		this.exclusion = exclusion;
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
