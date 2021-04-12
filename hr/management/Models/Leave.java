
package hr.management.Models;


public class Leave {
    String empID;
    String startDate;
    String endDate;
    String type;
    
    
     Leave(){
    
    }
    
    
     Leave(String empID, String startDate, String endTime, String type){
    this.empID = empID;
    this.startDate = startDate;
    this.endDate = endDate;
    this.type = type;
    }
     
   //Contructors end here  
     
     
    //setters and getters
     
      void setEmpID(String empID){
        this.empID = empID;
        }
    
        String getEmpID(){return empID;}
    
        void setstartDate(String startDate){
        this.startDate = startDate;
        }
    
        String getstartdate(){return startDate;}
    
        void setendDate(String endDate){
        this.endDate = endDate;
        }
    
        String getendDate(){return endDate;}
    
    
        void settype(String type){
        this.type = type;
        }
    
        String getype(){return type;}
    
   //setters and getters end here     
     
    
}
