/*QUESTION 8: Write a Java program to demonstrate object oriented 
programming. 
Create a class LibraryItem with data members: 
  o itemId (int) 
  o title (String) 
1. In LibraryItem class, create the following methods: 
  o setLibraryItemDetails(int itemId, String title) 
  o displayLibraryItemDetails() 
2. Create a class Book that inherits LibraryItem with data members: 
  o author (String) 
  o price (double) 
3. In Book class, create the following methods: 
  o setBookDetails(String author, double price) 
  o displayBookDetails() 
4. Create a class EBook that inherits Book with data member: 
  o fileSize (double) 
5. In EBook class, create the following methods: 
  o setEBookDetails(double fileSize) 
  o displayEBookDetails() 
6. Create a Main class. 
In the main() method: 
  o Create an object of EBook 
  o Call the following methods in order: 
    setLibraryItemDetails() 
    setBookDetails() 
    setEBookDetails() 
    displayEBookDetails() 
Expected Output: 
Item ID: 301 
Title: Java Programming 
Author: James 
Price: 450 
File Size: 5.2 MB*/


class LibraryItem {
    int itemId;
    String title;
    
    public void  setLibraryItemDetails(int itemId, String title) {
        this.itemId=itemId;
        this.title=title;
    }
    public void displayLibraryItemDetails() {
        System.out.println("Item ID: "+itemId);
        System.out.println("Title: "+title);
    }
}

class Book extends LibraryItem {
    String author;
    double price;
    
    public void  setBookDetails(String author, double price) {
        this.author = author;
        this.price = price;
    }
    public void displayBookDetails() {
        displayLibraryItemDetails();
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}

class EBook extends Book {
    double fileSize;
    
    public void setEBookDetails(double fileSize) {
        this.fileSize = fileSize;
    }
    public void displayEBookDetails() {
        displayBookDetails();
        System.out.println("File Size: "+fileSize+" MB");
    }
}


public class Question8 {
    public static void main(String[] args) {
        EBook b = new EBook();
        b.setLibraryItemDetails(301, "Java Programming");
        b.setBookDetails("James", 450);
        b.setEBookDetails(5.2);
        b.displayEBookDetails();
    }
}