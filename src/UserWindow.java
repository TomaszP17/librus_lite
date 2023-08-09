import javax.swing.*;
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
    private JLabel imageLabel;

    public UserWindow() {
        setTitle("User Information");
        setSize(new Dimension(1080, 820));
        ImageIcon icon = new ImageIcon("C:\\Users\\Tomasz\\Desktop\\PORTFOLIO\\librus_lite\\res\\icon.png");
        setIconImage(icon.getImage());
        imageLabel.setIcon(icon);



    }
}
