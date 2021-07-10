package Prototype;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*                                          INTRODUCTION FRAME CLASS                                            */
class introclass { // class for the introduction JFrame
    public void introfunction() { // a fuction to perform the introduction frame job
      JFrame introFrame = new JFrame("Introduction Page"); // Creating a JFrame for Itroduction page
      introFrame.setSize(500, 500); // setting frame size to 500x500 pixels
      introFrame.setLayout(null); // setting the layout to null so that we can give bounds to the components in the frame
      introFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ends the program when the frame is closed
      introFrame.setResizable(false); // setResizable is set to false so that the frame cannot be resized by dragging using mouse
  
      JLabel title = new JLabel("CURRICULUM VITAE"); // Creating a JLabel for title
      title.setBounds(150, 50, 200, 40); // setting its bounds
      title.setForeground(Color.white); // setting text color
      title.setFont(new Font("MV Boli", Font.BOLD, 15)); // setting font style and size
      introFrame.add(title); // adding the title label into the  Introduction frame
  
      JButton loginbtn = new JButton("SIGN IN"); // Creating a button for "sign in"
      loginbtn.setBounds(100, 350, 100, 40); // setting its bounds
      loginbtn.setFocusable(false); // this is to make the button to add a rectangle to itself when clicked
      introFrame.add(loginbtn); // adding the "sign in" button into the INTRODUCTION frame
  
      JButton registerbtn = new JButton("SIGN UP"); // Creating a button for "sign up"
      registerbtn.setBounds(300, 350, 100, 40); // setting its bounds
      registerbtn.setFocusable(false); // this is to make the button to add a rectangle to itself when clicked
      introFrame.add(registerbtn); // adding the "sign up" button into the INTRODUCTION frame
  
      ImageIcon img = new ImageIcon("leaflogo.jpg"); // Creating a ImageIcon object to set an icon for the frame
      introFrame.setIconImage(img.getImage()); // adding the naruto symbol as the icon for introduction frame
  
      introFrame.getContentPane().setBackground(new Color(0, 0, 0)); // setting a black Background to the introduction Frame
      JLabel leaf = new JLabel(new ImageIcon("leaflogo.jpg")); // setting the naruto sysbol as our background for frame
      leaf.setBounds(0, 20, 500, 500); // setting its bounds
      introFrame.add(leaf); // adding the background image into frame
  
      loginbtn.addActionListener(new ActionListener() { // action listener which is activated when the "sign in" button is clicked
  
        @Override
        public void actionPerformed(ActionEvent e) { // perform the following things when the "sign in" button is clicked
          introFrame.dispose(); // closing the introduction frame
          loginclass logincall = new loginclass(); // creating a object to call the login frame
          logincall.loginfunction(); // calling a fuction which has the login form
          // JOptionPane.showMessageDialog(null, "Will Add soon!!", "Message box",
          // JOptionPane.INFORMATION_MESSAGE);
        }
      });
  
      registerbtn.addActionListener(new ActionListener() { // perform the following things when the "sign up" button is clicked
  
        @Override
        public void actionPerformed(ActionEvent e) { // perform the following things when the "sign up" button is clicked
          registerclass registercall = new registerclass(); // creating a object to call the register frame
          introFrame.dispose(); // closing the introduction frame
          // JOptionPane.showMessageDialog(null, "Under Production", "Message box", JOptionPane.INFORMATION_MESSAGE);
          registercall.registerfunction(); // calling a fuction which has the register form
        }
      });
  
      introFrame.setVisible(true); // setVisible is set to "true" , so that the frame we created is displaced
    }
  
  }
  // END OF INTRODUCTION FRAME;
