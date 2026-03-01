/* QUESTION 45: Write a Java program to demonstrate object oriented 
programming.
1. Create a class InsurancePolicy with private data members:
   o policyNumber (int)
   o policyHolderName (String)
   o age (int)
   o premiumAmount (double)

2. Provide public methods:
   o setPolicyDetails(int policyNumber, String policyHolderName, int age)
       ▪ Age must be ≥ 18
   o calculatePremium()
       ▪ Age ≤ 30 → ₹3000
       ▪ Age ≤ 50 → ₹5000
       ▪ Age > 50 → ₹8000
   o getPremiumAmount()
   o displayPolicyDetails()

3. Create a Main class.
   In the main() method:
   o Create an object of InsurancePolicy
   o Set policy details
   o Calculate premium
   o Display policy information

Expected Output:
Policy Number: 9001
Policy Holder Name: Mahesh
Age: 45
Premium Amount: 5000.0
*/

class InsurancePolicy {
    private int policyNumber;
    private String policyHolderName;
    private int age;
    private double premiumAmount;

    public void setPolicyDetails(int policyNumber, String policyHolderName, int age) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;

        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Age must be 18 or above.");
        }
    }

    public void calculatePremium() {
        if (age <= 30) {
            premiumAmount = 3000;
        } else if (age <= 50) {
            premiumAmount = 5000;
        } else {
            premiumAmount = 8000;
        }
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void displayPolicyDetails() {
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Policy Holder Name: " + policyHolderName);
        System.out.println("Age: " + age);
        System.out.println("Premium Amount: " + premiumAmount);
    }
}

public class Question45 {
    public static void main(String[] args) {
        InsurancePolicy p = new InsurancePolicy();
        p.setPolicyDetails(9001, "Mahesh", 45);
        p.calculatePremium();
        p.displayPolicyDetails();
    }
}