package Resume_Builder;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Summarize
 */
public class Summarize2 {
    static dbms place;

    Summarize2(){
        
        // STRING TO STORE THE DATA RECEIVED FROM DATABASE
        String[] profileReceived = new String[15];
        String[] educationReceived = new String[14];
        String[] skillReceived = new String[7];
        String[] hobbiesReceived = new String[4];

        // MAKING A CONNECTION TO DATABASE AND GETTING DATA
        place = new dbms();
        profileReceived =  place.getProfileData();
        place = new dbms();
        educationReceived = place.getEducationData();
        place = new dbms();
        skillReceived = place.getSkillData();
        place = new dbms();
        hobbiesReceived = place.getHobbiesData();
        //---------------------------------------------------

        JFrame frame = new JFrame();
        frame.setSize(700, 850);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.decode("#F6D9A1"));
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        ImageIcon image = new ImageIcon(System.getProperty("user.dir") + "\\images\\logo.png");
        frame.setIconImage(image.getImage());
        
        //--------------------------------------------------
        //page start
        JPanel panel = new JPanel();
        panel.setBounds(40, 0, 565, 780);
        panel.setBackground(Color.white);
        panel.setLayout(null);

        JLabel line1 = new JLabel();
        line1.setBounds(281, 103, 2, 553);
        panel.add(linepreset(line1));
        
        JPanel greenpanel = new JPanel();
        greenpanel.setBounds(0, 0, 565, 100);
        greenpanel.setBackground(Color.decode("#99D6B9"));//use of hex code to import colors
        greenpanel.setLayout(null);
        panel.add(greenpanel);
        
        JLabel sign = new JLabel(profileReceived[1] +" " + profileReceived[2]);
        sign.setBounds(0, 0, 400, 40);
        sign.setFont(new Font("Roboto",Font.PLAIN,36));
        greenpanel.add(sign);
        
        ImageIcon phoneImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\phone-call.png");
        JLabel phoneL = new JLabel(profileReceived[3]);
        phoneL.setIcon(resizer(phoneImage));
        phoneL.setBounds(10, 42, 150, 30);
        phoneL.setIconTextGap(10);
        greenpanel.add(phoneL);

        ImageIcon mailImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\email.png");
        JLabel mailL = new JLabel(profileReceived[4]);
        mailL.setIcon(resizer(mailImage));
        mailL.setBounds(10, 70, 220, 30);
        mailL.setIconTextGap(10);
        greenpanel.add(mailL);

        ImageIcon dobImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\date-of-birth.png");
        JLabel dobL = new JLabel(profileReceived[6]);
        dobL.setIcon(resizer(dobImage));
        dobL.setBounds(10, 110, 220, 30);
        dobL.setIconTextGap(10);
        panel.add(dobL);

        ImageIcon locationImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\pin.png");
        JLabel locationL = new JLabel();
        locationL.setIcon(resizer(locationImage));
        locationL.setBounds(10, 150, 30, 30);
        locationL.setIconTextGap(10);
        panel.add(locationL);

        JTextArea locationArea = new JTextArea(profileReceived[8]+ ",\n" + profileReceived[9] + ", " + profileReceived[10] + ", " +
                                                profileReceived[11] + ",\n" + profileReceived[12] + ", " + profileReceived[13]);
        locationArea.setBounds(45, 155, 220, 75);
        panel.add(textPreset(locationArea));

        JLabel line2 = new JLabel();
        line2.setBounds(10, 240, 260, 2);
        panel.add(linepreset(line2));

        //label to to display "EDUCATION"
        JLabel educationL = new JLabel("EDUCATION");
        educationL.setBounds(10,245,150,20);
        educationL.setFont(new Font("Seriff",Font.BOLD,14));
        educationL.setForeground(Color.decode("#343A40"));
        panel.add(educationL);

        JTextArea educationArea = new JTextArea("PUC:\n"+educationReceived[3]+"  "+educationReceived[4]+"  "+educationReceived[5]+"\n"+
                                                "COLLEGE:\n"+educationReceived[7]+"  "+educationReceived[10]+"  "+educationReceived[11]+"  "+educationReceived[12]);
        educationArea.setBounds(10, 265, 260, 100);
        panel.add(textPreset(educationArea));

