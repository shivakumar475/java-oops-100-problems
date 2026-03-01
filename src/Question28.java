/*QUESTION 28: Write a Java program to demonstrate object oriented
programming.
1. Create a class Employee with data members:
 o empId (int)
 o empName (String)
 o salary (double)
2. In Employee class, create overloaded constructors:
 o Employee(int empId, String empName) → initialize empId and empName, salary
as 0.0
 o Employee(int empId, String empName, double salary) → initialize all data
members
3. Create a method in Employee class:
 o displayEmployeeDetails()
4. Create a Main class.
In the main() method:
 o Create objects using both constructors
 o Call displayEmployeeDetails() for each object
Expected Output:
Employee ID: 101
Employee Name: Ramesh
Salary: 0.0
Employee ID: 102
Employee Name: Sita
Salary: 55000.0
 */

class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        this.salary = 0.0;
    }

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}

public class Question28 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Ramesh");
        Employee e2 = new Employee(102, "Sita", 55000.0);

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
    }
}