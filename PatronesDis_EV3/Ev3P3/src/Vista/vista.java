package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;


public class vista {

	public JFrame frame;
	public JButton btnListar;
	public JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vista window = new vista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Oficina de Atención al Cliente (OAC) ");
		lblTitulo.setBounds(100, 22, 270, 16);
		frame.getContentPane().add(lblTitulo);
		
		table = new JTable();
		table.setBounds(67, 92, 317, 155);
		frame.getContentPane().add(table);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(151, 51, 117, 29);
		frame.getContentPane().add(btnListar);
		
		
	}
}
