/* QUESTION 56: Write a Java program to demonstrate object oriented
programming.

1. Create an abstract class Shape with data member:
   o color (String)

2. In Shape class:
   o Create a method setColor(String color)
   o Create an abstract method calculateArea()

3. Create a class Circle that inherits Shape.
4. In Circle class:
   o Add data member radius (double)
   o Create method setRadius(double radius)
   o Implement calculateArea() and display area of circle

5. Create another class Rectangle that also inherits Shape.
6. In Rectangle class:
   o Add data members length (double) and breadth (double)
   o Create method setDimensions(double length, double breadth)
   o Implement calculateArea() and display area of rectangle

7. Create a Main class.
   In the main() method:
   o Create objects of Circle and Rectangle
   o Call required setter methods
   o Call calculateArea() for both objects

Expected Output:
Area of Circle: 78.5
Area of Rectangle: 60.0
*/

abstract class Shape {
    String color;

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void calculateArea();
}

class Circle extends Shape {
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
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

public class Question56 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setColor("Red");
        c.setRadius(5);
        c.calculateArea();

        Rectangle r = new Rectangle();
        r.setColor("Blue");
        r.setDimensions(10, 6);
        r.calculateArea();
    }
}