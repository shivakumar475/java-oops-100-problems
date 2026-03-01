/*QUESTION 22: Write a Java program to demonstrate object oriented
programming.
1. Create a class Printer.
2. In Printer class, create overloaded methods named print():
 o print(String message) → prints the message
 o print(String message, int copies) → prints the message given number of times
3. Create a Main class.
In the main() method:
 o Create an object of Printer
 o Call both print() methods
Expected Output:
Hello World
Hello World
Hello World */

class Printer {
    void print(String message) {
        System.out.println(message);
    }

    void print(String message, int copies) {
        for(int i = 0; i < copies; i++) {
            System.out.println(message);
        }
    }
}

public class Question22 {
    public static void main(String[] args) {
        Printer p = new Printer();

        p.print("Hello World");
        p.print("Hello World", 2);
    }
}