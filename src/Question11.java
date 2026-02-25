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