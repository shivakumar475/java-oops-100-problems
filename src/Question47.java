/* QUESTION 47: Write a Java program to demonstrate object oriented
programming.
1. Create an abstract class Shape with data member:
   o dimension (double)

2. In Shape class:
   o Create a method setDimension(double dimension)
   o Create an abstract method calculateArea()

3. Create a class Square that inherits Shape.

4. In Square class:
   o Implement the calculateArea() method
   o Display the calculated area

5. Create a Main class.
   In the main() method:
   o Create an object of Square
   o Call setDimension()
   o Call calculateArea()

Expected Output:
Area of Square: 144.0
*/

abstract class Shape {
    double dimension;

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public abstract void calculateArea();
}

class Square extends Shape {
    @Override
    public void calculateArea() {
        double area = dimension * dimension;
        System.out.println("Area of Square: " + area);
    }
}

public class Question47 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setDimension(12);
        sq.calculateArea();
    }
}