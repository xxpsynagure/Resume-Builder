package Resume_Builder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class EducationPanel {
    EducationPanel(JFrame frame,JPanel panel) {
        
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.decode("#F6D9A1"));//use of hex code to import colors
        panel.setLayout(null);
        
        //label to display "Education"
        JLabel title = new JLabel("EDUCATION");
        title.setBounds(379, 11, 242, 43);
        title.setFont(new Font("Roboto", Font.BOLD, 37));
        panel.add(title);

// SECONDARY SCHOOL DETAILS
        //label to display "Secondory School Details"
        JLabel subtitle1 = new JLabel("Secondory School Details");
        subtitle1.setBounds(150, 76, 250, 21);
        subtitle1.setFont(new Font("Roboto",Font.PLAIN, 18));
        subtitle1.setForeground(Color.RED);
        panel.add(subtitle1);

        //label to display "School"
        JLabel schoolL = new JLabel("School ");
        schoolL.setBounds(150, 113, 60, 25);
        schoolL.setFont(new Font("Roboto", Font.PLAIN, 14));
        schoolL.setForeground(Color.decode("#000000"));//use of hex code to import colors
        panel.add(schoolL);
        
        //text field to enter school name
        JTextField school = new JTextField();
        school.setBounds(150, 135, 187, 25);
        panel.add(school);
        
        //label to display "Year of completion"
        JLabel SYearL = new JLabel("Year of Completion ");
        SYearL.setBounds(404, 113, 150, 16);
        SYearL.setFont(new Font("Roboto", Font.PLAIN, 14));
        SYearL.setForeground(Color.decode("#000000"));
        panel.add(SYearL);
        
        //text field to enter year of completion
        JTextField SYear = new JTextField();
        SYear.setBounds(404, 135, 187, 25);
        panel.add(SYear);
        
        //label to display "Perfomance"
        JLabel SPerformanceL = new JLabel("Performance *");
        SPerformanceL.setBounds(665, 113, 100, 16);
        SPerformanceL.setFont(new Font("Roboto", 0, 14));
        SPerformanceL.setForeground(Color.decode("#000000"));
        panel.add(SPerformanceL);
        
        //Text field to enter performace
        JTextField SPerformance = new JTextField();
        SPerformance.setBounds(665, 135, 187, 25);
        SPerformance.setToolTipText("Enter in %age");
        panel.add(SPerformance);
//--------------------------------------

// HIGHER SECONDARY SCHOOL DETAILS
        //label to display "Higher Secondary School Details"
        JLabel subtitle2 = new JLabel("Higher Secondary School Details");
        subtitle2.setBounds(150, 211, 360, 21);
        subtitle2.setFont(new Font("Roboto",Font.PLAIN, 18));
        subtitle2.setForeground(Color.RED);
        panel.add(subtitle2);
        
        //label to display "School"
        JLabel HschoolL = new JLabel("School *");
        HschoolL.setBounds(153, 249, 60, 25);
        HschoolL.setFont(new Font("Roboto", Font.PLAIN, 14));
        HschoolL.setForeground(Color.decode("#000000"));
        panel.add(HschoolL);

        //text field to enter school name
        JTextField Hschool = new JTextField();
        Hschool.setBounds(150, 271, 187, 25);
        panel.add(Hschool);

        //label to display "Year of Completion "
        JLabel HSYearL = new JLabel("Year of Completion *");
        HSYearL.setBounds(404, 249, 150, 16);
        HSYearL.setFont(new Font("Roboto", Font.PLAIN, 14));
        panel.add(HSYearL);
        
        //text field to enter year of completion
        JTextField HSYear = new JTextField();
        HSYear.setBounds(404, 271, 187, 25);
        panel.add(HSYear);

        //label to display "Perfomance"
        JLabel HSPerformanceL = new JLabel("Performance *");
        HSPerformanceL.setBounds(665, 249, 100, 16);
        HSPerformanceL.setFont(new Font("Roboto", 0, 14));
        HSPerformanceL.setForeground(Color.decode("#000000"));
        panel.add(HSPerformanceL);

        //Text field to enter performace
        JTextField HSPerformance = new JTextField();
        HSPerformance.setBounds(665, 271, 187, 25);
        HSPerformance.setToolTipText("Enter in %age ");
        panel.add(HSPerformance);
        
        //label to display "Stream"
        JLabel HStreamL = new JLabel("Stream");
        HStreamL.setBounds(150, 321, 60, 25);
        HStreamL.setFont(new Font("Roboto", 0, 14));
        HStreamL.setForeground(Color.decode("#000000"));
        panel.add(HStreamL);

        //text field to enter the stream
        JTextField HStream = new JTextField();
        HStream.setBounds(150, 346, 187, 25);
        panel.add(HStream);
//--------------------------------------------------------

//GRADUATION DETAILS
        //label to display "Graduation Details"
        JLabel subtitle3 = new JLabel("Graduation Details");
        subtitle3.setBounds(150, 402, 360, 21);
        subtitle3.setFont(new Font("Roboto",Font.PLAIN, 18));
        subtitle3.setForeground(Color.RED);
        panel.add(subtitle3);

        //label to display "College"
        JLabel collegeL = new JLabel("College *");
        collegeL.setBounds(153, 433, 60, 25);
        collegeL.setFont(new Font("Roboto", Font.PLAIN, 14));
        collegeL.setForeground(Color.decode("#000000"));
        panel.add(collegeL);

        //text field to enter college name
        JTextField college = new JTextField();
        college.setBounds(150, 455, 187, 25);
        panel.add(college);

        //label to display "Start Year"
        JLabel startYearL = new JLabel("Start Year *");
        startYearL.setBounds(404, 433, 130, 16);
        startYearL.setFont(new Font("Roboto", Font.PLAIN, 14));
        startYearL.setForeground(Color.decode("#000000"));
        panel.add(startYearL);

        //text field to enter Start Year
        JTextField startYear = new JTextField();
        startYear.setBounds(404, 455, 187, 25);
        panel.add(startYear);

        //label to display "End year"
        JLabel endYearL = new JLabel("End Year");
        endYearL.setBounds(665, 433, 100, 16);
        endYearL.setFont(new Font("Roboto", 0, 14));
        endYearL.setForeground(Color.decode("#000000"));
        panel.add(endYearL);

        //text field to enter end year
        JTextField endYear = new JTextField();
        endYear.setBounds(665, 455, 187, 25);
        panel.add(endYear);
 
        //label to display "Degree"
        JLabel DegreeL = new JLabel("Degree *");
        DegreeL.setBounds(150, 505, 60, 25);
        DegreeL.setFont(new Font("Roboto", 0, 14));
        DegreeL.setForeground(Color.decode("#000000"));
        panel.add(DegreeL);
 
        //text field to enter degree
        JTextField Degree = new JTextField();
        Degree.setBounds(150, 530, 187, 25);
        panel.add(Degree);    
        
        //label to display "Stream"
        JLabel clgStreamL = new JLabel("Stream *");
        clgStreamL.setBounds(404, 508, 130, 16);
        clgStreamL.setFont(new Font("Roboto", Font.PLAIN, 14));
        clgStreamL.setForeground(Color.decode("#000000"));
        panel.add(clgStreamL);

        //text field to enter stream
        JTextField clgStream = new JTextField();
        clgStream.setBounds(404, 530, 187, 25);
        panel.add(clgStream);

        //label to display "Performance"
        JLabel clgPerformanceL = new JLabel("Performance *");
        clgPerformanceL.setBounds(665, 508, 100, 16);
        clgPerformanceL.setFont(new Font("Roboto", 0, 14));
        clgPerformanceL.setForeground(Color.decode("#000000"));
        panel.add(clgPerformanceL);

        //text field to enter performance
        JTextField clgPerformance = new JTextField();
        clgPerformance.setBounds(665, 530, 187, 25);
        clgPerformance.setToolTipText("Enter in %age ");
        panel.add(clgPerformance);
//----------------------------------------------------------
        String[] educationReceived = new String[14];
        dbms educationGet = new dbms();
        educationReceived = educationGet.getEducationData();
        
        school.setText(educationReceived[0]);
        SYear.setText(educationReceived[1]);
        SPerformance.setText(educationReceived[2]);
        Hschool.setText(educationReceived[3]);
        HSYear.setText(educationReceived[4]);
        HSPerformance.setText(educationReceived[5]);
        HStream.setText(educationReceived[6]);
        college.setText(educationReceived[7]);
        startYear.setText(educationReceived[8]);
        endYear.setText(educationReceived[9]);
        Degree.setText(educationReceived[10]);
        clgStream.setText(educationReceived[11]);
        clgPerformance.setText(educationReceived[12]);

//----------------------------------------------------------
//"Save" button to save the details
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

        if(educationData.get(2).trim().equals("")||educationData.get(3).trim().equals("")||educationData.get(4).trim().equals("")||educationData.get(5).trim().equals("")||educationData.get(7).trim().equals("")||educationData.get(8).trim().equals("")||educationData.get(10).trim().equals("")||educationData.get(11).trim().equals("")||educationData.get(12).trim().equals(""))
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

        frame.add(panel);//add panel to the frame
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
    }
}
