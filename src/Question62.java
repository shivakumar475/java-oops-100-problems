/* QUESTION 62: Write a Java program to demonstrate object oriented
programming.

1. Create an interface Shape with a method:
   o calculateArea()

2. Create a class Rectangle that implements Shape.

3. In Rectangle class:
   o Create data members:
       ▪ length (double)
       ▪ breadth (double)
   o Create a method setDimensions(double length, double breadth)
   o Implement calculateArea() to display area of rectangle

4. Create a Main class.
   In the main() method:
   o Create an object of Rectangle
   o Call setDimensions()
   o Call calculateArea()

Expected Output:
Area of Rectangle: 50.0
*/

interface Shape {
    void calculateArea();
}

class Rectangle implements Shape {
    double length, breadth;

    public void setDimensions(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Question62 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setDimensions(10, 5);
        r.calculateArea();
    }
}