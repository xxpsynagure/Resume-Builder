package Prototype;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class loginclass {

  public void loginfunction() {
    
    JFrame loginFrame = new JFrame("Login Page");
    loginFrame.setSize(300, 300);
    loginFrame.setLayout(null);
    loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel title = new JLabel("CV Login");
    title.setBounds(100, 20, 200, 80);
    title.setForeground(Color.white);
    title.setFont(new Font("MV Boli", Font.BOLD, 15));
    loginFrame.add(title);

    JLabel usernameL = new JLabel("USERNAME:");
    usernameL.setBounds(50, 100, 100, 30);
    usernameL.setForeground(Color.white);
    usernameL.setFont(new Font("MV Boli", Font.PLAIN, 15));
    loginFrame.add(usernameL);

    JLabel passwordL = new JLabel("PASSWORD:");
    passwordL.setBounds(50, 150, 100, 30);
    passwordL.setForeground(Color.white);
    passwordL.setFont(new Font("MV Boli", Font.PLAIN, 15));
    loginFrame.add(passwordL);

    JTextField usernameT = new JTextField("USERNAME");
    usernameT.setBounds(150, 100, 100, 30);
    loginFrame.add(usernameT);

    JPasswordField passwordT = new JPasswordField();
    passwordT.setBounds(150, 150, 100, 30);
    loginFrame.add(passwordT);

    JButton loginbtn = new JButton("LOGIN");
    loginbtn.setBounds(100, 200, 80, 30);
    loginbtn.setFocusable(false);
    loginFrame.add(loginbtn);

    loginFrame.getContentPane().setBackground(Color.black);

    loginbtn.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        String name = usernameT.getText();
        char[] pass = passwordT.getPassword();
        System.out.println(name);
        System.out.println(pass);
        loginFrame.dispose();
        // mainPage.newWindow();
      }
    });

    JMenuBar menuBar = new JMenuBar();

    JMenu helpMenu = new JMenu("Settings");
    JMenuItem gobackItem = new JMenuItem("Logout");
    JMenuItem exitItem = new JMenuItem("exit();");

    gobackItem.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        introclass introcall = new introclass();
        loginFrame.dispose();
        introcall.introfunction();
      }
    });

    exitItem.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });

    helpMenu.setMnemonic(KeyEvent.VK_H); // press alt+H to open help window menubar
    exitItem.setMnemonic(KeyEvent.VK_F4); // press alt+F4 to exit the app

    helpMenu.add(gobackItem);
    helpMenu.add(exitItem);

    menuBar.add(helpMenu);

    loginFrame.setJMenuBar(menuBar);

    loginFrame.setVisible(true);
  }
}