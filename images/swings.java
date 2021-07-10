import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
//import java.awt.ActionListener;
class swings {
  

    public static void main(String args[])
    {
       JFrame frame = new JFrame();
       frame.setResizable(false);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       JPanel panel = new JPanel();
       panel.setLayout(null);
       panel.setPreferredSize(new Dimension(1000,700));
       panel.setBackground(Color.white);
       panel.setVisible(true);

        ImageIcon imageIcon1 = new ImageIcon("portfolio.png"); // load the image to a imageIcon
        Image image = imageIcon1.getImage(); // transform it 
        Image newimg = image.getScaledInstance(110, 110,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon1 = new ImageIcon(newimg);
       JLabel label1 = new JLabel("Smooth Scale");
       label1.setHorizontalTextPosition(JLabel.CENTER);
       label1.setVerticalTextPosition(JLabel.BOTTOM);
       label1.setIcon(imageIcon1);
       label1.setBounds(50, 350, 120, 150);
       panel.add(label1);

        ImageIcon imageIcon2 = new ImageIcon("graduation-cap.png"); // load the image to a imageIcon
        image = imageIcon2.getImage(); // transform it 
        newimg = image.getScaledInstance(110, 110,  java.awt.Image.SCALE_DEFAULT); // scale it the smooth way  
        imageIcon2 = new ImageIcon(newimg);
       JLabel label2 = new JLabel("scale default");
       label2.setHorizontalTextPosition(JLabel.CENTER);
       label2.setVerticalTextPosition(JLabel.BOTTOM);
       label2.setIcon(imageIcon2);
       label2.setBounds(200, 350, 120, 150);
       panel.add(label2);

        ImageIcon imageIcon3 = new ImageIcon("graduation-cap.png"); // load the image to a imageIcon
        image = imageIcon3.getImage(); // transform it 
        newimg = image.getScaledInstance(110, 110,  java.awt.Image.SCALE_FAST); // scale it the smooth way  
        imageIcon3 = new ImageIcon(newimg);
       JLabel label3 = new JLabel("scale fast");
       label3.setHorizontalTextPosition(JLabel.CENTER);
       label3.setVerticalTextPosition(JLabel.BOTTOM);
       label3.setIcon(imageIcon3);
       label3.setBounds(350, 350, 120, 150);
       panel.add(label3);

        ImageIcon imageIcon4 = new ImageIcon("graduation-cap.png"); // load the image to a imageIcon
        image = imageIcon4.getImage(); // transform it 
        newimg = image.getScaledInstance(110, 110,  java.awt.Image.SCALE_REPLICATE); // scale it the smooth way  
        imageIcon4 = new ImageIcon(newimg);
       JLabel label4 = new JLabel("scale replicate");
       label4.setHorizontalTextPosition(JLabel.CENTER);
       label4.setVerticalTextPosition(JLabel.BOTTOM);
       label4.setIcon(imageIcon4);
       label4.setBounds(500, 350, 120, 150);
       panel.add(label4);

        ImageIcon imageIcon5 = new ImageIcon("portfolio.png"); // load the image to a imageIcon
        image = imageIcon5.getImage(); // transform it 
        newimg = image.getScaledInstance(110, 110,  java.awt.Image.SCALE_AREA_AVERAGING); // scale it the smooth way  
        imageIcon5 = new ImageIcon(newimg);
       JLabel label5 = new JLabel("scale Area average");
       label5.setHorizontalTextPosition(JLabel.CENTER);
       label5.setVerticalTextPosition(JLabel.BOTTOM);
       label5.setIcon(imageIcon5);
       label5.setBounds(650, 350, 120, 150);
       panel.add(label5);

       frame.add(panel);
       frame.pack();
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);

    
}}