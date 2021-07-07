import javax.swing.JFrame;
//base template of where the panes should be added

public class baseFrame {
    baseFrame() {
        JFrame base = new JFrame();
        base.setTitle("Base frame");
        base.setSize(600, 600);
        base.setResizable(false);
        base.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        base.setLayout(null);
        base.setVisible(true);
    }

}
    
