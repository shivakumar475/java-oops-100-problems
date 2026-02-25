/*QUESTION 5: Write a Java program to demonstrate object oriented 
programming. 
1. Create a class Order with data members: 
o orderId (int) 
o productName (String) 
o price (double) 
o quantity (int) 
2. In Order class, create the following methods: 
o setOrderDetails(int orderId, String productName, double price, int quantity) 
o calculateTotalAmount() → returns price × quantity 
o displayOrderDetails() 
3. Create a class DiscountOrder that inherits Order. 
4. In DiscountOrder class: 
o Override calculateTotalAmount() 
Apply discount rules: 
▪ If total amount ≥ 5000 → 20% discount 
▪ If total amount ≥ 3000 → 10% discount 
▪ Else → No discount 
5. In DiscountOrder class, create method: 
o displayFinalBill() 
6. Create a Main class. 
In the main() method: 
o Create an object of DiscountOrder 
o Call the following methods in order: 
setOrderDetails() 
displayFinalBill() 
Expected Output: 
Order ID: 501 
Product Name: Laptop 
Price: 60000 
Quantity: 1 
Discount Applied: 20% 
Final Amount: 48000 */


class Order{
    int orderId;
    String productName;
    double price;
    int quantity;
    
    public void setOrderDetails(int orderId, String productName, double price, int quantity) {
        this.orderId = orderId;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }
    public double calculateTotalAmount() {
        double total = price*quantity;
        return total;
    }
    public void displayOrderDetails() {
        System.out.println("Order ID: "+orderId);
        System.out.println("Product Name: "+productName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
    }
}

class DiscountOrder extends Order {
    double disc;
    public double calculateTotalAmount(double price) {
        double total = price*quantity;
        return total;
    }
    
    
    public void displayFinalBill() {
        displayOrderDetails();
        if(calculateTotalAmount() >=5000) {
            disc = 20;
        } else if(calculateTotalAmount() >= 3000){
            disc = 10;
        } else {
            System.out.println("No Discount");
        }
        System.out.println("Discount Applied: "+disc+"%");
        double discAmount = (disc/100)*calculateTotalAmount();
        System.out.println("Final Amount: "+(calculateTotalAmount()-discAmount));
    }
}

public class Question5{
    public static void main(String[] args){
        DiscountOrder a = new DiscountOrder();
        a.setOrderDetails(501, "Laptop", 60000, 1);
        a.displayFinalBill();
    }
}