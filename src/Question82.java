/* QUESTION 82: Write a Java program to demonstrate object oriented
programming.

1. Create a class Book:
   • title (String)
   • author (String)

2. Create a class LibraryMember:
   • memberName (String)
   • memberId (int)
   • borrowedBook (Book)
   • Method borrowBook(Book book)
   • Method displayDetails()

3. Main Class:
   • Create Book object
   • Create LibraryMember
   • Borrow book
   • Display details

Expected Output:
Member Name: Sandeep
Member ID: 210
Book Title: Java Basics
Author: James Gosling
*/

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class LibraryMember {
    String memberName;
    int memberId;
    Book borrowedBook;

    public LibraryMember(String memberName, int memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public void borrowBook(Book book) {
        this.borrowedBook = book;
    }

    public void displayDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
        System.out.println("Book Title: " + borrowedBook.title);
        System.out.println("Author: " + borrowedBook.author);
    }
}

public class Question82 {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "James Gosling");
        LibraryMember lm = new LibraryMember("Sandeep", 210);
        lm.borrowBook(b);
        lm.displayDetails();
    }
}