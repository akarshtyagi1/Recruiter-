package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class database {
    private static String username = "root";
    private static String password = "Amit@123";
    private static String database = "Profiles";

    public static Connection Database(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database,username,password);
            return conn;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
