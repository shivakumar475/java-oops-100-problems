/* QUESTION 100: Write a Java program to demonstrate object oriented
programming.

1. Create a class University:
   • universityName (String)
   • rank (int)

2. Create a class Student:
   • studentName (String)
   • studentId (int)
   • university (University)
   • Method setUniversity(University u)
   • Method displayDetails()

3. Main Class:
   • Create University object
   • Create Student object
   • Link them
   • Display all details

Expected Output:
Student Name: Karthik
Student ID: 1201
University Name: Oxford University
Rank: 1
*/

class University {
    String universityName;
    int rank;

    public University(String universityName, int rank) {
        this.universityName = universityName;
        this.rank = rank;
    }
}

class Student {
    String studentName;
    int studentId;
    University university;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public void setUniversity(University u) {
        this.university = u;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("University Name: " + university.universityName);
        System.out.println("Rank: " + university.rank);
    }
}

public class Question100 {
    public static void main(String[] args) {
        University u = new University("Oxford University", 1);
        Student s = new Student("Karthik", 1201);
        s.setUniversity(u);
        s.displayDetails();
    }
}