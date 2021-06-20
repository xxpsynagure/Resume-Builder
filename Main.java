import javax.swing.*;
//import javax.swing.plaf.FontUIResource;
import java.awt.event.*;
import java.awt.*;

/*                                          INTRODUCTION FRAME CLASS                                            */
class introclass {
  public void introfunction() {
    JFrame introFrame = new JFrame("Intro Page");
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
        // JOptionPane.showMessageDialog(null, "Under Production", "Message box",
        // JOptionPane.INFORMATION_MESSAGE);
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
    loginFrame.add(title);

    JLabel usernameT = new JLabel("USERNAME:");
    usernameT.setBounds(50, 100, 100, 30);
    usernameT.setForeground(Color.white);
    loginFrame.add(usernameT);

    JLabel passwordT = new JLabel("PASSWORD:");
    passwordT.setBounds(50, 150, 100, 30);
    passwordT.setForeground(Color.white);
    loginFrame.add(passwordT);

    JTextField username = new JTextField("USERNAME");
    username.setBounds(150, 100, 100, 30);
    loginFrame.add(username);

    JPasswordField password = new JPasswordField();
    password.setBounds(150, 150, 100, 30);
    loginFrame.add(password);

    JButton loginbtn = new JButton("LOGIN");
    loginbtn.setBounds(100, 200, 80, 30);
    loginbtn.setFocusable(false);
    loginFrame.add(loginbtn);

    loginFrame.getContentPane().setBackground(Color.black);

    loginbtn.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        String name = username.getText();
        char[] pass = password.getPassword();
        System.out.println(name);
        System.out.println(pass);
        loginFrame.dispose();
        // mainPage.newWindow();
      }
    });

    JMenuBar menuBar = new JMenuBar();

    JMenu helpMenu = new JMenu("Help");
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

    helpMenu.setMnemonic(KeyEvent.VK_H);
    exitItem.setMnemonic(KeyEvent.VK_E); // E for exit

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
    registerFrame.add(nameL);

    /*String[] surlist = { "Mr", "Mrs" };
    JComboBox surlistBox = new JComboBox(surlist);
    surlistBox.setBounds(230, 50, 50, 30);
    registerFrame.add(surlistBox);
    */

    JTextField nameT = new JTextField();
    nameT.setBounds(280, 50, 100, 30);
    registerFrame.add(nameT);

    registerFrame.getContentPane().setBackground(Color.pink);
    registerFrame.setVisible(true);
  }
}
// --------------------------------------------------------------------------------------------------------------------
// ====================================================================================================================

/* MAIN CLASS */
class Main {
  public static void main(String args[]) {
    introclass introcall = new introclass();
    introcall.introfunction();
    System.out.println("End of what PK has done");
  }
}
