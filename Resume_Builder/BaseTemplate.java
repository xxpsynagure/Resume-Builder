package Resume_Builder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//All the frames and panels are declared in the BaseTemplate which is an abstract class


public abstract class BaseTemplate {

    JFrame frame = new JFrame();
    JPanel intro = new JPanel();

    JPanel navBar = new JPanel();

    JPanel eduPanel= new JPanel();
    JPanel profPanel= new JPanel();
    JPanel curPanel= new JPanel();
    JPanel skillPanel= new JPanel();

    BaseTemplate(){

        frame.setTitle("Resume Builder");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon(System.getProperty("user.dir") + "\\images\\logo.png");
        frame.setIconImage(image.getImage());

        //menuBar added to abstract class
        JMenuBar menuBar = new JMenuBar();
        JMenu settings = new JMenu("Help");
        JMenuItem logout = new JMenuItem("Log out   alt+L");
        JMenuItem exitThing = new JMenuItem("Exit   alt+f4");
        
        settings.add(logout);
        settings.add(exitThing);
        menuBar.add(settings);

        //actionListener added to logout menuitem which leads back to the login page
        logout.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                new LoginFrame();
                frame.dispose();

            }
        });

        //actionListener added to exitThing menuitem which closes the application
        exitThing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }); 
        
        frame.setJMenuBar(menuBar);

        // key Mnemonics added so that user can perform cetain actions with the keys
        settings.setMnemonic(KeyEvent.VK_H); // alt+H to open the Help Menu
        logout.setMnemonic(KeyEvent.VK_L); // alt+L to perform logout operation
        exitThing.setMnemonic(KeyEvent.VK_F4); // alt+f4 to exit the application

// ------------------------------------------------------------------------------------------
        //navigation Bar which allows you to access any other page at any time at your convenience
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
//----------------------------------------------------------------------------------------------------------
    
    //mouseFunctions changes the colour of the panelBtns and navPanels when the cursor is hovered on it
    void mouseFunctions(JPanel panel, int i){
        //mouseListener indicates whether a mouse action has been performed on a component or not
        panel.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                panel.setBackground(Color.gray);
            }
            public void mouseExited(MouseEvent e){
                panel.setBackground(Color.decode("#D88C9A"));
            }
             public void mouseClicked(MouseEvent e){
                 // switch statement used to correctly identify which panel is clicked and set visible
                 panelAdjuster();
                 switch (i) {
                     case 1:
                        profPanel.setVisible(true);
                        break;
                     case 2:                       
                        eduPanel.setVisible(true);
                        break;
                     case 3:                       
                        skillPanel.setVisible(true);
                        break;
                     case 4:                       
                        curPanel.setVisible(true);
                        break;
                     case 5:
                        dbms show = new dbms();
                        Boolean yes = show.showSummarize();
                        if(yes) {
                            new Summarize2();
                            
                            navBar.setVisible(false);
                            intro.setVisible(true);
                        }                       
                        else {
                            intro.setVisible(true);
                            navBar.setVisible(false);
                            JOptionPane.showMessageDialog(null,"Kindly fill all the details","No Data Entered",JOptionPane.ERROR_MESSAGE);
                        }                            
                        break;
                     case 6:  
                        navBar.setVisible(false);
                        intro.setVisible(true);
                        break;
                     default:
                         break;
                 }
                 
             }
        });
    }

    // method that sets visibility of navBar true and visibility of all other panels to false
    void panelAdjuster(){
        intro.setVisible(false);
        eduPanel.setVisible(false);
        profPanel.setVisible(false);
        curPanel.setVisible(false);
        skillPanel.setVisible(false);
        navBar.setVisible(true);

    }

    //resizer resizes the panelBtn icons
    ImageIcon resizer(ImageIcon image){

        Image imageget = image.getImage(); // transform it 
        Image newimg = imageget.getScaledInstance(110, 110,  Image.SCALE_SMOOTH);
        return new ImageIcon(newimg);

    }

    //navResizer resizes the navPanel icons
    ImageIcon navResizer(ImageIcon image){

        Image navImage = image.getImage(); // transform it 
        Image newNavImg = navImage.getScaledInstance(65, 65,  Image.SCALE_SMOOTH);
        return new ImageIcon(newNavImg);

    }

    //initializer invokes the constructors of all classes and sets their visibility to false
    // frame and panel are passed as arguments to the respective classes
    void initializer(){
        new ProfilePanel(frame,profPanel);
        profPanel.setVisible(false);
        new EducationPanel(frame,eduPanel);
        eduPanel.setVisible(false);
        new SkillsPanel(frame,skillPanel);
        skillPanel.setVisible(false);
        new HobbiesPanel(frame,curPanel);
        curPanel.setVisible(false);
    }
}
    
