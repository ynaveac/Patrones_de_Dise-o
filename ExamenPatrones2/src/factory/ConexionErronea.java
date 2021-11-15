package factory;

public class ConexionErronea implements IConexion{

	@Override
	public void conectar() {
		System.out.println("Intento de conexion cancelado");
	}
	
	
}
