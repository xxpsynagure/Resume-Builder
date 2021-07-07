import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//loginframe
public class loginFrame {

    loginFrame(){

        JFrame frame = new JFrame();
        frame.setTitle("Resume Builder");
        frame.setSize(350, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        // Testing JPanel and adding components
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 350, 600);
        panel.setBackground(new Color(150,150,150));
        //panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setLayout(new BorderLayout());
        panel.setLayout(null);
        
        

        JLabel username = new JLabel("Username:");
        username.setBounds(50, 170, 100, 25);
        username.setFont(new Font("Montserrat", Font.PLAIN, 15));
        panel.add(username);

        JTextField Usernametxt = new JTextField();
        Usernametxt.setBounds(50, 195, 200, 25);
        panel.add(Usernametxt);

        JLabel password = new JLabel("Password: ");
        password.setBounds(50, 225, 100, 25);
        password.setFont(new Font("Montserrat", Font.PLAIN, 15));
        panel.add(password);

        JPasswordField Passwordtxt = new JPasswordField();
        Passwordtxt.setBounds(50, 250, 200, 25);
        panel.add(Passwordtxt);

        JCheckBox chkbox = new JCheckBox("Show Password");
        chkbox.setBounds(52, 282, 150, 20);
        chkbox.setFont(new Font("Montserrat", Font.PLAIN, 12));
        chkbox.setFocusable(false);
        chkbox.setBackground(new Color(150,150,150));
        panel.add(chkbox);

        JButton loginBtn = new JButton("Sign in");
        loginBtn.setBounds(50, 310, 100, 25);
        loginBtn.setFont(new Font("Montserrat", Font.PLAIN, 15));
        loginBtn.setBackground(new Color(0, 95, 135));
        loginBtn.setForeground(new Color(255, 255, 255));
        loginBtn.setOpaque(true);
        loginBtn.setFocusable(false);
        panel.add(loginBtn);

        JButton registerBtn = new JButton("Sign up");
        registerBtn.setBounds(175, 310, 100, 25);
        registerBtn.setFont(new Font("Montserrat", Font.PLAIN, 15));
        registerBtn.setBackground(new Color(0, 95, 135));
        registerBtn.setForeground(new Color(255, 255, 255));
        registerBtn.setOpaque(true);
        registerBtn.setFocusable(false);
        panel.add(registerBtn);

        //ImageIcon image = new ImageIcon("logo.png");
        JLabel lbl = new JLabel();
        lbl.setBounds(55, 10, 350, 100);
        //lbl.setIcon(image);
        lbl.setText("Resume Builder");
        lbl.setVerticalTextPosition(JLabel.TOP);
        lbl.setHorizontalTextPosition(JLabel.CENTER);
        lbl.setIconTextGap(-10);
        lbl.setFont(new Font("Mv Boli", Font.BOLD, 26));
        panel.add(lbl);

        chkbox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (chkbox.isSelected()) {
                    Passwordtxt.setEchoChar((char) 0);
                } else {
                    Passwordtxt.setEchoChar('\u2022');
                }
            }

        });

        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Login Successfull", "Message box", JOptionPane.INFORMATION_MESSAGE);
            }
        });



        frame.add(panel);
        frame.setVisible(true);

    }
}