        JLabel line3 = new JLabel();
        line3.setBounds(10, 375, 260, 2);
        panel.add(linepreset(line3));

        //label to to display "COURSES"
        JLabel coursesL = new JLabel("COURSES");
        coursesL.setBounds(10,380,150,20);
        coursesL.setFont(new Font("Seriff",Font.BOLD,14));
        coursesL.setForeground(Color.decode("#343A40"));
        panel.add(coursesL);

        JTextArea coursesArea = new JTextArea(skillReceived[2]);
        coursesArea.setBounds(10, 410, 260, 90);
        panel.add(textPreset(coursesArea));

        JLabel line4 = new JLabel();
        line4.setBounds(10, 510, 260, 2);
        panel.add(linepreset(line4));

        //label to to display "ACHIEMENTS"
        JLabel achievementsL = new JLabel("ACHIEVEMENTS");
        achievementsL.setBounds(10,515,150,20);
        achievementsL.setFont(new Font("Seriff",Font.BOLD,14));
        achievementsL.setForeground(Color.decode("#343A40"));
        panel.add(achievementsL);

        JTextArea achievementsArea = new JTextArea(skillReceived[5]);
        achievementsArea.setBounds(10, 540, 260, 110);
        panel.add(textPreset(achievementsArea));

        //label to to display "SKILLS"
        JLabel skillsL = new JLabel("SKILLS");
        skillsL.setBounds(290,105,150,20);
        skillsL.setFont(new Font("Seriff",Font.BOLD,14));
        skillsL.setForeground(Color.decode("#343A40"));
        panel.add(skillsL);

        JTextArea skillsArea = new JTextArea(skillReceived[3]);
        skillsArea.setBounds(290, 130, 250, 80);
        panel.add(textPreset(skillsArea));

        //label to to display "JOB/EXPERIENCE"
        JLabel jobL = new JLabel("JOB/EXPERIENCE");
        jobL.setBounds(290,220,150,20);
        jobL.setFont(new Font("Seriff",Font.BOLD,14));
        jobL.setForeground(Color.decode("#343A40"));
        panel.add(jobL);

        JTextArea jobArea = new JTextArea(skillReceived[0]);
        jobArea.setBounds(290, 245, 250, 70);
        panel.add(textPreset(jobArea));

        //label to to display "INTERNSHIPS"
        JLabel internshipL = new JLabel("INTERNSHIPS");
        internshipL.setBounds(290,322,150,20);
        internshipL.setFont(new Font("Seriff",Font.BOLD,14));
        internshipL.setForeground(Color.decode("#343A40"));
        panel.add(internshipL);

        JTextArea internshipArea = new JTextArea(skillReceived[1]);
        internshipArea.setBounds(290, 345, 250, 80);
        panel.add(textPreset(internshipArea));

        //label to to display "PORTFOLIO"
        JLabel portfolioL = new JLabel("PORTFOLIO");
        portfolioL.setBounds(290,432,150,20);
        portfolioL.setFont(new Font("Seriff",Font.BOLD,14));
        portfolioL.setForeground(Color.decode("#343A40"));
        panel.add(portfolioL);

        JTextArea portfolioArea = new JTextArea(skillReceived[4]);
        portfolioArea.setBounds(290, 450, 250, 80);
        panel.add(textPreset(portfolioArea));

        //label to to display "HOBBIES"
        JLabel hobbiesL = new JLabel("HOBBIES");
        hobbiesL.setBounds(290,550,150,20);
        hobbiesL.setFont(new Font("Seriff",Font.BOLD,14));
        hobbiesL.setForeground(Color.decode("#343A40"));
        panel.add(hobbiesL);

        JTextArea hobbiesArea = new JTextArea(hobbiesReceived[0]);
        hobbiesArea.setBounds(290, 570, 250, 80);
        panel.add(textPreset(hobbiesArea));

        //label to to display "DECLARATION"
        JLabel declarationL = new JLabel("DECLARATION");
        declarationL.setBounds(10,655,150,20);
        declarationL.setFont(new Font("Seriff",Font.BOLD,14));
        declarationL.setForeground(Color.decode("#343A40"));
        panel.add(declarationL);

