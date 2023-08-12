import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class UserWindow extends JFrame{
    private JPanel mainPanel;
    private JLabel upperLabel;
    private JTable table;
    private JButton editInformationButton;
    private JButton editImageButton;
    private JButton dataPolicyButton;
    private JPanel centerPanel;
    private JPanel rightPanel;
    private JButton backButton;
    private JTable table1;
    private JLabel imageLabel;

    public UserWindow(Main main, ApplicationWindow applicationWindow) {

        // Create table and configurate it
        JTable tbl = new JTable();
        DefaultTableModel dtm = new DefaultTableModel(0, 2);
        tbl.setModel(dtm);
        // add row dynamically into the table
        for (int count = 0; count < 8; count++) {
            dtm.addRow(new Object[] { "data", "data" });
        }
        centerPanel.add(tbl);


        // when user wants back to the app window
        backButton.addActionListener(new BackButtonListener(applicationWindow, main));

    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
