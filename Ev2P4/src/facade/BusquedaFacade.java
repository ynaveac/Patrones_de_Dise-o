package facade;

import api.*;
		
public class BusquedaFacade {

	private ProductosWS productosWS;
	
	public BusquedaFacade() {
		
		productosWS = new ProductosWS();
	}
	
	public void buscar(String marca, String modelo, String producto) {
		
		productosWS.buscarImpresoras(marca, modelo);
			
	}	
	
}
