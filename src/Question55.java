/* QUESTION 55: Write a Java program to demonstrate object oriented
programming.

1. Create an abstract class Loan with data members:
   o loanId (int)
   o customerName (String)
   o loanAmount (double)

2. In Loan class:
   o Create a method setLoanDetails(int loanId, String customerName, double loanAmount)
   o Create an abstract method calculateEMI()

3. Create a class HomeLoan that inherits Loan.
4. In HomeLoan class:
   o Add data member tenure (int) (in years)
   o Create method setTenure(int tenure)

5. Create a class LuxuryHomeLoan that inherits HomeLoan.
6. In LuxuryHomeLoan class:
   o Implement calculateEMI()
       ▪ Interest Rate = 8% per annum
       ▪ EMI = (loanAmount + interest) / (tenure × 12)
   o Display loan details and monthly EMI

7. Create a Main class.
   In the main() method:
   o Create an object of LuxuryHomeLoan
   o Call all setter methods
   o Call calculateEMI()

Expected Output:
Loan ID: 9001
Customer Name: Suman
Loan Amount: 2400000
Tenure: 20 years
Monthly EMI: 10800
*/

abstract class Loan {
    int loanId;
    String customerName;
    double loanAmount;

    public void setLoanDetails(int loanId, String customerName, double loanAmount) {
        this.loanId = loanId;
        this.customerName = customerName;
        this.loanAmount = loanAmount;
    }

    public abstract void calculateEMI();
}

class HomeLoan extends Loan {
    int tenure;

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    @Override
    public void calculateEMI() {
        // Overridden in LuxuryHomeLoan
    }
}

class LuxuryHomeLoan extends HomeLoan {
    @Override
    public void calculateEMI() {
        double interest = loanAmount * 0.08; // 8% annual interest
        double totalAmount = loanAmount + interest;
        double emi = totalAmount / (tenure * 12);

        System.out.println("Loan ID: " + loanId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Tenure: " + tenure + " years");
        System.out.println("Monthly EMI: " + emi);
    }
}

public class Question55 {
    public static void main(String[] args) {
        LuxuryHomeLoan lhl = new LuxuryHomeLoan();
        lhl.setLoanDetails(9001, "Suman", 2400000);
        lhl.setTenure(20);
        lhl.calculateEMI();
    }
}