import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

//base template of where the panes should be added


public abstract class BaseTemplate {
    //demo code 
    JFrame frame = new JFrame();
    JPanel intro = new JPanel();

    JPanel navBar = new JPanel();

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
        //JMenuItem goback = new JMenuItem("Go Back");
        
        settings.add(logout);
        //settings.add(goback);
        menuBar.add(settings);

        //actionListener added to logout menuitem which leads back to the login page
        logout.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                new LoginFrame();
                frame.dispose();

            }
        });
/*        
        goback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelAdjuster();
                intro.setVisible(true);
            }
        }); */
        
        frame.setJMenuBar(menuBar);

        settings.setMnemonic(KeyEvent.VK_H); // access the help menu by pressing the key alt+H
        logout.setMnemonic(KeyEvent.VK_L); // logouts of the introPage by pressing the L key
        //goback.setMnemonic(KeyEvent.VK_B);


        //Demo navigation Bar
        navBar.setBackground(Color.decode("#1c2e4a"));
        navBar.setBounds(0, 0, 100, 600);
        navBar.setLayout(null);

        JPanel navPanel1 = new JPanel();
        navPanel1.setBackground(Color.decode("#D88C9A"));
        navPanel1.setBounds(12, 34, 75, 75);
        mouseFunctions(navPanel1, 6);
        ImageIcon navImage1 = new ImageIcon(System.getProperty("user.dir")+"\\images\\home.png");
        navImage1=navResizer(navImage1);
        JLabel navLabel1 = new JLabel();
        navLabel1.setIcon(navImage1);
        navPanel1.add(navLabel1);
        navBar.add(navPanel1);

        JPanel navPanel2 = new JPanel();
        navPanel2.setBackground(Color.decode("#D88C9A"));
        navPanel2.setBounds(12, 129, 75, 75);
        mouseFunctions(navPanel2, 1);
        ImageIcon navImage2 = new ImageIcon(System.getProperty("user.dir")+"\\images\\man-user.png");
        navImage2=navResizer(navImage2);
        JLabel navLabel2 = new JLabel();
        navLabel2.setIcon(navImage2);
        navPanel2.add(navLabel2);
        navBar.add(navPanel2);

        JPanel navPanel3 = new JPanel();
        navPanel3.setBackground(Color.decode("#D88C9A"));
        navPanel3.setBounds(12, 224, 75, 75);
        mouseFunctions(navPanel3, 2);
        ImageIcon navImage3 = new ImageIcon(System.getProperty("user.dir")+"\\images\\graduation-cap.png");
        navImage3=navResizer(navImage3);
        JLabel navLabel3 = new JLabel();
        navLabel3.setIcon(navImage3);
        navPanel3.add(navLabel3);
        navBar.add(navPanel3);

        JPanel navPanel4 = new JPanel();
        navPanel4.setBackground(Color.decode("#D88C9A"));
        navPanel4.setBounds(12, 319, 75, 75);
        mouseFunctions(navPanel4, 3);
        ImageIcon navImage4 = new ImageIcon(System.getProperty("user.dir")+"\\images\\portfolio.png");
        navImage4=navResizer(navImage4);
        JLabel navLabel4 = new JLabel();
        navLabel4.setIcon(navImage4);
        navPanel4.add(navLabel4);
        navBar.add(navPanel4);

        JPanel navPanel5 = new JPanel();
        navPanel5.setBackground(Color.decode("#D88C9A"));
        navPanel5.setBounds(12, 414, 75, 75);
        mouseFunctions(navPanel5, 4);
        ImageIcon navImage5 = new ImageIcon(System.getProperty("user.dir")+"\\images\\hobbie.png");
        navImage5=navResizer(navImage5);
        JLabel navLabel5 = new JLabel();
        navLabel5.setIcon(navImage5);
        navPanel5.add(navLabel5);
        navBar.add(navPanel5);

        frame.add(navBar);

    }
    
    void mouseFunctions(JPanel panel, int i){
        panel.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                panel.setBackground(Color.gray);
            }
            public void mouseExited(MouseEvent e){
                panel.setBackground(Color.decode("#D88C9A"));
            }
             public void mouseClicked(MouseEvent e){
                 // switch statement used to correctly identify which panel is clicked and
                 // call the constructor of the respective panel
                        intro.setVisible(false);
                 switch (i) {
                     case 1:
                        panelAdjuster();
                        profPanel.setVisible(true);
                        break;
                     case 2:
                        panelAdjuster();
                        eduPanel.setVisible(true);
                        break;
                     case 3:
                        panelAdjuster();
                        skillPanel.setVisible(true);
                        break;
                     case 4:
                        panelAdjuster();
                        curPanel.setVisible(true);
                        break;
                     case 5:
                        panelAdjuster();
                        sumPanel.setVisible(true);
                        break;
                     case 6:
                        panelAdjuster();
                        navBar.setVisible(false);
                        intro.setVisible(true);
                        break;
                     default:
                         break;
                 }
                 
             }
        });
    }

    void panelAdjuster(){

        eduPanel.setVisible(false);
        profPanel.setVisible(false);
        curPanel.setVisible(false);
        skillPanel.setVisible(false);
        sumPanel.setVisible(false);
        navBar.setVisible(true);

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

    ImageIcon navResizer(ImageIcon image){

        Image navImage = image.getImage(); // transform it 
        Image newNavImg = navImage.getScaledInstance(65, 65,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(newNavImg);

    }
    void initializer(){
        new EducationPanel(frame,eduPanel);
        eduPanel.setVisible(false);
        new ProfilePanel(frame,profPanel);
        profPanel.setVisible(false);
        new SkillsPanel(frame,skillPanel);
        skillPanel.setVisible(false);
        new HobbiesPanel(frame,curPanel);
        curPanel.setVisible(false);
        new Summarize(frame,sumPanel);
        sumPanel.setVisible(false);
    }
}
    
