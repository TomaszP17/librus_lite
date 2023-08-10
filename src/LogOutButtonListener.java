import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogOutButtonListener implements ActionListener {
    private Main mainWindow;
    private ApplicationWindow applicationWindow;

    public LogOutButtonListener(Main mainWindow, ApplicationWindow applicationWindow) {
        this.mainWindow = mainWindow;
        this.applicationWindow = applicationWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int resultFromWindow = JOptionPane.showConfirmDialog(applicationWindow, "Czy chcesz sie wylogowac?", "Wylogowanie", JOptionPane.OK_CANCEL_OPTION);
        if(resultFromWindow == JOptionPane.OK_OPTION){
            //wylogowanie uzytkownika
            //ustawienie go na offline jesli bedzie taka opcja
            //zmiana ekranu na Main
            mainWindow.changeWindow(mainWindow.getMainPanel());
        }
    }
}
