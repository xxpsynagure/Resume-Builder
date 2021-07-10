import javax.swing.*;
import java.awt.*;

public class EducationPanel {
    EducationPanel(JFrame frame) {
        JPanel edu = new JPanel();
        edu.setPreferredSize(new Dimension(1000,600));
        edu.setBackground(Color.gray);
        edu.setLayout(null);

        JLabel welcomeEdu = new JLabel("Welcome to Education page");
        welcomeEdu.setBounds(100, 100, 200, 25);
        edu.add(welcomeEdu);

        frame.add(edu);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
    }
}
