class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class OverrideSound {
    public static void main(String[] args) {

        Animal a;  // Reference of parent class

        a = new Dog();  // Dog object
        a.makeSound();  // Calls Dog's method

        a = new Cat();  // Cat object
        a.makeSound();  // Calls Cat's method
    }
}