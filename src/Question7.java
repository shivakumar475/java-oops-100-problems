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
        displayVehicleDetails();
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