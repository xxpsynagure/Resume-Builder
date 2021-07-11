import javax.swing.*;
import java.awt.*;

public class SkillsPanel extends BaseTemplate {
    SkillsPanel(JFrame frame, JPanel panel) {
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.gray);
        panel.setLayout(null);

        JLabel welcomeSkills = new JLabel("Welcome to skills page");
        welcomeSkills.setBounds(100, 100, 200, 25);
        panel.add(welcomeSkills);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
