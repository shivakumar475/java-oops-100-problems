/* QUESTION 48: Write a Java program to demonstrate object oriented
programming.

1. Create an abstract class Employee with data members:
   o empId (int)
   o empName (String)
   o basicSalary (double)

2. In Employee class:
   o Create a method setEmployeeDetails(int empId, String empName, double basicSalary)
   o Create an abstract method calculateSalary()

3. Create a class PermanentEmployee that inherits Employee.

4. In PermanentEmployee class:
   o Implement calculateSalary()
       ▪ HRA = 20% of basic salary
       ▪ Total Salary = basic + HRA
   o Display employee details and total salary

5. Create a Main class.
   In the main() method:
   o Create an object of PermanentEmployee
   o Call setEmployeeDetails()
   o Call calculateSalary()

Expected Output:
Employee ID: 201
Employee Name: Sunil
Total Salary: 36000.0
*/

abstract class Employee {
    int empId;
    String empName;
    double basicSalary;

    public void setEmployeeDetails(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    public abstract void calculateSalary();
}

class PermanentEmployee extends Employee {
    @Override
    public void calculateSalary() {
        double hra = basicSalary * 0.20;
        double totalSalary = basicSalary + hra;

        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class Question48 {
    public static void main(String[] args) {
        PermanentEmployee emp = new PermanentEmployee();
        emp.setEmployeeDetails(201, "Sunil", 30000);
        emp.calculateSalary();
    }
}