/*QUESTION 11: Write a Java program to demonstrate object oriented 
programming. 
1. Create a class Shape with data member: 
  o color (String) 
2. In Shape class, create the following methods: 
  o setShapeDetails(String color) 
  o displayShapeDetails() 
3. Create a class Circle that inherits Shape with data member: 
  o radius (double) 
4. In Circle class, create the following methods: 
  o setCircleDetails(double radius) 
  o displayCircleDetails() 
5. Create a class Rectangle that inherits Shape with data members: 
  o length (double) 
  o width (double) 
6. In Rectangle class, create the following methods: 
  o setRectangleDetails(double length, double width) 
  o displayRectangleDetails() 
7. Create a Main class. 
In the main() method: 
  o Create an object of Circle 
  o Call the following methods in order: 
    setShapeDetails() 
    setCircleDetails() 
    displayCircleDetails() 
  o Create an object of Rectangle 
  o Call the following methods in order: 
    setShapeDetails() 
    setRectangleDetails() 
    displayRectangleDetails() 
Expected Output: 
Color: Red 
Radius: 5 
Color: Blue 
Length: 10 
Width: 6 */



class Shape {
    String color;
    
    public void setShapeDetails(String color) {
        this.color = color;
    }
    public void displayShapeDetails() {
        System.out.println("Color: "+color);
    }
}

class Circle extends Shape {
    double radius;
    
    public void setCircleDetails(double radius) {
        this.radius=radius;
    }
    public void displayCircleDetails() {
        displayShapeDetails();
        System.out.println("Radius: "+radius);
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    
    public void setRectangleDetails(double length, double width) {
        this.length=length;
        this.width=width;
    }
    public void displayRectangleDetails() {
        displayShapeDetails();
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
    }
    
}

public class Question11 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setShapeDetails("Red");
        c.setCircleDetails(5);
        c.displayCircleDetails();
        Rectangle r = new Rectangle();
        r.setShapeDetails("Blue");
        r.setRectangleDetails(10, 6);
        r.displayRectangleDetails();
    }
}