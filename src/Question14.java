/*QUESTION 14: Write a Java program to demonstrate object oriented 
programming. 
1. Create a class Employee with data members: 
  o empId (int) 
  o empName (String) 
2. In Employee class, create the following methods: 
  o setEmployeeDetails(int empId, String empName) 
  o displayEmployeeDetails() 
3. Create a class PermanentEmployee that inherits Employee with data member: 
  o monthlySalary (double) 
4. In PermanentEmployee class, create the following methods: 
  o setPermanentEmployeeDetails(double monthlySalary) 
  o displayPermanentEmployeeDetails() 
5. Create a class ContractEmployee that inherits Employee with data members: 
  o hourlyRate (double) 
  o hoursWorked (int) 
6. In ContractEmployee class, create the following methods: 
  o setContractEmployeeDetails(double hourlyRate, int hoursWorked) 
  o calculateSalary() 
  o displayContractEmployeeDetails() 
7. Create a Main class. 
In the main() method: 
  o Create an object of PermanentEmployee 
  o Call the following methods in order: 
    setEmployeeDetails() 
    setPermanentEmployeeDetails() 
    displayPermanentEmployeeDetails() 
  o Create an object of ContractEmployee 
  o Call the following methods in order: 
    setEmployeeDetails() 
    setContractEmployeeDetails() 
    displayContractEmployeeDetails() 
Expected Output: 
Employee ID: 101 
Employee Name: Ravi 
Monthly Salary: 45000 
Employee ID: 102 
Employee Name: Anu 
Salary: 40000*/


class Employee {
    int empId;
    String empName;
    
    public void setEmployeeDetails(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Name: "+empName);
    }
}

class PermanentEmployee extends Employee {
    double monthlySalary;
    
    public void setPermanentEmployeeDetails(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public void displayPermanentEmployeeDetails() {
        displayEmployeeDetails();
        System.out.println("Monthly Salary: "+monthlySalary);
    }
}

class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    
    public void setContractEmployeeDetails(double hourlyRate, int hoursWorked) {
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }
    public double calculateSalary() {
        return hourlyRate*hoursWorked;
    }
    public void displayContractEmployeeDetails() {
        displayEmployeeDetails();
        System.out.println("Salary: "+calculateSalary());
    }
}

public class Question14 {
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee();
        p.setEmployeeDetails(101, "Ravi");
        p.setPermanentEmployeeDetails(45000);
        p.displayPermanentEmployeeDetails();
        System.out.println();
        ContractEmployee c = new ContractEmployee();
        c.setEmployeeDetails(102, "Anu");
        c.setContractEmployeeDetails(195, 205);
        c.displayContractEmployeeDetails();
    }
}