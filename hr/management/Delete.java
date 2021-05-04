/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.management;


import java.sql.ResultSet;

/**
 *
 * @author dtpic
 */
public class Delete {
    public static int deleteEmployee(String ID) throws Exception{
        int query=0;
        ResultSet set = DbConnection.stmt.executeQuery("SELECT ID FROM employee WHERE ID = '" + ID+"';"); 
        set.next();
        if (set.getString("ID").equalsIgnoreCase(ID)){
            query = DbConnection.stmt.executeUpdate("DELETE FROM employee WHERE ID = '"+ID+"';");
        
        }
         return query;
    }
    public static int deleteFinance(String ID) throws Exception{
        int query=0;
        ResultSet set = DbConnection.stmt.executeQuery("SELECT ID FROM finance WHERE ID =" + ID); 
        set.next();
        if (set.getString("ID").equalsIgnoreCase(ID)){
            query = DbConnection.stmt.executeUpdate("DELETE FROM finance WHERE employee_id = "+ID);
        }
        return query;
    }  
    public static int deleteAttendance(String ID) throws Exception{
        int query=0;
      ResultSet set = DbConnection.stmt.executeQuery("SELECT ID FROM attendance WHERE ID =" + ID); 
      set.next();
        if (set.getString("ID").equalsIgnoreCase(ID)){
             query = DbConnection.stmt.executeUpdate("DELETE FROM attendance WHERE employee_id = "+ID);
        }
            return query;
    }
    public static int deleteLeave(String ID) throws Exception{
        int query=0;
        ResultSet set = DbConnection.stmt.executeQuery("SELECT ID FROM leave WHERE ID =" + ID); 
        set.next();
        if (set.getString("ID").equalsIgnoreCase(ID)){
             query = DbConnection.stmt.executeUpdate("DELETE FROM leave WHERE employee_id = "+ID);
        }
            return query;
    }
}