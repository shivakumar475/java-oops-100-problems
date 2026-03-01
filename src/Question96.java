/* QUESTION 96: Write a Java program to demonstrate object oriented
programming.

1. Create a class Mobile:
   • model (String)
   • brand (String)

2. Create a class User:
   • userName (String)
   • userId (int)
   • mobile (Mobile)
   • Method setMobile(Mobile mobile)
   • Method displayDetails()

3. Main Class:
   • Create Mobile object
   • Create User object
   • Link mobile
   • Display details

Expected Output:
User Name: Sita
User ID: 501
Mobile Model: Galaxy S21
Brand: Samsung
*/

class Mobile {
    String model;
    String brand;

    public Mobile(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
}

class User {
    String userName;
    int userId;
    Mobile mobile;

    public User(String userName, int userId) {
        this.userName = userName;
        this.userId = userId;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void displayDetails() {
        System.out.println("User Name: " + userName);
        System.out.println("User ID: " + userId);
        System.out.println("Mobile Model: " + mobile.model);
        System.out.println("Brand: " + mobile.brand);
    }
}

public class Question96 {
    public static void main(String[] args) {
        Mobile m = new Mobile("Galaxy S21", "Samsung");
        User u = new User("Sita", 501);
        u.setMobile(m);
        u.displayDetails();
    }
}