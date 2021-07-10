import javax.swing.*;
import java.awt.*;

public class Curriculum extends BaseTemplate{
    Curriculum(JFrame frame) {
        JPanel cur = new JPanel();
        cur.setPreferredSize(new Dimension(1000,600));
        cur.setBackground(Color.gray);
        cur.setLayout(null);

        JLabel welcomeCur = new JLabel("Welcome to Extra Curriculum page");
        welcomeCur.setBounds(100, 100, 200, 25);
        cur.add(welcomeCur);

        frame.add(cur);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
