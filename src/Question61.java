/* QUESTION 61: Write a Java program to demonstrate object oriented
programming.

1. Create an interface Printable with a method:
   o printDetails()

2. Create a class Student that implements Printable.

3. In Student class:
   o Create data members:
       ▪ name (String)
       ▪ rollNo (int)
   o Create a method setStudentDetails(String name, int rollNo)
   o Implement the printDetails() method to display student details

4. Create a Main class.
   In the main() method:
   o Create an object of Student
   o Call setStudentDetails()
   o Call printDetails()

Expected Output:
Name: Arjun
Roll No: 15
*/

interface Printable {
    void printDetails();
}

class Student implements Printable {
    String name;
    int rollNo;

    public void setStudentDetails(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Question61 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudentDetails("Arjun", 15);
        s.printDetails();
    }
}