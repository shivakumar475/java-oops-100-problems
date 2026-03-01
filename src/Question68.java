/* QUESTION 68: Write a Java program to demonstrate object oriented
programming.

1. Create an interface Product with the method:
   o setProductDetails(int productId, String productName, double price)

2. Create an interface Cart that extends Product with the method:
   o calculateTotal(int quantity)

3. Create an interface Payment that extends Cart with the method:
   o makePayment()

4. Create a class OnlineOrder that implements Payment.

5. In the OnlineOrder class:
   o Implement all interface methods
   o Apply GST of 18% on total amount
   o Display product details, total amount, GST, and final payable amount

6. Create a Main class.
   In the main() method:
   o Create an object of OnlineOrder
   o Call methods in proper order to complete the order

Expected Output:
Product ID: 501
Product Name: Headphones
Price: 2000
Quantity: 2
Total Amount: 4000
GST (18%): 720
Final Amount: 4720
*/

interface Product {
    void setProductDetails(int productId, String productName, double price);
}

interface Cart extends Product {
    double calculateTotal(int quantity);
}

interface Payment extends Cart {
    void makePayment(int quantity);
}

class OnlineOrder implements Payment {
    int productId;
    String productName;
    double price;

    @Override
    public void setProductDetails(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public double calculateTotal(int quantity) {
        return price * quantity;
    }

    @Override
    public void makePayment(int quantity) {
        double total = calculateTotal(quantity);
        double gst = total * 0.18;
        double finalAmount = total + gst;

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + total);
        System.out.println("GST (18%): " + gst);
        System.out.println("Final Amount: " + finalAmount);
    }
}

public class Question68 {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder();
        order.setProductDetails(501, "Headphones", 2000);
        order.makePayment(2);
    }
}