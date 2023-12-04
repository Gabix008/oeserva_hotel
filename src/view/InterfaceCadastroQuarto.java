package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class InterfaceCadastroQuarto {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCadastroQuarto window = new InterfaceCadastroQuarto();
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
	public InterfaceCadastroQuarto() {
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
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE QUARTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(71, 10, 278, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Cama Casal:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(25, 61, 89, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cama Solteiro:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(25, 100, 111, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboCamaCasal = new JComboBox();
		comboCamaCasal.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboCamaCasal.setBounds(162, 57, 70, 25);
		frame.getContentPane().add(comboCamaCasal);
		
		JComboBox comboCamaSolteiro = new JComboBox();
		comboCamaSolteiro.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboCamaSolteiro.setBounds(162, 96, 70, 25);
		frame.getContentPane().add(comboCamaSolteiro);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(162, 191, 102, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Descrição:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(25, 139, 89, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(162, 131, 176, 41);
		frame.getContentPane().add(textArea);
	}
}