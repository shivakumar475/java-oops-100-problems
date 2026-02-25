/*QUESTION 18: Write a Java program to demonstrate object oriented
programming.
1. Create a class Shape with method:
 o calculateArea()
2. In Shape class, implement calculateArea() to display:
 o "Calculating area of shape"
3. Create a class Circle that inherits Shape with data member:
 o radius (double)
4. In Circle class:
 o Override calculateArea()
 Area = 3.14 × radius × radius
5. Create a Main class.
In the main() method:
 o Create an object of Circle
 o Set radius value
 o Call the method:
 calculateArea()
Expected Output:
Area of Circle: 78.5*/


class Shape{
    public void calculateArea(){
        System.out.println("Calculating Area of Shape");
    }
}
class Circle extends Shape{
    double radius;
    public void setradius(double radius){
        this.radius=radius;
    }
    @Override
    public void calculateArea(){
        double Area=(3.14*radius*radius);
        System.out.println("Area of a Circle: "+Area);
    }
}
public class Question18{
    public static void main(String[]args){
        Circle c=new Circle();
        c.setradius(5);
        c.calculateArea();
    }
}














