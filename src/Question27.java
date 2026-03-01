/*QUESTION 27: Write a Java program to demonstrate object oriented
programming.
1. Create a class Book with data members:
 o title (String)
 o price (double)
2. In Book class, create overloaded constructors:
 o Book() → initializes title as "Not Available" and price as 0.0
 o Book(String title, double price) → initializes data members using parameters
3. Create a Main class.
In the main() method:
 o Create one object using default constructor
 o Create another object using parameterized constructor
 o Display book details
Expected Output:
Title: Not Available
Price: 0.0 */

class Book {
    String title;
    double price;

    Book() {
        this.title = "Not Available";
        this.price = 0.0;
    }

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

public class Question27 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", 450.50);

        b1.display();
        b2.display();
    }
}