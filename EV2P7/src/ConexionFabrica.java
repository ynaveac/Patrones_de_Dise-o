
public class ConexionFabrica {

	public IConexion getConexion(String sucursal) {
		
		switch (sucursal) {
		case "Casa Matriz": {
			return new ConexionCasaMatriz();
		}
		case "Sucursal": {
			return new ConexionSucursal();
		}
		case "Nueva": {
			return new ConexionSucursalNueva();
		}
		default:
			return new ConexionErronea();
		}
		
	}
	
}
