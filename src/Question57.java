/* QUESTION 57: Write a Java program to demonstrate object oriented
programming.

1. Create an abstract class Employee with data members:
   o empId (int)
   o empName (String)

2. In Employee class:
   o Create a method setEmployeeDetails(int empId, String empName)
   o Create an abstract method calculateSalary()

3. Create a class Developer that inherits Employee.
4. In Developer class:
   o Implement calculateSalary()
       ▪ Salary = 40,000

5. Create another class Tester that also inherits Employee.
6. In Tester class:
   o Implement calculateSalary()
       ▪ Salary = 35,000

7. Create a Main class.
   In the main() method:
   o Create objects of Developer and Tester
   o Call setEmployeeDetails()
   o Call calculateSalary() for both objects

Expected Output:
Employee ID: 101
Employee Name: Rohit
Salary: 40000

Employee ID: 102
Employee Name: Neha
Salary: 35000
*/

abstract class Employee {
    int empId;
    String empName;

    public void setEmployeeDetails(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public abstract void calculateSalary();
}

class Developer extends Employee {
    @Override
    public void calculateSalary() {
        int salary = 40000;
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

class Tester extends Employee {
    @Override
    public void calculateSalary() {
        int salary = 35000;
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}

public class Question57 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.setEmployeeDetails(101, "Rohit");
        d.calculateSalary();

        Tester t = new Tester();
        t.setEmployeeDetails(102, "Neha");
        t.calculateSalary();
    }
}