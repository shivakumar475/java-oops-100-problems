/* QUESTION 69: Write a Java program to demonstrate object oriented
programming.

1. Create an interface Vehicle with the method:
   o start()

2. Create a class Car that implements Vehicle.
3. Create a class Bike that implements Vehicle.

4. In the Car class:
   o Implement start() to display a car start message

5. In the Bike class:
   o Implement start() to display a bike start message

6. Create a Main class.
   In the main() method:
   o Create objects of Car and Bike
   o Call start() using each object

Expected Output:
Car starts with a key
Bike starts with a kick
*/

interface Vehicle {
    void start();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with a kick");
    }
}

public class Question69 {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        bike.start();
    }
}