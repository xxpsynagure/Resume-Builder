package Resume_Builder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HobbiesPanel{
    
    HobbiesPanel(JFrame frame,JPanel panel) {

        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.decode("#F6D9A1"));//use of hex code to import colors
        panel.setLayout(null);

        JLabel title1 = new JLabel("EXTRA CURRICULUM");
        title1.setBounds(373, 28, 450, 43);
        title1.setFont(new Font("Roboto", Font.BOLD, 37));
        panel.add(title1);

// HOBBIES STARTS
        //label to set up "Hobbies"
        JLabel hobbiesL = new JLabel("Hobbies");
        hobbiesL.setBounds(210, 114, 100, 14);
        hobbiesL.setFont(new Font("Roboto", 0, 14));
        hobbiesL.setForeground(Color.decode("#000000"));//use of hex code to import colors
        panel.add(hobbiesL);
        
        //Text area to to type in details
        JTextArea hobbies = new JTextArea();
        hobbies.setBounds(209, 141, 303, 73);
        hobbies.setLineWrap(true);
        hobbies.setWrapStyleWord(true);
        hobbies.setToolTipText("do not exceed more than 30 words");
        panel.add(hobbies);
        
        //label to set up "Additional Info"
        JLabel voidL = new JLabel("Additional Info");
        voidL.setBounds(607, 114, 100, 14);
        voidL.setFont(new Font("Roboto", 0, 14));
        voidL.setForeground(Color.decode("#000000"));
        panel.add(voidL);
        
        //Text area to fill to additonal info
        JTextArea voidTxt = new JTextArea();
        voidTxt.setBounds(605, 141, 303, 73);
        voidTxt.setLineWrap(true);
        voidTxt.setWrapStyleWord(true);
        voidTxt.setToolTipText("do not exceed more than 30 words");
        panel.add(voidTxt);
//------------------------------------------------------------------

// DECLARATION STARTS
        //label to set up "Declaration"
        JLabel dec = new JLabel("DECLARATION");
        dec.setBounds(410, 325, 350, 43);
        dec.setFont(new Font("Roboto", Font.BOLD, 37));
        panel.add(dec);
        
        //Text area for declaration
        JTextArea decText = new JTextArea();
        decText.setText("I *Enter your name here*, hereby declare that the above information is true to the best of my knowledge and also try to" +
        " be involved in the work where I can utilize skills and creativity involved in the system contributes to the" +
        " growth of organization.");
        decText.setFont(new Font("Serif", 1, 20));
        decText.setBounds(184, 405, 749, 111);
        decText.setLineWrap(true);
        decText.setWrapStyleWord(true);
        decText.setToolTipText("Change as per your requirment");//display informative message
        decText.setOpaque(false);
        panel.add(decText);
        
        //check box to check in "I Agree" by user
        JCheckBox agree = new JCheckBox("I Agree");
        agree.setBounds(189, 508, 150, 20);
        agree.setFocusable(false);
        agree.setFont(new Font("Montserrat", 0, 16));
        agree.setBackground(Color.decode("#F6D9A1"));
        agree.setForeground(Color.decode("#000000"));
        panel.add(agree);
        
        //"Submit" button to submit the entered details and open up Summarize Page
        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(850, 540, 100, 50);
        submitBtn.setOpaque(true);
        submitBtn.setFocusable(false);
        submitBtn.setBackground(Color.decode("#a5a58d"));
        submitBtn.setVisible(false);
        panel.add(submitBtn);

//___________________________________________________________________________________________
    // establishing connection with the database and retrieving Hobbies Data 
        String[] hobbiesReceived = new String[4];
        dbms hobbiesGet=new dbms();
        hobbiesReceived = hobbiesGet.getHobbiesData();
    // Filling the data into respective textFields
        hobbies.setText(hobbiesReceived[0]);
        voidTxt.setText(hobbiesReceived[1]);
        if(hobbiesReceived[2]!=null)
            decText.setText(hobbiesReceived[2]);
//__________________________________________________________________________________________        
        //enabling submit button only after "I Agree" check box is checked
        agree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(agree.isSelected())
                    submitBtn.setVisible(true);
                else
                    submitBtn.setVisible(false);
            }
        });
    
    // When save button is clicked the data are passed as arguments to method in dbms class
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dbms add = new dbms();
                add.hobbyUpdate(hobbies.getText(), voidTxt.getText(),decText.getText());
                new Summarize2();

            }
        });

        frame.add(panel);//add panel to the frame
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
