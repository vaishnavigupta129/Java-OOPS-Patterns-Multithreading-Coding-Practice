// Abstract class
abstract class Shape {
    // Abstract method
    abstract double area();
}

// Circle class
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method
    double area() {
        return length * width;
    }
}

// Main class
public class Shape1 {
    public static void main(String[] args) {
        // Creating objects
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        // Displaying areas
        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Rectangle: " + r.area());
    }
}