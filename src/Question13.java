/*QUESTION 13: Write a Java program to demonstrate object oriented 
programming. 
1. Create a class Notification with data members: 
  o message (String) 
2. In Notification class, create the following methods: 
  o setNotification(String message) 
  o displayNotification() 
3. Create a class EmailNotification that inherits Notification with data members: 
  o emailId (String) 
4. In EmailNotification class, create the following methods: 
  o setEmailNotification(String emailId) 
  o displayEmailNotification() 
5. Create a class SMSNotification that inherits Notification with data members: 
  o phoneNumber (String) 
6. In SMSNotification class, create the following methods: 
  o setSMSNotification(String phoneNumber) 
  o displaySMSNotification() 
7. Create a Main class. 
In the main() method: 
  o Create an object of EmailNotification 
  o Call the following methods in order: 
    setNotification() 
    setEmailNotification() 
    displayEmailNotification() 
  o Create an object of SMSNotification 
  o Call the following methods in order: 
    setNotification() 
    setSMSNotification() 
    displaySMSNotification() 
Expected Output: 
Message: Meeting at 10 AM 
Email ID: abc@gmail.com 
Message: OTP 1234 
Phone Number: 9876543210 */


class Notification {
    String message;
    
    public void setNotification(String message) {
        this.message=message;
    }
    public void displayNotification() {
        System.out.println("Message: "+message);
    }
}

class EmailNotification extends Notification {
    String email;
    
    public void setEmailNotification(String email) {
        this.email=email;
    }
    public void displayEmailNotification() {
        displayNotification();
        System.out.println("Email: "+email);
    }
}

class SMSNotification extends Notification {
    String phoneNumber;
    
    public void setSMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void displaySMSNotification() {
        displayNotification();
        System.out.println("Phone Number: "+phoneNumber);
    }
}

public class Question13 {
    public static void main(String[] args) {
        EmailNotification e = new EmailNotification();
        e.setNotification("Meeting at 10 AM");
        e.setEmailNotification("abc@gmail.com");
        e.displayEmailNotification();
        System.out.println();
        SMSNotification s = new SMSNotification();
        s.setNotification("OTP 1234");
        s.setSMSNotification("9876543210");
        s.displaySMSNotification();
    }
}