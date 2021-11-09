package interfaz;


import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion1rePiso implements IConexion{

	@Override
	public void conectar() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			DriverManager.getConnection("jdbc:mysql://localhost:3306/eva3", "root", "");
			
			System.out.println("Conexión Establecida en Oficina ");
			
			JOptionPane.showMessageDialog(null, "Conexión Establecida en Oficina ");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			JOptionPane.showMessageDialog(null, " Error al cargar el controlador ");
			e.printStackTrace();
			
		}catch (SQLException e) {
			System.out.println("Error en la conexión");
			JOptionPane.showMessageDialog(null, " Error en la conexión ");
			e.printStackTrace();
		}
	

	}
	
	@Override
	public void desconectar() {
		System.out.println("Conexión Interrumpida en Oficina");
		
		JOptionPane.showMessageDialog(null, "Conexión Interrumpida en Oficina");
	}
	
}
