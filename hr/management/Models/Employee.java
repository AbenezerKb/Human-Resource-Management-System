
package hr.management.Models;


public class Employee {
    
    String empID;
    String firstName;
    String lastName;
    String sex;
    String address;
    int age;
    String role;
    
    
    
    //setters and getter functions 
        void setempID(String empID){
        this.empID = empID;
        }
    
        String getempID(){return empID;}
    
        void setfirstName(String firstName){
        this.firstName = firstName;
        }
    
        String getfirstName(){return firstName;}
    
        void setlastName(String lastName){
        this.lastName = lastName;
        }
    
        String getlastName(){return lastName;}
    
    
        void setSex(String sex){
        this.sex = sex;
        }
    
        String getSex(){return sex;}
    
        void setAddress(String address){
        this.address = address;
        }
    
        String getAddress(){return address;}
    
        void setAge(int age){
        this.age = age;
        }
    
        int getAge(){return age;}
    
        void setRole(String role){
        this.role = role;
        }
    
        String getRole(){return role;}
        
    //setters and getters functions end here
        
        
        //constructors
        
        Employee(){}
        
        
        Employee(String empID, String firstName, String lastName, String sex, String address, int age, String role){
        
            this.empID = empID;
            this.firstName= firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.address = address;
            this.age = age;
            this.role = role;
        
        }

}
