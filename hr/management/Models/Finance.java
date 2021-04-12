
package hr.management.Models;


public class Finance {
    String empID;
    String paymentdate;
    String paymentReason;
    
     Finance(){
    
    }
    
    
     Finance(String empID, String paymentdate, String paymentReason){
    this.empID = empID;
    this.paymentdate = paymentdate;
    this.paymentReason = paymentReason;
    
    }
     
   //Contructors end here  
     
     
    //setters and getters
     
      void setempID(String empID){
        this.empID = empID;
        }
    
        String getempID(){return empID;}
    
        void setpaymentdate(String paymentdate){
        this.paymentdate = paymentdate;
        }
    
        String getpaymentdate(){return paymentdate;}
    
        void setpaymentReason(String paymentReason){
        this.paymentReason = paymentReason;
        }
    
        String getpaymentReason(){return paymentReason;}
    
    
       
    
   //setters and getters end here     
     
}
