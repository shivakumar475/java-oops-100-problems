/* QUESTION 63: Write a Java program to demonstrate object oriented
programming.

1. Create an interface Payment with a method:
   o processPayment(double amount)

2. Create a class OnlinePayment that implements Payment.

3. In OnlinePayment class:
   o Create data members:
       ▪ transactionId (int)
       ▪ paymentMode (String)
   o Create a method setPaymentDetails(int transactionId, String paymentMode)
   o Implement processPayment(double amount)
       ▪ If amount ≥ 10,000 → Apply 10% discount
       ▪ Else → No discount
   o Display transaction details and final payable amount

4. Create a Main class.
   In the main() method:
   o Create an object of OnlinePayment
   o Call setPaymentDetails()
   o Call processPayment()

Expected Output:
Transaction ID: 501
Payment Mode: UPI
Original Amount: 12000
Discount Applied: 10%
Final Amount: 10800
*/

interface Payment {
    void processPayment(double amount);
}

class OnlinePayment implements Payment {
    int transactionId;
    String paymentMode;

    public void setPaymentDetails(int transactionId, String paymentMode) {
        this.transactionId = transactionId;
        this.paymentMode = paymentMode;
    }

    @Override
    public void processPayment(double amount) {
        double discount = 0;

        if (amount >= 10000) {
            discount = amount * 0.10;
        }

        double finalAmount = amount - discount;

        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Payment Mode: " + paymentMode);
        System.out.println("Original Amount: " + amount);

        if (discount > 0) {
            System.out.println("Discount Applied: 10%");
        } else {
            System.out.println("Discount Applied: 0%");
        }

        System.out.println("Final Amount: " + finalAmount);
    }
}

public class Question63 {
    public static void main(String[] args) {
        OnlinePayment op = new OnlinePayment();
        op.setPaymentDetails(501, "UPI");
        op.processPayment(12000);
    }
}