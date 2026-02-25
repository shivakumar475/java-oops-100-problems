/*QUESTION 3: Write a Java program to demonstrate object oriented 
programming. 
1. Create a class Employee with data members: 
o empId (int) 
o empName (String) 
o basicSalary (double) 
2. In Employee class, create the following methods: 
o setEmployeeDetails(int empId, String empName, double basicSalary) 
o calculateSalary() → calculates and returns total salary 
(HRA = 20% of basic, DA = 10% of basic) 
o displayEmployeeDetails() 
3. Create a class Manager that inherits Employee. 
4. In Manager class, add data member: 
o bonus (double) 
5. In Manager class, create the following methods: 
o setManagerDetails(double bonus) 
o displayManagerDetails() → display all details including total salary 
6. Create a Main class. 
In the main() method: 
o Create an object of Manager 
o Call the following methods in order: 
setEmployeeDetails() 
setManagerDetails() 
displayManagerDetails() 
Expected Output: 
Employee ID: 101 
Employee Name: Ravi 
Basic Salary: 30000 
Bonus: 5000 
Total Salary: 41000 */


class Employee {
    int empId;
    String empName;
    double basicSalary;
    
    public void setEmployeeDetails(int empId, String empName, double basicSalary) {
        this.empId=empId;
        this.empName=empName;
        this.basicSalary=basicSalary;
    }
    public double calculateSalary() {
        double total = basicSalary + (0.20 * basicSalary) + (0.10 * basicSalary);
        return total;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Basic Salary: "+ basicSalary);
    }
}

class Manager extends Employee {
    double bonus;
    
    public void setManagerDetails(double bonus) {
        this.bonus = bonus;
    }
    
    public void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+calculateSalary());
    }
}

public class Question3 {
    public static void main(String[] args){
        Manager m = new Manager();
        m.setEmployeeDetails(101, "Ravi", 50000);
        m.setManagerDetails(5000);
        m.displayManagerDetails();
    }
}