        JTextArea declarationArea = new JTextArea(hobbiesReceived[2]);
        declarationArea.setBounds(10, 680, 530, 60);
        panel.add(textPreset(declarationArea));

        //label to to display "SIGNATURE"
        JLabel signL = new JLabel("SIGNATURE");
        signL.setBounds(480,760,70,20);
        signL.setFont(new Font("Seriff",Font.BOLD,12));
        signL.setForeground(Color.decode("#343A40"));
        panel.add(signL);

        ImageIcon darkImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\dark.png");
        JToggleButton toggle = new JToggleButton();
        toggle.setIcon(resizer(darkImage));
        toggle.setBounds(630, 20, 30, 30);
        toggle.setFocusable(false);
        toggle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AbstractButton abstractButton = (AbstractButton)e.getSource();
                boolean selected = abstractButton.getModel().isSelected();
                if(selected) {
                    panel.setBackground(Color.decode("#6C757D"));
                    greenpanel.setBackground(Color.decode("#343A40"));
                    sign.setForeground(Color.white);
                    mailL.setForeground(Color.white);
                    phoneL.setForeground(Color.white);
                    dobL.setForeground(Color.white);
                    locationArea.setForeground(Color.white);
                    educationArea.setForeground(Color.white);
                    coursesArea.setForeground(Color.white);
                    achievementsArea.setForeground(Color.white);
                    skillsArea.setForeground(Color.white);
                    jobArea.setForeground(Color.white);
                    internshipArea.setForeground(Color.white);
                    portfolioArea.setForeground(Color.white);
                    hobbiesArea.setForeground(Color.white);
                    declarationArea.setForeground(Color.white);
                }
                else {
                    panel.setBackground(Color.white);
                    greenpanel.setBackground(Color.decode("#99D6B9"));
                    sign.setForeground(Color.black);
                    mailL.setForeground(Color.black);
                    phoneL.setForeground(Color.black);
                    dobL.setForeground(Color.black);
                    locationArea.setForeground(Color.black);
                    educationArea.setForeground(Color.black);
                    coursesArea.setForeground(Color.black);
                    achievementsArea.setForeground(Color.black);
                    skillsArea.setForeground(Color.black);
                    jobArea.setForeground(Color.black);
                    internshipArea.setForeground(Color.black);
                    portfolioArea.setForeground(Color.black);
                    hobbiesArea.setForeground(Color.black);
                    declarationArea.setForeground(Color.black);

                }
            }
        });


        ImageIcon donwload = new ImageIcon(System.getProperty("user.dir") + "\\images\\download.png");
        JButton downloadBtn = new JButton();
        downloadBtn.setIcon(resizer(donwload));
        downloadBtn.setBounds(630, 60, 30, 30);
        downloadBtn.setFocusable(false);

        downloadBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Container content = panel;
                BufferedImage img = new BufferedImage(content.getWidth(), content.getHeight(), BufferedImage.TYPE_INT_RGB);
                Graphics2D g2d = img.createGraphics();
                content.printAll(g2d);
                g2d.dispose();

                try {
                    JFileChooser j = new JFileChooser();
                    j.setDialogTitle("save as .png");
                    j.showSaveDialog(null);
                    ImageIO.write(img, "png", new File(j.getSelectedFile().getAbsolutePath()));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "Download Successful","Task Completed", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        frame.add(downloadBtn);
        frame.add(toggle);
        frame.add(panel);
        frame.setVisible(true);
        

    }
    ImageIcon resizer(ImageIcon image){

        Image imageget = image.getImage(); // transform it 
        Image newimg = imageget.getScaledInstance(20, 20,  Image.SCALE_SMOOTH);
        return new ImageIcon(newimg);

    }

    JTextArea textPreset(JTextArea text){
        text.setFont(new Font("Montserrat",Font.PLAIN , 14));
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setOpaque(false);
        text.setEditable(false);
        return text;
    }
    JLabel linepreset(JLabel line){
        line.setBackground(Color.decode("#99D6B9"));
        line.setOpaque(true);
        return line;
    }
    
    
}


