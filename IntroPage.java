import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

//this will probably be the page with all the buttons
public class IntroPage extends BaseTemplate {

    IntroPage(){
        //demo code
        intro.setPreferredSize(new Dimension(1000,600));
        intro.setBackground(Color.gray);
        //intro.setSize(1000, 600);
        intro.setLayout(null);
        
        JLabel welcome = new JLabel("Welcome to IntroPage");
        welcome.setBounds(100, 100, 200, 25);
        intro.add(welcome);
        
        JPanel panelBtn1 = new JPanel();
        panelBtn1.setBackground(Color.white);
        panelBtn1.setBounds(192, 206, 150, 150);
        mouseFunctions(panelBtn1,1);
        intro.add(panelBtn1);
        
        JPanel panelBtn2 = new JPanel();
        panelBtn2.setBackground(Color.white);
        panelBtn2.setBounds(462, 206, 150, 150);
        mouseFunctions(panelBtn2,2);
        intro.add(panelBtn2);
        
        JPanel panelBtn3 = new JPanel();
        panelBtn3.setBackground(Color.white);
        panelBtn3.setBounds(732, 206, 150, 150);
        mouseFunctions(panelBtn3,3);
        intro.add(panelBtn3);
        
        JPanel panelBtn4 = new JPanel();
        panelBtn4.setBackground(Color.white);
        panelBtn4.setBounds(192, 406, 150, 150);
        mouseFunctions(panelBtn4,4);
        intro.add(panelBtn4);
        
        JPanel panelBtn5 = new JPanel();
        panelBtn5.setBackground(Color.white);
        panelBtn5.setBounds(462, 406, 150, 150);
        mouseFunctions(panelBtn5,5);
        intro.add(panelBtn5);
        
        frame.add(intro);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
    }
}
