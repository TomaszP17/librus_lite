import javax.swing.*;
import java.awt.*;

public class ApplicationWindow extends JFrame{
    private JButton pracaDomowaButton;
    private JButton ocenyButton;
    private JButton ogloszeniaButton;
    private JButton wiadomosciButton;
    private JButton uzytkownikButton;
    private JList list1;
    private JButton wylogujSięButton;
    private JPanel centerPanel;
    private JPanel mainPanel;
    private JPanel rightPanel;
    private JList list2;
    private JLabel bottomLabel;
    private JLabel mainLogo;
    private JButton kontaktButton;
    private JLabel DateAndTime;

    public ApplicationWindow() {

        ImageIcon icon = new ImageIcon("C:\\Users\\Tomasz\\Desktop\\PORTFOLIO\\librus_lite\\res\\icon.png");
        setIconImage(icon.getImage());

        kontaktButton.addActionListener(e -> {
            System.out.println("TEST");
        });
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
}
