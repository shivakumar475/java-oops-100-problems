/* QUESTION 54: Write a Java program to demonstrate object oriented
programming.

1. Create an abstract class Course with data members:
   o courseName (String)

2. In Course class:
   o Create a method setCourseName(String courseName)
   o Create an abstract method calculateFee()

3. Create a class OnlineCourse that inherits Course.
4. In OnlineCourse class:
   o Add data member duration (int) (in months)
   o Create method setDuration(int duration)

5. Create a class CertificationCourse that inherits OnlineCourse.
6. In CertificationCourse class:
   o Implement calculateFee()
       ▪ Fee = duration × 2000
   o Display course name, duration, and total fee

7. Create a Main class.
   In the main() method:
   o Create an object of CertificationCourse
   o Call setter methods
   o Call calculateFee()

Expected Output:
Course Name: Java Full Stack
Duration: 6 months
Total Fee: 12000
*/

abstract class Course {
    String courseName;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public abstract void calculateFee();
}

class OnlineCourse extends Course {
    int duration;

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void calculateFee() {
        // Overridden in CertificationCourse
    }
}

class CertificationCourse extends OnlineCourse {
    @Override
    public void calculateFee() {
        int totalFee = duration * 2000;

        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Total Fee: " + totalFee);
    }
}

public class Question54 {
    public static void main(String[] args) {
        CertificationCourse c = new CertificationCourse();
        c.setCourseName("Java Full Stack");
        c.setDuration(6);
        c.calculateFee();
    }
}