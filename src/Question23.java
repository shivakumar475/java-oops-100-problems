/*QUESTION 23: Write a Java program to demonstrate object oriented
programming.
1. Create a class AreaCalculator.
2. In AreaCalculator class, create overloaded methods named calculateArea():
 o calculateArea(int side) → calculates area of a square
 o calculateArea(int length, int breadth) → calculates area of a rectangle
 o calculateArea(double radius) → calculates area of a circle
3. Create a Main class.
In the main() method:
 o Create an object of AreaCalculator
 o Call all overloaded calculateArea() methods
 o Display the results
Expected Output:
Area of Square: 25
Area of Rectangle: 40
Area of Circle: 78.5 */

class AreaCalculator {

    int calculateArea(int side) {
        return side * side;
    }

    int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}

public class Question23 {
    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();

        int squareArea = ac.calculateArea(5);
        int rectangleArea = ac.calculateArea(5, 8);
        double circleArea = ac.calculateArea(5.0);

        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}