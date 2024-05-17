
package all;


public class Messenger implements VideoCall {
    
    public void calling(String phoneNumber){
        System.out.println("Calling: " + phoneNumber);
    }
    
    public void videoCalling(String camera){
        System.out.println("Video calling using: " + camera);
    }
    
    public void applyFiler(String F){
        System.out.println("Selecting filter: " + F);
    }
            
    
}
