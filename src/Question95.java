/* QUESTION 95: Write a Java program to demonstrate object oriented
programming.

1. Create a class Stadium:
   • stadiumName (String)
   • capacity (int)

2. Create a class Player:
   • playerName (String)
   • sport (String)
   • stadium (Stadium)
   • Method setStadium(Stadium stadium)
   • Method displayDetails()

3. Main Class:
   • Create Stadium object
   • Create Player object
   • Link stadium
   • Display details

Expected Output:
Player Name: Dhoni
Sport: Cricket
Stadium: Wankhede Stadium
Capacity: 33000
*/

class Stadium {
    String stadiumName;
    int capacity;

    public Stadium(String stadiumName, int capacity) {
        this.stadiumName = stadiumName;
        this.capacity = capacity;
    }
}

class Player {
    String playerName;
    String sport;
    Stadium stadium;

    public Player(String playerName, String sport) {
        this.playerName = playerName;
        this.sport = sport;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public void displayDetails() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Sport: " + sport);
        System.out.println("Stadium: " + stadium.stadiumName);
        System.out.println("Capacity: " + stadium.capacity);
    }
}

public class Question95 {
    public static void main(String[] args) {
        Stadium s = new Stadium("Wankhede Stadium", 33000);
        Player p = new Player("Dhoni", "Cricket");
        p.setStadium(s);
        p.displayDetails();
    }
}