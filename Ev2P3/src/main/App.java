package main;

import decorador.AdicionalPromocion;
import interf.IProducto;
import interf.impl.CompraProducto;
import model.Producto;

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto p = new Producto(1, "Macbook", 1239900);
		
		IProducto producto = new CompraProducto();
		IProducto productoAdicionalPromocion = new AdicionalPromocion(producto);
		
		productoAdicionalPromocion.comprarProducto(p);
		
	}

}
