package decorador;

import interf.IProducto;
import model.Producto;

public class AdicionalPromocion extends ProductoDecorador{

	private float valor = 5990;
	private float subtotal;
	private float descuento = 10;
	private float total;
	
	public AdicionalPromocion(IProducto productoDecorada) {
		super(productoDecorada);
	}
	
	@Override
	public void comprarProducto(Producto p) {
		productoDecorada.comprarProducto(p);
		agregarAdicional(p);
	}
	
	public void agregarAdicional(Producto p) {
		subtotal = p.getvalor() + valor;
		total = subtotal - (subtotal * (descuento/100)) ; 
		System.out.println("========== Producto Adicional =============");
		System.out.println("A incorporado un : Mouse ");
		System.out.println("Valor : " + valor);
		System.out.println("Subtotal de la Compra : " + subtotal);
		System.out.println("===========================================");
		System.out.println("Se aplicara un descuento Promocional del " + descuento + "%");
		System.out.println("Valor del Descuento : " + (subtotal * (descuento/100)));
		System.out.println("Total a Pagar " + total);
	}

}
