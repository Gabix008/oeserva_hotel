package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;

public class InterfaceConfirmacao {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceConfirmacao window = new InterfaceConfirmacao();
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
	public InterfaceConfirmacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 526, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pagamento Concluido Com Sucesso!\r\n");
		lblNewLabel.setBounds(41, 98, 438, 29);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAcesseSuasReservas = new JLabel(" Acesse suas reservas para visualizar mais informações");
		lblAcesseSuasReservas.setBounds(26, 193, 453, 20);
		lblAcesseSuasReservas.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblAcesseSuasReservas);
		
		JButton btnNewButton = new JButton("Ínicio");
		btnNewButton.setBounds(445, 277, 57, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReservas = new JButton("Reservas");
		btnReservas.setBounds(354, 277, 81, 21);
		frame.getContentPane().add(btnReservas);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(263, 277, 81, 21);
		frame.getContentPane().add(btnSair);
	}
}