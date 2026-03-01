/* QUESTION 76: Write a Java program to demonstrate object oriented
programming.

1. Library Class
   • The Library class should have two data members:
       o libraryName (String)
       o bookCount (int)

2. Student Class
   • The Student class should have data members:
       o studentName (String)
       o studentId (int)
   • There should be a method setLibrary(Library library) to associate a library object
   • A method displayDetails() should display:
       ▪ studentName
       ▪ studentId
       ▪ libraryName
       ▪ bookCount

3. Main Class and Method Calls
   • Create Library object
   • Create Student object
   • Link library to student via setLibrary()
   • Display details

Expected Output:
Student Name: Riya
Student ID: 101
Library Name: City Library
Number of Books: 5000
*/

class Library {
    String libraryName;
    int bookCount;

    public Library(String libraryName, int bookCount) {
        this.libraryName = libraryName;
        this.bookCount = bookCount;
    }
}

class Student {
    String studentName;
    int studentId;
    Library library;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Library Name: " + library.libraryName);
        System.out.println("Number of Books: " + library.bookCount);
    }
}

public class Question76 {
    public static void main(String[] args) {
        Library lib = new Library("City Library", 5000);
        Student stu = new Student("Riya", 101);
        stu.setLibrary(lib);
        stu.displayDetails();
    }
}