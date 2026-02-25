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