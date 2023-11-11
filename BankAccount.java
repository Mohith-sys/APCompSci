/*Mohith Nagendra
3/10/2022*/

public class BankAccount {
    // instance variables
    private int accountNum;
    private double accountBalance;
    private String customerName, password;
    // static variables
    private static String bankAddress, bankName;
    private static int numberOfTransactions, routingNumber;
    private static double totalBalance;

    public BankAccount(int n, int b, String c, String p){
        accountNum = n;
        customerName = c;
        password = p;
        accountBalance = b;
        totalBalance += accountBalance;
    }

    public BankAccount(int n, String c, String p){
        accountNum = n;
        customerName = c;
        password = p;
        accountBalance = 0;
    }

    public String toString(){
        return "Customer name: " + customerName + "\nAccount number: " + accountNum + "\n Account balance: $" + accountBalance;
    }

    public void withdraw(double amt){
        accountBalance -= amt;
        numberOfTransactions++;
        totalBalance -= amt;
    }

    public void deposit(double amt){
        accountBalance += amt; // adding balance to specific account
        numberOfTransactions++;
        totalBalance += amt; // adding balance to the total amount
    }

    public void changePassword(String pass){
        password = pass;
    }

}