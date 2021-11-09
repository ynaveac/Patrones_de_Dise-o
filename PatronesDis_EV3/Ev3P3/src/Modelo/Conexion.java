package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {
	Connection con;
	public Connection getConnection() {
		
		String url = "jdbc:mysql://localhost:3306/eva3";
		String user = "root";
		String pass = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, pass);
			
			JOptionPane.showMessageDialog(null, "Conexión Establecida en Oficina ");
			
		} catch (ClassNotFoundException e) {

			JOptionPane.showMessageDialog(null, " Error al cargar el controlador ");
			e.printStackTrace();
			
		}catch (SQLException e) {

			JOptionPane.showMessageDialog(null, " Error en la conexión ");
			e.printStackTrace();
		}
		
		return con; 
	}
}
