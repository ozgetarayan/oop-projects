
package smarthome;


public  class  AirConditioner extends Device {
    public AirConditioner(String deviceName){
        super(deviceName);
    }
    
    @Override
    public void operate(){
        
        System.out.println("Klima sogutuyor.");
        
    }
    
}
