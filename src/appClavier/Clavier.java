package appClavier;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clavier {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clavier window = new Clavier();
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
	public Clavier() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 311, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane tScreen = new JTextPane();
		tScreen.setBounds(0, 0, 295, 56);
		frame.getContentPane().add(tScreen);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tScreen.setText(btn1.getText());
				
			}
			
		});
		btn1.setBounds(0, 84, 89, 56);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(99, 84, 89, 56);
		frame.getContentPane().add(btn2);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(198, 84, 89, 56);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(0, 151, 89, 56);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(99, 151, 89, 56);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("New button");
		btnNewButton_2_1.setBounds(198, 151, 89, 56);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(0, 218, 89, 56);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		btnNewButton_1_2.setBounds(99, 218, 89, 56);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("New button");
		btnNewButton_2_2.setBounds(198, 218, 89, 56);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_4_1 = new JButton("New button");
		btnNewButton_4_1.setBounds(0, 287, 89, 56);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_1_2_1 = new JButton("New button");
		btnNewButton_1_2_1.setBounds(99, 287, 89, 56);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_2_2_1 = new JButton("New button");
		btnNewButton_2_2_1.setBounds(198, 287, 89, 56);
		frame.getContentPane().add(btnNewButton_2_2_1);
	}
}
