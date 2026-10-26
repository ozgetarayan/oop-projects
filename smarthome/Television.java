
package smarthome;


public class Television extends Device implements Connectable{
    
    public Television(String deviceName){
    
            super(deviceName);
    }
    
    @Override
    
    public void operate(){
        System.out.println("Televizyon calisiyor!");
    }
    
    @Override
    public void connectWifi(){
        System.out.println("TV Wi-Fi'ye baglandi!.");
    }
    
    
}
