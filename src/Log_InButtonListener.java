import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Log_InButtonListener implements ActionListener {

    private final Main mainWindow;
    private final ApplicationWindow applicationWindow;
    public Log_InButtonListener(Main main, ApplicationWindow applicationWindow) {
        this.mainWindow = main;
        this.applicationWindow = applicationWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JPanel jPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        JLabel loginLabel = new JLabel("Login: ");
        JTextField loginTextField = new JTextField(10);
        JLabel passwordLabel = new JLabel("Password: ");
        JPasswordField passwordField = new JPasswordField(10);

        jPanel.add(loginLabel);
        jPanel.add(loginTextField);
        jPanel.add(passwordLabel);
        jPanel.add(passwordField);

        int windowResult = JOptionPane.showConfirmDialog(null,jPanel, "Logowanie", JOptionPane.OK_CANCEL_OPTION);
        boolean correctAdminLogIn = false;
        if(windowResult == JOptionPane.OK_OPTION){
            String login = loginTextField.getText();
            String password = String.valueOf(passwordField.getPassword());
            System.out.println("New log in: " + login + " " + password);
            if(login.equals("admin") && password.equals("admin")){
                correctAdminLogIn = true;
                mainWindow.changeWindow(applicationWindow.getMainPanel());
            }

            //obsluga prawidlowego logowania sie uzytkownika w aplikacji
            //call do bazy
        }
    }
}
