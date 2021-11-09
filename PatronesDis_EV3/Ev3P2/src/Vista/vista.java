package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class vista {

	public JFrame frame;
	public JTextField textticket;
	public JTextField textnombre;
	public JButton btnInsertar;

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
		
		JLabel lblNewLabel_1 = new JLabel("Ticket");
		lblNewLabel_1.setBounds(76, 79, 53, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cliente Nombre");
		lblNewLabel_2.setBounds(76, 107, 140, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textticket = new JTextField();
		textticket.setBounds(224, 74, 130, 26);
		frame.getContentPane().add(textticket);
		textticket.setColumns(10);
		
		textnombre = new JTextField();
		textnombre.setBounds(224, 102, 130, 26);
		frame.getContentPane().add(textnombre);
		textnombre.setColumns(10);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setBounds(169, 169, 117, 29);
		frame.getContentPane().add(btnInsertar);
		
		
	}

}
