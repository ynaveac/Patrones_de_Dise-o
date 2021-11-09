package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio frame = new inicio();
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
	public inicio() {
		
		ConexionFabrica fabrica = new ConexionFabrica();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTituloPrincipal = new JLabel("Oficina de Atención al Cliente (OAC) ");
		lblTituloPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTituloPrincipal, BorderLayout.NORTH);
		
		JComboBox CBOficina = new JComboBox();
		CBOficina.setModel(new DefaultComboBoxModel(new String[] {"Seleccione Oficina", "Oficina 1re Piso", "Oficina 2do Piso"}));
		contentPane.add(CBOficina, BorderLayout.CENTER);
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String seleccion = "";
				int seleccion2 = 0;
				
				seleccion = (String) CBOficina.getSelectedItem();
				
				seleccion2 = CBOficina.getSelectedIndex();
							
				JOptionPane.showMessageDialog(null, " Esta Intentado realizar una Conexión a " + seleccion );
				
				switch (seleccion2) {
				case 1: {
					IConexion con1 = fabrica.getConexion("Oficina 1re Piso");
					con1.conectar();
				}
				case 2: {
					IConexion con2 = fabrica.getConexion("Oficina 2do Piso");
					con2.conectar();
				}				
				default:
					IConexion con3 = fabrica.getConexion("Seleccione Oficina");
					con3.conectar();
				}
				
				
			}
		});
		contentPane.add(btnConectar, BorderLayout.WEST);
		
		JButton btnDesconectar = new JButton("Desconectar");
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String seleccion = "";
				int seleccion2 = 0;
				
				seleccion = (String) CBOficina.getSelectedItem();
				
				seleccion2 = CBOficina.getSelectedIndex();
							
				JOptionPane.showMessageDialog(null, " Esta Intentado realizar una Desconexión a " + seleccion );
				
				switch (seleccion2) {
				case 1: {
					IConexion con1 = fabrica.getConexion("Oficina 1re Piso");
					con1.desconectar();
				}
				case 2: {
					IConexion con2 = fabrica.getConexion("Oficina 2do Piso");
					con2.desconectar();
				}				
				default:
					IConexion con3 = fabrica.getConexion("Seleccione Oficina");
					con3.desconectar();
				}			
				
			}
		});
		contentPane.add(btnDesconectar, BorderLayout.EAST);
	}

}
