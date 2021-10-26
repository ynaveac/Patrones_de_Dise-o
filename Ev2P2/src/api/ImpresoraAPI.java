package api;

public class ImpresoraAPI {
	
	private int ripley;
	private int falabella;
	private int lapolar;
	private int pcfactory;
	
	public void buscarImpresoras(String marca, String modelo) {
		System.out.println("============= Impresoras =================");
		
		// valores simulados
		ripley = 5000;
		falabella = 3500;
		lapolar = 7000;
		pcfactory = 2500;
		
		// simular acceso a paginas o servicios externos
		System.out.println("Ripley : Impresora " + marca + " de tipo " + modelo + " Valor $" + ripley);
		System.out.println("Falabella : Impresora " + marca + " de tipo " + modelo + " Valor $" + falabella);
		System.out.println("La Polar : Impresora " + marca + " de tipo " + modelo + " Valor $" + lapolar);
		System.out.println("PcFactory : Impresora " + marca + " de tipo " + modelo + " Valor $" + pcfactory);
		
		System.out.println("============= Fin API Impresoras =================");
	}
}
