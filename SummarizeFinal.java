import javax.swing.*;
import java.awt.*;

public class SummarizeFinal {
    static dbms place;
     SummarizeFinal(){
        
        JFrame frame = new JFrame();
        frame.setSize(1470, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setLayout(null);
//---------------------------------------------------------------------------------------
        // ENTERING DETAILS INTO TEXTFIELDS FROM DATABASE   
        String[] profileReceived = new String[15];
        String[] educationReceived = new String[14];
        String[] skillReceived = new String[7];
        String[] hobbiesReceived = new String[4];

        place = new dbms();
        profileReceived =  place.getProfileData();
        place = new dbms();
        educationReceived = place.getEducationData();
        place = new dbms();
        skillReceived = place.getSkillData();
        place = new dbms();
        hobbiesReceived = place.getHobbiesData();    
        

        //---------------------------------------
        //page 1

        JPanel panel1= new JPanel();
        panel1.setBounds(25, 25, 640, 750);
        panel1.setBackground(Color.white);
        panel1.setLayout(null);
        
        JPanel greenpart1= new JPanel();
        greenpart1.setBackground(Color.decode("#99D6B9"));
        greenpart1.setBounds(0, 0, 286, 750);
        greenpart1.setLayout(null);
        panel1.add(greenpart1);

        JLabel name = new JLabel(profileReceived[1] + profileReceived[2]);
        name.setBounds(10,15,300,20);
        name.setFont(new Font("Seriff",Font.BOLD,24));
        greenpart1.add(name);

        ImageIcon mailImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\email.png");
        mailImage=resizer(mailImage);
        JLabel mailL = new JLabel(profileReceived[4]);
        mailL.setIcon(mailImage);
        mailL.setBounds(10, 45, 200, 30);
        mailL.setIconTextGap(10);
        greenpart1.add(mailL);
        
        ImageIcon phoneImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\phone-call.png");
        phoneImage=resizer(phoneImage);
        JLabel phoneL = new JLabel(profileReceived[3]);
        phoneL.setIcon(phoneImage);
        phoneL.setBounds(10, 80, 150, 30);
        phoneL.setIconTextGap(10);
        greenpart1.add(phoneL);

        ImageIcon dobImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\date-of-birth.png");
        dobImage=resizer(dobImage);
        JLabel dobL = new JLabel(profileReceived[6]);
        dobL.setIcon(dobImage);
        dobL.setBounds(10, 120, 150, 30);
        dobL.setIconTextGap(10);
        greenpart1.add(dobL);

        ImageIcon locationImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\pin.png");
        locationImage=resizer(locationImage);
        JLabel locationL = new JLabel();
        locationL.setIcon(locationImage);
        locationL.setBounds(10, 160, 30, 30);
        locationL.setIconTextGap(10);
        greenpart1.add(locationL);

        JTextArea addressArea = new JTextArea();
        addressArea.setText(profileReceived[8]+ ",\n " + profileReceived[9] + ", " + profileReceived[10] + ", " +
                            profileReceived[11] + ",\n " + profileReceived[12] + ", " + profileReceived[13]);
        addressArea.setBounds(40, 170, 225, 90);
        greenpart1.add(textPreset(addressArea));
        
        JLabel skillsL = new JLabel("SKILLS");
        skillsL.setBounds(210, 273, 100, 21);
        skillsL.setFont(new Font("Seriff",Font.BOLD,18));
        greenpart1.add(skillsL);

        JTextArea skillArea = new JTextArea();
        skillArea.setText(skillReceived[3]);
        skillArea.setBounds(10, 300, 270, 180);
        // skillArea.setFont(new Font("Serif",Font.PLAIN , 14));
        // skillArea.setLineWrap(true);
        // skillArea.setWrapStyleWord(true);
        // skillArea.setOpaque(true);
        greenpart1.add(textPreset(skillArea));

        JLabel awardsL = new JLabel("ACHIEVEMENTS");
        awardsL.setBounds(195, 504, 140, 21);
        awardsL.setFont(new Font("Seriff",Font.BOLD,18));
        greenpart1.add(awardsL);

        JTextArea awardsArea = new JTextArea();
        awardsArea.setText(skillReceived[5]);
        awardsArea.setBounds(10, 525, 270, 180);
        greenpart1.add(textPreset(awardsArea));


        JLabel educationL =new JLabel("EDUCATION");
        educationL.setBounds(293,60,150,21);
        educationL.setFont(new Font("Seriff",Font.BOLD,18));
        panel1.add(educationL);

       

        //JLabel hstxt =new JLabel("HIGH SCHOOL");
        //hstxt.set

        
        

       // JTextArea eduArea=new JTextArea();
       // eduArea.setText("mahesh"+"    "+"2017"+"     "+"83.33");
      //  eduArea.setBounds(279,40,327,335);
      //  panel1.add(eduArea);

        
        JLabel jobL =new JLabel("JOB EXPERIENCE");
        jobL.setBounds(292,384,290,21);
        jobL.setFont(new Font("Seriff",Font.BOLD,18));
        panel1.add(jobL);

        JTextArea jobArea = new JTextArea();
        jobArea.setText(skillReceived[0]);
        jobArea.setBounds(296, 420, 320, 320);
        panel1.add(textPreset(jobArea));

        //------------------------------
        //page2

        JPanel panel2= new JPanel();
        panel2.setBounds(750, 25, 640, 750);
        panel2.setBackground(Color.white);
        panel2.setLayout(null);
        
        JPanel greenpart2=new JPanel();
        greenpart2.setBackground(Color.decode("#99D6B9"));
        greenpart2.setBounds(0,0,286,500);
        greenpart2.setLayout(null);
        panel2.add(greenpart2);
        
        JLabel portfolioL = new JLabel("PORTFOLIO");
        portfolioL.setBounds(170,10,150,21);
        portfolioL.setFont(new Font("Seriff",Font.BOLD,18));
        greenpart2.add(portfolioL);

        JTextArea portfolioArea = new JTextArea();
        portfolioArea.setText(skillReceived[4]);
        portfolioArea.setBounds(10, 50, 270, 160);
        greenpart2.add(textPreset(portfolioArea));
        
        JLabel internshipL = new JLabel("INTERNSHIP");
        internshipL.setBounds(170,230,150,21);
        internshipL.setFont(new Font("Seriff",Font.BOLD,18));
        greenpart2.add(internshipL);

        JTextArea internshipArea = new JTextArea();
        internshipArea.setText(skillReceived[1]);
        internshipArea.setBounds(10, 260, 270, 220);
        greenpart2.add(textPreset(internshipArea));
        
        JLabel courseL = new JLabel("COURSES");
        courseL.setBounds(290,25,150,21);
        courseL.setFont(new Font("Seriff",Font.BOLD,18));
        panel2.add(courseL);

        JTextArea courseArea = new JTextArea();
        courseArea.setText(skillReceived[2]);
        courseArea.setBounds(300, 50, 310, 160);
        panel2.add(textPreset(courseArea));
        
        JLabel hobbiesL = new JLabel("HOBBIES");
        hobbiesL.setBounds(290,265,150,21);
        hobbiesL.setFont(new Font("Seriff",Font.BOLD,18));
        panel2.add(hobbiesL);

        JTextArea hobbiesArea = new JTextArea();
        hobbiesArea.setText(hobbiesReceived[0]);
        hobbiesArea.setBounds(300, 300, 310, 160);
        panel2.add(textPreset(hobbiesArea));

        JLabel declarationL = new JLabel("DECLARATION:");
        declarationL.setBounds(10,520,200,21);
        declarationL.setFont(new Font("Seriff",Font.BOLD,18));
        panel2.add(declarationL);

        JTextArea declarationArea = new JTextArea();
        declarationArea.setText(hobbiesReceived[2]);
        declarationArea.setBounds(10, 550, 595, 100);
        panel2.add(textPreset(declarationArea));

        
        JLabel signL = new JLabel("signature");
        signL.setBounds(500,713,200,28);
        signL.setFont(new Font("Seriff",Font.BOLD,18));
        panel2.add(signL);

        
        frame.add(panel1);
        frame.add(panel2);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

 //-------------------------------------------------------------------------------
 
    }
        ImageIcon resizer(ImageIcon image){

            Image imageget = image.getImage(); // transform it 
            Image newimg = imageget.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
            return new ImageIcon(newimg);

        }
        JTextArea textPreset(JTextArea text){
            text.setFont(new Font("Serif",Font.PLAIN , 14));
            text.setLineWrap(true);
            text.setWrapStyleWord(true);
            text.setOpaque(true);
            return text;
        }
//---------------------------------------------------------------------------------------------------
        

}
    

