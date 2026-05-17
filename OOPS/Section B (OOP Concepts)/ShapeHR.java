// Parent class
class Shape {
    void display() {
        System.out.println("This is a Shape");
    }
}

// Child class 1
class Circle extends Shape {
    void area(double radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Child class 2
class Square extends Shape {
    void area(double side) {
        double result = side * side;
        System.out.println("Area of Square: " + result);
    }
}

// Main class
public class ShapeHR{
    public static void main(String[] args) {

        // Creating objects
        Circle c = new Circle();
        Square s = new Square();

        // Using Circle
        c.display();
        c.area(5);

        // Using Square
        s.display();
        s.area(4);
    }
}