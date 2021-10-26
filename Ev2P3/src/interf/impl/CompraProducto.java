package interf.impl;

import interf.IProducto;
import model.Producto;

public class CompraProducto implements IProducto{

	@Override
	public void comprarProducto(Producto p) {
		
		System.out.println("================ Compra Producto ================ ");
		System.out.println("Estimado Cliente, se encuentra realizando la siguiente compra ");
		System.out.println("Producto : " + p.getNombre_Producto() + " Valor : " + p.getvalor());
		
	}

}
