package proxy2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Excluidos extends JFrame {

	private static final char[] fa = null;
	private JPanel contentPane;
	public JTextField textFieldFFAA;
	public JTextField textFieldEmpleados;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Excluidos frame = new Excluidos();
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
	public Excluidos() {
		
        IUsuario usuarioProxy = new UsuarioProxy( new UsuarioAImpl());        
        Usuario user = usuarioProxy.validarAcceso("Scex");
		
        //Excluidos ex = new Excluidos();
        
        System.out.println(user);
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Excluidos");
		lblNewLabel.setBounds(258, 6, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pensiones FFAA");
		lblNewLabel_1.setBounds(128, 55, 114, 16);
		contentPane.add(lblNewLabel_1);
		
		textFieldFFAA = new JTextField();
		textFieldFFAA.setBounds(274, 55, 130, 26);
		contentPane.add(textFieldFFAA);
		textFieldFFAA.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pensiones Empleados");
		lblNewLabel_2.setBounds(128, 108, 144, 16);
		contentPane.add(lblNewLabel_2);
		
		textFieldEmpleados = new JTextField();
		textFieldEmpleados.setBounds(274, 103, 130, 26);
		contentPane.add(textFieldEmpleados);
		textFieldEmpleados.setColumns(10);
		
	
	}

}
