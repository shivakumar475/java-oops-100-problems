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
        m.setPersonDetails("shiva",19);
        m.setEmployeeDetails(201,50000);
        m.setManagerDetails("IT");
        m.displayManagerDetails();
    }
}