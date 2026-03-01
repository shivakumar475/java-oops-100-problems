/* QUESTION 77: Write a Java program to demonstrate object oriented
programming.

1. Department Class
   • deptName (String)
   • location (String)

2. Teacher Class
   • teacherName (String)
   • teacherId (int)
   • Method setDepartment(Department dept) to link teacher with department
   • Method displayDetails() to display teacher + department info

3. Main Class:
   • Create Department object
   • Create Teacher object
   • Link using setDepartment()
   • Display all details

Expected Output:
Teacher Name: Anil
Teacher ID: 201
Department Name: Computer Science
Location: Block A
*/

class Department {
    String deptName;
    String location;

    public Department(String deptName, String location) {
        this.deptName = deptName;
        this.location = location;
    }
}

class Teacher {
    String teacherName;
    int teacherId;
    Department dept;

    public Teacher(String teacherName, int teacherId) {
        this.teacherName = teacherName;
        this.teacherId = teacherId;
    }

    public void setDepartment(Department dept) {
        this.dept = dept;
    }

    public void displayDetails() {
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Department Name: " + dept.deptName);
        System.out.println("Location: " + dept.location);
    }
}

public class Question77 {
    public static void main(String[] args) {
        Department d = new Department("Computer Science", "Block A");
        Teacher t = new Teacher("Anil", 201);

        t.setDepartment(d);
        t.displayDetails();
    }
}