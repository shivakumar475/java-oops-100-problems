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