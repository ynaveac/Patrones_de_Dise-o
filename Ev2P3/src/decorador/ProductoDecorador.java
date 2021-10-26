package decorador;

import interf.IProducto;
import model.Producto;

public abstract class ProductoDecorador implements IProducto{

	protected IProducto productoDecorada;
	
	public ProductoDecorador(IProducto productoDecorada) {
		this.productoDecorada = productoDecorada;
	}
	
	@Override
	public void comprarProducto(Producto p) {
		this.productoDecorada.comprarProducto(p);
	}
	
}
