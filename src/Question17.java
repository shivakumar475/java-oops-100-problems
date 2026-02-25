/*QUESTION 17: Write a Java program to demonstrate object oriented
programming.
1. Create a class Payment with method:
 o payAmount()
2. In Payment class, implement payAmount() to display:
 o "Payment is being processed"
3. Create a class UPIPayment that inherits Payment.
4. In UPIPayment class:
 o Override payAmount() to display:
 "Payment done using UPI"
5. Create a Main class.
In the main() method:
 o Create an object of UPIPayment
 o Call the method:
 payAmount()
Expected Output:
Payment done using UP*/


class Payment{
    public void payAmount(){
        System.out.println("Payment is being processed");
    }
}
class UPIPayment extends Payment{
    @Override
    public void payAmount(){
        System.out.println("Payment dome using UPI");
    }
}
public class Question17{
    public static void main (String []arg){
        UPIPayment up=new UPIPayment();
        up.payAmount();
    }
}














