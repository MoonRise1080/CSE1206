
package all;


abstract class MobilePhone implements PhoneCall{
    
    abstract void sendSMS(String name, String phoneNumber);
    abstract void saveContact(String R, String msg);
}
