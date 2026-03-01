/* QUESTION 81: Write a Java program to demonstrate object oriented
programming.

1. Create a class Company with:
   • companyName (String)
   • location (String)

2. Create a class Employee:
   • employeeName (String)
   • employeeId (int)
   • company (Company)
   • Method setCompany(Company company)
   • Method displayDetails()

3. Main Class:
   • Create Company object
   • Create Employee object
   • Link them
   • Display details

Expected Output:
Employee Name: Kiran
Employee ID: 401
Company Name: Infosys
Location: Hyderabad
*/

class Company {
    String companyName;
    String location;

    public Company(String companyName, String location) {
        this.companyName = companyName;
        this.location = location;
    }
}

class Employee {
    String employeeName;
    int employeeId;
    Company company;

    public Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Company Name: " + company.companyName);
        System.out.println("Location: " + company.location);
    }
}

public class Question81 {
    public static void main(String[] args) {
        Company comp = new Company("Infosys", "Hyderabad");
        Employee emp = new Employee("Kiran", 401);
        emp.setCompany(comp);
        emp.displayDetails();
    }
}