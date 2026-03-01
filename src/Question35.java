/*QUESTION 35: Write a Java program to demonstrate object oriented
programming.
1. Create a class Product with private data members:
 o productId (int)
 o productName (String)
 o price (double)
 o quantity (int)
2. Provide public methods:
 o setProductDetails(int productId, String productName, double price, int quantity)
 o calculateTotalCost() → returns price × quantity
 o Getter methods for all data members
3. Create a Main class.
In the main() method:
 o Create an object of Product
 o Set product details
 o Display product information and total cost
Expected Output:
Product ID: 301
Product Name: Keyboard
Price: 1200.0
Quantity: 2
Total Cost: 2400.0*/


class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public void setProductDetails(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class Question35 {
    public static void main(String[] args) {
        Product p = new Product();

        p.setProductDetails(301, "Keyboard", 1200.0, 2);

        System.out.println("Product ID: " + p.getProductId());
        System.out.println("Product Name: " + p.getProductName());
        System.out.println("Price: " + p.getPrice());
        System.out.println("Quantity: " + p.getQuantity());
        System.out.println("Total Cost: " + p.calculateTotalCost());
    }
}