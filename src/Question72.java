/* QUESTION 72: Write a Java program to demonstrate object oriented
programming.

1. Create an interface Switchable with the method:
   o turnOn()

2. Create an interface Adjustable with the method:
   o adjustLevel()

3. Create a class SmartFan that implements Switchable, Adjustable.

4. In the SmartFan class:
   o Implement turnOn()
   o Implement adjustLevel()
   o Display appropriate messages

5. Create a Main class.
   In the main() method:
   o Create an object of SmartFan
   o Call turnOn()
   o Call adjustLevel()

Expected Output:
Smart Fan is turned ON
Fan speed adjusted
*/

interface Switchable {
    void turnOn();
}

interface Adjustable {
    void adjustLevel();
}

class SmartFan implements Switchable, Adjustable {
    @Override
    public void turnOn() {
        System.out.println("Smart Fan is turned ON");
    }

    @Override
    public void adjustLevel() {
        System.out.println("Fan speed adjusted");
    }
}

public class Question72 {
    public static void main(String[] args) {
        SmartFan fan = new SmartFan();
        fan.turnOn();
        fan.adjustLevel();
    }
}