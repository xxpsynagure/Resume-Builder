package Resume_Builder;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SkillsPanel {
    SkillsPanel(JFrame frame, JPanel panel) {

        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.decode("#F6D9A1"));
        panel.setLayout(null);
        
        //label to display "Skills and Experiences"
        JLabel welcomeSkills = new JLabel("SKILLS & EXPERIENCES ");
        welcomeSkills.setBounds(310,24,500,43);
        welcomeSkills.setFont(new Font("Roboto",Font.BOLD, 37));
        welcomeSkills.setForeground(Color.decode("#000000"));//use of hex code to import colors
        panel.add(welcomeSkills);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    
    //JOB DETAILS
        //label to display "Job  Experience / Position of Responsibility"
        JLabel jobL= new JLabel("Job  Experience / Position of Responsibility");
        jobL.setBounds(177,81,300,16);
        jobL.setFont(new Font("Roboto",Font.PLAIN, 14));
        jobL.setForeground(Color.decode("#000000"));//use of hex code to import colors
        panel.add(jobL);
        
        //text area to fill in job details
        JTextArea job = new JTextArea();
        job.setBounds(177,100,505,74);
        job.setLineWrap(true);//moves the curser to the next line
        job.setWrapStyleWord(true);
        job.setToolTipText("do not exceed more than 50 words");//display informative message
        panel.add(job);
    //----------------------------------------------------------------

    //INTERSHIP DETAILS
        //label to display "Internships"
        JLabel internL= new JLabel("Internships");
        internL.setFont(new Font("Roboto",Font.PLAIN, 14));
        internL.setBounds(177,185,70,16);
        internL.setForeground(Color.decode("#000000"));
        panel.add(internL);
        
        //text area to fill in internship details
        JTextArea intern=new JTextArea();
        intern.setBounds(177,204,505,74);
        intern.setLineWrap(true);
        intern.setWrapStyleWord(true);
        intern.setToolTipText("do not exceed more than 50 words");//display informative message
        panel.add(intern);
    //----------------------------------------------------------

    //COURSE DETAILS
        //label to dispalay "Courses" 
        JLabel coursesL =new JLabel("Courses");
        coursesL.setBounds(177,289,60,19);
        coursesL.setFont(new Font("Roboto",Font.PLAIN, 14));
        coursesL.setForeground(Color.decode("#000000"));
        panel.add(coursesL);
        
        //text area to fill in courses details
        JTextArea courses =new JTextArea();
        courses.setBounds(177,310,505,74);
        courses.setLineWrap(true);
        courses.setWrapStyleWord(true);
        courses.setToolTipText("do not exceed more than 50 words");//display informative message
        panel.add(courses);
    //---------------------------------------------------------

    //SKILL DETAILS
        //label to display "Skills and languages known"
        JLabel skillL=new JLabel("Skills & languages known");
        skillL.setBounds(177,402,200,21);
        skillL.setFont(new Font("Roboto",Font.PLAIN, 14));
        skillL.setForeground(Color.decode("#000000"));
        panel.add(skillL);
        
        //text area to fill in skills details
        JTextArea skill=new JTextArea();
        skill.setBounds(177,430,505,74);
        skill.setLineWrap(true);
        skill.setWrapStyleWord(true);
        skill.setToolTipText("do not exceed more than 50 words");//display informative message
        panel.add(skill);
    //----------------------------------------------------------

    //PORTFOLIO
        //label to display "Portfolio"
        JLabel portL=new JLabel("Portfolio / Work Examples"); 
        portL.setBounds(738,146,200,16);
        portL.setFont(new Font("Roboto",Font.PLAIN, 14));
        portL.setForeground(Color.decode("#000000"));
        panel.add(portL);
        
        //text area to fill in portfolio details
        JTextArea port=new JTextArea();
        port.setBounds(738,168,218,93);
        port.setLineWrap(true);
        port.setWrapStyleWord(true);
        port.setToolTipText("do not exceed more than 50 words");//display informative message
        panel.add(port);
    //------------------------------------------------------------

    //ACHIEVEMENTS DETAILS
        //label to display "Achievements"
        JLabel achieveL=new JLabel("Achievements");
        achieveL.setBounds(738,338,89,16);
        achieveL.setFont(new Font("Roboto",Font.PLAIN, 14));
        achieveL.setForeground(Color.decode("#000000"));
        panel.add(achieveL);
        
        //text area to fill in achievements details
        JTextArea achieve=new JTextArea();
        achieve.setBounds(738,360,218,93);
        achieve.setWrapStyleWord(true);
        achieve.setLineWrap(true);
        achieve.setToolTipText("do not exceed more than 50 words");
        panel.add(achieve);
        
        //"Save" button to save filled in details
        JButton saveBtn = new JButton("SAVE");
        saveBtn.setBounds(908, 572, 100, 20);
        saveBtn.setFont(new Font("Montserrat", Font.PLAIN, 15));
        saveBtn.setBackground(Color.decode("#a5a58d"));
        saveBtn.setForeground(Color.decode("#000000"));
        saveBtn.setOpaque(true);
        saveBtn.setFocusable(false);
        panel.add(saveBtn);

//_________________________________________________________________________________________________
        String[] skillReceived = new String[7];
        dbms skillGet=new dbms();
        skillReceived = skillGet.getSkillData();

        job.setText(skillReceived[0]);
        intern.setText(skillReceived[1]);
        courses.setText(skillReceived[2]);
        skill.setText(skillReceived[3]);
        port.setText(skillReceived[4]);
        achieve.setText(skillReceived[5]);
//_________________________________________________________________________________________________        
        saveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> skillsData = new ArrayList<String>();
                skillsData.add(job.getText());//0
                skillsData.add(intern.getText());//1
                skillsData.add(courses.getText());//2
                skillsData.add(skill.getText());//3
                skillsData.add(port.getText());//4
                skillsData.add(achieve.getText());//5
                
                dbms add = new dbms();
                if(add.skillUpdate(skillsData))
                {
                    //message displayed to show the details are saved
                    JOptionPane.showMessageDialog(null, "Save Successful","Message Box", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    
    }
}
