/* QUESTION 78: Write a Java program to demonstrate object oriented
programming.

1. Bank Class
   • bankName (String)
   • branch (String)

2. Customer Class
   • customerName (String)
   • customerId (int)
   • Method setBank(Bank bank)
   • Method displayDetails()

3. Main Class:
   • Create Bank object
   • Create Customer object
   • Link via setBank()
   • Display info

Expected Output:
Customer Name: Pooja
Customer ID: 301
Bank Name: HDFC Bank
Branch: MG Road
*/

class Bank {
    String bankName;
    String branch;

    public Bank(String bankName, String branch) {
        this.bankName = bankName;
        this.branch = branch;
    }
}

class Customer {
    String customerName;
    int customerId;
    Bank bank;

    public Customer(String customerName, int customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Bank Name: " + bank.bankName);
        System.out.println("Branch: " + bank.branch);
    }
}

public class Question78 {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC Bank", "MG Road");
        Customer c = new Customer("Pooja", 301);
        c.setBank(bank);
        c.displayDetails();
    }
}