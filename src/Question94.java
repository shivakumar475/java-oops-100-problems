/* QUESTION 94: Write a Java program to demonstrate object oriented
programming.

1. Create a class Teacher:
   • teacherName (String)
   • subject (String)

2. Create a class School:
   • schoolName (String)
   • city (String)
   • Method assignTeacher(Teacher t)
   • Method displayDetails()

3. Main Class:
   • Create School object
   • Create Teacher object
   • Assign teacher to school
   • Display details

Expected Output:
School Name: Sunrise High School
City: Pune
Teacher: Priya
Subject: Mathematics
*/

class Teacher {
    String teacherName;
    String subject;

    public Teacher(String teacherName, String subject) {
        this.teacherName = teacherName;
        this.subject = subject;
    }
}

class School {
    String schoolName;
    String city;
    Teacher teacher;

    public School(String schoolName, String city) {
        this.schoolName = schoolName;
        this.city = city;
    }

    public void assignTeacher(Teacher t) {
        this.teacher = t;
    }

    public void displayDetails() {
        System.out.println("School Name: " + schoolName);
        System.out.println("City: " + city);
        System.out.println("Teacher: " + teacher.teacherName);
        System.out.println("Subject: " + teacher.subject);
    }
}

public class Question94 {
    public static void main(String[] args) {
        School s = new School("Sunrise High School", "Pune");
        Teacher t = new Teacher("Priya", "Mathematics");
        s.assignTeacher(t);
        s.displayDetails();
    }
}