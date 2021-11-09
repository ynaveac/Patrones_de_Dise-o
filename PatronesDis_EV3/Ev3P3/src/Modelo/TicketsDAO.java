package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TicketsDAO {
	Conexion conectar = new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	

	public List listar() {
		List<Tickets>datos=new ArrayList<>();
		String sql="SELECT * from ticket;";
		try {
			con=conectar.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while (rs.next()) {
				Tickets t = new Tickets();
				
				t.setNombre(rs.getString("nombres"));
				t.setOficina(rs.getString("oficina"));
				t.setTickets(rs.getString("ticket"));
				datos.add(t);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return datos;
	}
	
}
