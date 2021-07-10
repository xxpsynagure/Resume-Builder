
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*                                           REGISTER FRAME CLASS                                           */

class registerclass {
    public void registerfunction() {
      JFrame registerFrame = new JFrame("Registration Page");
      registerFrame.setSize(500, 500);
      registerFrame.setLayout(null);
      registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
      JLabel nameL = new JLabel("Enter your name:");
      nameL.setBounds(100, 50, 200, 30);
      nameL.setForeground(Color.white);
      nameL.setFont(new Font("MV Boli", Font.PLAIN, 15));
      registerFrame.add(nameL);
  
      /*String[] surlist = { "Mr", "Mrs" };
      JComboBox surlistBox = new JComboBox(surlist);
      surlistBox.setBounds(230, 50, 50, 30);
      registerFrame.add(surlistBox);
      */
  
      JTextField nameT = new JTextField();
      nameT.setBounds(250, 50, 100, 30);
      registerFrame.add(nameT);
  
      JLabel mailidL = new JLabel("Mail ID: ");
      mailidL.setBounds(100, 100, 200, 30);
      mailidL.setForeground(Color.white);
      mailidL.setFont(new Font("MV Boli", Font.PLAIN, 15));
      registerFrame.add(mailidL);
  
      JTextField mailidT = new JTextField();
      mailidT.setBounds(250, 100, 200, 30);
      registerFrame.add(mailidT);
  
      JLabel usernameL = new JLabel("USERNAME: ");
      usernameL.setBounds(100, 150, 200, 30);
      usernameL.setForeground(Color.white);
      usernameL.setFont(new Font("MV Boli", Font.PLAIN, 15));
      registerFrame.add(usernameL);
  
      JTextField usernameT = new JTextField();
      usernameT.setBounds(250, 150, 200, 30);
      registerFrame.add(usernameT);
  
      JLabel passwordL = new JLabel("PASSWORD: ");
      passwordL.setBounds(100, 200, 200, 30);
      passwordL.setForeground(Color.white);
      passwordL.setFont(new Font("MV Boli", Font.PLAIN, 15));
      registerFrame.add(passwordL);
  
      JPasswordField passwordT = new JPasswordField();
      passwordT.setBounds(250, 200, 100, 30);
      registerFrame.add(passwordT);
  
      JButton registerbtn = new JButton("REGISTER");
      registerbtn.setBounds(200, 300, 100, 30);
      registerbtn.setFocusable(false);
      registerFrame.add(registerbtn);
  
      registerbtn.addActionListener(new ActionListener(){
  
        @Override
        public void actionPerformed(ActionEvent e) {
          String Name = nameT.getText();
          String mail = mailidT.getText();
          String userName = usernameT.getText();
          char[] password = passwordT.getPassword();
          System.out.println(Name+"_"+mail+"_"+userName+"_");
          System.out.println(password);
          registerFrame.dispose();
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
          registerFrame.dispose();
          introcall.introfunction();
        }
      });
  
      exitItem.addActionListener(new ActionListener() {
  
        @Override
        public void actionPerformed(ActionEvent e) {
          System.exit(0);
        }
      });
  
      helpMenu.setMnemonic(KeyEvent.VK_H);
      exitItem.setMnemonic(KeyEvent.VK_E); // press alt+F4 to exit the app
  
      helpMenu.add(gobackItem);
      helpMenu.add(exitItem);
  
      menuBar.add(helpMenu);
  
      registerFrame.setJMenuBar(menuBar);
  
      registerFrame.getContentPane().setBackground(Color.black);
      registerFrame.setVisible(true);
    }
  }