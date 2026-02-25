/*QUESTION 19: Write a Java program to demonstrate object oriented 
programming. 
1. Create a class Employee with method: 
  o calculateSalary() 
2. In Employee class, implement calculateSalary() to display: 
  o "Base salary calculation" 
3. Create a class HourlyEmployee that inherits Employee with data members: 
  o hourlyRate (double) 
  o hoursWorked (int) 
4. In HourlyEmployee class: 
  o Override calculateSalary() 
    Salary = hourlyRate × hoursWorked 
5. Create a Main class. 
In the main() method: 
  o Create an object of HourlyEmployee 
  o Set hourlyRate and hoursWorked 
  o Call the method: 
    calculateSalary() 
Expected Output: 
Salary: 20000 */


class Employee {
    public void calculateSalary() {
        System.out.println("Base salary calculation");
    }
}

class HourlyEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    
    public void calculateSalary(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        int Salary = (int)(hourlyRate)*hoursWorked;
        System.out.println("Salary: "+Salary);
    }
}

public class Question19 {
    public static void main(String[] args) {
        HourlyEmployee h = new HourlyEmployee();
        h.calculateSalary(1000, 20);
        
        
    }
}