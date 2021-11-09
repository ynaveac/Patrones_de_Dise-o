package interfaz;

public class ConexionFabrica {

	public IConexion getConexion(String oficina) {
		
		switch (oficina) {
		case "Oficina 1re Piso": {
			return new Conexion1rePiso();
		}

		default:
			return new ConexionErronea();
		}
		
	}
	
}
