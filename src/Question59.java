/* QUESTION 59: Write a Java program to demonstrate object oriented
programming.

1. Create an abstract class Account with data members:
   o accountNumber (int)
   o holderName (String)

2. In Account class:
   o Create a method setAccountDetails(int accountNumber, String holderName)
   o Create an abstract method calculateInterest()

3. Create a class SavingsAccount that inherits Account.
4. In SavingsAccount class:
   o Add data member balance (double)
   o Create method setBalance(double balance)
   o Implement calculateInterest()
       ▪ Interest = balance × 4 / 100

5. Create another class CurrentAccount that also inherits Account.
6. In CurrentAccount class:
   o Add data member balance (double)
   o Create method setBalance(double balance)
   o Implement calculateInterest()
       ▪ Interest = balance × 2 / 100

7. Create a Main class.
   In the main() method:
   o Create objects of SavingsAccount and CurrentAccount
   o Call setter methods
   o Call calculateInterest() for both

Expected Output:
Account Number: 7001
Holder Name: Mohan
Savings Account Interest: 2000.0
Account Number: 7002
Holder Name: Anita
Current Account Interest: 1000.0
*/

abstract class Account {
    int accountNumber;
    String holderName;

    public void setAccountDetails(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public abstract void calculateInterest();
}

class SavingsAccount extends Account {
    double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 4 / 100;
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Savings Account Interest: " + interest);
    }
}

class CurrentAccount extends Account {
    double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 2 / 100;
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Account Interest: " + interest);
    }
}

public class Question59 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.setAccountDetails(7001, "Mohan");
        sa.setBalance(50000);
        sa.calculateInterest();

        CurrentAccount ca = new CurrentAccount();
        ca.setAccountDetails(7002, "Anita");
        ca.setBalance(50000);
        ca.calculateInterest();
    }
}