import javax.swing.*;
import java.awt.*;
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
        navBar.setBounds(0, 0, 100, 600);
        navBar.setLayout(null);

        JPanel navPanel1 = new JPanel();
        navPanel1.setBackground(Color.lightGray);
        navPanel1.setBounds(12, 34, 75, 75);
        mouseFunctions(navPanel1, 6);
        navBar.add(navPanel1);

        JPanel navPanel2 = new JPanel();
        navPanel2.setBackground(Color.lightGray);
        navPanel2.setBounds(12, 129, 75, 75);
        mouseFunctions(navPanel2, 1);
        navBar.add(navPanel2);

        JPanel navPanel3 = new JPanel();
        navPanel3.setBackground(Color.lightGray);
        navPanel3.setBounds(12, 224, 75, 75);
        mouseFunctions(navPanel3, 2);
        navBar.add(navPanel3);

        JPanel navPanel4 = new JPanel();
        navPanel4.setBackground(Color.lightGray);
        navPanel4.setBounds(12, 319, 75, 75);
        mouseFunctions(navPanel4, 3);
        navBar.add(navPanel4);

        JPanel navPanel5 = new JPanel();
        navPanel5.setBackground(Color.lightGray);
        navPanel5.setBounds(12, 414, 75, 75);
        mouseFunctions(navPanel5, 4);
        navBar.add(navPanel5);

        frame.add(navBar);

    }
    
    void mouseFunctions(JPanel panel, int i){
        panel.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                panel.setBackground(Color.decode("#4895ef"));
            }
            public void mouseExited(MouseEvent e){
                panel.setBackground(Color.lightGray);
            }
             public void mouseClicked(MouseEvent e){
                 // switch statement used to correctly identify which panel is clicked and
                 // call the constructor of the respective panel
                        intro.setVisible(false);
                 switch (i) {
                     case 1:
                        panelCloser();
                        EducationPanel education = new EducationPanel(frame,eduPanel);
                        break;
                     case 2:
                        panelCloser();
                        ProfilePanel profile = new ProfilePanel(frame,profPanel);
                        break;
                     case 3:
                        panelCloser();
                        SkillsPanel skill = new SkillsPanel(frame,skillPanel);
                        break;
                     case 4:
                        panelCloser();
                        Hobbies hobbies = new Hobbies(frame,curPanel);
                        break;
                     case 5:
                        panelCloser();
                        Summarize summarize = new Summarize(frame,sumPanel);
                        break;
                     case 6:
                        intro.setVisible(true);
                        break;
                     default:
                         break;
                 }
                 
             }
        });
    }
    void panelCloser(){
        eduPanel.setVisible(false);
        profPanel.setVisible(false);
        curPanel.setVisible(false);
        skillPanel.setVisible(false);
        sumPanel.setVisible(false);
    }
    //ImageIcon imageIcon1 = new ImageIcon("portfolio.png"); // load the image to a imageIcon
        // Image image = imageIcon1.getImage(); // transform it 
        // Image newimg = image.getScaledInstance(110, 110,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        //imageIcon1 = new ImageIcon(newimg);
    ImageIcon resizer(ImageIcon image){
        Image imageget = image.getImage(); // transform it 
        Image newimg = imageget.getScaledInstance(110, 110,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(newimg);
    }
}
    
