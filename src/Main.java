package src;
import Resume_Builder.LoginFrame;
import Resume_Builder.dbms;


public class Main {
    public static void main(String[] args) {

        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        new dbms();
        new LoginFrame();

    }
    
}