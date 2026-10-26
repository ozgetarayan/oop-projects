/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitymanagementsystem;

/**
 *
 * @author Özge
 */
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    
    public Person(String name, String address,String phoneNumber,String email){
        this.address = address;
        this.email=email;
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    
    public String getName(){
        return name;
    }
    
     public String getEmail(){
        return email;
    }
    
      public String getAddress(){
        return address;
    }
     
      
       public String getPhoneNumber(){
        return phoneNumber;
    }
       
       public void setName(String name){
           this.name = name;
       }
       
       public void setAddress(String address){
           this.address = address;
       }
       
       public void setEmail(String email){
           this.email = email;
       }
       
       public void setPhoneNumber(String phoneNumber){
           this.phoneNumber = phoneNumber;
       }
       
       @Override
       
       public String toString(){
           return "Person:" + name;
       }
}
