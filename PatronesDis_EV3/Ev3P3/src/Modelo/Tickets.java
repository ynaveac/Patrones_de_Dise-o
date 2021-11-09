package Modelo;

public class Tickets {

	String tickets;
	String nombre;
	String oficina;
	
	public Tickets() {
		// TODO Auto-generated constructor stub
	}
	
	public Tickets(String tickets, String nombre) {
		this.tickets = tickets;
		this.nombre = nombre;
	}

	public String getTickets() {
		return tickets;
	}

	public void setTickets(String tickets) {
		this.tickets = tickets;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}	
	
}

