/* QUESTION 60: Write a Java program to demonstrate object oriented
programming.

1. Create an abstract class Insurance with data members:
   o policyId (int)
   o policyHolderName (String)

2. In Insurance class:
   o Create a method setPolicyDetails(int policyId, String policyHolderName)
   o Create an abstract method calculatePremium()

3. Create a class HealthInsurance that inherits Insurance.
4. In HealthInsurance class:
   o Add data member age (int)
   o Create method setAge(int age)
   o Implement calculatePremium()
       ▪ Age ≤ 30 → Premium = 3000
       ▪ Age ≤ 50 → Premium = 5000
       ▪ Age > 50 → Premium = 8000

5. Create another class VehicleInsurance that also inherits Insurance.
6. In VehicleInsurance class:
   o Add data member vehicleType (String)
   o Create method setVehicleType(String vehicleType)
   o Implement calculatePremium()
       ▪ Two-Wheeler → Premium = 2000
       ▪ Four-Wheeler → Premium = 4000

7. Create a Main class.
   In the main() method:
   o Create objects of HealthInsurance and VehicleInsurance
   o Call setter methods
   o Call calculatePremium() for both
   o Display policy details and premium amount

Expected Output:
Policy ID: 9001
Policy Holder Name: Rakesh
Health Insurance Premium: 5000
Policy ID: 9002
Policy Holder Name: Pooja
Vehicle Insurance Premium: 4000
*/

abstract class Insurance {
    int policyId;
    String policyHolderName;

    public void setPolicyDetails(int policyId, String policyHolderName) {
        this.policyId = policyId;
        this.policyHolderName = policyHolderName;
    }

    public abstract void calculatePremium();
}

class HealthInsurance extends Insurance {
    int age;

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void calculatePremium() {
        int premium;

        if (age <= 30)
            premium = 3000;
        else if (age <= 50)
            premium = 5000;
        else
            premium = 8000;

        System.out.println("Policy ID: " + policyId);
        System.out.println("Policy Holder Name: " + policyHolderName);
        System.out.println("Health Insurance Premium: " + premium);
    }
}

class VehicleInsurance extends Insurance {
    String vehicleType;

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public void calculatePremium() {
        int premium;

        if (vehicleType.equalsIgnoreCase("Two-Wheeler"))
            premium = 2000;
        else
            premium = 4000;

        System.out.println("Policy ID: " + policyId);
        System.out.println("Policy Holder Name: " + policyHolderName);
        System.out.println("Vehicle Insurance Premium: " + premium);
    }
}

public class Question60 {
    public static void main(String[] args) {
        HealthInsurance hi = new HealthInsurance();
        hi.setPolicyDetails(9001, "Rakesh");
        hi.setAge(40);
        hi.calculatePremium();

        VehicleInsurance vi = new VehicleInsurance();
        vi.setPolicyDetails(9002, "Pooja");
        vi.setVehicleType("Four-Wheeler");
        vi.calculatePremium();
    }
}