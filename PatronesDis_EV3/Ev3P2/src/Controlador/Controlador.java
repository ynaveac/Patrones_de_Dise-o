package Controlador;

import Vista.vista;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Modelo.Tickets;
import Modelo.TicketsDAO;

public class Controlador  implements ActionListener{

	
	TicketsDAO dao = new TicketsDAO();
	Tickets t = new Tickets();
	vista vista = new vista();
	DefaultTableModel modelo = new DefaultTableModel();
	
	public Controlador(vista v) {
		this.vista = v;
		this.vista.btnInsertar.addActionListener(this);
	}
	

	public void agregar() {
		String tickets = vista.textnombre.getText();
		String nombre = vista.textnombre.getText();
		
		t.setTickets(tickets);
		t.setNombre(nombre);
		t.setOficina("1re Piso Atencion");
		int r = dao.agregar(t);
		
		if(r==1) {
			JOptionPane.showMessageDialog(null, "El Ticket Agregado");
		}else {
			JOptionPane.showMessageDialog(null, "Error");
		}
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
		if(e.getSource()==vista.btnInsertar) {
			JOptionPane.showMessageDialog(null, "boton insertar");
			agregar();
		}
		
	}


	
}
