class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}

public class PolymorphicArray {
    public static void main(String[] args) {

        // Polymorphic array
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();

        // Loop through array and call draw()
        for (Shape s : shapes) {
            s.draw();   // Runtime polymorphism
        }
    }
}