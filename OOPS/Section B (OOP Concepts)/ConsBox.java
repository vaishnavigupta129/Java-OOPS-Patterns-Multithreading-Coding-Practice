class Box {
    double length, width, height;

    // Default constructor
    Box() {
        length = width = height = 1;
    }

    // Constructor with one parameter (cube)
    Box(double side) {
        length = width = height = side;
    }

    // Constructor with three parameters
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    // Method to calculate volume
    double volume() {
        return length * width * height;
    }
}

public class ConsBox {
    public static void main(String[] args) {

        Box b1 = new Box();              // Default
        Box b2 = new Box(5);             // Cube
        Box b3 = new Box(2, 3, 4);       // Rectangular box

        System.out.println("Volume of b1: " + b1.volume());
        System.out.println("Volume of b2: " + b2.volume());
        System.out.println("Volume of b3: " + b3.volume());
    }
}