/*QUESTION 12: Write a Java program to demonstrate object oriented 
programming. 
Create a class Account with data member: 
  o accountNumber (int) 
1. In Account class, create the following methods: 
  o setAccountDetails(int accountNumber) 
  o displayAccountDetails() 
2. Create a class SavingsAccount that inherits Account with data member: 
  o interestRate (double) 
3. In SavingsAccount class, create the following methods: 
  o setSavingsAccountDetails(double interestRate) 
  o displaySavingsAccountDetails() 
4. Create a class CurrentAccount that inherits Account with data member: 
  o overdraftLimit (double) 
5. In CurrentAccount class, create the following methods: 
  o setCurrentAccountDetails(double overdraftLimit) 
  o displayCurrentAccountDetails() 
6. Create a Main class. 
In the main() method: 
  o Create an object of SavingsAccount 
  o Call the following methods in order: 
    setAccountDetails() 
    setSavingsAccountDetails() 
    displaySavingsAccountDetails() 
  o Create an object of CurrentAccount 
  o Call the following methods in order: 
    setAccountDetails() 
    setCurrentAccountDetails() 
    displayCurrentAccountDetails() 
Expected Output: 
Account Number: 1001 
Interest Rate: 4.5 
Account Number: 2001 
Overdraft Limit: 50000*/


class Account {
    int accountNumber;
    
    public void setAccountDetails(int accountNumber) {
        this.accountNumber=accountNumber;
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: "+accountNumber);
    }
}

class SavingsAccount extends Account {
    double interestRate;
    
    public void  setSavingsAccountDetails(double interestRate) {
        this.interestRate=interestRate;
    }
    public void  displaySavingsAccountDetails() {
        displayAccountDetails();
        System.out.println("Interest Rate: "+interestRate);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;
    
    public void setCurrentAccountDetails(double overdraftLimit) {
        this.overdraftLimit=overdraftLimit;
    }
    public void displayCurrentAccountDetails() {
        displayAccountDetails();
        System.out.println("Over Draft Limit: "+overdraftLimit);
    }
}
public class Question12 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.setAccountDetails(1001);
        s.setSavingsAccountDetails(4.5f);
        s.displaySavingsAccountDetails();
        System.out.println();
        CurrentAccount c = new CurrentAccount();
        c.setAccountDetails(2001);
        c.setCurrentAccountDetails(50000);
        c.displayCurrentAccountDetails();
    }
}