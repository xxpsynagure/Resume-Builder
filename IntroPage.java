import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
//this will probably be the page with all the buttons
public class IntroPage extends baseFrame {

    IntroPage(){
        //demo code
        JPanel intro = new JPanel();
        intro.setBackground(Color.gray);
        intro.setBounds(0, 0, 1000, 600);

        JLabel welcome = new JLabel("Welcome to IntroPage");
        welcome.setBounds(100, 100, 200, 25);
        intro.add(welcome);

        add(intro);
        setVisible(true);
    }
}
