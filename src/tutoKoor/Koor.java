package tutoKoor;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.UIManager;

public class Koor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Koor window = new Koor();
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
	public Koor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(UIManager.getColor("Button.background"));
		frame.getContentPane().setBackground(UIManager.getColor("Button.shadow"));
		frame.setBounds(100, 100, 414, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.RIGHT,20,40)); //équivaut à display flex et wrap auto
		
		JButton btnNewButton = new JButton("New button");
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_1);
	}

}
