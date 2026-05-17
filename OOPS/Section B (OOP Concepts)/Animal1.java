// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class Animal1{
    public static void main(String[] args) {
        // Creating object of Dog
        Dog d = new Dog();

        // Calling parent class method
        d.eat();

        // Calling child class method
        d.bark();
    }
}