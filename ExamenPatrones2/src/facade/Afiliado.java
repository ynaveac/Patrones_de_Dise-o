package facade;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Afiliado extends JFrame {

	public JPanel contentPane;
	public JTable tablaAfiliado; 
	public JTextField textFieldcontribuciones;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Afiliado frame = new Afiliado();
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
	public Afiliado() {
		int contribuciones = 0;
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		BusquedaFacade api = new BusquedaFacade();			

		ArrayList<Post> resultado = api.buscar("Slafi");
		
		System.out.println(resultado.size());
						
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		modelo.addColumn("Edad");
		modelo.addColumn("Afp");
		modelo.addColumn("Contrigución");
		modelo.addColumn("Pensión");	
		
		//String[]p1 = resultado;
		
		for(int i=0; i<resultado.size(); i++) {
			//System.out.println(resultado.get(i).getContribucion());
			String[]p1 = { resultado.get(i).getNombre(), resultado.get(i).getApellido(), resultado.get(i).getEdad(), resultado.get(i).getAfp(), resultado.get(i).getContribucion(), resultado.get(i).getPension() };
			modelo.addRow(p1);
			contribuciones = contribuciones + Integer.parseInt(resultado.get(i).getContribucion());
		}
		
		setSize(443,326);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 31, 357, 160);
		contentPane.add(scrollPane);
		
		
		JTable tablaAfiliado=new JTable(modelo);
		scrollPane.setViewportView(tablaAfiliado);
		
		JLabel lblNewLabel = new JLabel("Total Contribuciones :");
		lblNewLabel.setBounds(69, 231, 170, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Afiliados");
		lblNewLabel_1.setBounds(176, 3, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		textFieldcontribuciones = new JTextField();
		textFieldcontribuciones.setBounds(220, 226, 130, 26);
		contentPane.add(textFieldcontribuciones);
		textFieldcontribuciones.setColumns(10);
		setVisible(true);
		
		textFieldcontribuciones.setText(Integer.toString(contribuciones));
		
		
	}
}
