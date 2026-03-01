/* QUESTION 93: Write a Java program to demonstrate object oriented
programming.

1. Create a class Flight:
   • flightNumber (String)
   • airline (String)

2. Create a class Passenger:
   • passengerName (String)
   • age (int)
   • flight (Flight)
   • Method setFlight(Flight flight)
   • Method displayDetails()

3. Main Class:
   • Create Flight object
   • Create Passenger object
   • Link using setFlight()
   • Display details

Expected Output:
Passenger Name: Mahesh
Age: 28
Flight Number: AI202
Airline: Air India
*/

class Flight {
    String flightNumber;
    String airline;

    public Flight(String flightNumber, String airline) {
        this.flightNumber = flightNumber;
        this.airline = airline;
    }
}

class Passenger {
    String passengerName;
    int age;
    Flight flight;

    public Passenger(String passengerName, int age) {
        this.passengerName = passengerName;
        this.age = age;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void displayDetails() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Age: " + age);
        System.out.println("Flight Number: " + flight.flightNumber);
        System.out.println("Airline: " + flight.airline);
    }
}

public class Question93 {
    public static void main(String[] args) {
        Flight f = new Flight("AI202", "Air India");
        Passenger p = new Passenger("Mahesh", 28);
        p.setFlight(f);
        p.displayDetails();
    }
}