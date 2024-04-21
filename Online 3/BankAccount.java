package all;
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double balance, debit, credit, temp1, temp2; 
        int userID1, userID2;
        
        System.out.print("Enter balance: ");
        balance = input.nextDouble();
        
        JointAccount acc = new JointAccount(balance);
        
        System.out.print("First User ID: ");
        userID1 = input.nextInt();
        User firstUser = new User(userID1);
        
        System.out.print("Second User ID: ");
        userID2 = input.nextInt();
        User secondUser = new User(userID2);
        
        System.out.print("Enter debit amount: ");
        debit = input.nextDouble();
        firstUser.amount = debit;
        temp1 = firstUser.Debit();
        
        System.out.print("Enter crebit amount: ");
        credit = input.nextDouble();
        secondUser.amount = credit;
        temp2 = secondUser.Credit();
        
        System.out.println("");
        
        System.out.println("User ID: " + firstUser.getUserID());
        System.out.println("Debited Amount: " + debit);
        System.out.println("Balance: " + temp1);
        
        
        System.out.println("User ID: " + secondUser.getUserID());
        System.out.println("Debited Amount: " + credit);
        System.out.println("Balance: " + temp2);
        
        
    }
}
