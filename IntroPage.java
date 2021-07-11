import java.awt.*;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

//this will probably be the page with all the buttons
public class IntroPage extends BaseTemplate {

    IntroPage(){
        //demo code
        navBar.setVisible(false);
        intro.setPreferredSize(new Dimension(1000,600));
        intro.setBackground(Color.gray);
        //intro.setSize(1000, 600);
        intro.setLayout(null);
        
        JLabel mainttl=new JLabel("BUILD YOUR RESUME");
        mainttl.setBounds(164,50,450,42);
        mainttl.setFont(new Font("Roboto", Font.BOLD, 36));
        intro.add(mainttl);

        JLabel welcome = new JLabel("BUILD YOUR FUTURE");
        welcome.setBounds(240,92,450,42);
        welcome.setFont(new Font("Roboto",Font.BOLD,36));
        intro.add(welcome);
         
        JPanel panelBtn1 = new JPanel();
        panelBtn1.setBackground(Color.lightGray);
        panelBtn1.setBounds(141, 205, 216, 150);
        mouseFunctions(panelBtn1,2);
        ImageIcon eduimage = new ImageIcon("man-user.png");
        eduimage=resizer(eduimage);
        JLabel edulLabel = new JLabel();
        edulLabel.setIcon(eduimage);
        JLabel Profile = new JLabel("Profile");
        panelBtn1.add(Profile);
        panelBtn1.add(edulLabel);
        intro.add(panelBtn1);
        
        JPanel panelBtn2 = new JPanel();
        panelBtn2.setBackground(Color.lightGray);
        panelBtn2.setBounds(430, 205, 216, 150);
        mouseFunctions(panelBtn2,1);
        ImageIcon profileImage = new ImageIcon("graduation-cap.png");
        profileImage=resizer(profileImage);
        JLabel profileLabel = new JLabel();
        profileLabel.setIcon(profileImage);
        panelBtn2.add(profileLabel);
        intro.add(panelBtn2);
        
        JPanel panelBtn3 = new JPanel();
        panelBtn3.setBackground(Color.lightGray);
        panelBtn3.setBounds(738, 205, 216, 150);
        mouseFunctions(panelBtn3,3);
        ImageIcon skillImage = new ImageIcon("portfolio.png");
        skillImage=resizer(skillImage);
        JLabel skillLabel = new JLabel();
        skillLabel.setIcon(skillImage);
        panelBtn3.add(skillLabel);
        intro.add(panelBtn3);
        
        JPanel panelBtn4 = new JPanel();
        panelBtn4.setBackground(Color.lightGray);
        panelBtn4.setBounds(278, 410, 216, 150);
        mouseFunctions(panelBtn4,4);
        ImageIcon hobbiesImage = new ImageIcon("hobbie.png");
        hobbiesImage=resizer(hobbiesImage);
        JLabel hobbiesLabel = new JLabel();
        hobbiesLabel.setIcon(hobbiesImage);
        panelBtn4.add(hobbiesLabel);
        intro.add(panelBtn4);
        
        JPanel panelBtn5 = new JPanel();
        panelBtn5.setBackground(Color.lightGray);
        panelBtn5.setBounds(598, 410, 216, 150);
        mouseFunctions(panelBtn5,5);
        ImageIcon summarizeImage = new ImageIcon("summarize.png");
        summarizeImage = resizer(summarizeImage);
        JLabel summarizeLabel = new JLabel();
        summarizeLabel.setIcon(summarizeImage);
        panelBtn5.add(summarizeLabel);
        intro.add(panelBtn5);

        initializer();
        
        frame.add(intro);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
    }
}
