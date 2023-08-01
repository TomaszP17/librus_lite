import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AuthorWindow extends JPanel {

    private JLabel BottomLabel;
    private JTextArea mlodyAmbitnyProgramistaKtoryTextArea;
    private JLabel UpperLabel;

    public AuthorWindow() {
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.fill = GridBagConstraints.BOTH;

        UpperLabel = new JLabel("Upper Label", SwingConstants.CENTER);
        BottomLabel = new JLabel("Bottom Label", SwingConstants.CENTER);

        StringBuilder contentTextArea = new StringBuilder();
        try{
            String filePath = "./text_files/author.txt";
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String nextString = scanner.next();
                contentTextArea.append(nextString + " ");
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        mlodyAmbitnyProgramistaKtoryTextArea = new JTextArea(contentTextArea.toString());
        mlodyAmbitnyProgramistaKtoryTextArea.setLineWrap(true);
        mlodyAmbitnyProgramistaKtoryTextArea.setWrapStyleWord(true);

        gridBagConstraints.gridy = 0;
        add(UpperLabel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(mlodyAmbitnyProgramistaKtoryTextArea, gridBagConstraints);

        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 0.0;
        add(BottomLabel, gridBagConstraints);

        setPreferredSize(new Dimension(600, 400));
    }
}
