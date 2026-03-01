/* QUESTION 52: Write a Java program to demonstrate object oriented
programming.

1. Create an abstract class Shape with data member:
   o value (double)

2. In Shape class:
   o Create a method setValue(double value)
   o Create an abstract method calculateArea()

3. Create a class Rectangle that inherits Shape.
4. In Rectangle class:
   o Add data member breadth (double)
   o Create method setBreadth(double breadth)

5. Create a class Square that inherits Rectangle.
6. In Square class:
   o Implement calculateArea()
   o Display area of square using value as side

7. Create a Main class.
   In the main() method:
   o Create an object of Square
   o Call setValue()
   o Call calculateArea()

Expected Output:
Area of Square: 100.0
*/

abstract class Shape {
    double value;

    public void setValue(double value) {
        this.value = value;
    }

    public abstract void calculateArea();
}

class Rectangle extends Shape {
    double breadth;

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        // Not used here; overridden in Square
    }
}

class Square extends Rectangle {
    @Override
    public void calculateArea() {
        double area = value * value;
        System.out.println("Area of Square: " + area);
    }
}

public class Question52 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setValue(10);
        sq.calculateArea();
    }
}