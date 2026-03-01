/* QUESTION 87: Write a Java program to demonstrate object oriented
programming.

1. Create a class College:
   • collegeName (String)
   • city (String)

2. Create a class Professor:
   • professorName (String)
   • subject (String)
   • college (College)
   • Method setCollege(College college)
   • Method displayDetails()

3. Main Class:
   • Create College object
   • Create Professor object
   • Link college
   • Display information

Expected Output:
Professor Name: Dr. Meera
Subject: Physics
College: IIT Mumbai
City: Mumbai
*/

class College {
    String collegeName;
    String city;

    public College(String collegeName, String city) {
        this.collegeName = collegeName;
        this.city = city;
    }
}

class Professor {
    String professorName;
    String subject;
    College college;

    public Professor(String professorName, String subject) {
        this.professorName = professorName;
        this.subject = subject;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public void displayDetails() {
        System.out.println("Professor Name: " + professorName);
        System.out.println("Subject: " + subject);
        System.out.println("College: " + college.collegeName);
        System.out.println("City: " + college.city);
    }
}

public class Question87 {
    public static void main(String[] args) {
        College c = new College("IIT Mumbai", "Mumbai");
        Professor p = new Professor("Dr. Meera", "Physics");
        p.setCollege(c);
        p.displayDetails();
    }
}