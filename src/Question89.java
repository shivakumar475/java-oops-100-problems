/* QUESTION 89: Write a Java program to demonstrate object oriented
programming.

1. Create a class Course:
   • courseName (String)
   • duration (int)

2. Create a class Student:
   • studentName (String)
   • studentId (int)
   • course (Course)
   • Method setCourse(Course course)
   • Method displayDetails()

3. Main Class:
   • Create Course object
   • Create Student object
   • Link course to student
   • Display student + course details

Expected Output:
Student Name: Manoj
Student ID: 104
Course Name: Data Science
Duration: 6 months
*/

class Course {
    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class Student {
    String studentName;
    int studentId;
    Course course;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Course Name: " + course.courseName);
        System.out.println("Duration: " + course.duration + " months");
    }
}

public class Question89 {
    public static void main(String[] args) {
        Course c = new Course("Data Science", 6);
        Student s = new Student("Manoj", 104);
        s.setCourse(c);
        s.displayDetails();
    }
}