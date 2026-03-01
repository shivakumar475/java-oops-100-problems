/* QUESTION 70: Write a Java program to demonstrate object oriented
programming.

1. Create an interface EmployeeRole with the method:
   o getRoleDetails()

2. Create a class Manager that implements EmployeeRole.
3. Create a class Developer that implements EmployeeRole.

4. In the Manager class:
   o Implement getRoleDetails() to display manager responsibilities

5. In the Developer class:
   o Implement getRoleDetails() to display developer responsibilities

6. Create a Main class.
   In the main() method:
   o Create objects of Manager and Developer
   o Call getRoleDetails()

Expected Output:
Role: Manager
Role: Developer
*/

interface EmployeeRole {
    void getRoleDetails();
}

class Manager implements EmployeeRole {
    @Override
    public void getRoleDetails() {
        System.out.println("Role: Manager");
    }
}

class Developer implements EmployeeRole {
    @Override
    public void getRoleDetails() {
        System.out.println("Role: Developer");
    }
}

public class Question70 {
    public static void main(String[] args) {
        Manager m = new Manager();
        Developer d = new Developer();

        m.getRoleDetails();
        d.getRoleDetails();
    }
}