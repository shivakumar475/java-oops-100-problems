/* QUESTION 73: Write a Java program to demonstrate object oriented
programming.

1. Create an interface Theory with the method:
   o studyTheory()

2. Create an interface Practical with the method:
   o performPractical()

3. Create a class StudentActivity that implements Theory, Practical.

4. In the StudentActivity class:
   o Implement studyTheory()
   o Implement performPractical()
   o Display appropriate messages

5. Create a Main class.
   In the main() method:
   o Create an object of StudentActivity
   o Call studyTheory()
   o Call performPractical()

Expected Output:
Studying theory concepts
Performing practical experiments
*/

interface Theory {
    void studyTheory();
}

interface Practical {
    void performPractical();
}

class StudentActivity implements Theory, Practical {
    @Override
    public void studyTheory() {
        System.out.println("Studying theory concepts");
    }

    @Override
    public void performPractical() {
        System.out.println("Performing practical experiments");
    }
}

public class Question73 {
    public static void main(String[] args) {
        StudentActivity sa = new StudentActivity();
        sa.studyTheory();
        sa.performPractical();
    }
}