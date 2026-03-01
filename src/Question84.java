/* QUESTION 84: Write a Java program to demonstrate object oriented
programming.

1. Create a class Country:
   • countryName (String)
   • continent (String)

2. Create a class Player:
   • playerName (String)
   • sport (String)
   • country (Country)
   • Method setCountry(Country country)
   • Method displayPlayerDetails()

3. Main Class:
   • Create Country object
   • Create Player object
   • Assign country
   • Display details

Expected Output:
Player Name: Virat Kohli
Sport: Cricket
Country: India
Continent: Asia
*/

class Country {
    String countryName;
    String continent;

    public Country(String countryName, String continent) {
        this.countryName = countryName;
        this.continent = continent;
    }
}

class Player {
    String playerName;
    String sport;
    Country country;

    public Player(String playerName, String sport) {
        this.playerName = playerName;
        this.sport = sport;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void displayPlayerDetails() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Sport: " + sport);
        System.out.println("Country: " + country.countryName);
        System.out.println("Continent: " + country.continent);
    }
}

public class Question84 {
    public static void main(String[] args) {
        Country c = new Country("India", "Asia");
        Player p = new Player("Virat Kohli", "Cricket");
        p.setCountry(c);
        p.displayPlayerDetails();
    }
}