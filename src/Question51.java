/* QUESTION 51: Write a Java program to demonstrate object oriented
programming.

1. Create an abstract class Person with data member:
   o name (String)

2. In Person class:
   o Create a method setPersonName(String name)
   o Create an abstract method displayRole()

3. Create a class Employee that inherits Person.
4. In Employee class:
   o Add data member employeeId (int)
   o Create method setEmployeeId(int employeeId)

5. Create a class Manager that inherits Employee.
6. In Manager class:
   o Implement displayRole()
   o Display name and employee ID

7. Create a Main class.
   In the main() method:
   o Create an object of Manager
   o Call setPersonName()
   o Call setEmployeeId()
   o Call displayRole()

Expected Output:
Name: Anil
Employee ID: 301
*/

abstract class Person {
    String name;

    public void setPersonName(String name) {
        this.name = name;
    }

    public abstract void displayRole();
}

class Employee extends Person {
    int employeeId;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void displayRole() {
        // Not used here; overridden in Manager
    }
}

class Manager extends Employee {
    @Override
    public void displayRole() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Question51 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setPersonName("Anil");
        m.setEmployeeId(301);
        m.displayRole();
    }
}