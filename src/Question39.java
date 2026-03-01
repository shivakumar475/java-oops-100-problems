/*QUESTION 39: Write a Java program to demonstrate object oriented
programming.
1. Create a class Laptop with private data members:
 o brand (String)
 o ram (int)
2. Provide public setter and getter methods:
 o setBrand(String brand)
 o setRam(int ram)
 o getBrand()
 o getRam()
3. Create a Main class.
In the main() method:
 o Create an object of Laptop
 o Assign values using setters
 o Display laptop details
Expected Output:
Brand: HP
RAM: 8 GB */

class Laptop {
    private String brand;
    private int ram;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }
}

public class Question39 {
    public static void main(String[] args) {
        Laptop l = new Laptop();

        l.setBrand("HP");
        l.setRam(8);

        System.out.println("Brand: " + l.getBrand());
        System.out.println("RAM: " + l.getRam() + " GB");
    }
}