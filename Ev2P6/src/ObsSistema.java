
public class ObsSistema extends Observador{

	public ObsSistema(Despacho despacho) {
		this.despacho = despacho;
		this.despacho.agregar(this);
	}
	
	@Override
	public void actualizar() {
		System.out.println("Alerta Observe : Sistema Notificado.");
	}
	
}
