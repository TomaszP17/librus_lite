import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Sign_inButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JPanel jPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        addElementsToPanel(jPanel);

        int result = JOptionPane.showConfirmDialog(null, jPanel, "Rejestracja", JOptionPane.OK_CANCEL_OPTION);

        //checking registration function

        /*if(result == JOptionPane.OK_OPTION){
            String firstName = firstNameTextField.getText();
            String lastName = lastNameTextField.getText();
            String age = ageTextField.getText();
            String email = emailTextField.getText();
            String phone = phoneTextField.getText();
            String studyYear = studyYearComboBox.getSelectedItem().toString();
            String course = courseComboBox.getSelectedItem().toString();
            String specialization = specializactionJComboBox.getSelectedItem().toString();

            List<String> fieldsArray = new ArrayList<>();
            fieldsArray.add(firstName);
            fieldsArray.add(lastName);
            fieldsArray.add(age);
            fieldsArray.add(email);
            fieldsArray.add(phone);
            fieldsArray.add(studyYear);
            fieldsArray.add(course);
            fieldsArray.add(specialization);

            for (String x : fieldsArray) {
                if ( x.equals("") ) {
                    System.out.println("znaleziono nulla");
                }
            }
            String filePath = "./text_files/users.txt";
            try {
                FileWriter fileWriter = new FileWriter(filePath, true);
                fileWriter.write(firstName + "xxx\n");
                fileWriter.close();

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }*/
    }
    /**
     * Method add elements to main panel (labels, textfields, comboboxes)
     * @param panel - the main panel in this window
     */
    public void addElementsToPanel(JPanel panel){
        JLabel firstNameLabel = new JLabel("First name: ");
        JTextField firstNameTextField = new JTextField(10);
        JLabel lastNameLabel = new JLabel("Last name: ");
        JTextField lastNameTextField = new JTextField(10);
        JLabel ageLabel = new JLabel("Age: ");
        JTextField ageTextField = new JTextField(5);
        JLabel emailLabel = new JLabel("Email: ");
        JTextField emailTextField = new JTextField(10);
        JLabel phoneLabel = new JLabel("Phone: ");
        JTextField phoneTextField = new JTextField(10);
        JLabel studyYearLabel = new JLabel("Study Year: ");
        JComboBox<StudyYear> studyYearComboBox = new JComboBox<>();
        addToComboBox(studyYearComboBox, EnumListener.getAllValues(StudyYear.class));
        JLabel courseLabel = new JLabel("Course: ");
        JComboBox<Course> courseComboBox = new JComboBox<>();
        addToComboBox(courseComboBox, EnumListener.getAllValues(Course.class));
        JLabel specializationLabel = new JLabel("Specializaiton: ");
        JComboBox<Specialization> specializactionJComboBox = new JComboBox<>();
        addToComboBox(specializactionJComboBox, EnumListener.getAllValues(Specialization.class));

        panel.add(firstNameLabel);
        panel.add(firstNameTextField);
        panel.add(lastNameLabel);
        panel.add(lastNameTextField);
        panel.add(ageLabel);
        panel.add(ageTextField);
        panel.add(emailLabel);
        panel.add(emailTextField);
        panel.add(phoneLabel);
        panel.add(phoneTextField);
        panel.add(studyYearLabel);
        panel.add(studyYearComboBox);
        panel.add(courseLabel);
        panel.add(courseComboBox);
        panel.add(specializationLabel);
        panel.add(specializactionJComboBox);
    }

    /**
     * Method add items to combobox
     */
    public <T extends Enum<T>> void addToComboBox(JComboBox<T> comboBox, T[] values){
        for(T value : values){
            comboBox.addItem(value);
        }
    }

    //check if fields are empty
    public boolean isEmptyFields(JPanel panel){
        Compopanel.getComponents();
    }

}
