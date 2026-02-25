/*QUESTION 20: Write a Java program to demonstrate object oriented 
programming. 
1. Create a class Account with method: 
  o calculateInterest() → returns interest amount 
2. In Account class: 
  o Interest = balance × 2% 
3. Create a class SavingsAccount that inherits Account with data member: 
  o balance (double) 
4. In SavingsAccount class: 
  o Override calculateInterest() 
    Use super.calculateInterest() 
    If balance ≥ 100000, add extra 1% interest 
5. Create a Main class. 
In the main() method: 
  o Create an object of SavingsAccount 
  o Set balance value 
  o Call the method: 
    calculateInterest() 
Expected Output: 
Interest Amount: 3000*/


class Account {
    
    public double calculateInterest(double balance) {
        return balance*0.02;
    }
}

class SavingsAccount extends Account {
    double balance;
    
    public double calculateInterest(double balance)  {
        double Interest = super.calculateInterest(balance);
        
        if(balance>=100000) {
            Interest += balance*0.01 ;
        }
        return Interest;
    }
}

public class Question20 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.balance = 100000;
        
        System.out.println("Interest Amount: "+(int)(s.calculateInterest(s.balance)));
    }
}