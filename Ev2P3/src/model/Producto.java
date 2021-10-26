package model;

public class Producto {
	private int id;
	private String Nombre_Producto;
	private float valor;

	public Producto() {

	}

	public Producto(int id, String Nombre_Producto, float valor) {
		this.id = id;
		this.Nombre_Producto = Nombre_Producto;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_Producto() {
		return Nombre_Producto;
	}

	public void setCliente(String Nombre_Producto) {
		this.Nombre_Producto = Nombre_Producto;
	}
	
	public float getvalor() {
		return valor;
	}

	public void setvalor(float valor) {
		this.valor = valor;
	}	
}
