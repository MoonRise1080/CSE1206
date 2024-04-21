package all;

public class JointAccount {

    private static double balance;

    JointAccount() {

    }

    JointAccount(double balance) {
        this.balance = balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    static double getBalance() {
        return balance;
    }

}
