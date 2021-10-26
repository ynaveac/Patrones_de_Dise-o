
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConexionFabrica fabrica = new ConexionFabrica();
		
		IConexion con1 = fabrica.getConexion("Casa Matriz");
		con1.conectar();
		con1.desconectar();
		
		IConexion con2 = fabrica.getConexion("Sucursal");
		con2.conectar();
		con2.desconectar();
		
		IConexion con3 = fabrica.getConexion("Nueva");
		con3.conectar();
		con3.desconectar();
		
		IConexion con4 = fabrica.getConexion("Intruso");
		con4.conectar();
		con4.desconectar();
		
	}

}

