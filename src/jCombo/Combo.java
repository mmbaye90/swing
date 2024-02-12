package jCombo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Combo {

	private JFrame frame;
	private JTextField nb1;
	private JTextField nb2;
	private JTextField screen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combo window = new Combo();
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
	public Combo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 282, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		nb1 = new JTextField();
		nb1.setHorizontalAlignment(SwingConstants.CENTER);
		nb1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nb1.setBounds(0, 0, 266, 39);
		frame.getContentPane().add(nb1);
		nb1.setColumns(10);
		
		nb2 = new JTextField();
		nb2.setHorizontalAlignment(SwingConstants.CENTER);
		nb2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nb2.setColumns(10);
		nb2.setBounds(0, 200, 266, 39);
		frame.getContentPane().add(nb2);
		
		screen = new JTextField();
		screen.setHorizontalAlignment(SwingConstants.CENTER);
		screen.setFont(new Font("Tahoma", Font.PLAIN, 16));
		screen.setColumns(10);
		screen.setBounds(0, 319, 266, 39);
		frame.getContentPane().add(screen);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "/"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(0, 96, 266, 31);
		frame.getContentPane().add(comboBox);
		
		JButton btn = new JButton("=");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val1 = Integer.parseInt(nb1.getText());
				int val2 = Integer.parseInt(nb2.getText());
				int res = 0;
				if (comboBox.getSelectedItem().toString() =="+") {
					res = val1+val2;
				} else if(comboBox.getSelectedItem().toString() =="-"){
					res = val1-val2;
				}else if(comboBox.getSelectedItem().toString() =="/"){
					res = val1/val2;
				}
				screen.setText(res+"");
			}
		});
		btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn.setBounds(0, 264, 266, 31);
		frame.getContentPane().add(btn);
	}
}
