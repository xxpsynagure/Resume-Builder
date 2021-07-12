import javax.swing.*;
import java.awt.*;

public class SkillsPanel {
    SkillsPanel(JFrame frame, JPanel panel) {
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.gray);
        panel.setLayout(null);

        JLabel welcomeSkills = new JLabel("SKILLS & EXPERIENCES ");
        welcomeSkills.setBounds(310,24,379,43);
        welcomeSkills.setFont(new Font("Roboto",Font.BOLD, 24));
        panel.add(welcomeSkills);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    
    //JOB DETAILS
        JLabel jobL= new JLabel("Job  Experience / Position of Responsibility");
        jobL.setBounds(177,81,270,16);
        jobL.setFont(new Font("Roboto",Font.PLAIN, 14));
        panel.add(jobL);

        JTextArea job = new JTextArea();
        job.setBounds(177,100,505,74);
        job.setLineWrap(true);
        job.setWrapStyleWord(true);
        job.setToolTipText("do not exceed more than 50 words");
        panel.add(job);
    //----------------------------------------------------------------

    //INTERSHIP DETAILS
        JLabel internL= new JLabel("Internship");
        internL.setFont(new Font("Roboto",Font.PLAIN, 14));
        internL.setBounds(177,185,70,16);
        panel.add(internL);

        JTextArea intern=new JTextArea();
        intern.setBounds(177,204,505,74);
        intern.setLineWrap(true);
        intern.setWrapStyleWord(true);
        intern.setToolTipText("do not exceed more than 50 words");
        panel.add(intern);
    //----------------------------------------------------------

    //COURSE DETAILS
        JLabel coursesL =new JLabel("Courses");
        coursesL.setBounds(177,289,60,19);
        coursesL.setFont(new Font("Roboto",Font.PLAIN, 14));
        panel.add(coursesL);

        JTextArea courses =new JTextArea();
        courses.setBounds(177,310,505,74);
        courses.setLineWrap(true);
        courses.setWrapStyleWord(true);
        courses.setToolTipText("do not exceed more than 50 words");
        panel.add(courses);
    //---------------------------------------------------------

    //SKILL DETAILS
        JLabel skillL=new JLabel("Skills & languages known");
        skillL.setBounds(177,402,200,21);
        skillL.setFont(new Font("Roboto",Font.PLAIN, 14));
        panel.add(skillL);

        JTextArea skill=new JTextArea();
        skill.setBounds(177,430,505,74);
        skill.setLineWrap(true);
        skill.setWrapStyleWord(true);
        skill.setToolTipText("do not exceed more than 50 words");
        panel.add(skill);
    //----------------------------------------------------------

    //PORTFOLIO
        JLabel portL=new JLabel("Portfolio / Work Examples"); 
        portL.setBounds(738,146,163,16);
        portL.setFont(new Font("Roboto",Font.PLAIN, 14));
        panel.add(portL);

        JTextArea port=new JTextArea();
        port.setBounds(738,168,218,93);
        port.setLineWrap(true);
        port.setWrapStyleWord(true);
        port.setToolTipText("do not exceed more than 50 words");
        panel.add(port);
    //------------------------------------------------------------

    //ACHIEVEMENTS DETAILS
        JLabel achieveL=new JLabel("Achievements");
        achieveL.setBounds(738,338,89,16);
        achieveL.setFont(new Font("Roboto",Font.PLAIN, 14));
        panel.add(achieveL);

        JTextArea achieve=new JTextArea();
        achieve.setBounds(738,360,218,93);
        achieve.setWrapStyleWord(true);
        achieve.setLineWrap(true);
        achieve.setToolTipText("do not exceed more than 50 words");
        panel.add(achieve);
    
    }
}
