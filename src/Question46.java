/* QUESTION 46: Write a Java program to demonstrate object oriented
programming.
1. Create an abstract class Person with data members:
   o name (String)
   o age (int)

2. In Person class:
   o Create a method setPersonDetails(String name, int age)
   o Create an abstract method displayDetails()

3. Create a class Student that inherits Person.

4. In Student class:
   o Implement the displayDetails() method
   o Display name and age

5. Create a Main class.
   In the main() method:
   o Create an object of Student
   o Call setPersonDetails()
   o Call displayDetails()

Expected Output:
Name: Ramesh
Age: 20
*/

abstract class Person {
    String name;
    int age;

    public void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayDetails();
}

class Student extends Person {
    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Question46 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setPersonDetails("Ramesh", 20);
        s.displayDetails();
    }
}