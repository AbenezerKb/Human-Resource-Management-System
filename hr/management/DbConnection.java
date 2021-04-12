
package hr.management;
import java.sql.*;

public class DbConnection {
    
    
    
        private final String username = "room";
        private final String password ="abeny";
        private final String dataconnection ="jdbc:mysql://localhost:3306/EmployeeDB";
        public  static Statement stmt;
        private static Connection con;
    DbConnection(){
    
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(dataconnection, username,password);
          stmt = con.createStatement();
        }
        catch(Exception e){
        System.out.println("error at connecting");
        }
        
        
    }
    
    
    
}
