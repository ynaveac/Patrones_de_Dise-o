package api;

public class ProductosWS {

	private int stock;
	
	public void buscarImpresoras(String marca, String modelo) {
		System.out.println("============= Producto Buscado =================");
		
		// valores simulados

		stock = (int) (Math.random()*6);
		
		// simular acceso a paginas o servicios externos
		System.out.println("Producto : " + marca + " de tipo " + modelo + " Stock :" + stock);	
		System.out.println("============= Fin WS Producto =================");
	}
}
