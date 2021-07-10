import javax.swing.*;
import java.awt.*;

public class ProfilePanel extends BaseTemplate{
    ProfilePanel(JFrame frame) {
        JPanel profile = new JPanel();
        profile.setPreferredSize(new Dimension(1000,600));
        profile.setBackground(Color.gray);
        profile.setLayout(null);

        JLabel welcomeProfile = new JLabel("Welcome to Profile page");
        welcomeProfile.setBounds(100, 100, 200, 25);
        profile.add(welcomeProfile);

        frame.add(profile);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
