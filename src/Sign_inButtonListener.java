import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sign_inButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JPanel jPanel = new JPanel(new GridLayout(0, 2, 5, 5));
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
        studyYearComboBox.addItem(StudyYear.FIRST);
        studyYearComboBox.addItem(StudyYear.SECOND);
        studyYearComboBox.addItem(StudyYear.THIRD);
        studyYearComboBox.addItem(StudyYear.FOURTH);
        studyYearComboBox.addItem(StudyYear.FIFTH);
        JLabel courseLabel = new JLabel("Course: ");
        JComboBox<Course> courseComboBox = new JComboBox<>();
        courseComboBox.addItem(Course.IT);
        courseComboBox.addItem(Course.HR);
        courseComboBox.addItem(Course.SNM);
        courseComboBox.addItem(Course.KJ);
        JLabel specializationLabel = new JLabel("Specializaiton: ");
        JComboBox<Specialization> specializactionJComboBox = new JComboBox<>();
        specializactionJComboBox.addItem(Specialization.BRAK_SPECJALIZACJI);
        specializactionJComboBox.addItem(Specialization.A_BD);
        specializactionJComboBox.addItem(Specialization.A_IO);
        specializactionJComboBox.addItem(Specialization.B);
        specializactionJComboBox.addItem(Specialization.D);
        specializactionJComboBox.addItem(Specialization.E);
        specializactionJComboBox.addItem(Specialization.E_3D);
        specializactionJComboBox.addItem(Specialization.E_PG);
        specializactionJComboBox.addItem(Specialization.F);
        specializactionJComboBox.addItem(Specialization.G);
        specializactionJComboBox.addItem(Specialization.H);

        jPanel.add(firstNameLabel);
        jPanel.add(firstNameTextField);
        jPanel.add(lastNameLabel);
        jPanel.add(lastNameTextField);
        jPanel.add(ageLabel);
        jPanel.add(ageTextField);
        jPanel.add(emailLabel);
        jPanel.add(emailTextField);
        jPanel.add(phoneLabel);
        jPanel.add(phoneTextField);
        jPanel.add(studyYearLabel);
        jPanel.add(studyYearComboBox);
        jPanel.add(courseLabel);
        jPanel.add(courseComboBox);
        jPanel.add(specializationLabel);
        jPanel.add(specializactionJComboBox);

        JScrollPane scrollPane = new JScrollPane(jPanel);
        scrollPane.setPreferredSize(new Dimension(400, 500));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JOptionPane.showConfirmDialog(null, scrollPane, "Rejestracja", JOptionPane.OK_CANCEL_OPTION);
    }
}
