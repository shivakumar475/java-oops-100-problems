/*QUESTION 29: Write a Java program to demonstrate object oriented
programming.
1. Create a class Mobile with data members:
 o brand (String)
 o model (String)
 o price (double)
2. In Mobile class, create overloaded constructors:
 o Mobile(String brand) → initialize brand only
 o Mobile(String brand, String model) → initialize brand and model
 o Mobile(String brand, String model, double price) → initialize all data members
3. Create a method:
 o displayMobileDetails()
4. Create a Main class.
In the main() method:
 o Create objects using all three constructors
 o Call displayMobileDetails() for each object
Expected Output:
Brand: Samsung
Model: Not Available
Price: 0.0
Brand: Samsung
Model: Galaxy A15
Price: 0.0
Brand: Samsung
Model: Galaxy A15
Price: 18000.0 */

class Mobile {
    String brand;
    String model;
    double price;

    Mobile(String brand) {
        this.brand = brand;
        this.model = "Not Available";
        this.price = 0.0;
    }

    Mobile(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 0.0;
    }

    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayMobileDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Question29 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung");
        Mobile m2 = new Mobile("Samsung", "Galaxy A15");
        Mobile m3 = new Mobile("Samsung", "Galaxy A15", 18000.0);

        m1.displayMobileDetails();
        m2.displayMobileDetails();
        m3.displayMobileDetails();
    }
}