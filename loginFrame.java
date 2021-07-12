import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

//loginframe
class LoginFrame
 {

    JFrame frame;
    JPanel panel, panel2;
    //separated the constructor LoginFrame and loginPanel to implement the backBtn
    LoginFrame(){
        
        frame = new JFrame();
        frame.setTitle("Resume Builder");
        frame.setSize(350, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        loginPanel(frame);

    }

    public void loginPanel(JFrame frame){

        
        // Testing JPanel and adding components
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 350, 600);
        panel.setBackground(new Color(150,150,150));
        panel.setBorder(BorderFactory.createBevelBorder(0));
        //panel.setLayout(new BorderLayout());
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

        JLabel ttl=new JLabel("Create your own professional cv");
        ttl.setBounds(55,70,300,30);
        ttl.setFont(new Font("Mv Boli", Font.BOLD, 14));
        panel.add(ttl);

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
                
                try{
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root","your_password");
                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("Select username, password from registration where name='"+ Usernametxt.getText() +"' and password='"+ String.valueOf(Passwordtxt.getPassword()) + "'" );
                    ResultSet rs = st.executeQuery();

                    if(rs.next()){
                        //IntroPage intro = new IntroPage();
                        JOptionPane.showMessageDialog(null, "Login Successful", "Message box", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                        IntroPage intro = new IntroPage();
                    }
                    else{
                        loginBtn.remove(loginBtn);
                        JLabel incorrect = new JLabel("Incorrect Username or Password");
                        incorrect.setForeground(Color.red);
                        incorrect.setBounds(50, 300, 200, 25);
                        
                        loginBtn.setBounds(50, 330, 100, 25);
                        registerBtn.setBounds(175, 330, 100, 25);
                        
                        panel.add(incorrect);
                        panel.add(loginBtn);
                        panel.add(registerBtn);
        
                        panel.revalidate();
                        panel.repaint();
                    }
                    connection.close();
                }
                catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }




 /*               if(usertxt.equals("resume") && passtxt.equals("resume")){
                    //IntroPage intro = new IntroPage();
                    JOptionPane.showMessageDialog(null, "Login Successfull", "Message box", JOptionPane.INFORMATION_MESSAGE);
                    frame.dispose();
                    IntroPage intro = new IntroPage();
                }
                else{
                    loginBtn.remove(loginBtn);
                    JLabel incorrect = new JLabel("Incorrect Username or Password");
                    incorrect.setForeground(Color.red);
                    incorrect.setBounds(50, 300, 200, 25);
                    
                    loginBtn.setBounds(50, 330, 100, 25);
                    registerBtn.setBounds(175, 330, 100, 25);
                    
                    panel.add(incorrect);
                    panel.add(loginBtn);
                    panel.add(registerBtn);
    
                    panel.revalidate();
                    panel.repaint();
                }*/
                
                
            }
        });

        registerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                registerPanel();
            }
        });

        //loginBtn.setMnemonic(KeyEvent.VK_ENTER);

        Passwordtxt.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {}
            public void keyPressed(KeyEvent f) {
                if( f.getKeyCode()  == KeyEvent.VK_ENTER){
                    loginBtn.doClick();
                }
            }
            public void keyReleased(KeyEvent g) {}
        });;
        

        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.setVisible(true);
        
    }
    
    //register panel
    public void registerPanel() {
        JPanel panel2 = new JPanel();
        panel2.setBounds(0, 0, 350, 600);
        panel2.setBackground(new Color(150, 150, 150));
        panel2.setLayout(null);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(50, 100, 150, 25);
        name.setFont(new Font("Montserrat", Font.PLAIN, 15));
        panel2.add(name);
        
        JTextField nametxt = new JTextField();
        nametxt.setBounds(50, 125, 200, 25);
        panel2.add(nametxt);
        
        JLabel email = new JLabel("Email Id");
        email.setBounds(50, 160, 100, 25);
        email.setFont(new Font("Montserrat", Font.PLAIN, 15));
        panel2.add(email);
        
        JTextField emailtxt = new JTextField();
        emailtxt.setBounds(50, 185, 200, 25);
        panel2.add(emailtxt);
        
        JLabel usernameR = new JLabel("Username");
        usernameR.setBounds(50, 220, 100, 25);
        usernameR.setFont(new Font("Montserrat", Font.PLAIN, 15));
        panel2.add(usernameR);
        
        JTextField usernametxt = new JTextField();
        usernametxt.setBounds(50, 245, 200, 25);
        panel2.add(usernametxt);
        
        JLabel password = new JLabel("Password");
        password.setBounds(50, 280, 100, 25);
        password.setFont(new Font("Montserrat", Font.PLAIN, 15));
        panel2.add(password);
        
        JPasswordField Passwordtxt = new JPasswordField();
        Passwordtxt.setBounds(50, 305, 200, 25);
        Passwordtxt.setToolTipText("must contain 8 characters with atleast one special character eg:@#$");
        panel2.add(Passwordtxt);

        JLabel confirmpassword = new JLabel("Confirm Password");
        confirmpassword.setBounds(50, 340, 160, 25);
        confirmpassword.setFont(new Font("Montserrat", Font.PLAIN, 15));
        panel2.add(confirmpassword);
        
        JPasswordField ConfirmPasswordtxt = new JPasswordField();
        ConfirmPasswordtxt.setBounds(50, 365, 200, 25);
        ConfirmPasswordtxt.setToolTipText("confirm your password");
        panel2.add(ConfirmPasswordtxt);

        JButton registerBtnR = new JButton("Sign up");
        registerBtnR.setBounds(170, 410, 100, 25);
        registerBtnR.setFont(new Font("Montserrat", Font.PLAIN, 15));
        registerBtnR.setBackground(new Color(0, 95, 135));
        registerBtnR.setForeground(new Color(255, 255, 255));
        registerBtnR.setOpaque(true);
        registerBtnR.setFocusable(false);
        panel2.add(registerBtnR);

        
        //backBtn takes the panel back to the loginPanel
        JButton backBtn = new JButton("Back");
        backBtn.setBounds(50, 410, 100, 25);
        backBtn.setFont(new Font("Montserrat", Font.PLAIN, 15));
        backBtn.setBackground(new Color(0, 95, 135));
        backBtn.setForeground(new Color(255, 255, 255));
        backBtn.setOpaque(true);
        backBtn.setFocusable(false);
        panel2.add(backBtn);

        registerBtnR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // create a function to verify the empty fields  
                String fname = nametxt.getText();
                String uname = usernametxt.getText();
                String emaill = emailtxt.getText();
                String pass1 = String.valueOf(Passwordtxt.getPassword());
                String pass2 = String.valueOf(ConfirmPasswordtxt.getPassword());
                
                // check empty fields
                if(fname.trim().equals("") || uname.trim().equals("") || emaill.trim().equals("") || pass1.trim().equals("") || pass2.trim().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
                }
        
                // check if the two password are equals or not
                else if(!pass1.equals(pass2))
                {
                    JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2); 
                } 

                //true if username exists
                //for validated credentials
                else if(!checkUsername(uname))
                {
                    try{
                        Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root","your_password");
                        String sql= "INSERT INTO REGISTRATION (USERNAME, PASSWORD,NAME,EMAIL) VALUES (?,?,?,?)";
                        PreparedStatement ps=conn.prepareStatement(sql);
                        ps.setString(1,uname);
                        ps.setString(2,pass1);
                        ps.setString(3,fname);
                        ps.setString(4,emaill);
                        ps.executeUpdate();
                        conn.close();
                        IntroPage intro = new IntroPage();
                    }
                    catch(SQLException ex){

                    }
                }
                       
            
            }
        });
        
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(false);

                loginPanel(frame);
            }
        });

        
        //registerBtnR.setMnemonic(KeyEvent.VK_ENTER);

        Passwordtxt.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {}
            public void keyPressed(KeyEvent f) {
                if( f.getKeyCode()  == KeyEvent.VK_ENTER){
                    registerBtnR.doClick();
                }
            }
            public void keyReleased(KeyEvent g) {}
        });;
        
        frame.add(panel2);//add to the frame
    }

    
    // a function to check if the entered username already exists in the database
    public Boolean checkUsername(String username){
        boolean username_exist = false;
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root","your_password");
            PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT NAME FROM REGISTRATION WHERE NAME=?");
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
        
            if(rs.next())
            {
                username_exist=true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed", 2);
            }
            else{
                IntroPage intro = new IntroPage();
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return username_exist;
        
    }
    
   
}
