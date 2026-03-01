/*QUESTION 41: Write a Java program to demonstrate object oriented
programming.
1. Create a class SalaryAccount with private data members:
 o employeeName (String)
 o basicSalary (double)
 o hra (double)
 o da (double)
2. Provide public methods:
 o setSalaryDetails(String employeeName, double basicSalary)
 o calculateHRA() → 20% of basic salary
 o calculateDA() → 10% of basic salary
 o getTotalSalary() → basic + hra + da
3. Create a Main class.
In the main() method:
 o Create an object of SalaryAccount
 o Set salary details
 o Display employee name and total salary
Expected Output:
Employee Name: Suresh
Total Salary: 36000.0 */

class SalaryAccount {
    private String employeeName;
    private double basicSalary;
    private double hra;
    private double da;

    public void setSalaryDetails(String employeeName, double basicSalary) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public void calculateHRA() {
        this.hra = basicSalary * 0.20;
    }

    public void calculateDA() {
        this.da = basicSalary * 0.10;
    }

    public double getTotalSalary() {
        return basicSalary + hra + da;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}

public class Question41 {
    public static void main(String[] args) {
        SalaryAccount sa = new SalaryAccount();

        sa.setSalaryDetails("Suresh", 30000);
        sa.calculateHRA();
        sa.calculateDA();

        System.out.println("Employee Name: " + sa.getEmployeeName());
        System.out.println("Total Salary: " + sa.getTotalSalary());
    }
}