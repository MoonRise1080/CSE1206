package all;

public class Samsung extends MobilePhone {

    public void calling(String phoneNumber) {

        System.out.println("Calling: " + phoneNumber);
    }

    void sendSMS(String R, String msg){
        
        System.out.println("Sending " + R + " message: " + msg);
        
    }
    
    void saveContact(String name, String phoneNumber){
        System.out.println("Saving " + name + ", Number: " + phoneNumber);
    }

}
