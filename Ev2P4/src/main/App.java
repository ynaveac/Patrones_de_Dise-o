package main;

import facade.BusquedaFacade;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusquedaFacade Producto1 = new BusquedaFacade();
		Producto1.buscar("Epson", "LASER", "Producto");
		
		BusquedaFacade Producto2 = new BusquedaFacade();
		Producto2.buscar("Mac", "Macbook Pro", "Producto");

	}

}
