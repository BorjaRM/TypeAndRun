package Vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TipoEquipos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TipoEquipos frame = new TipoEquipos();
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
	public TipoEquipos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(70, 50, 70, 50));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("ELEGIR EQUIPOS");
		btnNewButton.setBackground(java.awt.Color.GREEN.darker());
		btnNewButton.setFont(new Font("Courier New", Font.ITALIC, 20));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Introduce los nombres del EQUIPO A :");
				System.out.println("Introduce los nombres del EQUIPO B :");
			}
		});
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("EQUIPOS ALEATORIOS");
		btnNewButton_1.setBackground(java.awt.Color.GREEN.darker());
		btnNewButton_1.setFont(new Font("Courier New", Font.ITALIC, 20));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Equipos elegidos aleatoriamente.");
			}
		});
		contentPane.add(btnNewButton_1, BorderLayout.SOUTH);
	}

}
