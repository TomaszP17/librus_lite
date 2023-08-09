import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class ApplicationWindow extends JFrame{
    private JButton pracaDomowaButton;
    private JButton ocenyButton;
    private JButton ogloszeniaButton;
    private JButton wiadomosciButton;
    private JButton uzytkownikButton;
    private JList list1;
    private JButton logoutButtom;
    private JPanel centerPanel;
    private JPanel mainPanel;
    private JPanel rightPanel;
    private JList list2;
    private JLabel bottomLabel;
    private JLabel mainLogo;
    private JButton kontaktButton;
    private JLabel dateAndTime;
    private Main mainWindow;

    public ApplicationWindow(Main mainWindow) {
        this.mainWindow = mainWindow;
        ImageIcon icon = new ImageIcon("C:\\Users\\Tomasz\\Desktop\\PORTFOLIO\\librus_lite\\res\\icon.png");
        setIconImage(icon.getImage());

        //date and time label
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        String dateAndTimeText = localDate + " / " + localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond();
        dateAndTime.setText(dateAndTimeText);

        uzytkownikButton.addActionListener(e -> {
            UserWindow userWindow = new UserWindow();
            JOptionPane.showConfirmDialog(this, userWindow, "Kontakt", JOptionPane.DEFAULT_OPTION);
        });

        //Kontakt
        kontaktButton.addActionListener(e -> {
            ContantWindow contantWindow = new ContantWindow();
            JOptionPane.showConfirmDialog(this, contantWindow, "Kontakt", JOptionPane.DEFAULT_OPTION);
        });

        //logout button listener
        logoutButtom.addActionListener(e -> {
            int resultFromWindow = JOptionPane.showConfirmDialog(this, "Czy chcesz sie wylogowac?", "Wylogowanie", JOptionPane.OK_CANCEL_OPTION);
            if(resultFromWindow == JOptionPane.OK_OPTION){
                //wylogowanie uzytkownika
                //ustawienie go na offline jesli bedzie taka opcja
                //zmiana ekranu na Main
                mainWindow.changeWindow(mainWindow.getMainPanel());
            }
        });
    }
    public JPanel getMainPanel(){
        return mainPanel;
    }
}
