

public class ConexionCasaMatriz implements IConexion{

	@Override
	public void conectar() {
		System.out.println("Conexión Establecida en Casa Matriz");
	}
	
	@Override
	public void desconectar() {
		System.out.println("Conexión Interrumpida en Casa Matriz");
	}
}
