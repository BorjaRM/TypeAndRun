package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;

public class VentanaPalabra extends JFrame {

	private JPanel contentPane;
	private JTextField textJ1;
	private JTextField textJ2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPalabra frame = new VentanaPalabra();
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
	public VentanaPalabra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("4");
		panel.add(lblNewLabel_1);
		
		Box AreaJ1 = Box.createVerticalBox();
		contentPane.add(AreaJ1, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("Jugador 1");
		AreaJ1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		Component verticalStrut_2 = Box.createVerticalStrut(50);
		AreaJ1.add(verticalStrut_2);
		
		textJ1 = new JTextField();
		AreaJ1.add(textJ1);
		textJ1.setColumns(10);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		AreaJ1.add(verticalStrut);
		
		JLabel puntosJ1 = new JLabel("puntos");
		puntosJ1.setAlignmentX(Component.CENTER_ALIGNMENT);
		AreaJ1.add(puntosJ1);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		AreaJ1.add(verticalStrut_1);
		
		Box AreaJ2 = Box.createVerticalBox();
		contentPane.add(AreaJ2, BorderLayout.EAST);
		
		JLabel lblNewLabel_2 = new JLabel("Jugador 2");
		AreaJ2.add(lblNewLabel_2);
		
		Component verticalStrut_3 = Box.createVerticalStrut(50);
		AreaJ2.add(verticalStrut_3);
		
		textJ2 = new JTextField();
		AreaJ2.add(textJ2);
		textJ2.setColumns(10);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		AreaJ2.add(verticalStrut_4);
		
		JLabel label = new JLabel("puntos");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		AreaJ2.add(label);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		AreaJ2.add(verticalStrut_5);
		
		Box horizontalBox = Box.createHorizontalBox();
		contentPane.add(horizontalBox, BorderLayout.CENTER);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue);
		
		JLabel palabra = new JLabel("PALABRA");
		horizontalBox.add(palabra);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_1);
	}
	
	public JTextField getTextJ1() {
		return textJ1;
	}

	public JTextField getTextJ2() {
		return textJ2;
	}

}
