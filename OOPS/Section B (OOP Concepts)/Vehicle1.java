// Abstract class
abstract class Vehicle {
    String brand;
    int speed;

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Abstract method
    abstract void start();

    // Concrete method
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

// Car class
class Car extends Vehicle {

    Car(String brand, int speed) {
        super(brand, speed);
    }

    // Implement abstract method
    void start() {
        System.out.println("Car starts with a key or button.");
    }
}

// Bike class
class Bike extends Vehicle {

    Bike(String brand, int speed) {
        super(brand, speed);
    }

    // Implement abstract method
    void start() {
        System.out.println("Bike starts with a kick or self-start.");
    }
}

// Main class
public class Vehicle1 {
    public static void main(String[] args) {

        Vehicle v1 = new Car("Honda", 120);
        Vehicle v2 = new Bike("Yamaha", 90);

        System.out.println("Car Details:");
        v1.display();
        v1.start();

        System.out.println("\nBike Details:");
        v2.display();
        v2.start();
    }
}