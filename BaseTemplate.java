import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

//base template of where the panes should be added


public abstract class BaseTemplate extends JFrame {
    //demo code 
    BaseTemplate(){
        //demo code
        setTitle("Resume Builder");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        //setLayout(null);

        //menuBar added to abstract class
        JMenuBar menuBar = new JMenuBar();
        JMenu settings = new JMenu("Help");
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

        settings.setMnemonic(KeyEvent.VK_H); // access the help menu by pressing the key alt+H
        logout.setMnemonic(KeyEvent.VK_L); // logouts of the introPage by pressing the L key


        //Demo navigation Bar
        JPanel navBar = new JPanel();
        navBar.setBackground(Color.white);
        navBar.setBounds(0, 0, 75, 600);
        add(navBar);

    }
    
    void mouseFunctions(JPanel panel){
        panel.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                panel.setBackground(Color.blue);
            }
            public void mouseExited(MouseEvent e){
                panel.setBackground(Color.white);
            }
            public void mouseClicked(MouseEvent e){
                LoginFrame login = new LoginFrame();
            }
        });
    }
    
}
    
