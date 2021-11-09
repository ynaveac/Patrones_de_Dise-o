package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TicketsDAO {
	Conexion conectar = new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	

	
	
	
	public int agregar(Tickets t) {
		
		String sql="insert into ticket (ticket, nombres, oficina) values (?, ?, ?)";
		
		try {
			
			con = conectar.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, t.getTickets());
			ps.setString(1, t.getNombre());
			ps.setString(1, t.getNombre());
			ps.setString(1, t.getOficina());
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return 1;
	}
	
}
