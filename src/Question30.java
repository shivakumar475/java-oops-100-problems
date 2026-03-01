/*QUESTION 30: Write a Java program to demonstrate object oriented
programming.
1. Create a class ElectricityBill with data members:
 o consumerName (String)
 o unitsConsumed (int)
 o billAmount (double)
2. In ElectricityBill class, create overloaded constructors:
 o ElectricityBill(String consumerName) → unitsConsumed = 0
 o ElectricityBill(String consumerName, int unitsConsumed) → initialize name and
units
3. In ElectricityBill class, create a method:
 o calculateBill()
 Billing Rules:
 ▪ First 100 units → ₹1 per unit
 ▪ Next 100 units → ₹2 per unit
 ▪ Above 200 units → ₹3 per unit
4. Create another method:
 o displayBillDetails()
5. Create a Main class.
In the main() method:
 o Create objects using both constructors
 o Call calculateBill()
 o Call displayBillDetails()
Expected Output:
Consumer Name: Anil
Units Consumed: 250
Total Bill Amount: 450.0 */

class ElectricityBill {
    String consumerName;
    int unitsConsumed;
    double billAmount;

    ElectricityBill(String consumerName) {
        this.consumerName = consumerName;
        this.unitsConsumed = 0;
    }

    ElectricityBill(String consumerName, int unitsConsumed) {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    void calculateBill() {
        int units = this.unitsConsumed;

        if (units <= 100) {
            billAmount = units * 1;
        } else if (units <= 200) {
            billAmount = (100 * 1) + (units - 100) * 2;
        } else {
            billAmount = (100 * 1) + (100 * 2) + (units - 200) * 3;
        }
    }

    void displayBillDetails() {
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: " + billAmount);
    }
}

public class Question30 {
    public static void main(String[] args) {

        ElectricityBill eb1 = new ElectricityBill("Anil", 250);

        eb1.calculateBill();
        eb1.displayBillDetails();
    }
}