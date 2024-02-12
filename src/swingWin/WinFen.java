package swingWin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinFen {

	private JFrame frame;
	private JTextField tPrenom;
	private JTextField tDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinFen window = new WinFen();
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
	public WinFen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setSize(559,400);		
		JLabel p = new JLabel("prenom");
		p.setBounds(105, 41, 46, 14);
		frame.getContentPane().add(p);
		
		tPrenom = new JTextField();
		tPrenom.setBounds(161, 35, 86, 20);
		frame.getContentPane().add(tPrenom);
		tPrenom.setColumns(10);
		
		tDisplay = new JTextField();
		tDisplay.setText("");
		
		tDisplay.setBounds(78, 124, 243, 20);
		frame.getContentPane().add(tDisplay);
		tDisplay.setColumns(10);
		
		JButton btnNewButton = new JButton("Go !!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tDisplay.setBounds(78, 124, 243, 20);
				tDisplay.setText("Bonjour" +tPrenom.getText());
			}
		});
		btnNewButton.setBounds(161, 79, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
