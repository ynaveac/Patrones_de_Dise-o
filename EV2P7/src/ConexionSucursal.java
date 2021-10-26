
public class ConexionSucursal implements IConexion{

	@Override
	public void conectar() {
		System.out.println("Conexión Establecida en Sucursal");
	}
	
	@Override
	public void desconectar() {
		System.out.println("Conexión Interrumpida en Sucursal");
	}
	
}
