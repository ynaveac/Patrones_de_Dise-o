package factory;

public class ConexionFabrica {

	public IConexion getConexion(String api) {
		
		switch (api) {
		case "Sipen": {
			return new SipenAPI();
		}

		default:
			return new ConexionErronea();
		}
		
	}
	
}
