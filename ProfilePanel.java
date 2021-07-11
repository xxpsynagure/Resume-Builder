import javax.swing.*;
import java.awt.*;

public class ProfilePanel {
    ProfilePanel(JFrame frame,JPanel panel) {
        //panel = new JPanel();
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.gray);
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
        JComboBox ttlBox = new JComboBox(ttls);
        ttlBox.setBounds(161, 141, 67, 22);
        panel.add(ttlBox);

        JLabel fNameL = new JLabel("First Name");
        fNameL.setBounds(265, 118, 100, 16);
        fNameL.setFont(new Font("Roboto", 0, 14));
        panel.add(fNameL);

        JTextField fName = new JTextField();
        fName.setBounds(265, 141, 147, 22);
        panel.add(fName);

        JLabel mNameL = new JLabel("last Name");
        mNameL.setBounds(473, 118, 100, 16);
        mNameL.setFont(new Font("Roboto", 0, 14));
        panel.add(mNameL);

        JTextField mName = new JTextField();
        mName.setBounds(473, 141, 147, 22);
        panel.add(mName);


        JLabel phnoL = new JLabel("Phone Number");
        phnoL.setBounds(161, 203, 100, 16);
        phnoL.setFont(new Font("Roboto", 0, 14));
        panel.add(phnoL);

        JTextField phno = new JTextField();
        phno.setBounds(161, 226, 147, 22);
        panel.add(phno);

        JLabel emailL = new JLabel("Email Address");
        emailL.setBounds(381, 203, 100, 16);
        emailL.setFont(new Font("Roboto", 0, 14));
        panel.add(emailL);

        JTextField email = new JTextField();
        email.setBounds(381, 226, 147, 22);
        panel.add(email);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(620, 203, 45, 16);
        panel.add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBackground(Color.gray);
        male.setBounds(620, 231, 70, 11);
        male.setSelected(true);
        panel.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBackground(Color.gray);
        female.setBounds(708, 231, 70, 11);
        panel.add(female);

        JRadioButton other = new JRadioButton("Other");
        other.setBackground(Color.gray);
        other.setBounds(808, 231, 70, 11);
        panel.add(other);

        ButtonGroup bgGender = new ButtonGroup();
        bgGender.add(male);
        bgGender.add(female);
        bgGender.add(other);



        JLabel dobL = new JLabel("Date of Birth");
        dobL.setBounds(161, 284, 100, 16);
        dobL.setFont(new Font("Roboto", 0, 14));
        panel.add(dobL);

        JTextField dob = new JTextField();
        dob.setBounds(161, 307, 147, 22);
        panel.add(dob);

        JLabel nationL = new JLabel("Nationality");
        nationL.setBounds(381, 281, 100, 16);
        nationL.setFont(new Font("Roboto", 0, 14));
        panel.add(nationL);

        JTextField nationality = new JTextField();
        nationality.setBounds(381, 307, 147, 22);
        panel.add(nationality);

        JLabel subtitle = new JLabel("Address");
        subtitle.setBounds(161, 358, 100, 28);
        subtitle.setFont(new Font("Roboto", 0, 24));
        panel.add(subtitle);

        JLabel streetL = new JLabel("Street");
        streetL.setBounds(161, 405, 50, 16);
        streetL.setFont(new Font("Roboto", 0, 14));
        panel.add(streetL);

        JTextField street = new JTextField();
        street.setBounds(161, 428, 215, 22);
        panel.add(street);

        JLabel areaL = new JLabel("Area");
        areaL.setBounds(420, 405, 37, 16);
        areaL.setFont(new Font("Roboto", 0, 14));
        panel.add(areaL);

        JTextField area = new JTextField();
        area.setBounds(420, 428, 215, 22);
        panel.add(area);

        JLabel cityL = new JLabel("City");
        cityL.setBounds(696, 405, 37, 16);
        cityL.setFont(new Font("Roboto", 0, 14));
        panel.add(cityL);

        JTextField city = new JTextField();
        city.setBounds(696, 428, 215, 22);
        panel.add(city);

        JLabel districtL = new JLabel("District");
        districtL.setBounds(161, 482, 50, 16);
        districtL.setFont(new Font("Roboto", 0, 14));
        panel.add(districtL);

        JTextField district = new JTextField();
        district.setBounds(161, 505, 215, 22);
        panel.add(district);

        JLabel stateL = new JLabel("State");
        stateL.setBounds(420, 482, 37, 16);
        stateL.setFont(new Font("Roboto", 0, 14));
        panel.add(stateL);

        JTextField state = new JTextField();
        state.setBounds(420, 505, 215, 22);
        panel.add(state);

        JLabel countryL = new JLabel("Country");
        countryL.setBounds(696, 482, 50, 16);
        countryL.setFont(new Font("Roboto", 0, 14));
        panel.add(countryL);

        JTextField country = new JTextField();
        country.setBounds(696, 505, 215, 22);
        panel.add(country);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
