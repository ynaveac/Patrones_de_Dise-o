package interfaz;

import javax.swing.JOptionPane;

public class ConexionErronea implements IConexion{

	@Override
	public void conectar() {
		System.out.println("Intento de conexion cancelado");
		
		JOptionPane.showMessageDialog(null, "Conexión Cancelada en Oficina");
	}
	
	@Override
	public void desconectar() {
		System.out.println("---");
		
		JOptionPane.showMessageDialog(null, " --- ");
	}
	
}
