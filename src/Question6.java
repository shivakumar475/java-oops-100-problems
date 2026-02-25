/*QUESTION 6: Write a Java program to demonstrate object oriented 
programming. 
Create a class Person with data members: 
  o name (String) 
  o age (int) 
1. In Person class, create the following methods: 
  o setPersonDetails(String name, int age) 
  o displayPersonDetails() 
2. Create a class Employee that inherits Person with data members: 
  o empId (int) 
  o salary (double) 
3. In Employee class, create the following methods: 
  o setEmployeeDetails(int empId, double salary) 
  o displayEmployeeDetails() 
4. Create a class Manager that inherits Employee with data member: 
  o department (String) 
5. In Manager class, create the following methods: 
  o setManagerDetails(String department) 
  o displayManagerDetails() 
6. Create a Main class. 
In the main() method: 
  o Create an object of Manager 
  o Call the following methods in order: 
    setPersonDetails() 
    setEmployeeDetails() 
    setManagerDetails() 
    displayManagerDetails() 
Expected Output: 
Name: Ramesh 
Age: 35 
Employee ID: 201 
Salary: 50000 
Department: IT*/


class Person{
    String name;
    int age;
    
    public void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayPersonDetails() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Employee extends Person{
    int empId;
    double salary;
    
    public void setEmployeeDetails(int empId, double salary) {
        this.empId=empId;
        this.salary=salary;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: "+empId);
        System.out.println("Salary: "+salary);
    }
}

class Manager extends Employee {
    String department;
    
    public void setManagerDetails(String department) {
        this.department=department;
    }
    public void displayManagerDetails() {
        displayPersonDetails();
        displayEmployeeDetails();
        System.out.println("Department: "+department);
    }
}

public class Question6 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setPersonDetails("Ramesh", 35);
        m.setEmployeeDetails(201,50000);
        m.setManagerDetails("IT");
        m.displayManagerDetails();
    }
}

