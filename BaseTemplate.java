import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

//base template of where the panes should be added


public abstract class BaseTemplate {
    //demo code 
    JFrame frame = new JFrame();

    JPanel intro = new JPanel();

    JPanel eduPanel= new JPanel();
    JPanel profPanel= new JPanel();
    JPanel curPanel= new JPanel();
    JPanel skillPanel= new JPanel();
    JPanel sumPanel= new JPanel();

    BaseTemplate(){
        //demo code
        frame.setTitle("Resume Builder");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        //setLayout(null);

        //menuBar added to abstract class
        JMenuBar menuBar = new JMenuBar();
        JMenu settings = new JMenu("Help");
        JMenuItem logout = new JMenuItem("Log out");
        JMenuItem goback = new JMenuItem("Go Back");
        settings.add(logout);
        settings.add(goback);
        menuBar.add(settings);

        //actionListener added to logout menuitem which leads back to the login page
        logout.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                LoginFrame login = new LoginFrame();
                //frame.dispose();

            }
        });
        
        goback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                eduPanel.setVisible(false);
                profPanel.setVisible(false);
                curPanel.setVisible(false);
                skillPanel.setVisible(false);
                sumPanel.setVisible(false);
                intro.setVisible(true);
            }
        }); 
        
        frame.setJMenuBar(menuBar);

        settings.setMnemonic(KeyEvent.VK_H); // access the help menu by pressing the key alt+H
        logout.setMnemonic(KeyEvent.VK_L); // logouts of the introPage by pressing the L key
        goback.setMnemonic(KeyEvent.VK_B);


        //Demo navigation Bar
        JPanel navBar = new JPanel();
        navBar.setBackground(Color.white);
        navBar.setBounds(0, 0, 75, 600);
        frame.add(navBar);

    }
    
    void mouseFunctions(JPanel panel, int i){
        panel.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                panel.setBackground(Color.blue);
            }
            public void mouseExited(MouseEvent e){
                panel.setBackground(Color.white);
            }
             public void mouseClicked(MouseEvent e){
                 // switch statement used to correctly identify which panel is clicked and
                 // call the constructor of the respective panel
                 switch (i) {
                     case 1:
                        intro.setVisible(false);
                        EducationPanel education = new EducationPanel(frame,eduPanel);
                        break;
                     case 2:
                        intro.setVisible(false);
                        ProfilePanel profile = new ProfilePanel(frame,profPanel);
                        break;
                     case 3:
                        intro.setVisible(false);
                        SkillsPanel skill = new SkillsPanel(frame,skillPanel);
                        break;
                     case 4:
                        intro.setVisible(false);
                        Curriculum curriculum = new Curriculum(frame,curPanel);
                        break;
                     case 5:
                        intro.setVisible(false);
                        Summarize summarize = new Summarize(frame,sumPanel);
                        break;
                     default:
                         break;
                 }
                 
             }
        });
    }
}
    
