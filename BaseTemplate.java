import javax.swing.JFrame;
//base template of where the panes should be added

public abstract class BaseTemplate extends JFrame{
    //demo code 
    BaseTemplate(){
        //demo code
        setTitle("Resume Builder");
        setSize(1000,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
    }
}
    
