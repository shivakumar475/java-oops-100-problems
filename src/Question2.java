/*QUESTION 2: Write a Java program to demonstrate object oriented 
programming. 
1. Create a class Vehicle with data members: 
o brand (String) 
o speed (int) 
2. In Vehicle class, create the following methods: 
o setVehicleDetails(String brand, int speed) 
o displayVehicleDetails() 
3. Create a class Car that inherits Vehicle. 
4. In Car class, add data member: 
o fuelType (String) 
5. In Car class, create the following methods: 
o setCarDetails(String fuelType) 
o displayCarDetails() 
6. Create a Main class. 
In the main() method: 
o Create an object of Car 
o Call the following methods in order: 
setVehicleDetails() 
setCarDetails() 
displayCarDetails() 
Expected Output: 
Brand: Hyundai 
Speed: 120 km/h 
Fuel Type: Petrol */

class Vehicle {
    String brand;
    int speed;
    
    public void setVehicleDetails(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void displayVehicleDetails() {
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed+"km/h");
    }
}

class Car extends Vehicle {
    String fuelType;
    
    public void setCarDetails(String fuelType) {
        this.fuelType=fuelType;
    }
    public void displayCarDetails() {
        System.out.println("Fuel Type: "+fuelType);
    }
}


public class Question2 {
    public static void main(String args[]){
        Car c = new Car();
        c.setVehicleDetails("Hyundai", 120);
        c.setCarDetails("Petrol");
        c.displayCarDetails();
        c.displayVehicleDetails();
    }
}




















