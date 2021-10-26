
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Despacho despacho = new Despacho();
		
		new ObsSistema(despacho);
		
		System.out.println(" ============= Monitoreo de Despacho ==============");
		System.out.println("Cliente A tiene depacho para : 27/10/2021");
		System.out.println("Despacho aun no Disponible");
		despacho.setEstado(0);
		System.out.println("Cliente B tiene depacho para : 25/10/2021");
		System.out.println("Despacho aun no Disponible");
		despacho.setEstado(0);
		System.out.println("Cliente A tiene depacho para : 24/10/2021");
		System.out.println("Despacho Entregado");
		despacho.setEstado(1);
	}

}
