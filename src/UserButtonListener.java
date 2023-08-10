import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserButtonListener implements ActionListener {

    private final Main main;
    private final ApplicationWindow applicationWindow;

    public UserButtonListener(Main main, ApplicationWindow applicationWindow) {
        this.main = main;
        this.applicationWindow = applicationWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        UserWindow userWindow = new UserWindow(main, applicationWindow);
        main.changeWindow(userWindow.getMainPanel());
    }
}
