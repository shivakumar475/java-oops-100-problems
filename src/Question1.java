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
        obj1.setPersonDetails("Shiva", 19);
        obj1.setStudentDetails(101, 85);
        
        obj1.displayStudentDetails();
    }
}