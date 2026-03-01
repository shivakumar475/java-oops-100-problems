/*QUESTION 26: Write a Java program to demonstrate object oriented
programming.
1. Create a class Student with data members:
 o name (String)
 o rollNo (int)
2. In Student class, create overloaded constructors:
 o Student() → initializes name as "Unknown" and rollNo as 0
 o Student(String name, int rollNo) → initializes data members using parameters
3. Create a Main class.
In the main() method:
 o Create one object using default constructor
 o Create another object using parameterized constructor
 o Display student details for both objects
Expected Output:
Name: Unknown
Roll No: 0
Name: Rahul
Roll No: 101 */

class Student {
    String name;
    int rollNo;

    Student() {
        this.name = "Unknown";
        this.rollNo = 0;
    }

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Question26 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul", 101);

        s1.display();
        s2.display();
    }
}