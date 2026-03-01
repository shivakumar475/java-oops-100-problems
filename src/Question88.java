/* QUESTION 88: Write a Java program to demonstrate object oriented
programming.

1. Create a class Movie:
   • title (String)
   • genre (String)

2. Create a class Actor:
   • actorName (String)
   • age (int)
   • movie (Movie)
   • Method setMovie(Movie movie)
   • Method displayDetails()

3. Main Class:
   • Create Movie object
   • Create Actor object
   • Link movie to actor
   • Display info

Expected Output:
Actor Name: Prabhas
Age: 43
Movie Title: Baahubali
Genre: Action
*/

class Movie {
    String title;
    String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
}

class Actor {
    String actorName;
    int age;
    Movie movie;

    public Actor(String actorName, int age) {
        this.actorName = actorName;
        this.age = age;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void displayDetails() {
        System.out.println("Actor Name: " + actorName);
        System.out.println("Age: " + age);
        System.out.println("Movie Title: " + movie.title);
        System.out.println("Genre: " + movie.genre);
    }
}

public class Question88 {
    public static void main(String[] args) {
        Movie m = new Movie("Baahubali", "Action");
        Actor a = new Actor("Prabhas", 43);
        a.setMovie(m);
        a.displayDetails();
    }
}