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
        s.setAccountDetails(12345, "Shiva", 30000);
        s.setInterestRate(5);
        s.deposit(5000);
        s.withdraw(10000);
        s.calculateInterest();
        s.displaySavingsAccountDetails();
        
    }
}