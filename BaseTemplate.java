import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

//base template of where the panes should be added


public abstract class BaseTemplate extends JFrame {
    //demo code 
    BaseTemplate(){
        //demo code
        setTitle("Resume Builder");
        setSize(1000,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        //menuBar added to abstract class
        JMenuBar menuBar = new JMenuBar();
        JMenu settings = new JMenu("Settings");
        JMenuItem logout = new JMenuItem("Log out");
        settings.add(logout);
        menuBar.add(settings);

        //actionListener added to logout menuitem which leads back to the login page
        logout.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                LoginFrame login = new LoginFrame();
                dispose();

            }
        });

        setJMenuBar(menuBar);

        //Demo navigation Bar
        JPanel navBar = new JPanel();
        navBar.setBackground(Color.white);
        navBar.setBounds(0, 0, 75, 600);
        add(navBar);

    }
}
    
