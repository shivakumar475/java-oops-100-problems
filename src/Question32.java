/*QUESTION 32: Write a Java program to demonstrate object oriented
programming.
1. Create a class BankAccount with private data members:
 o accountNumber (int)
 o balance (double)
2. Provide public methods:
 o setAccountDetails(int accountNumber, double balance)
 o getAccountNumber()
 o getBalance()
3. Create a Main class.
In the main() method:
 o Create an object of BankAccount
 o Set account details
 o Display account number and balance
Expected Output:
Account Number: 12345
Balance: 25000.0
*/


class BankAccount {
    private int accountNumber;
    private double balance;

    public void setAccountDetails(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class Question32 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.setAccountDetails(12345, 25000.0);

        System.out.println("Account Number: " + ba.getAccountNumber());
        System.out.println("Balance: " + ba.getBalance());
    }
}
