import javax.swing.*;
import java.awt.*;

public class Summarize extends BaseTemplate{
    Summarize(JFrame frame) {

        JPanel sumz = new JPanel();
        sumz.setPreferredSize(new Dimension(1000,600));
        sumz.setBackground(Color.gray);
        sumz.setLayout(null);

        JLabel welcomeSumz = new JLabel("Welcome to Summarize page");
        welcomeSumz.setBounds(100, 100, 200, 25);
        sumz.add(welcomeSumz);

        
        frame.add(sumz);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
