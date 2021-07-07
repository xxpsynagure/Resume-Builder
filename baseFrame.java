import javax.swing.JFrame;
//base template of where the panes should be added
public abstract class baseFrame extends JFrame{
    //demo code 
    baseFrame(){
        //demo code
        setTitle("Resume Builder");
        setSize(1000,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
    }
}
