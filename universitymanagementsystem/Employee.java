
package universitymanagementsystem;


public class Employee extends Person {
    private String office;
    private double salary;
    private String dateHired;
    
    public Employee(String name, String address, String phoneNumber, String email, String office, double salary , String dateHired){
        super (name,address,phoneNumber,email);
        
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    
    public String getOffice(){
        return office;
    }
    
    public double getSalary(){
        return salary;
    }
    
     public String getDateHired(){
        return dateHired;
    }
     
     public void setOffice(String office){
         this.office = office;
         
     }
     
      public void setSalary(Double Salary){
         this.salary = salary;
         
     }
      
       public void setDateHired(String DateHired){
         this.dateHired = dateHired;
         
     }
       
       @Override
       
       public String toString(){
           return "Employee: "+getName();
       }
     
    
}
