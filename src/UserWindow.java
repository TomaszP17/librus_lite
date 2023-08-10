import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

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
    private JLabel imageLabel;

    public UserWindow(Main main, ApplicationWindow applicationWindow) {
        setTitle("User Information");
        setSize(new Dimension(1080, 820));

        DefaultTableModel tableModel = new DefaultTableModel();

        // when user wants back to the app window
        backButton.addActionListener(new BackButtonListener(applicationWindow, main));

    }

    public void changeWindow(JPanel panel){
        setContentPane(panel);
        revalidate();
        repaint();
        pack();
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

}
