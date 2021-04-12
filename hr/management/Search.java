
package hr.management;

import java.sql.Statement;
import java.lang.Exception;
import java.sql.ResultSet;

public class Search {
    
  
    
    
    public static Employee searchEmployee(String ID) throws Exception{
    ResultSet set = DbConnection.stmt.executeQuery("SELECT * FROM employee WHERE ID = " + ID);
        
    Employee emp = new Employee( set.getString("ID"), set.getString("firstname"),set.getString("lastname"),set.getString("sex"),set.getString("address"),set.getInt("age"),set.getString("role"));   
    return emp;
    }
 
    
    
      public static Attendance searchAttendance(String ID) throws Exception{
    ResultSet set = DbConnection.stmt.executeQuery("SELECT * FROM employee WHERE ID = " + ID);
        
    Attendance att = new Attendance( set.getString("ID"), set.getString("currentdate"),set.getString("entranceTime"),set.getString("exitTime"));   
    return att;
    }
      
      
       public static Finance searchFinance(String ID) throws Exception{
    ResultSet set = DbConnection.stmt.executeQuery("SELECT * FROM finance WHERE ID = " + ID);
        
    Finance fin = new Finance( set.getString("ID"), set.getString("paymentdate"),set.getString("paymentreason"));   
    return fin;
    }
       
       
          public static Leave searchLeave(String ID) throws Exception{
    ResultSet set = DbConnection.stmt.executeQuery("SELECT * FROM leave WHERE ID = " + ID);
        
    Leave leave = new Leave( set.getString("ID"), set.getString("startDate"),set.getString("endDate"), set.getString("type"));   
    return leave;
    }
    
}
