/* QUESTION 98: Write a Java program to demonstrate object oriented
programming.

1. Create a class Hotel:
   • hotelName (String)
   • rating (int)

2. Create a class Tourist:
   • touristName (String)
   • country (String)
   • hotel (Hotel)
   • Method setHotel(Hotel hotel)
   • Method displayDetails()

3. Main Class:
   • Create Hotel object
   • Create Tourist object
   • Connect them
   • Display details

Expected Output:
Tourist Name: John
Country: USA
Hotel Name: Taj Hotel
Rating: 5 Star
*/

class Hotel {
    String hotelName;
    int rating;

    public Hotel(String hotelName, int rating) {
        this.hotelName = hotelName;
        this.rating = rating;
    }
}

class Tourist {
    String touristName;
    String country;
    Hotel hotel;

    public Tourist(String touristName, String country) {
        this.touristName = touristName;
        this.country = country;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void displayDetails() {
        System.out.println("Tourist Name: " + touristName);
        System.out.println("Country: " + country);
        System.out.println("Hotel Name: " + hotel.hotelName);
        System.out.println("Rating: " + hotel.rating + " Star");
    }
}

public class Question98 {
    public static void main(String[] args) {
        Hotel h = new Hotel("Taj Hotel", 5);
        Tourist t = new Tourist("John", "USA");
        t.setHotel(h);
        t.displayDetails();
    }
}