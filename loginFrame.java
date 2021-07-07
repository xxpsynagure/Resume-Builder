import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loginFrame {

    loginFrame(){

        JFrame frame = new JFrame();
        frame.setTitle("Resume Builder");
        frame.setSize(350, 600);
        frame.setResizable(false);

        JLabel username = new JLabel("Username:");
        username.setBounds(50, 170, 100, 25);
        username.setFont(new Font("Montserrat", Font.PLAIN, 15));
        frame.add(username);

        JTextField Usernametxt = new JTextField();
        Usernametxt.setBounds(50, 195, 200, 25);
        frame.add(Usernametxt);

        JLabel password = new JLabel("Password: ");
        password.setBounds(50, 225, 100, 25);
        password.setFont(new Font("Montserrat", Font.PLAIN, 15));
        frame.add(password);

        JPasswordField Passwordtxt = new JPasswordField();
        Passwordtxt.setBounds(50, 250, 200, 25);
        frame.add(Passwordtxt);

        JCheckBox chkbox = new JCheckBox("Show Password");
        chkbox.setBounds(52, 282, 150, 20);
        chkbox.setFont(new Font("Montserrat", Font.PLAIN, 12));
        chkbox.setFocusable(false);
        frame.add(chkbox);

        JButton btn = new JButton("Login");
        btn.setBounds(50, 310, 75, 25);
        btn.setFont(new Font("Montserrat", Font.PLAIN, 15));
        btn.setBackground(new Color(0, 95, 135));
        btn.setForeground(new Color(255, 255, 255));
        btn.setOpaque(true);
        btn.setFocusable(false);
        frame.add(btn);

        ImageIcon image = new ImageIcon("logo1.png");
        JLabel lbl = new JLabel();
        lbl.setBounds(50, 10, 350, 100);
        lbl.setIcon(image);
        lbl.setText("Resume Builder");
        //lbl.setVerticalTextPosition(JLabel.BOTTOM);
        lbl.setIconTextGap(-10);
        lbl.setFont(new Font("Mv Boli", Font.PLAIN, 26));
        frame.add(lbl);

        chkbox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (chkbox.isSelected()) {
                    Passwordtxt.setEchoChar((char) 0);
                } else {
                    Passwordtxt.setEchoChar('\u2022');
                }
            }

        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}