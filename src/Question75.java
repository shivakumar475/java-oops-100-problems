/* QUESTION 75: Write a Java program to demonstrate object oriented
programming.

1. Create an interface LightingControl with the method:
   - controlLights()

2. Create an interface SecurityControl with the method:
   - activateSecurity()

3. Create an interface EnergyMonitoring with the method:
   - calculateEnergyUsage()

4. Create a class SmartHomeSystem that implements LightingControl,
   SecurityControl, EnergyMonitoring.

5. In the SmartHomeSystem class:
   o Implement all interface methods
   o Calculate total energy usage based on:
       ▪ Lights = 3 units
       ▪ Security System = 2 units
   o Display system status and total energy consumption

6. Create a Main class.
   In the main() method:
   o Create an object of SmartHomeSystem
   o Call all interface methods

Expected Output:
Lights Status: ON
Security System: Activated
Energy Usage: 5 units
*/

interface LightingControl {
    void controlLights();
}

interface SecurityControl {
    void activateSecurity();
}

interface EnergyMonitoring {
    void calculateEnergyUsage();
}

class SmartHomeSystem implements LightingControl, SecurityControl, EnergyMonitoring {
    @Override
    public void controlLights() {
        System.out.println("Lights Status: ON");
    }

    @Override
    public void activateSecurity() {
        System.out.println("Security System: Activated");
    }

    @Override
    public void calculateEnergyUsage() {
        int energy = 3 + 2;
        System.out.println("Energy Usage: " + energy + " units");
    }
}

public class Question75 {
    public static void main(String[] args) {
        SmartHomeSystem shs = new SmartHomeSystem();
        shs.controlLights();
        shs.activateSecurity();
        shs.calculateEnergyUsage();
    }
}