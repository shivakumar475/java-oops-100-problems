/* QUESTION 66: Write a Java program to demonstrate object oriented
programming.

1. Create an interface Course with the method:
   o courseDetails()

2. Create an interface OnlineCourse that extends Course with the method:
   o platformDetails()

3. Create a class JavaCourse that implements OnlineCourse.

4. In the JavaCourse class:
   o Implement courseDetails()
   o Implement platformDetails()
   o Display course name and learning platform

5. Create a Main class.
   In the main() method:
   o Create an object of JavaCourse
   o Call courseDetails()
   o Call platformDetails()

Expected Output:
Course Name: Java Programming
Platform: Online Learning Portal
*/

interface Course {
    void courseDetails();
}

interface OnlineCourse extends Course {
    void platformDetails();
}

class JavaCourse implements OnlineCourse {
    @Override
    public void courseDetails() {
        System.out.println("Course Name: Java Programming");
    }

    @Override
    public void platformDetails() {
        System.out.println("Platform: Online Learning Portal");
    }
}

public class Question66 {
    public static void main(String[] args) {
        JavaCourse jc = new JavaCourse();
        jc.courseDetails();
        jc.platformDetails();
    }
}