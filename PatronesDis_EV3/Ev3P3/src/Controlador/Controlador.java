package Controlador;

import Vista.vista;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JTable;
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
		this.vista.btnListar.addActionListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
	}
	
	public void listar(JTable tabla);


	
}
