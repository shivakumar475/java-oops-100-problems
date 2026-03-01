/*QUESTION 21: Write a Java program to demonstrate object oriented
programming.
1. Create a class Calculator.
2. In Calculator class, create overloaded methods named add():
 o add(int a, int b) → returns sum of two integers
 o add(int a, int b, int c) → returns sum of three integers
3. Create a Main class.
In the main() method:
 o Create an object of Calculator
 o Call both add() methods with appropriate arguments
 o Display the results
Expected Output:
Sum of two numbers: 30
Sum of three numbers: 60 */

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Question21 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(10, 20);
        int sum2 = calc.add(10, 20, 30);

        System.out.println("Sum of two numbers: " + sum1);
        System.out.println("Sum of three numbers: " + sum2);
    }
}