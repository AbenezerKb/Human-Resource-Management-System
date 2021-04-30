/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrm;

/**
 *
 * @author dtpic
 */
import hrm.Models.Employee;
import java.sql.*;

public class Edit {
    
    public static int editEmployee(String ID, String firstname, String lastname, String sex, String address,int age, String role) throws Exception{
        String sqlUpdate;
        int query=0;
        ResultSet set = DbConnection.stmt.executeQuery("SELECT ID FROM employee WHERE ID =" + ID);
        if (set.getString("ID").equalsIgnoreCase(ID)){
            sqlUpdate="UPDATE employee SET '"+firstname+"',"
             + "'"+lastname+"'," 
             + "'"+sex+"',"
             + "'"+address+"'," 
             + age + "," + "'" 
             + role + "' WHERE ID = '"+ID+"'";
     // executeUpdate returns an int signifying number of rows updated
        query=DbConnection.stmt.executeUpdate(sqlUpdate);
        
        }
        return query;
    }
    public static int editFinance(String ID,String paymentdate, String paymentreason) throws Exception{
        String sqlUpdate;
        int query=0;
        ResultSet set = DbConnection.stmt.executeQuery("SELECT ID FROM finance WHERE ID =" + ID);
        if (set.getString("ID").equalsIgnoreCase(ID)){
            sqlUpdate="UPDATE employee SET '"+paymentdate+"',"
             + "'"+paymentreason+"'," 
             + "' WHERE ID = '"+ID+"'";
     // executeUpdate returns an int signifying number of rows updated
        query=DbConnection.stmt.executeUpdate(sqlUpdate);
        }
        
        return query;
    }  
    public static int editAttendance(String ID, String currentdate, String entranceTime , String exitTime ) throws Exception{
      String sqlUpdate;
      int query=0;
        ResultSet set = DbConnection.stmt.executeQuery("SELECT ID FROM attendance WHERE ID =" + ID);
        if (set.getString("ID").equalsIgnoreCase(ID)){
            sqlUpdate="UPDATE employee SET '"+currentdate+"',"
             + "'"+entranceTime+"'," 
             + "'"+exitTime+"',"
             + "' WHERE ID = '"+ID+"'";
     // executeUpdate returns an int signifying number of rows updated
        query=DbConnection.stmt.executeUpdate(sqlUpdate);
        }
        return query;
    }
    public static int editLeave(String ID, String startDate, String endDate, String type) throws Exception{
         String sqlUpdate;
         int query=0;
        ResultSet set = DbConnection.stmt.executeQuery("SELECT ID FROM leave WHERE ID =" + ID);
        if (set.getString("ID").equalsIgnoreCase(ID)){
            sqlUpdate="UPDATE employee SET '"+startDate+"',"
             + "'"+endDate+"'," 
             + "' WHERE ID = '"+ID+"'";
     // executeUpdate returns an int signifying number of rows updated
            query=DbConnection.stmt.executeUpdate(sqlUpdate);
        }
        return query;
    }
}