/* QUESTION 43: Write a Java program to demonstrate object oriented 
programming.
1. Create a class ATMAccount with private data members:
   o accountNumber (int)
   o holderName (String)
   o balance (double)

2. Provide public methods:
   o setAccountDetails(int accountNumber, String holderName, double balance)
   o deposit(double amount)
       ▪ Amount must be greater than 0
   o withdraw(double amount)
       ▪ Amount must be less than or equal to balance
   o getBalance()
   o displayAccountDetails()

3. Create a Main class.
   In the main() method:
   o Create an object of ATMAccount
   o Set account details
   o Deposit an amount
   o Withdraw an amount
   o Display final account details

Expected Output:
Account Number: 1001
Holder Name: Rohan
Final Balance: 18500.0
*/

class ATMAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public void setAccountDetails(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Final Balance: " + balance);
    }
}

public class Question43 {
    public static void main(String[] args) {
        ATMAccount acc = new ATMAccount();

        acc.setAccountDetails(1001, "Rohan", 15000);
        acc.deposit(5000);
        acc.withdraw(1500);

        acc.displayAccountDetails();
    }
}