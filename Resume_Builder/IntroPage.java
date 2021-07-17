package Resume_Builder;
import java.awt.*;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

//IntroPage as child class of BaseTemplate
public class IntroPage extends BaseTemplate {

    IntroPage(){
        //intro frame to add panels
        navBar.setVisible(false);
        intro.setPreferredSize(new Dimension(1000,600));
        intro.setBackground(Color.decode("#F6D9A1"));//use of hex code to import colors
        //intro.setSize(1000, 600);
        intro.setLayout(null);

        JPanel head = new JPanel();
        head.setBackground(Color.decode("#1C2E4A"));
        head.setBounds(0, 0, 1000, 162);
        head.setLayout(null);
        intro.add(head); 
        
        //label to set up title "BUILD YOUR RESUME"
        JLabel mainttl=new JLabel("BUILD YOUR RESUME");
        mainttl.setBounds(100,30,450,50);
        mainttl.setFont(new Font("Montserrat", Font.BOLD, 36));
        mainttl.setForeground(Color.decode("#F6D9A1"));
        head.add(mainttl);

        JLabel welcome = new JLabel("BUILD YOUR FUTURE");
        welcome.setBounds(246,92,450,50);
        welcome.setFont(new Font("Montserrat",Font.BOLD,36));
        welcome.setForeground(Color.decode("#F6D9A1"));
        head.add(welcome);
         
        JPanel panelBtn1 = new JPanel();
        panelBtn1.setBackground(Color.decode("#D88C9A"));
        panelBtn1.setBounds(93, 207, 216, 150);
        mouseFunctions(panelBtn1,1);
       
        //adding profile image icon in profile panel
        ImageIcon profileImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\man-user.png");
        profileImage=resizer(profileImage);
        
        //label to display "Profile" in panel
        JLabel profileLabel = new JLabel("Profile");
        profileLabel.setIcon(profileImage);
        profileLabel.setHorizontalTextPosition(JLabel.CENTER);
        profileLabel.setVerticalTextPosition(JLabel.BOTTOM);//setting the icon position in the panel
        panelBtn1.add(profileLabel);
        intro.add(panelBtn1);
        
        //panel for education page
        JPanel panelBtn2 = new JPanel();
        panelBtn2.setBackground(Color.decode("#D88C9A"));
        panelBtn2.setBounds(381, 207, 216, 150);
        mouseFunctions(panelBtn2,2);//calling mouse function method from the base template class
       
        //adding education image icon in education panel
        ImageIcon eduImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\graduation-cap.png");
        eduImage=resizer(eduImage);
        
        //label to display "Education" in panel
        JLabel eduLabel = new JLabel("Education");
        eduLabel.setIcon(eduImage);
        eduLabel.setHorizontalTextPosition(JLabel.CENTER);
        eduLabel.setVerticalTextPosition(JLabel.BOTTOM);
        panelBtn2.add(eduLabel);
        intro.add(panelBtn2);
        
        //panel for skills and experience page
        JPanel panelBtn3 = new JPanel();
        panelBtn3.setBackground(Color.decode("#D88C9A"));
        panelBtn3.setBounds(690, 207, 216, 150);
        mouseFunctions(panelBtn3,3);
        
        //adding skills image icon in skills panel
        ImageIcon skillImage = new ImageIcon(System.getProperty("user.dir")+"\\images\\portfolio.png");
        skillImage=resizer(skillImage);
       
        //label to display "Skills and Experience" text in panel
        JLabel skillLabel = new JLabel("Skills and work experience");
        skillLabel.setIcon(skillImage);
        skillLabel.setHorizontalTextPosition(JLabel.CENTER);
        skillLabel.setVerticalTextPosition(JLabel.BOTTOM);
        panelBtn3.add(skillLabel);
        intro.add(panelBtn3);
        
        //panel for hobbies page
        JPanel panelBtn4 = new JPanel();
        panelBtn4.setBackground(Color.decode("#D88C9A"));
        panelBtn4.setBounds(230, 412, 216, 150);
        mouseFunctions(panelBtn4,4);
       
        //adding hobbies image icon in hobbies panel
        ImageIcon hobbiesImage = new ImageIcon(System.getProperty("user.dir")+"\\images\\hobbie.png");
        hobbiesImage=resizer(hobbiesImage);
       
        //label to display "Hobbies" panel
        JLabel hobbiesLabel = new JLabel("Hobbies");
        hobbiesLabel.setIcon(hobbiesImage);
        hobbiesLabel.setHorizontalTextPosition(JLabel.CENTER);
        hobbiesLabel.setVerticalTextPosition(JLabel.BOTTOM);
        panelBtn4.add(hobbiesLabel);
        intro.add(panelBtn4);
        
        //panel for summarize page
        JPanel panelBtn5 = new JPanel();
        panelBtn5.setBackground(Color.decode("#D88C9A"));
        panelBtn5.setBounds(550, 412, 216, 150);
        mouseFunctions(panelBtn5,5);
      
        //adding summarize image icon  in summarize panel
        ImageIcon summarizeImage = new ImageIcon(System.getProperty("user.dir")+"\\images\\summarize.png");
        summarizeImage = resizer(summarizeImage);
       
        //label to display "Summarize" panel
        JLabel summarizeLabel = new JLabel("Summarize      ");
        summarizeLabel.setIcon(summarizeImage);
        summarizeLabel.setHorizontalTextPosition(JLabel.CENTER);
        summarizeLabel.setVerticalTextPosition(JLabel.BOTTOM);
        panelBtn5.add(summarizeLabel);
        intro.add(panelBtn5);

        initializer();

        frame.add(intro);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
    }
}
