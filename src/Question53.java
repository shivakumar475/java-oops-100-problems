/* QUESTION 53: Write a Java program to demonstrate object oriented
programming.

1. Create an abstract class Account with data members:
   o accountNumber (int)
   o holderName (String)

2. In Account class:
   o Create a method setAccountDetails(int accountNumber, String holderName)
   o Create an abstract method calculateCharges()

3. Create a class SavingsAccount that inherits Account.
4. In SavingsAccount class:
   o Add data member balance (double)
   o Create method setBalance(double balance)

5. Create a class PremiumSavingsAccount that inherits SavingsAccount.
6. In PremiumSavingsAccount class:
   o Implement calculateCharges()
       ▪ If balance ≥ 50,000 → Service charge = 0
       ▪ Else → Service charge = 500
   o Display account details and service charge

7. Create a Main class.
   In the main() method:
   o Create an object of PremiumSavingsAccount
   o Call all required setter methods
   o Call calculateCharges()

Expected Output:
Account Number: 3001
Holder Name: Rajesh
Service Charge: 0
*/

abstract class Account {
    int accountNumber;
    String holderName;

    public void setAccountDetails(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public abstract void calculateCharges();
}

class SavingsAccount extends Account {
    double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void calculateCharges() {
        // Not used here; overridden in PremiumSavingsAccount
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    @Override
    public void calculateCharges() {
        int serviceCharge = (balance >= 50000) ? 0 : 500;

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Service Charge: " + serviceCharge);
    }
}

public class Question53 {
    public static void main(String[] args) {
        PremiumSavingsAccount psa = new PremiumSavingsAccount();
        psa.setAccountDetails(3001, "Rajesh");
        psa.setBalance(60000); // ≥ 50,000 → No service charge
        psa.calculateCharges();
    }
}