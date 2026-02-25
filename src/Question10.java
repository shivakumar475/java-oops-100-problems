/*QUESTION 10: Write a Java program to demonstrate object oriented 
programming. 
Create a class Device with data members: 
  o brand (String) 
  o basePrice (double) 
1. In Device class, create the following methods: 
  o setDeviceDetails(String brand, double basePrice) 
  o calculatePrice() → returns basePrice 
  o displayDeviceDetails() 
2. Create a class Mobile that inherits Device with data member: 
  o warrantyYears (int) 
3. In Mobile class: 
  o Override calculatePrice() 
    Add warranty cost = warrantyYears × 2000 
4. Create a class SmartPhone that inherits Mobile with data members: 
  o cameraMP (int) 
  o 5GSupport (boolean) 
5. In SmartPhone class: 
  o Override calculatePrice() 
    If 5GSupport is true, add extra 5000 
6. Create a Main class. 
In the main() method: 
  o Create an object of SmartPhone 
  o Call the following methods in order: 
    setDeviceDetails() 
    setMobileDetails() 
    setSmartPhoneDetails() 
    displaySmartPhoneDetails() 
Expected Output: 
Brand: Samsung 
Base Price: 30000 
Warranty Years: 2 
Camera: 64 MP 
5G Support: true 
Final Price: 39000*/



class Device {
    String brand;
    double basePrice;
    
    public void setDeviceDetails(String brand, double basePrice) {
        this.brand = brand;
        this.basePrice = basePrice;
    }
    public double calculatePrice() {
        return basePrice;
    }
    public void displayDeviceDetails() {
        System.out.println("Brand: "+brand);
        System.out.println("Base Price: "+basePrice);
    }
}
class Mobile extends Device {
    int warrantyYears;
    
    public void setMobileDetails(int warrantyYears) {
        this.warrantyYears=warrantyYears;
    }
    
    public double calculatePrice() {
        double cost =  warrantyYears*2000;
        return basePrice + cost;
    }
    public void displayMobileDetails() {
        displayDeviceDetails();
        System.out.println("Warranty Years: "+warrantyYears);
    }
    
}

class SmartPhone extends Mobile {
    int cameraMP;
    boolean fiveGSupport;
    
    public void setSmartPhoneDetails(int cameraMP, boolean fiveGSupport) {
        this.cameraMP=cameraMP;
        this.fiveGSupport=fiveGSupport;
    }

    public double calculatePrice() {
        double total = super.calculatePrice();
        if(fiveGSupport==true) {
            total+=5000;
        }
        return total;
        
    }
    public void displaySmartPhoneDetails() {
        displayMobileDetails();
        System.out.println("Camera: "+cameraMP+" MP");
        System.out.println("5G Support: "+fiveGSupport);
        System.out.println("Final Price: "+calculatePrice());
    }
}

public class Question10 {
    public static void main(String[] args){
        SmartPhone s = new SmartPhone();
        s.setDeviceDetails("Samsung", 30000);
        s.setMobileDetails(2);
        s.setSmartPhoneDetails(64, true);
        s.displaySmartPhoneDetails();
        
    }
}