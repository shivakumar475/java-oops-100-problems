/*QUESTION 4: Write a Java program to demonstrate object oriented 
programming. 
1. Create a class BankAccount with data members: 
o accountNumber (int) 
o accountHolderName (String) 
o balance (double) 
2. In BankAccount class, create the following methods: 
o setAccountDetails(int accNo, String name, double balance) 
o deposit(double amount) 
o withdraw(double amount) 
o displayAccountDetails() 
3. Create a class SavingsAccount that inherits BankAccount. 
4. In SavingsAccount class, add data member: 
o interestRate (double) 
5. In SavingsAccount class, create the following methods: 
o setInterestRate(double rate) 
o calculateInterest() 
o displaySavingsAccountDetails() 
6. Create a Main class. 
In the main() method: 
o Create an object of SavingsAccount 
o Call the following methods: 
setAccountDetails() 
setInterestRate() 
deposit() 
withdraw() 
calculateInterest() 
displaySavingsAccountDetails() 
Expected Output: 
Account Number: 12345 
Account Holder: Anjali 
Balance: 12000 
Interest: 600*/


class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    
    public void setAccountDetails(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.accountHolderName = name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance+=amount;
        System.out.println(amount+" deposited");
    }
    public void withdraw(double amount) {
        balance-=amount;
        System.out.println(amount+" withdrawn");
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Balance: "+balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }
    public double calculateInterest() {
        double interest = (balance*interestRate*1)/100;
        return interest;
    }
    public void displaySavingsAccountDetails() {
        displayAccountDetails();
        System.out.println("Interest: "+calculateInterest());
    }
}

public class Question4 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.setAccountDetails(12345, "Anjali", 30000);
        s.setInterestRate(5);
        s.deposit(5000);
        s.withdraw(10000);
        s.calculateInterest();
        s.displaySavingsAccountDetails();
        
    }
}