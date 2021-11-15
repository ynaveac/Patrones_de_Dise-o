import facade.*;
import factory.Pensionados;
import proxy2.Excluidos;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();	
					
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 233);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("PreOnline");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("|");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Afiliado");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Total Contribuciones");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Afiliado af = new Afiliado();
				af.setLocationRelativeTo(null); 
				af.setVisible(true);
				
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_3 = new JMenu("|");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Pensionados");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Listado");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pensionados af = new Pensionados();
				af.setLocationRelativeTo(null); 
				af.setVisible(true);				
				
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_5 = new JMenu("|");
		menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("Excluidos");
		menuBar.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Suma");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Excluidos ex = new Excluidos();
				ex.setLocationRelativeTo(null); 
				ex.setVisible(true);	
				
			}
		});
		mnNewMenu_6.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Segmento de Menu");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(151, 64, 186, 16);
		contentPane.add(lblNewLabel);
	}

}
