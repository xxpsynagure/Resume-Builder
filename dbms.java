import java.sql.*;
import java.util.ArrayList;

public class dbms {
    // REMOTE SERVER
    //private String database = "jdbc:mysql://sql6.freemysqlhosting.net/sql6424721";
    //private String username = "sql6424721";
    //private String password = "hektpFek6Y";

    // LOCAL CONNECTION
    private String database = "jdbc:mysql://127.0.0.1/project";
    private String username = "root";
    private String password = "your_password";
    
    Connection connection = null;
    
    dbms() {
    try {
        connection = (Connection) DriverManager.getConnection(database, username,password);
    } catch (SQLException e) {
        e.printStackTrace();
    } finally{}
        
    }

    String user;
    
    Boolean loginUpdate(String Usernametxt,String Passwordtxt)
    {   
        user = Usernametxt;
        Boolean login=false;
        String sql="SELECT USERNAME, PASSWORD FROM REGISTRATION WHERE USERNAME='"+ Usernametxt +"' AND PASSWORD='"+ Passwordtxt + "'";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                login= true;
            }
            else {
                login= false;
            }
            connection.close();
            return login;   
        }catch(SQLException ex){
            System.out.println(ex);
            return false;
        }
        
    }

    // a function to check if the entered username already exists in the database
    public Boolean checkUsername(String username){
        boolean username_exist = false;
        try {
            PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT USERNAME FROM REGISTRATION WHERE USERNAME=?");
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
        
            if(rs.next())
            {
                username_exist=true;
            }
            //connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return username_exist;

    }

    void registrationUpdate(ArrayList<String> registerData)
    {
        user = registerData.get(0);
        try{

            String sql= "INSERT INTO REGISTRATION (USERNAME, PASSWORD,NAME,EMAIL) VALUES (?,?,?,?)";
            PreparedStatement ps=connection.prepareStatement(sql);
            for(int i=0; i<registerData.size(); i++){
                ps.setString(i+1, registerData.get(i));
            }
            ps.executeUpdate();
            connection.close();
                        
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    }
    void profileUpdate(ArrayList<String> profileData) {
        System.out.println(user);
        String sql= "INSERT INTO PROFILETABLE (TITLE, FNAME, LNAME, PHNO, EMAIL, GENDER, DOB, NATIONALITY, HOUSENO, AREA, CITY, DISTRICT, STATE, COUNTRY, USERNAME) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,'" + user + "')";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            int i;
            for(i=0; i<profileData.size(); i++){
            ps.setString(i+1, profileData.get(i));
            }
            //ps.setString(i+1, user);
            ps.executeUpdate();
            connection.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    void educationUpdate(ArrayList<String> educationData) {
        String sql= "INSERT INTO EDUCATIONTABLE (SCHOOL, SYEAR, SPERFORMANCE, HSCHOOL, HSYEAR, HSPERFORMANCE, HSTREAM, COLLEGE, STARTYEAR, ENDYEAR, DEGREE, CLGSTREAM, CLGPERFORMANCE) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i=0; i<educationData.size(); i++){
            ps.setString(i+1, educationData.get(i));
            }
            ps.executeUpdate();
            connection.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
    

    void skillUpdate(ArrayList<String> skillsData) {
        String sql= "INSERT INTO SKILLTABLE (JOBEXP, INTERNSHIP, COURSES, SKLANDLANG, PORTFOLIO, ACHIEVEMENTS) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i=0; i<skillsData.size(); i++){
            ps.setString(i+1, skillsData.get(i));
            }
            ps.executeUpdate();
            connection.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}
