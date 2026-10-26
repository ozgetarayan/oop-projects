
package smarthome;


public class SmartHome {

   
    public static void main(String[] args) {
        
         Television tv = new Television("Samsung TV");
        tv.turnOn();
        tv.showInfo();
        tv.operate();
        tv.connectWifi();
        
        System.out.println("-----------------------");
        
        AirConditioner ac = new AirConditioner("Arcelik Klima");
        ac.turnOn();
        ac.showInfo();
        ac.operate();
    }
    
}
