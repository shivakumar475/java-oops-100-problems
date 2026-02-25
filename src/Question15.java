/*QUESTION 15: Write a Java program to demonstrate object oriented 
programming. 
1. Create a class Ticket with data members: 
  o ticketId (int) 
  o baseFare (double) 
2. In Ticket class, create the following methods: 
  o setTicketDetails(int ticketId, double baseFare) 
  o calculateFare() → returns baseFare 
  o displayTicketDetails() 
3. Create a class BusTicket that inherits Ticket with data member: 
  o distance (int) 
4. In BusTicket class: 
  o Override calculateFare() 
    Fare = baseFare + (distance × 5) 
5. Create a class TrainTicket that inherits Ticket with data member: 
  o coachType (String) 
6. In TrainTicket class: 
  o Override calculateFare() 
    If coachType = "AC", add 1000 
    Else add 500 
7. Create a Main class. 
In the main() method: 
  o Create an object of BusTicket 
  o Call the following methods in order: 
    setTicketDetails() 
    setBusTicketDetails() 
    displayBusTicketDetails() 
  o Create an object of TrainTicket 
  o Call the following methods in order: 
    setTicketDetails() 
    setTrainTicketDetails() 
    displayTrainTicketDetails() 
Expected Output: 
Ticket ID: 301 
Base Fare: 500 
Bus Fare: 750 
Ticket ID: 302 
Base Fare: 600 
Train Fare: 1600*/


class Ticket {
    int ticketId;
    double baseFare;
    
    public void setTicketDetails(int ticketId, double baseFare) {
        this.ticketId=ticketId;
        this.baseFare=baseFare;
    }
    public double calculateFare() {
        return baseFare;
    }
    public void displayTicketDetails() {
        System.out.println("Ticket ID: "+ticketId);
        System.out.println("Base Fare: "+baseFare);
    }
}

class BusTicket extends Ticket {
    int distance;
    
    public void setBusTicketDetails(int distance){
        this.distance=distance;
    }
    public double calculateFare() {
        return baseFare+(distance*5);
    }
    public void displayBusTicketDetails() {
        displayTicketDetails();
        System.out.println("Bus Fare: "+calculateFare());
    }
}

class TrainTicket extends Ticket {
    String coachType;
    
    public void setTrainTicketDetails(String coachType) {
        this.coachType = coachType;
    }
    public double calculateFare() {
        double total = super.calculateFare();
        if(coachType=="AC"){
            total+=1000;
        } else {
            total+=500;
        }
        return total;
    }
    public void displayTrainTicketDetails() {
        displayTicketDetails();
        System.out.println("Train Fare: "+calculateFare());
    }
}

public class Question15 {
    public static void main(String[] args) {
        BusTicket b = new BusTicket();
        b.setTicketDetails(301, 500);
        b.setBusTicketDetails(50);
        b.displayBusTicketDetails();
        System.out.println();
        TrainTicket t = new TrainTicket();
        t.setTicketDetails(302, 600);
        t.setTrainTicketDetails("AC");
        t.displayTrainTicketDetails();
    }
}