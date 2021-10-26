package api;

public class ComputadorAPI {

	private int ripley;
	private int falabella;
	private int lapolar;
	private int pcfactory;
	
	public void buscarComputador(String marca, String modelo) {
		System.out.println("============= Computadores =================");
		
		// valores simulados
		ripley = 15000;
		falabella = 23500;
		lapolar = 47000;
		pcfactory = 32500;
		
		// simular acceso a paginas o servicios externos
		System.out.println("Ripley : Computador " + marca + " de tipo " + modelo + " Valor $" + ripley);
		System.out.println("Falabella : Computador " + marca + " de tipo " + modelo + " Valor $" + falabella);
		System.out.println("La Polar : Computador " + marca + " de tipo " + modelo + " Valor $" + lapolar);
		System.out.println("PcFactory : Computador " + marca + " de tipo " + modelo + " Valor $" + pcfactory);
		
		System.out.println("============= Fin API Computadores =================");
	}
	
}
