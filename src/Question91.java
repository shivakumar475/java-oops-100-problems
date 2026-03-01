/* QUESTION 91: Write a Java program to demonstrate object oriented
programming.

1. Create a class Store:
   • storeName (String)
   • city (String)

2. Create a class Customer:
   • customerName (String)
   • customerId (int)
   • store (Store)
   • Method setStore(Store store)
   • Method displayDetails()

3. Main Class:
   • Create Store object
   • Create Customer object
   • Link them
   • Display info

Expected Output:
Customer Name: Kavya
Customer ID: 701
Store Name: Reliance Mart
City: Chennai
*/

class Store {
    String storeName;
    String city;

    public Store(String storeName, String city) {
        this.storeName = storeName;
        this.city = city;
    }
}

class Customer {
    String customerName;
    int customerId;
    Store store;

    public Customer(String customerName, int customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Store Name: " + store.storeName);
        System.out.println("City: " + store.city);
    }
}

public class Question91 {
    public static void main(String[] args) {
        Store s = new Store("Reliance Mart", "Chennai");
        Customer c = new Customer("Kavya", 701);
        c.setStore(s);
        c.displayDetails();
    }
}