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

        if (result == JOptionPane.OK_OPTION) {
            if (isEmptyFields(jPanel)) {
                showInfoWindow(jPanel);
            } else {
                List<String> array = getDataFromFields(jPanel);
                saveDataToFile(array, 1, "password");
            }
        }
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

    //check if textfields are empty
    public boolean isEmptyFields(JPanel panel){
        Component[] components = panel.getComponents();
        for(Component x : components){
            if(x instanceof JTextField){
                JTextField textField = (JTextField) x;
                if(textField.getText().isEmpty()){
                    return true;
                }
            }
        }
        return false;
    }
    //create window with communicate about empty fields
    public void showInfoWindow(JPanel panel){
        JOptionPane.showMessageDialog(panel, "Problem with fields\n" +
                "Please try again");
    }

    //method get all data from fields into list of strings
    public List<String> getDataFromFields(JPanel panel){
        Component[] components = panel.getComponents();
        List<String> userDataArray = new ArrayList<>();
        for(Component x : components){
            if(x instanceof JTextField){
                String data = ((JTextField) x).getText();
                userDataArray.add(data);
            }else if (x instanceof JComboBox) {
                JComboBox comboBox = (JComboBox) x;
                String data = comboBox.getSelectedItem().toString();
                userDataArray.add(data);
            }
        }
        return userDataArray;
    }
    //method get userData userIndex and userPassword to save it into the file users.txt
    public void saveDataToFile(List<String> userDataArray, int userIndex, String userPassword){
        String filePath = "./text_files/users.txt";
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            fileWriter.write("s" + userIndex + " | ");
            fileWriter.write( userPassword + " | ");
            for (String s : userDataArray) {
                fileWriter.write(s + " | ");
            }
            fileWriter.write("\n");
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
