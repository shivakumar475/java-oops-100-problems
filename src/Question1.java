/*QUESTION 1: Write a Java program to demonstrate object oriented 
programming. 
1. Create a class Person with data members: 
o name (String) 
o age (int) 
2. In Person class, create the following methods: 
o setPersonDetails(String name, int age) 
o displayPersonDetails() 
3. Create a class Student that inherits Person. 
4. In Student class, add data members: 
o rollNo (int) 
o marks (int) 
5. In Student class, create the following methods: 
o setStudentDetails(int rollNo, int marks) 
o displayStudentDetails() 
6. Create a Main class. 
In the main() method: 
o Create an object of Student 
o Call the following methods in order: 
setPersonDetails() 
setStudentDetails() 
displayStudentDetails() 
Expected Output: 
Name: Anu 
Age: 20 
Roll No: 101 
Marks: 85 */

class Person {
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

class Student extends Person {
    int rollNo;
    int marks;
    
    public void setStudentDetails(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Roll No: "+rollNo);
        System.out.println("Marks: "+marks);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.setPersonDetails("Anu", 20);
        obj1.setStudentDetails(101, 85);
        
        obj1.displayStudentDetails();
    }
}