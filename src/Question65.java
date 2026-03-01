/* QUESTION 65: Write a Java program to demonstrate object oriented
programming.

1. Create an interface Device with the method:
   o powerOn()

2. Create an interface SmartDevice that extends Device with the method:
   o connectToWifi()

3. Create a class SmartPhone that implements SmartDevice.

4. In the SmartPhone class:
   o Implement powerOn()
   o Implement connectToWifi()
   o Display appropriate messages for each action

5. Create a Main class.
   In the main() method:
   o Create an object of SmartPhone
   o Call powerOn()
   o Call connectToWifi()

Expected Output:
Device is powered on
Smartphone connected to WiFi
*/

interface Device {
    void powerOn();
}

interface SmartDevice extends Device {
    void connectToWifi();
}

class SmartPhone implements SmartDevice {
    @Override
    public void powerOn() {
        System.out.println("Device is powered on");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Smartphone connected to WiFi");
    }
}

public class Question65 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.powerOn();
        sp.connectToWifi();
    }
}