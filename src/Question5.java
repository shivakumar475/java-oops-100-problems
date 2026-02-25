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