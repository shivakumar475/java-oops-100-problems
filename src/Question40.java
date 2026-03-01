/*QUESTION 40: Write a Java program to demonstrate object oriented
programming.
1. Create a class Customer with private data members:
 o customerId (int)
 o customerName (String)
 o phoneNumber (String)
2. Provide public setter and getter methods:
 o setCustomerId(int customerId)
 o setCustomerName(String customerName)
 o setPhoneNumber(String phoneNumber)
 ▪ Phone number must contain 10 digits
 o getCustomerId()
 o getCustomerName()
 o getPhoneNumber()
3. Create a Main class.
In the main() method:
 o Create an object of Customer
 o Set customer details
 o Display customer information using getters
Expected Output:
Customer ID: 401
Customer Name: Ravi
Phone Number: 9876543210 */


class Customer {
    private int customerId;
    private String customerName;
    private String phoneNumber;

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid Phone Number");
        }
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

public class Question40 {
    public static void main(String[] args) {
        Customer c = new Customer();

        c.setCustomerId(401);
        c.setCustomerName("Ravi");
        c.setPhoneNumber("9876543210");

        System.out.println("Customer ID: " + c.getCustomerId());
        System.out.println("Customer Name: " + c.getCustomerName());
        System.out.println("Phone Number: " + c.getPhoneNumber());
    }
}