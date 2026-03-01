/* QUESTION 79: Write a Java program to demonstrate object oriented
programming.

1. Project Class
   • projectName (String)
   • duration (int)
   • Method displayProjectDetails()

2. Employee Class
   • employeeName (String)
   • employeeId (int)
   • Method setProject(Project project)
   • Method displayEmployeeDetails()

3. Main Class:
   • Create Project object
   • Create Employee object
   • Link using setProject()
   • Display all info

Expected Output:
Employee Name: Arjun
Employee ID: 501
Project Name: AI Development
Project Duration: 12 months
*/

class Project {
    String projectName;
    int duration;

    public Project(String projectName, int duration) {
        this.projectName = projectName;
        this.duration = duration;
    }

    public void displayProjectDetails() {
        System.out.println("Project Name: " + projectName);
        System.out.println("Project Duration: " + duration + " months");
    }
}

class Employee {
    String employeeName;
    int employeeId;
    Project project;

    public Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        project.displayProjectDetails();
    }
}

public class Question79 {
    public static void main(String[] args) {
        Project p = new Project("AI Development", 12);
        Employee e = new Employee("Arjun", 501);

        e.setProject(p);
        e.displayEmployeeDetails();
    }
}