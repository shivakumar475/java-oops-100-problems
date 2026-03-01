/* QUESTION 71: Write a Java program to demonstrate object oriented
programming.

1. Create an interface PaymentMethod with the method:
   o pay(double amount)

2. Create a class CreditCardPayment that implements PaymentMethod.
3. Create a class UPIPayment that implements PaymentMethod.

4. In the CreditCardPayment class:
   o Implement pay()
   o Add service charge of 2% on amount

5. In the UPIPayment class:
   o Implement pay()
   o No service charge applied

6. Create a Main class.
   In the main() method:
   o Create objects of CreditCardPayment and UPIPayment
   o Call pay() for both payment modes

Expected Output:
Payment Mode: Credit Card
Amount Paid: 1020
Payment Mode: UPI
Amount Paid: 1000
*/

interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        double finalAmount = amount + (amount * 0.02);
        System.out.println("Payment Mode: Credit Card");
        System.out.println("Amount Paid: " + finalAmount);
    }
}

class UPIPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment Mode: UPI");
        System.out.println("Amount Paid: " + amount);
    }
}

public class Question71 {
    public static void main(String[] args) {
        PaymentMethod credit = new CreditCardPayment();
        PaymentMethod upi = new UPIPayment();

        credit.pay(1000);
        upi.pay(1000);
    }
}