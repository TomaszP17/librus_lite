import javax.swing.*;

public class Main extends JFrame {
    private JPanel jPanel;
    private JLabel upperPanel;
    private JButton Log_in;
    private JButton Sign_in;
    private JButton Author;
    private JLabel registeredUsers;
    private JLabel allVisit;
    private int rUsers; //sum of registered users
    private int countOfVisit; //sum of open app
    public static void main(String[] args) {
        new Main();
    }
    public Main(){
        setContentPane(jPanel);
        setTitle("Librus Lite");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        pack();
        setVisible(true);

        //User need to declare path to icon
        ImageIcon icon = new ImageIcon("C:\\Users\\Tomasz\\Desktop\\PORTFOLIO\\librus_lite\\res\\icon.png");
        setIconImage(icon.getImage());

        Log_in.addActionListener(new Log_InButtonListener(this, new ApplicationWindow(this)));
        Sign_in.addActionListener(new Sign_inButtonListener());
        Author.addActionListener(new AuthorButtonListener());

        //stats label
        registeredUsers.setText(rUsers == 0 ? registeredUsers.getText() + " 0" : registeredUsers.getText() + " " + rUsers);
        allVisit.setText(countOfVisit == 0 ? allVisit.getText() + " 0" : allVisit.getText() + " " + countOfVisit);

    }

    public void changeWindow(JPanel panel){
        setContentPane(panel);
        validate();
        repaint();
        pack();
    }

    public JPanel getMainPanel(){
        return jPanel;
    }
}

