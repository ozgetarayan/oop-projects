/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universitymanagementsystem;

/**
 *
 * @author Özge
 */
public class UniversityManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Person p1 = new Person("ahmet","manisa","1234","test.com");
              System.out.println(p1);  
        
              
              Student s1 = new Student("mehmet","izmir","111","mehmet.com", Student.StudentStatus.SOPHOMORE);
    }
    
}
