/* 
QUESTION 44: Write a Java program to demonstrate object oriented programming.
1. Create a class StudentGrade with private data members:
   o studentId (int)
   o studentName (String)
   o marks (int)
   o grade (char)

2. Provide public methods:
   o setStudentDetails(int studentId, String studentName, int marks)
       ▪ Marks must be between 0 and 100
   o calculateGrade()
       ▪ Marks ≥ 85 → Grade A
       ▪ Marks ≥ 70 → Grade B
       ▪ Marks ≥ 50 → Grade C
       ▪ Else → Grade F
   o displayResult()

3. Create a Main class.
   In the main() method:
   o Create an object of StudentGrade
   o Set student details
   o Calculate grade
   o Display result

Expected Output:
Student ID: 602
Student Name: Kavya
Marks: 78
Grade: B
*/

class StudentGrade {
    private int studentId;
    private String studentName;
    private int marks;
    private char grade;

    public void setStudentDetails(int studentId, String studentName, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            this.marks = 0;
        }
    }

    public void calculateGrade() {
        if (marks >= 85) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
    }

    public void displayResult() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class Question44 {
    public static void main(String[] args) {
        StudentGrade sg = new StudentGrade();
        sg.setStudentDetails(602, "Kavya", 78);
        sg.calculateGrade();
        sg.displayResult();
    }
}