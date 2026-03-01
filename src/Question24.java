/*QUESTION 24: Write a Java program to demonstrate object oriented
programming.
1. Create a class BillCalculator.
2. In BillCalculator class, create overloaded methods named calculateBill():
 o calculateBill(int units) → calculates electricity bill (units × 5)
 o calculateBill(double units) → calculates electricity bill (units × 5.5)
3. Create a Main class.
In the main() method:
 o Create an object of BillCalculator
 o Call both versions of calculateBill()
 o Display the bill amount
Expected Output:
Bill Amount: 500
Bill Amount: 550.0 */

class BillCalculator {

    int calculateBill(int units) {
        return units * 5;
    }

    double calculateBill(double units) {
        return units * 5.5;
    }
}

public class Question24 {
    public static void main(String[] args) {
        BillCalculator bc = new BillCalculator();

        int bill1 = bc.calculateBill(100);
        double bill2 = bc.calculateBill(100.0);

        System.out.println("Bill Amount: " + bill1);
        System.out.println("Bill Amount: " + bill2);
    }
}