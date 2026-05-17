// Parent class
class Person {
    String name;
    int age;

    // Parent constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }
}

// Child class
class Student extends Person {
    int rollNo;

    // Child constructor
    Student(String name, int age, int rollNo) {
        // Calling parent constructor using super
        super(name, age);
        this.rollNo = rollNo;
        System.out.println("Student constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }
}

// Main class
public class SuperCons {
    public static void main(String[] args) {
        // Creating object
        Student s = new Student("Shivangi", 21, 101);

        // Display details
        s.display();
    }
}