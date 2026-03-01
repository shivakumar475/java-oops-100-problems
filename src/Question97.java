/* QUESTION 97: Write a Java program to demonstrate object oriented
programming.

1. Create a class Bank:
   • bankName (String)
   • ifscCode (String)

2. Create a class AccountHolder:
   • holderName (String)
   • accountNumber (long)
   • bank (Bank)
   • Method setBank(Bank bank)
   • Method displayDetails()

3. Main Class:
   • Create Bank object
   • Create AccountHolder object
   • Link them
   • Display details

Expected Output:
Account Holder: Naveen
Account Number: 9876543210
Bank Name: SBI Bank
IFSC Code: SBIN001234
*/

class Bank {
    String bankName;
    String ifscCode;

    public Bank(String bankName, String ifscCode) {
        this.bankName = bankName;
        this.ifscCode = ifscCode;
    }
}

class AccountHolder {
    String holderName;
    long accountNumber;
    Bank bank;

    public AccountHolder(String holderName, long accountNumber) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name: " + bank.bankName);
        System.out.println("IFSC Code: " + bank.ifscCode);
    }
}

public class Question97 {
    public static void main(String[] args) {
        Bank b = new Bank("SBI Bank", "SBIN001234");
        AccountHolder ah = new AccountHolder("Naveen", 9876543210L);
        ah.setBank(b);
        ah.displayDetails();
    }
}