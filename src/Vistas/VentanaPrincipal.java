package Vistas;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanelFondo contentPane;

	public VentanaPrincipal(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanelFondo();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel zonaBotones = new JPanel();
		contentPane.add(zonaBotones, BorderLayout.SOUTH);
		zonaBotones.setLayout(new BoxLayout(zonaBotones, BoxLayout.Y_AXIS));
		
		JButton jugar = new JButton("JUGAR");
		jugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPalabra frame = new VentanaPalabra();
				frame.setVisible(true);
			}
		});
		jugar.setAlignmentX(Component.CENTER_ALIGNMENT);
		zonaBotones.add(jugar);
		
		zonaBotones.add(Box.createRigidArea(new Dimension(0,10)));
		
		JButton salir = new JButton("SALIR");
		salir.setAlignmentX(Component.CENTER_ALIGNMENT);
		zonaBotones.add(salir);
	}

	
}
