import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

//this will probably be the page with all the buttons
public class IntroPage extends BaseTemplate {

    IntroPage(){
        //demo code
        JPanel intro = new JPanel();
        intro.setPreferredSize(new Dimension(1000,600));
        intro.setBackground(Color.gray);
        //intro.setSize(1000, 600);
        intro.setLayout(null);
        
        JLabel welcome = new JLabel("Welcome to IntroPage");
        welcome.setBounds(100, 100, 200, 25);
        intro.add(welcome);
        
        JPanel button1 = new JPanel();
        button1.setBackground(Color.white);
        button1.setBounds(192, 206, 150, 150);
        intro.add(button1);
        
        JPanel button2 = new JPanel();
        button2.setBackground(Color.white);
        button2.setBounds(462, 206, 150, 150);
        intro.add(button2);
        
        JPanel button3 = new JPanel();
        button3.setBackground(Color.white);
        button3.setBounds(732, 206, 150, 150);
        intro.add(button3);
        
        JPanel button4 = new JPanel();
        button4.setBackground(Color.white);
        button4.setBounds(192, 406, 150, 150);
        intro.add(button4);
        
        JPanel button5 = new JPanel();
        button5.setBackground(Color.white);
        button5.setBounds(462, 406, 150, 150);
        intro.add(button5);
        
        add(intro);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
        
    }
}
