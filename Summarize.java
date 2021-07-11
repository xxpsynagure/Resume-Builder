import javax.swing.*;
import java.awt.*;

public class Summarize {
    Summarize(JFrame frame, JPanel panel) {
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.gray);
        panel.setLayout(null);

        JLabel title1 = new JLabel("Welcome to Summarize page");
        title1.setBounds(373, 28, 357, 43);
        title1.setFont(new Font("Roboto", Font.BOLD, 37));
        panel.add(title1);

        
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
