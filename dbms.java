import java.sql.*;
import java.util.ArrayList;

public class dbms {
    private String database = "jdbc:mysql://127.0.0.1:3306/project";
    private String username = "root";
    private String password = "your_password";
    
    Connection connection = null;
    
    dbms() {
    try {
        //connection = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root","your_password");
        connection = (Connection) DriverManager.getConnection(database, username,password);
    } catch (SQLException e) {
        e.printStackTrace();
    } finally{}
        
    }
    
    Boolean loginUpdate(String Usernametxt,String Passwordtxt)
    {   Boolean login=false;
        String sql="Select username, password from registration where username='"+ Usernametxt +"' and password='"+ Passwordtxt + "'";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                login= true;
                connection.close();
            }
            else {
                connection.close();
                login= false;
            }
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
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root","your_password");
            PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT USERNAME FROM REGISTRATION WHERE USERNAME=?");
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
        
            if(rs.next())
            {
                username_exist=true;
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return username_exist;

    }

    void registrationUpdate(ArrayList<String> registerData)
    {
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
        String sql= "INSERT INTO PROFILETABLE (TITLE, FNAME, LNAME, PHNO, EMAIL, GENDER, DOB, NATIONALITY, HOUSENO, AREA, CITY, DISTRICT, STATE, COUNTRY) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i=0; i<profileData.size(); i++){
            ps.setString(i+1, profileData.get(i));
            }
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
