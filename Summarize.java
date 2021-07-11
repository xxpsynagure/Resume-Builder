import javax.swing.*;
import java.awt.*;

public class Summarize extends BaseTemplate{
    Summarize(JFrame frame, JPanel panel) {
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.gray);
        panel.setLayout(null);

        JLabel welcomeSumz = new JLabel("Welcome to Summarize page");
        welcomeSumz.setBounds(100, 100, 200, 25);
        panel.add(welcomeSumz);

        
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
