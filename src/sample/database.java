package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class database {
    private static String username = "root";
    private static String password = "Ayushjagga@7";
    private static String database = "profiles";

    public static Connection main(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/" + database,username,password);
            return conn;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
