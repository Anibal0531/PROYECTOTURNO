package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class INTERFASASESOR extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblId;
	private JTextField textField_1;
	private JLabel lblTipoServicio;
	private JTextField textField_2;
	private JLabel lblEstado;
	private JTextField textField_3;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					INTERFASASESOR frame = new INTERFASASESOR();
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
	public INTERFASASESOR() {
		setTitle("ASESOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(20, 38, 74, 14);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(104, 35, 106, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblId = new JLabel("ID");
		lblId.setBounds(20, 92, 46, 14);
		contentPane.add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 89, 106, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblTipoServicio = new JLabel("TIPO SERVICIO");
		lblTipoServicio.setBounds(10, 160, 97, 14);
		contentPane.add(lblTipoServicio);
		
		textField_2 = new JTextField();
		textField_2.setBounds(104, 157, 106, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblEstado = new JLabel("ESTADO");
		lblEstado.setBounds(220, 38, 68, 14);
		contentPane.add(lblEstado);
		
		textField_3 = new JTextField();
		textField_3.setBounds(300, 35, 106, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		btnNewButton = new JButton("INGRESAR");
		btnNewButton.setBounds(275, 125, 116, 64);
		contentPane.add(btnNewButton);
	}
}
