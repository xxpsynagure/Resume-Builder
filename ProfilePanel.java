import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ProfilePanel {
    ProfilePanel(JFrame frame,JPanel panel) {
        dbms add=new dbms();
        ArrayList<String> preDefault=add.profilepreDefault();

        //dbms infoadd=new dbms();
        //ArrayList <String> infoDefault=infoadd.profileDefault();

        //panel = new JPanel();
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.decode("#F6D9A1"));
        panel.setLayout(null);

        JLabel title = new JLabel("PERSONAL INFORMATION");
        title.setBounds(253, 15, 494, 43);
        title.setFont(new Font("Roboto", Font.BOLD, 37));
        panel.add(title);

        JLabel ttl = new JLabel("Title");
        ttl.setBounds(161, 118, 28, 16);
        ttl.setFont(new Font("Roboto", 0, 14));
        panel.add(ttl);

        String ttls[] = {"Ms", "Mr", "Mrs"};
        JComboBox<String> ttlBox = new JComboBox<String>(ttls);
        ttlBox.setBounds(161, 141, 67, 22);
        panel.add(ttlBox);

        JLabel fNameL = new JLabel("First Name *");
        fNameL.setBounds(265, 118, 100, 16);
        fNameL.setFont(new Font("Roboto", 0, 14));
        panel.add(fNameL);

        JTextField fName = new JTextField(preDefault.get(0));
        fName.setBounds(265, 141, 147, 22);
        panel.add(fName);

        JLabel lNameL = new JLabel("last Name");
        lNameL.setBounds(473, 118, 100, 16);
        lNameL.setFont(new Font("Roboto", 0, 14));
        panel.add(lNameL);

        JTextField lName = new JTextField();
        lName.setBounds(473, 141, 147, 22);
        panel.add(lName);


        JLabel phnoL = new JLabel("Phone Number");
        phnoL.setBounds(161, 203, 100, 16);
        phnoL.setFont(new Font("Roboto", 0, 14));
        panel.add(phnoL);

        JTextField phno = new JTextField();
        phno.setBounds(161, 226, 147, 22);
        phno.setToolTipText("Enter the phone number followed by your country code");
        panel.add(phno);

        JLabel emailL = new JLabel("Email Address *");
        emailL.setBounds(381, 203, 100, 16);
        emailL.setFont(new Font("Roboto", 0, 14));
        panel.add(emailL);

        JTextField email = new JTextField(preDefault.get(1));
        email.setBounds(381, 226, 200, 22);
        panel.add(email);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(620, 203, 45, 16);
        panel.add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setActionCommand("Male");
        male.setBackground(Color.decode("#F6D9A1"));
        male.setBounds(620, 231, 70, 11);
        male.setSelected(true);
        panel.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setActionCommand("Female");
        female.setBackground(Color.decode("#F6D9A1"));
        female.setBounds(708, 231, 70, 11);
        panel.add(female);

        JRadioButton other = new JRadioButton("Others");
        other.setActionCommand("Others");
        other.setBackground(Color.decode("#F6D9A1"));
        other.setBounds(808, 231, 70, 11);
        panel.add(other);

        ButtonGroup bgGender = new ButtonGroup();
        bgGender.add(male);
        bgGender.add(female);
        bgGender.add(other);



        JLabel dobL = new JLabel("Date of Birth *");
        dobL.setBounds(161, 284, 100, 16);
        dobL.setFont(new Font("Roboto", 0, 14));
        panel.add(dobL);

        JTextField dob = new JTextField();
        dob.setBounds(161, 307, 147, 22);
        dob.setToolTipText("YYYY-MM-DD");
        panel.add(dob);

        JLabel nationL = new JLabel("Nationality *");
        nationL.setBounds(381, 281, 100, 16);
        nationL.setFont(new Font("Roboto", 0, 14));
        panel.add(nationL);

        JTextField nationality = new JTextField();
        nationality.setBounds(381, 307, 147, 22);
        panel.add(nationality);

//-----------------------------------------------------------------       
        JLabel subtitle = new JLabel("Address");
        subtitle.setBounds(161, 358, 100, 28);
        subtitle.setFont(new Font("Roboto", 0, 24));
        panel.add(subtitle);

        JLabel houseNoL = new JLabel("House Number / Name");
        houseNoL.setBounds(161, 405, 150, 16);
        houseNoL.setFont(new Font("Roboto", 0, 14));
        panel.add(houseNoL);

        JTextField houseNo = new JTextField();
        houseNo.setBounds(161, 428, 215, 22);
        panel.add(houseNo);

        JLabel areaL = new JLabel("Area");
        areaL.setBounds(420, 405, 37, 16);
        areaL.setFont(new Font("Roboto", 0, 14));
        panel.add(areaL);

        JTextField area = new JTextField();
        area.setBounds(420, 428, 215, 22);
        panel.add(area);

        JLabel cityL = new JLabel("City *");
        cityL.setBounds(696, 405, 37, 16);
        cityL.setFont(new Font("Roboto", 0, 14));
        panel.add(cityL);

        JTextField city = new JTextField();
        city.setBounds(696, 428, 215, 22);
        panel.add(city);

        JLabel districtL = new JLabel("District *");
        districtL.setBounds(161, 482, 60, 16);
        districtL.setFont(new Font("Roboto", 0, 14));
        panel.add(districtL);

        JTextField district = new JTextField();
        district.setBounds(161, 505, 215, 22);
        panel.add(district);

        JLabel stateL = new JLabel("State *");
        stateL.setBounds(420, 482, 50, 16);
        stateL.setFont(new Font("Roboto", 0, 14));
        panel.add(stateL);

        JTextField state = new JTextField();
        state.setBounds(420, 505, 215, 22);
        panel.add(state);

        JLabel countryL = new JLabel("Country *");
        countryL.setBounds(696, 482, 60, 16);
        countryL.setFont(new Font("Roboto", 0, 14));
        panel.add(countryL);

        JTextField country = new JTextField();
        country.setBounds(696, 505, 215, 22);
        panel.add(country);

        JButton saveBtn = new JButton("SAVE");
        saveBtn.setBounds(908, 572, 100, 20);
        saveBtn.setFont(new Font("Montserrat", Font.PLAIN, 15));
        saveBtn.setBackground(Color.decode("#a5a58d"));
        saveBtn.setForeground(Color.decode("#000000"));
        saveBtn.setOpaque(true);
        saveBtn.setFocusable(false);
        panel.add(saveBtn);
//____________________________________________________________________________________________________
        
        saveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> profileData = new ArrayList<String>();
                profileData.add(String.valueOf(ttlBox.getSelectedItem()));//0
                profileData.add(fName.getText());//1
                profileData.add(lName.getText());//2
                profileData.add(phno.getText());//3
                profileData.add(email.getText());//4
                profileData.add(bgGender.getSelection().getActionCommand());//5
                profileData.add(dob.getText());//6
                profileData.add(nationality.getText());//7
                profileData.add(houseNo.getText());//8
                profileData.add(area.getText());//9
                profileData.add(city.getText());//10
                profileData.add(district.getText());//11
                profileData.add(state.getText());//12
                profileData.add(country.getText());//13
              
                System.out.println(fName.getText().trim());
                if(profileData.get(1).trim().equals("")||profileData.get(4).trim().equals("")||profileData.get(6).trim().equals("")||profileData.get(7).trim().equals("")||profileData.get(10).trim().equals("")||profileData.get(11).trim().equals("")||profileData.get(12).trim().equals("")||profileData.get(13).trim().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"*  Fields Cannot Be Empty","Empty Fields",2);
                }
                else
                {
                    dbms add = new dbms();
                    if(add.profileUpdate(profileData))
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
