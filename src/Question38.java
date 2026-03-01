/*QUESTION 38: Write a Java program to demonstrate object oriented
programming.
1. Create a class Car with private data members:
 o carName (String)
 o carPrice (double)
2. Provide public methods:
 o setCarDetails(String carName, double carPrice)
 o getCarName()
 o getCarPrice()
3. Create a Main class.
In the main() method:
 o Create an object of Car
 o Set car details
 o Display car name and price
Expected Output:
Car Name: Swift
Car Price: 650000.0 */

class Car {
    private String carName;
    private double carPrice;

    public void setCarDetails(String carName, double carPrice) {
        this.carName = carName;
        this.carPrice = carPrice;
    }

    public String getCarName() {
        return carName;
    }

    public double getCarPrice() {
        return carPrice;
    }
}

public class Question38 {
    public static void main(String[] args) {
        Car c = new Car();

        c.setCarDetails("Swift", 650000.0);

        System.out.println("Car Name: " + c.getCarName());
        System.out.println("Car Price: " + c.getCarPrice());
    }
}