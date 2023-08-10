import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class ApplicationWindow extends JFrame{
    private JButton pracaDomowaButton;
    private JButton ocenyButton;
    private JButton ogloszeniaButton;
    private JButton wiadomosciButton;
    private JButton userButton;
    private JList list1;
    private JButton logoutButtom;
    private JPanel centerPanel;
    private JPanel mainPanel;
    private JPanel rightPanel;
    private JList list2;
    private JLabel bottomLabel;
    private JLabel mainLogo;
    private JButton contactButton;
    private JLabel dateAndTime;
    private Main mainWindow;

    public ApplicationWindow(Main mainWindow) {
        this.mainWindow = mainWindow;
        ImageIcon icon = new ImageIcon("C:\\Users\\Tomasz\\Desktop\\PORTFOLIO\\librus_lite\\res\\icon.png");
        setIconImage(icon.getImage());

        //date and time label

        dateAndTime.setText(getLocalDateAndTime());
        // when user clicked on userButton to see info about him
        userButton.addActionListener(new UserButtonListener(mainWindow, this));

        //user button which open new window,
        contactButton.addActionListener(new ContactButtonListener(this));

        //logout button listener
        logoutButtom.addActionListener(new LogOutButtonListener(mainWindow, this));
    }
    public JPanel getMainPanel(){
        return mainPanel;
    }
    //method which gets date and time
    public String getLocalDateAndTime(){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        return localDate + " / " + localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond();
    }
}
