import java.util.ArrayList;
import java.util.List;

public class Despacho {

	private List<Observador> observadores = new ArrayList<Observador>();
	private int estado;
	
	public int getEstado(){
		return estado;
	}
	
	public void setEstado(int estado) {
		this.estado = estado;
		if(estado == 1) {
			notificarSistemas();
		}
	}
	
	public void agregar(Observador observador) {
		observadores.add(observador);
	}
	
	public void notificarSistemas() {
		for (Observador observador : observadores) {
			observador.actualizar();
		}
	}
	
}
