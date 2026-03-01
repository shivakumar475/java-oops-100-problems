/* QUESTION 50: Write a Java program to demonstrate object oriented
programming.

1. Create an abstract class BankAccount with data members:
   o accountNumber (int)
   o accountHolderName (String)
   o balance (double)

2. In BankAccount class:
   o Create a method setAccountDetails(int accountNumber, String accountHolderName, double balance)
   o Create an abstract method calculateInterest()

3. Create a class SavingsAccount that inherits BankAccount.

4. In SavingsAccount class:
   o Implement calculateInterest()
       ▪ Interest Rate = 4% per annum
       ▪ Interest = balance × 4 / 100
   o Display account details, interest, and final balance

5. Create a Main class.
   In the main() method:
   o Create an object of SavingsAccount
   o Call setAccountDetails()
   o Call calculateInterest()

Expected Output:
Account Number: 5001
Account Holder Name: Deepak
Balance: 50000.0
Interest: 2000.0
Final Balance: 52000.0
*/

abstract class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    public void setAccountDetails(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();
}

class SavingsAccount extends BankAccount {
    @Override
    public void calculateInterest() {
        double interest = balance * 4 / 100;
        double finalBalance = balance + interest;

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + interest);
        System.out.println("Final Balance: " + finalBalance);
    }
}

public class Question50 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.setAccountDetails(5001, "Deepak", 50000.0);
        sa.calculateInterest();
    }
}