package exple;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exple extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DefaultTableModel tableModel;
    private JTable table;
    private JTextField tprenom, tville;

    public Exple() {
        initialize();
    }

    private void initialize() {
        setTitle("Exple");
        setSize(449, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel label1 = new JLabel("Prenom:");
        tprenom = new JTextField();
        JLabel label2 = new JLabel("Ville:");
        tville = new JTextField();

        JButton bajouter = new JButton("Ajouter");
        bajouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String prenom = tprenom.getText();
                String ville = tville.getText();

                tableModel.addRow(new String[]{prenom, ville});
            }
        });

        JButton bsupprimer = new JButton("Supprimer");
        bsupprimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(null, "Quoi ?!!!");
                } else {
                    tableModel.removeRow(selectedRow);
                }
            }
        });

        JButton btaville = new JButton("Trier par ville");
        btaville.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    tableModel.setValueAt("Zak", selectedRow, 0);
                }
            }
        });

        panel.add(label1);
        panel.add(tprenom);
        panel.add(label2);
        panel.add(tville);
        panel.add(bajouter);
        panel.add(bsupprimer);
        panel.add(btaville);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Prenom");
        tableModel.addColumn("Ville");

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        getContentPane().add(panel, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Exple().setVisible(true);
            }
        });
    }
}