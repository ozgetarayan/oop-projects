
package universitymanagementsystem;


public class Student extends Person {
    
  public enum StudentStatus{
      FRESHMAN,//1.SINIF
      SOPHOMORE,//2.SINIF
      JUNIOR,//3.SIINIF
      SENİOR,//4.SINIF
      GRADUATED
  } 
  
  private StudentStatus status;
  
  public Student(String name, String address,String phoneNumber, String email,StudentStatus status){
      super(name,address,phoneNumber,email);
      
      this.status = status;
  }
  
  public StudentStatus getStatus(){
      return status;
  } 
  
  public void setStatus (StudentStatus status){
      this.status = status;
     
  }
  
  @Override
  
  public String toString(){
      return "student: "+getName();
  }
    
}
