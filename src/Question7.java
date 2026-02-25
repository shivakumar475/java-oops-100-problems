/*QUESTION 7: Write a Java program to demonstrate object oriented 
programming. 
Create a class Vehicle with data members: 
  o brand (String) 
  o speed (int) 
1. In Vehicle class, create the following methods: 
  o setVehicleDetails(String brand, int speed) 
  o displayVehicleDetails() 
2. Create a class Car that inherits Vehicle with data member: 
  o fuelType (String) 
3. In Car class, create the following methods: 
  o setCarDetails(String fuelType) 
  o displayCarDetails() 
4. Create a class ElectricCar that inherits Car with data member: 
  o batteryCapacity (int) 
5. In ElectricCar class, create the following methods: 
  o setElectricCarDetails(int batteryCapacity) 
  o displayElectricCarDetails() 
6. Create a Main class. 
In the main() method: 
  o Create an object of ElectricCar 
  o Call the following methods in order: 
    setVehicleDetails() 
    setCarDetails() 
    setElectricCarDetails() 
    displayElectricCarDetails() 
Expected Output: 
Brand: Tesla 
Speed: 150 km/h 
Fuel Type: Electric 
Battery Capacity: 75 kWh */


class Vehicle {
    String brand;
    int speed;
    
    public void setVehicleDetails(String brand, int speed) {
        this.brand=brand;
        this.speed=speed;
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
        displayVehicleDetails();
        System.out.println("Fuel Type "+fuelType);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;
    
    public void setElectricCarDetails(int batteryCapacity) {
        this.batteryCapacity=batteryCapacity;
    }
    public void displayElectricCarDetails() {
        displayCarDetails();
        System.out.println("Battery Capacity: "+ batteryCapacity+"kWh");
    }
}

public class Question7 {
    public static void main(String[] args) {
        ElectricCar ev = new ElectricCar();
        ev.setVehicleDetails("Tesla", 150);
        ev.setCarDetails("Electric");
        ev.setElectricCarDetails(75);
        ev.displayElectricCarDetails();
    }
}