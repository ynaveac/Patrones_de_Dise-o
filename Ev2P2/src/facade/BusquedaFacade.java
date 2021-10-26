package facade;

import api.*;
		
public class BusquedaFacade {

	private ComputadorAPI computadorAPI;
	private ImpresoraAPI impresoraAPI;
	
	public BusquedaFacade() {
		
		computadorAPI = new ComputadorAPI();
		impresoraAPI = new ImpresoraAPI();
	}
	
	public void buscar(String marca, String modelo, String producto) {
		
		switch(producto) 
		{
			case "Impresora":
				impresoraAPI.buscarImpresoras(marca, modelo);
				break;
			case "Computador":
				computadorAPI.buscarComputador(marca, modelo);
				break;
			default:
				System.out.println("============= Resultado =================");
				System.out.println("Producto no encontrado : " + marca + " - " + modelo + " - " + producto);				
				System.out.println("============= Fin API Resultado =================");				
		}
		
			
			
			
	}	
	
}
