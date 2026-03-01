/* QUESTION 83: Write a Java program to demonstrate object oriented
programming.

1. Create a class Engine:
   • engineType (String)
   • horsepower (int)

2. Create a class Car:
   • carName (String)
   • modelYear (int)
   • Engine engine
   • Method setEngine(Engine engine)
   • Method displayDetails()

3. Main Class:
   • Create Engine object
   • Create Car object
   • Link them
   • Display details

Expected Output:
Car Name: Swift
Model Year: 2022
Engine Type: Petrol
Horsepower: 90
*/

class Engine {
    String engineType;
    int horsepower;

    public Engine(String engineType, int horsepower) {
        this.engineType = engineType;
        this.horsepower = horsepower;
    }
}

class Car {
    String carName;
    int modelYear;
    Engine engine;

    public Car(String carName, int modelYear) {
        this.carName = carName;
        this.modelYear = modelYear;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void displayDetails() {
        System.out.println("Car Name: " + carName);
        System.out.println("Model Year: " + modelYear);
        System.out.println("Engine Type: " + engine.engineType);
        System.out.println("Horsepower: " + engine.horsepower);
    }
}

public class Question83 {
    public static void main(String[] args) {
        Engine e = new Engine("Petrol", 90);
        Car c = new Car("Swift", 2022);
        c.setEngine(e);
        c.displayDetails();
    }
}