/*QUESTION 36: Write a Java program to demonstrate object oriented
programming.
1. Create a class ExamResult with private data members:
 o studentName (String)
 o marks (int)
2. Provide public methods:
 o setStudentName(String studentName)
 o setMarks(int marks)
 ▪ Marks should be between 0 and 100
 o getStudentName()
 o getMarks()
 o getResult() → returns Pass if marks ≥ 40, else Fail
3. Create a Main class.
In the main() method:
 o Create an object of ExamResult
 o Set student name and marks
 o Display student name, marks, and result
Expected Output:
Student Name: Meena
Marks: 68
Result: Pass */

class ExamResult {
    private String studentName;
    private int marks;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks");
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMarks() {
        return marks;
    }

    public String getResult() {
        if (marks >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}

public class Question36 {
    public static void main(String[] args) {
        ExamResult er = new ExamResult();

        er.setStudentName("Meena");
        er.setMarks(68);

        System.out.println("Student Name: " + er.getStudentName());
        System.out.println("Marks: " + er.getMarks());
        System.out.println("Result: " + er.getResult());
    }
}