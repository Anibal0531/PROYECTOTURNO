import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ModeloVistaControlador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModeloVistaControlador frame = new ModeloVistaControlador();
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
	public ModeloVistaControlador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(161, 139, 46, 14);
		contentPane.add(label);
		
		JButton btnSoliciteTurno = new JButton("SOLICITE TURNO");
		btnSoliciteTurno.setBounds(139, 35, 160, 23);
		contentPane.add(btnSoliciteTurno);
		
		JButton btnListaEnEspera = new JButton("LISTA EN ESPERA");
		btnListaEnEspera.setBounds(139, 105, 160, 23);
		contentPane.add(btnListaEnEspera);
		
		JButton btnEstadoAsesor = new JButton("ESTADO ASESOR");
		btnEstadoAsesor.setBounds(139, 181, 160, 23);
		contentPane.add(btnEstadoAsesor);
	}
}
