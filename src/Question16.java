/*QUESTION 16: Write a Java program to demonstrate object oriented
programming.
1. Create a class Animal with method:
 o makeSound()
2. In Animal class, implement makeSound() to display:
 o "Animal makes a sound"
3. Create a class Dog that inherits Animal.
4. In Dog class:
 o Override makeSound() to display:
 "Dog barks"
5. Create a Main class.
In the main() method:
 o Create an object of Dog
 o Call the method:
 makeSound()
Expected Output:
Dog barks
QUESTION 17: Write a Java program to demonstrate object oriented
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
Payment done using UPI*/


class Animal{
    public void makeSound(){
        System.out.println("animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
public class Question16{
    public static void main(String[]args){
        Dog d=new Dog();
        d.makeSound();
    }
}














