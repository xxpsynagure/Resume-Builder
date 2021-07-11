import javax.swing.*;
import java.awt.*;

public class HobbiesPanel {
    HobbiesPanel(JFrame frame,JPanel panel) {
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.gray);
        panel.setLayout(null);

        JLabel title1 = new JLabel("EXTRA CURRICULUM");
        title1.setBounds(373, 28, 450, 43);
        title1.setFont(new Font("Roboto", Font.BOLD, 37));
        panel.add(title1);

        JLabel hobbiesL = new JLabel("Hobbies");
        hobbiesL.setBounds(210, 114, 100, 16);
        hobbiesL.setFont(new Font("Roboto", 0, 14));
        panel.add(hobbiesL);

        JTextField hobbies = new JTextField();
        hobbies.setBounds(209, 141, 303, 73);
        panel.add(hobbies);

        JLabel voidL = new JLabel("VOID");
        voidL.setBounds(607, 114, 100, 16);
        voidL.setFont(new Font("Roboto", 0, 14));
        panel.add(voidL);

        JTextField voidTxt = new JTextField();
        voidTxt.setBounds(605, 141, 303, 73);
        panel.add(voidTxt);

        JLabel dec = new JLabel("Declaration");
        dec.setBounds(410, 325, 247, 43);
        dec.setFont(new Font("Roboto", 0, 37));
        panel.add(dec);

        JTextArea decText = new JTextArea(
            "I John Doe hereby declare that the above information is true to the best of my knowledge and also try to" +
            " be involved in the work where I can utilize skills and creativity involved in the system contributes to the" +
            " growth of organization", 
                3, 
                20);
        decText.setFont(new Font("Serif", 0, 16));
        decText.setLineWrap(true);
        decText.setWrapStyleWord(true);
        decText.setOpaque(false);
        decText.setEditable(false);
        panel.add(decText);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
