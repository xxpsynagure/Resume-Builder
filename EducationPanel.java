import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class EducationPanel {
    EducationPanel(JFrame frame,JPanel panel) {
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.decode("#F6D9A1"));
        panel.setLayout(null);

        JLabel title = new JLabel("EDUCATION");
        title.setBounds(379, 11, 242, 43);
        title.setFont(new Font("Roboto", Font.BOLD, 37));
        panel.add(title);

// SECONDARY SCHOOL DETAILS
        JLabel subtitle1 = new JLabel("Secondory School Details");
        subtitle1.setBounds(150, 76, 250, 21);
        subtitle1.setFont(new Font("Roboto",Font.PLAIN, 18));
        subtitle1.setForeground(Color.RED);
        panel.add(subtitle1);

        JLabel schoolL = new JLabel("School ");
        schoolL.setBounds(150, 113, 60, 25);
        schoolL.setFont(new Font("Roboto", Font.PLAIN, 14));
        schoolL.setForeground(Color.decode("#000000"));
        panel.add(schoolL);

        JTextField school = new JTextField();
        school.setBounds(150, 135, 187, 25);
        panel.add(school);

        JLabel SYearL = new JLabel("Year of Completion ");
        SYearL.setBounds(404, 113, 130, 16);
        SYearL.setFont(new Font("Roboto", Font.PLAIN, 14));
        SYearL.setForeground(Color.decode("#000000"));
        panel.add(SYearL);

        JTextField SYear = new JTextField();
        SYear.setBounds(404, 135, 187, 25);
        panel.add(SYear);

        JLabel SPerformanceL = new JLabel("Performance");
        SPerformanceL.setBounds(665, 113, 100, 16);
        SPerformanceL.setFont(new Font("Roboto", 0, 14));
        SPerformanceL.setForeground(Color.decode("#000000"));
        panel.add(SPerformanceL);

        JTextField SPerformance = new JTextField();
        SPerformance.setBounds(665, 135, 187, 25);
        SPerformance.setToolTipText("Enter in %age");
        panel.add(SPerformance);
//--------------------------------------

// HIGHER SECONDARY SCHOOL DETAILS
        JLabel subtitle2 = new JLabel("Higher Secondary School Details");
        subtitle2.setBounds(150, 211, 360, 21);
        subtitle2.setFont(new Font("Roboto",Font.PLAIN, 18));
        subtitle2.setForeground(Color.RED);
        panel.add(subtitle2);

        JLabel HschoolL = new JLabel("School *");
        HschoolL.setBounds(153, 249, 60, 25);
        HschoolL.setFont(new Font("Roboto", Font.PLAIN, 14));
        HschoolL.setForeground(Color.decode("#000000"));
        panel.add(HschoolL);

        JTextField Hschool = new JTextField();
        Hschool.setBounds(150, 271, 187, 25);
        panel.add(Hschool);

        JLabel HSYearL = new JLabel("Year of Completion *");
        HSYearL.setBounds(404, 249, 130, 16);
        HSYearL.setFont(new Font("Roboto", Font.PLAIN, 14));
        panel.add(HSYearL);

        JTextField HSYear = new JTextField();
        HSYear.setBounds(404, 271, 187, 25);
        panel.add(HSYear);

        JLabel HSPerformanceL = new JLabel("Performance *");
        HSPerformanceL.setBounds(665, 249, 100, 16);
        HSPerformanceL.setFont(new Font("Roboto", 0, 14));
        HSPerformanceL.setForeground(Color.decode("#000000"));
        panel.add(HSPerformanceL);

        JTextField HSPerformance = new JTextField();
        HSPerformance.setBounds(665, 271, 187, 25);
        HSPerformance.setToolTipText("Enter in %age ");
        panel.add(HSPerformance);

        JLabel HStreamL = new JLabel("Stream");
        HStreamL.setBounds(150, 321, 60, 25);
        HStreamL.setFont(new Font("Roboto", 0, 14));
        HStreamL.setForeground(Color.decode("#000000"));
        panel.add(HStreamL);

        JTextField HStream = new JTextField();
        HStream.setBounds(150, 346, 187, 25);
        panel.add(HStream);
//--------------------------------------------------------

//GRADUATION DETAILS
        JLabel subtitle3 = new JLabel("Graduation Details");
        subtitle3.setBounds(150, 402, 360, 21);
        subtitle3.setFont(new Font("Roboto",Font.PLAIN, 18));
        subtitle3.setForeground(Color.RED);
        panel.add(subtitle3);

        JLabel collegeL = new JLabel("College *");
        collegeL.setBounds(153, 433, 60, 25);
        collegeL.setFont(new Font("Roboto", Font.PLAIN, 14));
        collegeL.setForeground(Color.decode("#000000"));
        panel.add(collegeL);

        JTextField college = new JTextField();
        college.setBounds(150, 455, 187, 25);
        panel.add(college);

        JLabel startYearL = new JLabel("Start Year *");
        startYearL.setBounds(404, 433, 130, 16);
        startYearL.setFont(new Font("Roboto", Font.PLAIN, 14));
        startYearL.setForeground(Color.decode("#000000"));
        panel.add(startYearL);

        JTextField startYear = new JTextField();
        startYear.setBounds(404, 455, 187, 25);
        panel.add(startYear);

        JLabel endYearL = new JLabel("End Year");
        endYearL.setBounds(665, 433, 100, 16);
        endYearL.setFont(new Font("Roboto", 0, 14));
        endYearL.setForeground(Color.decode("#000000"));
        panel.add(endYearL);

        JTextField endYear = new JTextField();
        endYear.setBounds(665, 455, 187, 25);
        panel.add(endYear);

        JLabel DegreeL = new JLabel("Degree *");
        DegreeL.setBounds(150, 505, 60, 25);
        DegreeL.setFont(new Font("Roboto", 0, 14));
        DegreeL.setForeground(Color.decode("#000000"));
        panel.add(DegreeL);

        JTextField Degree = new JTextField();
        Degree.setBounds(150, 530, 187, 25);
        panel.add(Degree);    
        
        JLabel clgStreamL = new JLabel("Stream *");
        clgStreamL.setBounds(404, 508, 130, 16);
        clgStreamL.setFont(new Font("Roboto", Font.PLAIN, 14));
        clgStreamL.setForeground(Color.decode("#000000"));
        panel.add(clgStreamL);

        JTextField clgStream = new JTextField();
        clgStream.setBounds(404, 530, 187, 25);
        panel.add(clgStream);

        JLabel clgPerformanceL = new JLabel("Performance *");
        clgPerformanceL.setBounds(665, 508, 100, 16);
        clgPerformanceL.setFont(new Font("Roboto", 0, 14));
        clgPerformanceL.setForeground(Color.decode("#000000"));
        panel.add(clgPerformanceL);

        JTextField clgPerformance = new JTextField();
        clgPerformance.setBounds(665, 530, 187, 25);
        clgPerformance.setToolTipText("Enter in %age ");
        panel.add(clgPerformance);
//----------------------------------------------------------

JButton saveBtn = new JButton("SAVE");
saveBtn.setBounds(908, 572, 100, 20);
saveBtn.setFont(new Font("Montserrat", Font.PLAIN, 15));
saveBtn.setBackground(Color.decode("#a5a58d"));
saveBtn.setForeground(Color.decode("#000000"));
saveBtn.setOpaque(true);
saveBtn.setFocusable(false);
panel.add(saveBtn);

saveBtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        ArrayList<String> educationData = new ArrayList<String>();
        educationData.add(school.getText());//0
        educationData.add(SYear.getText());//1
        educationData.add(SPerformance.getText());//2
        educationData.add(Hschool.getText());//3
        educationData.add(HSYear.getText());//4
        educationData.add(HSPerformance.getText());//5
        educationData.add(HStream.getText());//6
        educationData.add(college.getText());//7
        educationData.add(startYear.getText());//8
        educationData.add(endYear.getText());//9
        educationData.add(Degree.getText());//10
        educationData.add(clgStream.getText());//11
        educationData.add(clgPerformance.getText());//12

        if(educationData.get(3).trim().equals("")||educationData.get(4).trim().equals("")||educationData.get(5).trim().equals("")||educationData.get(7).trim().equals("")||educationData.get(8).trim().equals("")||educationData.get(10).trim().equals("")||educationData.get(11).trim().equals("")||educationData.get(12).trim().equals(""))
        {
            JOptionPane.showMessageDialog(null,"*  Fields Cannot Be Empty","Empty Fields",2);
        }
        else{
            dbms add = new dbms();
            if(add.educationUpdate(educationData))
            {
                JOptionPane.showMessageDialog(null, "Save Successful","Message Box", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
});        

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
    }
}
