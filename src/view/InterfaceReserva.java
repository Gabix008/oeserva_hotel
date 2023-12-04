package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InterfaceReserva {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceReserva window = new InterfaceReserva();
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
	public InterfaceReserva() {
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
		
		JLabel lblNewLabel_3 = new JLabel("Local");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 89, 32, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 110, 96, 19);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(210, 110, 96, 19);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Check-In");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(210, 89, 57, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Check-out");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(210, 139, 81, 17);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(210, 167, 96, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(210, 64, 96, 19);
		frame.getContentPane().add(textField_3);
		
		lblNewLabel = new JLabel("Valor \r\nTotal");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(210, 36, 69, 17);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("Ir para o pagamento");
		btnNewButton.setBounds(299, 232, 127, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(10, 34, 81, 20);
		frame.getContentPane().add(lblNome);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 64, 108, 19);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 167, 108, 19);
		frame.getContentPane().add(textField_5);
		
		JLabel lblHotel = new JLabel("Hotel");
		lblHotel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHotel.setBounds(10, 137, 81, 20);
		frame.getContentPane().add(lblHotel);
		
		JLabel lblQuarto = new JLabel("Quarto");
		lblQuarto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuarto.setBounds(10, 204, 81, 20);
		frame.getContentPane().add(lblQuarto);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(10, 233, 108, 19);
		frame.getContentPane().add(textField_6);
	}
}
