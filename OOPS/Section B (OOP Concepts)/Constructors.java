class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display data
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructors {
    public static void main(String[] args) {

        // Using default constructor
        Student s1 = new Student();
        s1.display();

        // Using parameterized constructor
        Student s2 = new Student("Shivangi", 20);
        s2.display();
    }
}