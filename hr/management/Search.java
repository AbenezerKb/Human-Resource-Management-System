
package hr.management;

import java.sql.Statement;
import java.lang.Exception;
import java.sql.ResultSet;

public class Search {
    
  
    
    
    public Employee searchEmployee(String ID) {
        Employee emp=null;
        try{
    ResultSet set = DbConnection.stmt.executeQuery("SELECT * FROM employee WHERE employee_id = '" + ID +"'");
     while(set.next()){
       emp = new Employee(set.getString(1),set.getString(2),set.getString(3),set.getString(4),set.getString(5),set.getInt(6),set.getString(7));   
     }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
       return emp;
    }
    public Employee getAllEmployee() {
        Employee emp=null;
        try{
    ResultSet set = DbConnection.stmt.executeQuery("SELECT * FROM employee");
    
     while(set.next()){
         
       emp = new Employee(set.getString(1),set.getString(2),set.getString(3),set.getString(4),set.getString(5),set.getInt(6),set.getString(7));   
     }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
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
