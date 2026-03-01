/*QUESTION 37: Write a Java program to demonstrate object oriented
programming.
1. Create a class Person with private data members:
 o name (String)
 o age (int)
2. Provide public setter and getter methods:
 o setName(String name)
 o setAge(int age)
 o getName()
 o getAge()
3. Create a Main class.
In the main() method:
 o Create an object of Person
 o Set values using setter methods
 o Display values using getter methods
Expected Output:
Name: Arun
Age: 21
*/


class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Question37 {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Arun");
        p.setAge(21);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}