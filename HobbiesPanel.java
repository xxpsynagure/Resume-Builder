import javax.swing.*;
import java.awt.*;

public class HobbiesPanel {
    HobbiesPanel(JFrame frame,JPanel panel) {
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.gray);
        panel.setLayout(null);

        JLabel welcomeCur = new JLabel("Welcome to Extra Curriculum page");
        welcomeCur.setBounds(100, 100, 200, 25);
        panel.add(welcomeCur);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
