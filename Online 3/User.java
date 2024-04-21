package all;

public class User extends JointAccount {

    private int userID;
    static double amount, temp;

    User() {

    }

    User(int userID) {
        this.userID = userID;
    }

    void setUserID(int userID) {
        this.userID = userID;
    }

    double getUserID() {
        return userID;
    }

    static double Debit() {
        temp = JointAccount.getBalance() - amount;
        return temp;
    }



    static double Credit() {
        temp = JointAccount.getBalance() + amount;
        return temp;
    }

}
