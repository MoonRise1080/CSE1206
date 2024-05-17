
package all;
import java.util.Scanner;

public class DemoPhone {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        Samsung J7 = new Samsung();
        Messenger FB = new Messenger();
        
        String name, phoneNumber, camera, filter, msg;
        
        name = input.nextLine();
        phoneNumber = input.nextLine();
        msg = input.nextLine();
        camera = input.nextLine();
        filter = input.nextLine();
        
        System.out.println("");
        System.out.println("Using Samsung");
        
        J7.saveContact(name, phoneNumber);
        J7.calling(phoneNumber);
        J7.sendSMS(name, msg);
        
        System.out.println("");
        System.out.println("Using messenger");
        FB.calling(phoneNumber);
        FB.videoCalling(camera);
        FB.applyFiler(filter);
       
    }     
}
