package hr.management.Models;


public class Attendance {
    String empID;
    String currentdate;
    String entranceTime;
    String exitTime;
    
    
    //Constructors
    
    Attendance(){
    
    }
    
    
     Attendance(String empID, String currentdate, String entranceTime, String exitTime){
    this.empID = empID;
    this.currentdate = currentdate;
    this.entranceTime = entranceTime;
    this.exitTime = exitTime;
    }
     
   //Contructors end here  
     
     
    //setters and getters
     
      void setempID(String empID){
        this.empID = empID;
        }
    
        String getempID(){return empID;}
    
        void setcurrentdate(String currentdate){
        this.currentdate = currentdate;
        }
    
        String getcurrentdate(){return currentdate;}
    
        void setentranceTime(String entranceTime){
        this.entranceTime = entranceTime;
        }
    
        String getentranceTime(){return entranceTime;}
    
    
        void setexitTime(String exitTime){
        this.exitTime = exitTime;
        }
    
        String getexitTime(){return exitTime;}
    
   //setters and getters end here     
     
}
