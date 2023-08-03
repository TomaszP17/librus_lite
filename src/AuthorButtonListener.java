import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthorButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        AuthorWindow authorWindow = new AuthorWindow();
        JOptionPane.showMessageDialog(null, authorWindow, "Autor", JOptionPane.WARNING_MESSAGE);
    }
}
