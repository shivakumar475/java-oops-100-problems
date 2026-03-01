/*QUESTION 33: Write a Java program to demonstrate object oriented
programming.
1. Create a class Employee with private data members:
 o empId (int)
 o empName (String)
2. Provide public setter and getter methods:
 o setEmpId(int empId)
 o setEmpName(String empName)
 o getEmpId()
 o getEmpName()
3. Create a Main class.
In the main() method:
 o Create an object of Employee
 o Assign values using setter methods
 o Display employee details using getter methods
Expected Output:
Employee ID: 201
Employee Name: Karthik*/

class Employee {
    private int empId;
    private String empName;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}

public class Question33 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmpId(201);
        e.setEmpName("Karthik");

        System.out.println("Employee ID: " + e.getEmpId());
        System.out.println("Employee Name: " + e.getEmpName());
    }
}
