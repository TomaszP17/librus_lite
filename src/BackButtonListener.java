import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackButtonListener implements ActionListener {

    //private final UserWindow userWindow;
    private final ApplicationWindow applicationWindow;
    private final Main main;

    public BackButtonListener(ApplicationWindow applicationWindow, Main main) {
        //this.userWindow = userWindow;
        this.applicationWindow = applicationWindow;
        this.main = main;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click");
        main.changeWindow(applicationWindow.getMainPanel());
    }
}
