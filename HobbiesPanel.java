import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HobbiesPanel extends dbms{
    HobbiesPanel(JFrame frame,JPanel panel) {

        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(1000,600));
        panel.setBackground(Color.decode("#F6D9A1"));
        panel.setLayout(null);

        JLabel title1 = new JLabel("EXTRA CURRICULUM");
        title1.setBounds(373, 28, 450, 43);
        title1.setFont(new Font("Roboto", Font.BOLD, 37));
        panel.add(title1);

// HOBBIES STARTS
        JLabel hobbiesL = new JLabel("Hobbies");
        hobbiesL.setBounds(210, 114, 100, 14);
        hobbiesL.setFont(new Font("Roboto", 0, 14));
        hobbiesL.setForeground(Color.decode("#000000"));
        panel.add(hobbiesL);

        JTextArea hobbies = new JTextArea();
        hobbies.setBounds(209, 141, 303, 73);
        hobbies.setLineWrap(true);
        hobbies.setWrapStyleWord(true);
        hobbies.setToolTipText("do not exceed more than 30 words");
        panel.add(hobbies);

        JLabel voidL = new JLabel("Additional Info");
        voidL.setBounds(607, 114, 100, 14);
        voidL.setFont(new Font("Roboto", 0, 14));
        voidL.setForeground(Color.decode("#000000"));
        panel.add(voidL);

        JTextArea voidTxt = new JTextArea();
        voidTxt.setBounds(605, 141, 303, 73);
        voidTxt.setLineWrap(true);
        voidTxt.setWrapStyleWord(true);
        voidTxt.setToolTipText("do not exceed more than 30 words");
        panel.add(voidTxt);
//------------------------------------------------------------------

// DECLARATION STARTS
        JLabel dec = new JLabel("DECLARATION");
        dec.setBounds(410, 325, 350, 43);
        dec.setFont(new Font("Roboto", Font.BOLD, 37));
        panel.add(dec);

        JTextArea decText = new JTextArea();
        decText.setText("I *Enter your name here*, hereby declare that the above information is true to the best of my knowledge and also try to" +
        " be involved in the work where I can utilize skills and creativity involved in the system contributes to the" +
        " growth of organization.");
        decText.setFont(new Font("Serif", 1, 20));
        decText.setBounds(184, 405, 749, 111);
        decText.setLineWrap(true);
        decText.setWrapStyleWord(true);
        decText.setToolTipText("Change as per your requirment");
        decText.setOpaque(false);
        panel.add(decText);

        JCheckBox agree = new JCheckBox("I Agree");
        agree.setBounds(189, 508, 150, 20);
        agree.setFocusable(false);
        agree.setFont(new Font("Montserrat", 0, 16));
        agree.setBackground(Color.decode("#F6D9A1"));
        agree.setForeground(Color.decode("#000000"));
        panel.add(agree);

        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(850, 540, 100, 50);
        submitBtn.setOpaque(true);
        submitBtn.setFocusable(false);
        submitBtn.setBackground(Color.decode("#a5a58d"));
        submitBtn.setVisible(false);
        panel.add(submitBtn);

//___________________________________________________________________________________________
        String[] hobbiesReceived = new String[4];
        dbms hobbiesGet=new dbms();
        hobbiesReceived = hobbiesGet.getHobbiesData();

        hobbies.setText(hobbiesReceived[0]);
        voidTxt.setText(hobbiesReceived[1]);
        if(hobbiesReceived[2]!=null||hobbiesReceived[2]!="")
            decText.setText(hobbiesReceived[2]);
//__________________________________________________________________________________________        
        agree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(agree.isSelected())
                    submitBtn.setVisible(true);
                else
                    submitBtn.setVisible(false);
            }
        });
    
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dbms add = new dbms();
                add.hobbyUpdate(hobbies.getText(), voidTxt.getText(),decText.getText());
                frame.dispose();
                new SummarizeFinal();

            }
        });

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
