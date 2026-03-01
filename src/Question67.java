/* QUESTION 67: Write a Java program to demonstrate object oriented
programming.

1. Create an interface BankAccount with the method:
   o createAccount(int accountNumber, String accountHolderName)

2. Create an interface SavingsAccount that extends BankAccount with the method:
   o calculateInterest(double balance)

3. Create a class CustomerAccount that implements SavingsAccount.

4. In the CustomerAccount class:
   o Implement createAccount() to store and display account details
   o Implement calculateInterest() using:
       ▪ Interest = balance × 4%
   o Display account details and calculated interest

5. Create a Main class.
   In the main() method:
   o Create an object of CustomerAccount
   o Call createAccount()
   o Call calculateInterest()

Expected Output:
Account Number: 1001
Account Holder: Suresh
Balance: 20000
Interest: 800
*/

interface BankAccount {
    void createAccount(int accountNumber, String accountHolderName);
}

interface SavingsAccount extends BankAccount {
    void calculateInterest(double balance);
}

class CustomerAccount implements SavingsAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    @Override
    public void createAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
    }

    @Override
    public void calculateInterest(double balance) {
        this.balance = balance;
        double interest = balance * 0.04;

        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + interest);
    }
}

public class Question67 {
    public static void main(String[] args) {
        CustomerAccount ca = new CustomerAccount();
        ca.createAccount(1001, "Suresh");
        ca.calculateInterest(20000);
    }
}