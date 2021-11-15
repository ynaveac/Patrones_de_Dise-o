package factory;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import facade.Post;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Pensionados extends JFrame {

	private JPanel contentPane;
	private JTable tablePensionados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pensionados frame = new Pensionados();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pensionados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pensionados");
		lblNewLabel.setBounds(232, 21, 113, 16);
		contentPane.add(lblNewLabel);
		
		
		ConexionFabrica fabrica = new ConexionFabrica();
		
		IConexion con1 = fabrica.getConexion("Sipen");
		ArrayList<Post> resultado = con1.conectar();
		
		System.out.println(resultado.size());
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		modelo.addColumn("Edad");
		modelo.addColumn("Afp");
		modelo.addColumn("Pensión");
		
		for(int i=0; i<resultado.size(); i++) {
			//System.out.println(resultado.get(i).getContribucion());
			String[]p1 = { resultado.get(i).getNombre(), resultado.get(i).getApellido(), resultado.get(i).getEdad(), resultado.get(i).getAfp(), resultado.get(i).getPension() };
			modelo.addRow(p1);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(63, 49, 454, 160);
		contentPane.add(scrollPane);
		
		JTable tablePensionados=new JTable(modelo);
		scrollPane.setViewportView(tablePensionados);
		
		

		
	}
}
