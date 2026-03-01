/* QUESTION 64: Write a Java program to demonstrate object oriented
programming.

1. Create an interface Employee with the method:
   o calculateSalary()

2. Create a class FullTimeEmployee that implements Employee.

3. In the FullTimeEmployee class:
   o Create data members:
       ▪ employeeId (int)
       ▪ employeeName (String)
       ▪ basicSalary (double)
   o Create a method setEmployeeDetails(int id, String name, double basicSalary)
   o Implement the calculateSalary() method as follows:
       ▪ HRA = 20% of basic salary
       ▪ DA = 10% of basic salary
       ▪ Total Salary = basic + HRA + DA
   o Display all employee details along with total salary

4. Create a Main class.
   In the main() method:
   o Create an object of FullTimeEmployee
   o Call setEmployeeDetails()
   o Call calculateSalary()

Expected Output:
Employee ID: 101
Employee Name: Rahul
Basic Salary: 25000
HRA: 5000
DA: 2500
Total Salary: 32500
*/

interface Employee {
    void calculateSalary();
}

class FullTimeEmployee implements Employee {
    int employeeId;
    String employeeName;
    double basicSalary;

    public void setEmployeeDetails(int id, String name, double basicSalary) {
        this.employeeId = id;
        this.employeeName = name;
        this.basicSalary = basicSalary;
    }

    @Override
    public void calculateSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double totalSalary = basicSalary + hra + da;

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class Question64 {
    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee();
        emp.setEmployeeDetails(101, "Rahul", 25000);
        emp.calculateSalary();
    }
}