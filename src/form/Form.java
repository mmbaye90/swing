package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
//import java.awt.List;     
import javax.swing.JList;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class Form {

    private JFrame frame;
    private JTextField ville;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Form window = new Form();
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
    public Form() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        JLabel lblNewLabel = new JLabel("Prénom");
        JLabel lblNewLabel_1 = new JLabel("Ville");
        JLabel lblNewLabel_2 = new JLabel("Civilité");
        JLabel lblNewLabel_3 = new JLabel("Compte");
        JTextField prenom = new JTextField();
        ville = new JTextField();
        JRadioButton chekMmde = new JRadioButton("Mme(madame)");
        JRadioButton checkMr = new JRadioButton("Mr(monsieur)");
        JRadioButton checkClt = new JRadioButton("Client");
        JRadioButton checkAdmin = new JRadioButton("Admin");
        JCheckBox html = new JCheckBox("HTML");
        JCheckBox css = new JCheckBox("CSS");
        JCheckBox javaScript = new JCheckBox("JavaScript");
        JCheckBox php = new JCheckBox("PHP");
        JCheckBox csharp = new JCheckBox("C#");
        JCheckBox javaCheckbox = new JCheckBox("JAVA");
        JCheckBox cpluss = new JCheckBox("C++");
        JCheckBox python = new JCheckBox("Python");
        JButton selectAllChBox = new JButton("         *");
        JLabel lblNewLabel_4 = new JLabel("Prénom");
        JScrollPane scrollPane = new JScrollPane();
        JLabel lblNewLabel_4_1 = new JLabel("Prénom");
        JLabel lblNewLabel_4_1_1 = new JLabel("Prénom");
        JLabel lblNewLabel_4_1_2 = new JLabel("Prénom");
        JLabel lblNewLabel_4_1_2_1 = new JLabel("Prénom");

        DefaultListModel<String> model_prenom = new DefaultListModel<>();
        DefaultListModel<String> model_ville = new DefaultListModel<>();
        DefaultListModel<String> model_civilite = new DefaultListModel<>();
        DefaultListModel<String> model_compte = new DefaultListModel<>(); 
        DefaultListModel<String> model_lang = new DefaultListModel<>(); 

        JList<String> jListPrenom = new JList<String>((model_prenom) );
        JList<String> jListVille = new JList<String>(model_ville );       
        JList<String> jList_0_2 = new JList<String>(model_civilite);
        JList<String> jList_0_3 = new JList<String>((model_compte) );
        JList<String> jListLang = new JList<String>((model_lang));

        JLabel langages = new JLabel("Langages");
        JButton btnAjouter = new JButton("Ajouter");
        JCheckBox sql = new JCheckBox("SQL");


        frame.setBounds(100, 100, 742, 478);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        lblNewLabel.setBounds(10, 24, 46, 14);
        frame.getContentPane().add(lblNewLabel);

        lblNewLabel_1.setBounds(10, 51, 46, 14);
        frame.getContentPane().add(lblNewLabel_1);

        lblNewLabel_2.setBounds(10, 90, 46, 14);
        frame.getContentPane().add(lblNewLabel_2);

        lblNewLabel_3.setBounds(10, 127, 46, 14);
        frame.getContentPane().add(lblNewLabel_3);

        langages.setBounds(10, 173, 46, 14);
        frame.getContentPane().add(langages);

        prenom.setBounds(82, 18, 192, 20);
        frame.getContentPane().add(prenom);
        prenom.setColumns(10);

        ville.setColumns(10);
        ville.setBounds(82, 48, 192, 20);
        frame.getContentPane().add(ville);

        chekMmde.setBounds(81, 86, 109, 23);
        frame.getContentPane().add(chekMmde);

        checkMr.setBounds(192, 86, 109, 23);
        frame.getContentPane().add(checkMr);

        checkClt.setBounds(82, 123, 109, 23);
        frame.getContentPane().add(checkClt);

        checkAdmin.setBounds(193, 123, 109, 23);
        frame.getContentPane().add(checkAdmin);

        html.setBounds(81, 169, 61, 23);
        frame.getContentPane().add(html);

        css.setBounds(144, 169, 46, 23);
        frame.getContentPane().add(css);

        javaScript.setBounds(187, 169, 75, 23);
        frame.getContentPane().add(javaScript);

        php.setBounds(264, 169, 46, 23);
        frame.getContentPane().add(php);

        sql.setBounds(310, 169, 46, 23);
        frame.getContentPane().add(sql);

        csharp.setBounds(354, 169, 46, 23);
        frame.getContentPane().add(csharp);

        javaCheckbox.setBounds(403, 169, 51, 23);
        frame.getContentPane().add(javaCheckbox);

        cpluss.setBounds(456, 169, 57, 23);
        frame.getContentPane().add(cpluss);

        python.setBounds(512, 169, 61, 23);
        frame.getContentPane().add(python);

        selectAllChBox.setBounds(579, 169, 23, 23);
        frame.getContentPane().add(selectAllChBox);

        btnAjouter.setBounds(612, 169, 69, 23);
        frame.getContentPane().add(btnAjouter);

        lblNewLabel_4.setBounds(45, 251, 46, 14);
        frame.getContentPane().add(lblNewLabel_4);

        scrollPane.setBounds(10, 279, 110, 150);
        frame.getContentPane().add(scrollPane);
        
       
        scrollPane.setViewportView(jListPrenom);

        lblNewLabel_4_1.setBounds(161, 251, 46, 14);
        frame.getContentPane().add(lblNewLabel_4_1);

        lblNewLabel_4_1_1.setBounds(284, 251, 46, 14);
        frame.getContentPane().add(lblNewLabel_4_1_1);

        lblNewLabel_4_1_2.setBounds(408, 240, 46, 14);
        frame.getContentPane().add(lblNewLabel_4_1_2);

        lblNewLabel_4_1_2_1.setBounds(594, 240, 46, 14);
        frame.getContentPane().add(lblNewLabel_4_1_2_1);
        

        
        jListVille.setBounds(144, 280, 108, 148);
        frame.getContentPane().add(jListVille);
        
        jList_0_2.setBounds(264, 280, 108, 148);
        frame.getContentPane().add(jList_0_2);
        
        jList_0_3.setBounds(380, 280, 108, 148);
        frame.getContentPane().add(jList_0_3);
        
        jListLang.setBounds(498, 261, 218, 168);
        frame.getContentPane().add(jListLang);
        
        frame.setVisible(true);

//=========================== SELECT ALL CHECKBOX ===============        
        selectAllChBox.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                JCheckBox valChkBox [] = {html,css,javaScript,php,sql,csharp,cpluss,javaCheckbox,python};
                for (int i = 0; i < valChkBox.length; i++) {
                    if (!valChkBox[i].isSelected()) {
                        valChkBox[i].setSelected(true);;  
                    }
                }
        	}
        });
//=========================== BTN AJOUTER  ===============
        btnAjouter.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                if (!prenom.getText().isEmpty()) {
                    model_prenom.addElement(prenom.getText());
                    prenom.setText("");
                    prenom.requestFocus();
                };
                model_ville.addElement(ville.getText());

                JCheckBox valChkBox [] = {html,css,javaScript,php,sql,csharp,javaCheckbox,cpluss,python};
                
                StringBuilder technos = new StringBuilder();
                for (int i = valChkBox.length-1; i >=0; i--) {
                    if (valChkBox[i].isSelected()) {
                        technos.append(valChkBox[i].getText()+" ");
                    }
                }
                model_lang.addElement(technos.toString());
                System.out.println(technos);

        	}
        });

    }
}
