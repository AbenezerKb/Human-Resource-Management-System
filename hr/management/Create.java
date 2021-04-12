
package hr.management;

import java.sql.ResultSet;


public class Create {
    
    
    
    public static boolean createEmployee(String ID, String firstname, String lastname, String sex, String address,int age, String role) throws Exception{
    
        ResultSet set = DbConnection.stmt.executeQuery("INSERT INTO employee VALUES( '" + ID + "'," + "'"+firstname+"'," + "'"+lastname+"'," + "'"+sex+"',"
    + "'"+address+"'," + age + "," + "'" + role + "'");
        
       set = DbConnection.stmt.executeQuery("SELECT ID FROM employee WHERE ID =" + ID); 
       
       if (set.getString("ID").equalsIgnoreCase(ID))
           return true;
       else
          return false;
    }
 
    
    
      public static boolean createAttendance(String ID, String currentdate, String entranceTime , String exitTime ) throws Exception{
      ResultSet set = DbConnection.stmt.executeQuery("INSERT INTO attendance VALUES( '" + ID + "'," + "'"+ currentdate +"'," +"'"+entranceTime+"',"+"'"+exitTime+"'");
        
   set = DbConnection.stmt.executeQuery("SELECT ID FROM attendance WHERE ID =" + ID); 
       
       if (set.getString("ID").equalsIgnoreCase(ID))
           return true;
       else
          return false;
    }
      
      
       public static boolean createFinance(String ID,String paymentdate, String paymentreason) throws Exception{
    ResultSet set = DbConnection.stmt.executeQuery("INSERT INTO finance VALUES( '" + ID + "'," + "'"+ paymentdate +"'," +"'"+paymentreason+"'");
        
   set = DbConnection.stmt.executeQuery("SELECT ID FROM finance WHERE ID =" + ID); 
       
       if (set.getString("ID").equalsIgnoreCase(ID))
           return true;
       else
          return false;
    }
       
       
          public static boolean createLeave(String ID, String startDate, String endDate, String type) throws Exception{
    ResultSet set = DbConnection.stmt.executeQuery("INSERT INTO leave VALUES( '" + ID + "'," + "'"+ startDate +"'," +"'"+endDate+"'," + "'"+type+"'");
        
    set = DbConnection.stmt.executeQuery("SELECT ID FROM leave WHERE ID =" + ID); 
       
       if (set.getString("ID").equalsIgnoreCase(ID))
           return true;
       else
          return false;
    }
    
    
}
