/* QUESTION 49: Write a Java program to demonstrate object oriented
programming.

1. Create an abstract class Vehicle with data members:
   o vehicleNumber (String)
   o fuelType (String)

2. In Vehicle class:
   o Create a method setVehicleDetails(String vehicleNumber, String fuelType)
   o Create an abstract method calculateMileage()

3. Create a class Bike that inherits Vehicle.

4. In Bike class:
   o Implement calculateMileage()
       ▪ Mileage = 60 km/l if fuelType is Petrol
   o Display vehicle details and mileage

5. Create a Main class.
   In the main() method:
   o Create an object of Bike
   o Call setVehicleDetails()
   o Call calculateMileage()

Expected Output:
Vehicle Number: TS09AB1234
Fuel Type: Petrol
Mileage: 60 km/l
*/

abstract class Vehicle {
    String vehicleNumber;
    String fuelType;

    public void setVehicleDetails(String vehicleNumber, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.fuelType = fuelType;
    }

    public abstract void calculateMileage();
}

class Bike extends Vehicle {
    @Override
    public void calculateMileage() {
        int mileage = 0;

        if (fuelType.equalsIgnoreCase("Petrol")) {
            mileage = 60;
        }

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

public class Question49 {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.setVehicleDetails("TS09AB1234", "Petrol");
        b.calculateMileage();
    }
}