/*QUESTION 31: Write a Java program to demonstrate object oriented
programming.
1. Create a class Student with private data members:
 o name (String)
 o rollNo (int)
2. Provide public setter and getter methods for all data members:
 o setName(String name)
 o setRollNo(int rollNo)
 o getName()
 o getRollNo()
3. Create a Main class.
In the main() method:
 o Create an object of Student
 o Set values using setter methods
 o Display values using getter methods
Expected Output:
Name: Riya
Roll No: 12 */

class Student {
    private String name;
    private int rollNo;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}

public class Question31 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Riya");
        s.setRollNo(12);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
    }
}