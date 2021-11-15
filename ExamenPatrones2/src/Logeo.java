import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import proxy.*;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Logeo extends JFrame {

	private JPanel contentPane;
	public JTextField textUsuario;
	public JPasswordField jpassClave;
	public JButton btnIngresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logeo frame = new Logeo();
					
					frame.setLocationRelativeTo(null);  
					
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
	public Logeo() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Inicio de Sesion");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(172, 25, 104, 31);
		contentPane.add(lblLogin);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(108, 92, 61, 16);
		contentPane.add(lblUsuario);
		
		JLabel lblClave = new JLabel("Clave");
		lblClave.setBounds(108, 121, 61, 16);
		contentPane.add(lblClave);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(194, 87, 130, 26);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		jpassClave = new JPasswordField();
		jpassClave.setBounds(194, 116, 130, 26);
		contentPane.add(jpassClave);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] clave = jpassClave.getPassword();
				String claveFinal = new String(clave);
				String usuarioFinal = textUsuario.getText();

				
				IUsuario usuarioProxy = new UsuarioProxy( new UsuarioAImpl());
				Usuario user = usuarioProxy.validarAcceso(usuarioFinal, claveFinal);
				
				
		        if (user != null) {
		            System.out.println(" ============= Acceso al Sistema ===============");
		            System.out.println(" Bienvenido Usuario : " + user.getusuario());
		            
		            JOptionPane.showMessageDialog(null, "Bienvenido al Sistema", "Preonline", JOptionPane.INFORMATION_MESSAGE);		            
		            dispose();		            
		            Principal p = new Principal();
		            p.setLocationRelativeTo(null); 
		            p.setVisible(true);
		            
		            
		        } else {
		            System.out.println(" ============= Acceso al Sistema ===============");
		            System.out.println(" Acceso Denegado ");
		            
		            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos", "Preonline", JOptionPane.ERROR_MESSAGE);
		            textUsuario.setText("");
		            jpassClave.setText("");
		            textUsuario.requestFocus();
		            
		        }
				
			}
		});
		btnIngresar.setBounds(159, 205, 117, 29);
		contentPane.add(btnIngresar);
	}
}
