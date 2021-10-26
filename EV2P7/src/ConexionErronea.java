
public class ConexionErronea implements IConexion{

	@Override
	public void conectar() {
		System.out.println("Intento de conexion cancelado");
	}
	
	@Override
	public void desconectar() {
		System.out.println("---");
	}
	
}
