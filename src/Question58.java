/* QUESTION 58: Write a Java program to demonstrate object oriented
programming.

1. Create an abstract class Appliance with data member:
   o brand (String)

2. In Appliance class:
   o Create a method setBrand(String brand)
   o Create an abstract method calculatePowerConsumption()

3. Create a class WashingMachine that inherits Appliance.
4. In WashingMachine class:
   o Add data member unitsUsed (int)
   o Create method setUnitsUsed(int unitsUsed)
   o Implement calculatePowerConsumption()
       ▪ Power Consumption = unitsUsed × 2

5. Create another class Refrigerator that also inherits Appliance.
6. In Refrigerator class:
   o Add data member unitsUsed (int)
   o Create method setUnitsUsed(int unitsUsed)
   o Implement calculatePowerConsumption()
       ▪ Power Consumption = unitsUsed × 1.5

7. Create a Main class.
   In the main() method:
   o Create objects of WashingMachine and Refrigerator
   o Call setter methods
   o Call calculatePowerConsumption() for both

Expected Output:
Appliance Brand: LG
Washing Machine Power Consumption: 400 units
Appliance Brand: Samsung
Refrigerator Power Consumption: 300 units
*/

abstract class Appliance {
    String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void calculatePowerConsumption();
}

class WashingMachine extends Appliance {
    int unitsUsed;

    public void setUnitsUsed(int unitsUsed) {
        this.unitsUsed = unitsUsed;
    }

    @Override
    public void calculatePowerConsumption() {
        int power = unitsUsed * 2;
        System.out.println("Appliance Brand: " + brand);
        System.out.println("Washing Machine Power Consumption: " + power + " units");
    }
}

class Refrigerator extends Appliance {
    int unitsUsed;

    public void setUnitsUsed(int unitsUsed) {
        this.unitsUsed = unitsUsed;
    }

    @Override
    public void calculatePowerConsumption() {
        double power = unitsUsed * 1.5;
        System.out.println("Appliance Brand: " + brand);
        System.out.println("Refrigerator Power Consumption: " + power + " units");
    }
}

public class Question58 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.setBrand("LG");
        wm.setUnitsUsed(200);
        wm.calculatePowerConsumption();

        Refrigerator rf = new Refrigerator();
        rf.setBrand("Samsung");
        rf.setUnitsUsed(200);
        rf.calculatePowerConsumption();
    }
}