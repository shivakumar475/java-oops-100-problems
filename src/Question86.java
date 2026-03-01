/* QUESTION 86: Write a Java program to demonstrate object oriented
programming.

1. Create a class Author:
   • authorName (String)
   • country (String)

2. Create a class Novel:
   • title (String)
   • price (double)
   • author (Author)
   • Method setAuthor(Author author)
   • Method displayDetails()

3. Main Class:
   • Create Author object
   • Create Novel object
   • Link author
   • Display details

Expected Output:
Novel Title: The Silent River
Price: 350.0
Author: K. Narayan
Country: India
*/

class Author {
    String authorName;
    String country;

    public Author(String authorName, String country) {
        this.authorName = authorName;
        this.country = country;
    }
}

class Novel {
    String title;
    double price;
    Author author;

    public Novel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Novel Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Author: " + author.authorName);
        System.out.println("Country: " + author.country);
    }
}

public class Question86 {
    public static void main(String[] args) {
        Author a = new Author("K. Narayan", "India");
        Novel n = new Novel("The Silent River", 350.0);
        n.setAuthor(a);
        n.displayDetails();
    }
}