
package smarthome;


public abstract class Device {
    
    protected String deviceName;
    protected boolean isOn;
    
    public Device(String deviceName){
        
        this.deviceName = deviceName;
        this.isOn = false;
    }
    
    public void turnOn(){
        
        isOn = true;
        System.out.println(deviceName + " acildi.");
        
    }
    
    public void turnOff(){
        isOn = false;
        System.out.println(deviceName + " kapandi.");
    }
    
    public void showInfo(){
        System.out.println("Cihaz: " + deviceName);
        
    }
    
    public abstract void operate();
    
}
