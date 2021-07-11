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
        mainttl.setBounds(93,55,450,42);
        mainttl.setFont(new Font("Roboto", Font.BOLD, 36));
        intro.add(mainttl);

        JLabel welcome = new JLabel("BUILD YOUR FUTURE");
        welcome.setBounds(169,97,450,42);
        welcome.setFont(new Font("Roboto",Font.BOLD,36));
        intro.add(welcome);
         
        JPanel panelBtn1 = new JPanel();
        panelBtn1.setBackground(Color.lightGray);
        panelBtn1.setBounds(93, 207, 216, 150);
        mouseFunctions(panelBtn1,1);
        ImageIcon profileImage = new ImageIcon("man-user.png");
        profileImage=resizer(profileImage);
        JLabel profileLabel = new JLabel("Profile");
        profileLabel.setIcon(profileImage);
        profileLabel.setHorizontalTextPosition(JLabel.CENTER);
        profileLabel.setVerticalTextPosition(JLabel.BOTTOM);
        panelBtn1.add(profileLabel);
        intro.add(panelBtn1);
        
        JPanel panelBtn2 = new JPanel();
        panelBtn2.setBackground(Color.lightGray);
        panelBtn2.setBounds(381, 207, 216, 150);
        mouseFunctions(panelBtn2,2);
        ImageIcon eduImage = new ImageIcon("graduation-cap.png");
        eduImage=resizer(eduImage);
        JLabel eduLabel = new JLabel("Education");
        eduLabel.setIcon(eduImage);
        eduLabel.setHorizontalTextPosition(JLabel.CENTER);
        eduLabel.setVerticalTextPosition(JLabel.BOTTOM);
        panelBtn2.add(eduLabel);
        intro.add(panelBtn2);
        
        JPanel panelBtn3 = new JPanel();
        panelBtn3.setBackground(Color.lightGray);
        panelBtn3.setBounds(690, 207, 216, 150);
        mouseFunctions(panelBtn3,3);
        ImageIcon skillImage = new ImageIcon("portfolio.png");
        skillImage=resizer(skillImage);
        JLabel skillLabel = new JLabel("Skills and work experience");
        skillLabel.setIcon(skillImage);
        skillLabel.setHorizontalTextPosition(JLabel.CENTER);
        skillLabel.setVerticalTextPosition(JLabel.BOTTOM);
        panelBtn3.add(skillLabel);
        intro.add(panelBtn3);
        
        JPanel panelBtn4 = new JPanel();
        panelBtn4.setBackground(Color.lightGray);
        panelBtn4.setBounds(230, 412, 216, 150);
        mouseFunctions(panelBtn4,4);
        ImageIcon hobbiesImage = new ImageIcon("hobbie.png");
        hobbiesImage=resizer(hobbiesImage);
        JLabel hobbiesLabel = new JLabel("Hobbies");
        hobbiesLabel.setIcon(hobbiesImage);
        hobbiesLabel.setHorizontalTextPosition(JLabel.CENTER);
        hobbiesLabel.setVerticalTextPosition(JLabel.BOTTOM);
        panelBtn4.add(hobbiesLabel);
        intro.add(panelBtn4);
        
        JPanel panelBtn5 = new JPanel();
        panelBtn5.setBackground(Color.lightGray);
        panelBtn5.setBounds(550, 412, 216, 150);
        mouseFunctions(panelBtn5,5);
        ImageIcon summarizeImage = new ImageIcon("summarize.png");
        summarizeImage = resizer(summarizeImage);
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
