import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactButtonListener implements ActionListener {

    private final ApplicationWindow applicationWindow;

    public ContactButtonListener(ApplicationWindow applicationWindow) {
        this.applicationWindow = applicationWindow;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        ContantWindow contantWindow = new ContantWindow();
        JOptionPane.showConfirmDialog(applicationWindow, contantWindow, "Contact", JOptionPane.DEFAULT_OPTION);

    }
}
