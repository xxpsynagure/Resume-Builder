import javax.swing.*;
//import javax.swing.plaf.FontUIResource;
import java.awt.event.*;
import java.awt.*;

/*                                          INTRODUCTION FRAME CLASS                                            */
class introclass {
  public void introfunction() {
    JFrame introFrame = new JFrame("Introduction Page");
    introFrame.setSize(500, 500);
    introFrame.setLayout(null);
    introFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    introFrame.setResizable(false);

    JLabel title = new JLabel("CURRICULUM VITAE");
    title.setBounds(150, 50, 200, 40);
    title.setForeground(Color.white);
    title.setFont(new Font("MV Boli", Font.BOLD, 15));
    introFrame.add(title);

    JButton loginbtn = new JButton("SIGN IN");
    loginbtn.setBounds(100, 350, 100, 40);
    loginbtn.setFocusable(false);
    introFrame.add(loginbtn);

    JButton registerbtn = new JButton("SIGN UP");
    registerbtn.setBounds(300, 350, 100, 40);
    registerbtn.setFocusable(false);
    introFrame.add(registerbtn);

    ImageIcon img = new ImageIcon("leaflogo.jpg");
    introFrame.setIconImage(img.getImage());

    introFrame.getContentPane().setBackground(new Color(0, 0, 0));
    JLabel leaf = new JLabel(new ImageIcon("leaflogo.jpg"));
    leaf.setBounds(0, 20, 500, 500);
    introFrame.add(leaf);

    loginbtn.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        introFrame.dispose();
        loginclass logincall = new loginclass();
        logincall.loginfunction();
        // JOptionPane.showMessageDialog(null, "Will Add soon!!", "Message box",
        // JOptionPane.INFORMATION_MESSAGE);
      }
    });

    registerbtn.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        registerclass registercall = new registerclass();
        introFrame.dispose();
        // JOptionPane.showMessageDialog(null, "Under Production", "Message box", JOptionPane.INFORMATION_MESSAGE);
        registercall.registerfunction();
      }
    });

    introFrame.setVisible(true);
  }

}
// ---------------------------------------------------------------------------------------------------------------------------------
// ================================================================================================================================+

/*                                                         LOGIN FRAME CLASS                                                          */
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
    JMenuItem gobackItem = new JMenuItem("Go Back");
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
// ---------------------------------------------------------------------------------------------------------------------------
// ===========================================================================================================================

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
    JMenuItem gobackItem = new JMenuItem("Go Back");
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
// --------------------------------------------------------------------------------------------------------------------
// ====================================================================================================================

/*                                                MAIN CLASS                                                                  */
class Main {
  public static void main(String args[]) {
    introclass introcall = new introclass();
    introcall.introfunction();

  }
}
