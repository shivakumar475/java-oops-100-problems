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
        m.setEmployeeDetails(101, "Shiva", 50000);
        m.setManagerDetails(5000);
        m.displayManagerDetails();
    }
}