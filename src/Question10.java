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