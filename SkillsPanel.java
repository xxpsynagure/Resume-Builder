import javax.swing.*;
import java.awt.*;

public class SkillsPanel extends BaseTemplate {
    SkillsPanel(JFrame frame) {
        JPanel skills = new JPanel();
        skills.setPreferredSize(new Dimension(1000,600));
        skills.setBackground(Color.gray);
        skills.setLayout(null);

        JLabel welcomeSkills = new JLabel("Welcome to skills page");
        welcomeSkills.setBounds(100, 100, 200, 25);
        skills.add(welcomeSkills);

        frame.add(skills);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
