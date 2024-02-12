package list;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppList {

	private JFrame frame;
	private JTextField tVal1;
	private JTextField tVal2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppList window = new AppList();
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
	public AppList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//======================= LES VARS =====================
		frame = new JFrame("AppList");
		tVal1 = new JTextField();
		tVal2 = new JTextField();
		JButton btn1 = new JButton("Ajouter");
		JButton btn2 = new JButton("Ajouter");
		List list1 = new List();
		List list2 = new List();
		JButton btnmvToRight = new JButton("<<<");
		JButton btnmveToLeft = new JButton(">>>");
		JButton vider1 = new JButton("vider");
		JButton sup2 = new JButton("supprimer");
		JButton vider2 = new JButton("vider");
		JButton sup1 = new JButton("supprimer");

//======================================================

//-------------------------- Config du Frame --------------------
		frame.setBounds(100, 100, 566, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

//-------------------------- Config du TextField --------------------
		tVal1.setBounds(10, 25, 119, 20);
		frame.getContentPane().add(tVal1);
		tVal1.setColumns(10);

		tVal2.setColumns(10);
		tVal2.setBounds(335, 25, 119, 20);
		frame.getContentPane().add(tVal2);
//-------------------------- Config du Jbtn --------------------
		btn1.setBounds(133, 24, 89, 23);
		frame.getContentPane().add(btn1);
		
		btn2.setBounds(451, 24, 89, 23);
		frame.getContentPane().add(btn2);

		btnmvToRight.setBounds(250, 149, 66, 23);
		frame.getContentPane().add(btnmvToRight);
		
		btnmveToLeft.setBounds(250, 188, 66, 23);
		frame.getContentPane().add(btnmveToLeft);

		sup1.setBounds(10, 309, 89, 23);
		frame.getContentPane().add(sup1);
		
		vider1.setBounds(133, 309, 89, 23);
		frame.getContentPane().add(vider1);
		
		sup2.setBounds(335, 309, 89, 23);
		frame.getContentPane().add(sup2);
		
		vider2.setBounds(451, 309, 89, 23);
		frame.getContentPane().add(vider2);


//-------------------------- Config du List --------------------
		list1.setBounds(10, 73, 212, 216);
		frame.getContentPane().add(list1);	
		
		

		list2.setBounds(335, 73, 205, 216);
		frame.getContentPane().add(list2);

//-------------------------- LES EVENTS: appel des fctions --------------------	
		
		//appel pour la partie de gauche
		ajouter(btn1, tVal1, list1);
		addWithpressEnter(tVal1, btn1);

		//appel pour la partie de droite
		ajouter(btn2, tVal2, list2);
		addWithpressEnter(tVal2, btn2);
		
		//Supp (droite)
		supp(sup1,list1);
		//sup(gauche)
		supp(sup2,list2);

		//vider(droite)
		vider(vider1,list1);
		//vider(gauche)
		vider(vider2,list2);
		
		//movToRight
		deplacer(btnmvToRight,btnmveToLeft,list1,list2);

	}


//--------- Création des fctions pour éviter de retaper la meme chse --- 
	private void addWithpressEnter(JTextField chText,JButton btn){
		chText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn.doClick();
			}
		});
}

	private void ajouter(JButton btn,JTextField tField,List list) {
		btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (!tField.getText().isEmpty()) {
						// String str = tField.getText();
						list.add(tField.getText());
						// System.out.println(list.getSelectedItem());
						tField.setText("");
						tField.requestFocus();
					}else{
						JOptionPane.showMessageDialog(frame,"he ohhh","alert",JOptionPane.WARNING_MESSAGE);
					}
	
				}
			});
	}

	private void supp(JButton btn,List list){
		btn.addActionListener(e-> {
				if (list.getSelectedIndex() !=-1)  list.remove(list.getSelectedIndex());
				else JOptionPane.showMessageDialog(frame,"he ohhh","alert",JOptionPane.WARNING_MESSAGE);		
			});
	}

	private void vider(JButton btn,List list){
		btn.addActionListener(e-> {
				 list.removeAll();
			});
	}

	public void deplacer(JButton btn1,JButton btn2,List list1,List list2){
		// if (btn1) {
			btn1.addActionListener(e->{
					if (list2.getSelectedItem()!=null) {
						list1.add(list2.getSelectedItem());
						list2.remove(list2.getSelectedIndex());
					}else{
						System.out.println("Rien de SELECTIONNER");
					}
			});
			btn2.addActionListener(e->{
				if (list1.getSelectedItem()!=null) {
					list2.add(list1.getSelectedItem());
					list1.remove(list1.getSelectedIndex());
				}else{
					System.out.println("Rien de SELECTIONNER");
				}

			});

	}

}
