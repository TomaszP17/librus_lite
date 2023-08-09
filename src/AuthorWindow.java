import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthorWindow extends JPanel {

    private JLabel bottomLabel;
    private JTextArea textArea;
    private JLabel upperLabel;

    public AuthorWindow() {
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.fill = GridBagConstraints.BOTH;

        upperLabel = new JLabel("KILKA SLOW O AUTORZE...", SwingConstants.CENTER);
        Font upperFont = new Font("Consolas", Font.PLAIN, 24);
        upperLabel.setFont(upperFont);
        upperLabel.setOpaque(true);
        upperLabel.setBackground(Color.LIGHT_GRAY);

        String phoneNumber = null;
        String ethWallet = null;

        //searching for phoneNumber and ethWallet in file "contact.txt" by regex finder
        try{
            String filePath = "./text_files/contact.txt";
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                Pattern phonePattern = Pattern.compile("\\d{3}-\\d{3}-\\d{3}");
                Matcher phoneMatcher = phonePattern.matcher(line);
                if(phoneMatcher.find()){
                    phoneNumber = phoneMatcher.group(0);
                }

                Pattern ethWalletPattern = Pattern.compile("[0-9a-zA-Z]{40}");
                Matcher ethWalletMatcher = ethWalletPattern.matcher(line);
                if(ethWalletMatcher.find()){
                    ethWallet = ethWalletMatcher.group(0);
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        bottomLabel = new JLabel("wesprzyj tworce: [BLIK] " + phoneNumber + " / [ETH] " + ethWallet , SwingConstants.CENTER);
        Font bottomFont = new Font("Consolas", Font.PLAIN, 12);
        bottomLabel.setFont(bottomFont);
        bottomLabel.setOpaque(true);
        bottomLabel.setBackground(Color.LIGHT_GRAY);

        StringBuilder contentTextArea = new StringBuilder();

        //getting content from file "author.txt" to textArea
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

        textArea = new JTextArea(contentTextArea.toString());
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        Font textAreaFont = new Font("Consolas", Font.ITALIC, 14);
        textArea.setFont(textAreaFont);

        gridBagConstraints.gridy = 0;
        add(upperLabel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(textArea, gridBagConstraints);

        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 0.0;
        add(bottomLabel, gridBagConstraints);

        setPreferredSize(new Dimension(600, 400));
    }
}
