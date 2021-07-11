import javax.swing.*;
import java.awt.*;

public class EducationPanel extends BaseTemplate{
    EducationPanel(JFrame frame,JPanel panel) {
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.gray);
        panel.setLayout(null);

        JLabel welcomeEdu = new JLabel("Welcome to Education page");
        welcomeEdu.setBounds(100, 100, 200, 25);
        panel.add(welcomeEdu);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
    }
}
