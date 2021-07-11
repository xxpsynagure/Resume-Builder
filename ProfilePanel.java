import javax.swing.*;
import java.awt.*;

public class ProfilePanel extends BaseTemplate{
    ProfilePanel(JFrame frame,JPanel panel) {
        //panel = new JPanel();
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.gray);
        panel.setLayout(null);

        JLabel welcomeProfile = new JLabel("Welcome to Profile page");
        welcomeProfile.setBounds(100, 100, 200, 25);
        panel.add(welcomeProfile);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
