import java.sql.*;
import java.util.ArrayList;

public class dbms {
    // REMOTE SERVER
    private String database = "jdbc:mysql://sql6.freemysqlhosting.net/sql6424721";
    private String username = "sql6424721";
    private String password = "hektpFek6Y";

    // LOCAL CONNECTION
    //private String database = "jdbc:mysql://127.0.0.1/project";
    //private String username = "root";
    //private String password = "your_password";
    
    Connection connection = null;
    
    dbms() {
    try {
        connection = (Connection) DriverManager.getConnection(database, username,password);
    } catch (SQLException e) {
        e.printStackTrace();
    } finally{}
        
    }

    public static String user;
    
    Boolean loginUpdate(String Usernametxt,String Passwordtxt)
    {   
        user = Usernametxt;
        System.out.println(user);
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
        System.out.println(user);
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
    Boolean profileUpdate(ArrayList<String> profileData) {
        System.out.println(user);
        Boolean update=false;
        String sql= "INSERT INTO PROFILETABLE (USERNAME, TITLE, FNAME, LNAME, PHNO, EMAIL, GENDER, DOB, NATIONALITY, HOUSENO, AREA, CITY, DISTRICT, STATE, COUNTRY) VALUES ('" + user + "',?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement del = connection.prepareStatement("DELETE IGNORE FROM PROFILETABLE WHERE USERNAME='" + user + "'");
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i=0; i<profileData.size(); i++){
            ps.setString(i+1, profileData.get(i));
            }
            del.executeUpdate();
            ps.executeUpdate();
            connection.close();
            update=true;
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return update;
    }

    Boolean educationUpdate(ArrayList<String> educationData) {
        Boolean update=false;
        String sql= "INSERT INTO EDUCATIONTABLE (USERNAME, SCHOOL, SYEAR, SPERFORMANCE, HSCHOOL, HSYEAR, HSPERFORMANCE, HSTREAM, COLLEGE, STARTYEAR, ENDYEAR, DEGREE, CLGSTREAM, CLGPERFORMANCE) VALUES ('" + user + "',?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement del = connection.prepareStatement("DELETE IGNORE FROM EDUCATIONTABLE WHERE USERNAME='" + user + "'");
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i=0; i<educationData.size(); i++){
            ps.setString(i+1, educationData.get(i));
            }
            del.executeUpdate();
            ps.executeUpdate();
            connection.close();
            update=true;
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return update;
    }
    

    Boolean skillUpdate(ArrayList<String> skillsData) {
        Boolean update=false;
        String sql= "INSERT INTO SKILLTABLE (USERNAME, JOBEXP, INTERNSHIP, COURSES, SKLANDLANG, PORTFOLIO, ACHIEVEMENTS) VALUES ('" + user + "',?,?,?,?,?,?);";
        try {
            PreparedStatement del = connection.prepareStatement("DELETE IGNORE FROM SKILLTABLE WHERE USERNAME='" + user + "'");
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i=0; i<skillsData.size(); i++){
            ps.setString(i+1, skillsData.get(i));
            }
            del.executeUpdate();
            ps.executeUpdate();
            connection.close();
            update=true;
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return update;
    }

    void hobbyUpdate(String hobby, String voidtxt) {
        String sql = "INSERT INTO HOBBIESTABLE (USERNAME, HOBBY , VOID) VALUES ('" + user + "',?,?)";
        try {
            PreparedStatement del = connection.prepareStatement("DELETE IGNORE FROM HOBBIESTABLE WHERE USERNAME = '" + user + "'");
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, hobby);
            ps.setString(2, voidtxt);
            del.executeUpdate();
            ps.executeUpdate();
            connection.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
    //___________________________________________________________________________________________________________

    ArrayList<String> profilepreDefault()
    {
        String sql="SELECT NAME, EMAIL FROM REGISTRATION WHERE USERNAME='"+user+"'";
        ArrayList <String> preDefault = new ArrayList<String>();
        try{
            PreparedStatement ps= connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); 
            while(rs.next())
            {
                preDefault.add(rs.getString("NAME"));
                preDefault.add(rs.getString("EMAIL")); 
            }
            connection.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return preDefault;
    }

    Boolean rowcheck(String tablename)
    {
        boolean username_exist = false;
        String sql="SELECT USERNAME FROM "+tablename +" WHERE USERNAME = '"+ user +"'";
        try {
            PreparedStatement st =connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                username_exist=true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return username_exist;
    }
  /*
    ArrayList<String> profileDefault()
    {
        String sql="SELECT * FROM SKILLTABLE WHERE USERNAME= '"+user+"'";
        ArrayList <String> profile = new ArrayList<String>();
        try{
            PreparedStatement ps= connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();//skips username
            while(rs.next())
            {
                profile.add(rs.getString("TITLE"));//0
                profile.add(rs.getString("FNAME"));//1
                profile.add(rs.getString("LNAME"));//2
                profile.add(rs.getString("PHNO"));//3
                profile.add(rs.getString("EMAIL"));//4
                profile.add(rs.getString("GENDER"));//5
                profile.add(rs.getString("DOB"));//6
                profile.add(rs.getString("NATIONALITY"));//7
                profile.add(rs.getString("HOUSENO"));//8
                profile.add(rs.getString("AREA"));//9
                profile.add(rs.getString("CITY"));//10
                profile.add(rs.getString("DISTRICT"));//11
                profile.add(rs.getString("STATE"));//12
                profile.add(rs.getString("COUNTRY"));//13
                connection.close();
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return profile;
    } */  
}




