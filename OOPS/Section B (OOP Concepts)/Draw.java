// Interface
interface Drawable {
    void draw(); // abstract method
}

// Circle class implementing Drawable
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Square class implementing Drawable
class Square implements Drawable {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

// Main class
public class Draw {
    public static void main(String[] args) {
        // Using interface reference
        Drawable d1 = new Circle();
        Drawable d2 = new Square();

        // Calling methods
        d1.draw();
        d2.draw();
    }
}