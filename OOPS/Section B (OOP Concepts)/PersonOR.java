// Parent class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString()
    public String toString() {
        return "Person [Name=" + name + ", Age=" + age + "]";
    }
}

// Child class
class Student extends Person {
    int rollNo;
    String course;

    // Constructor
    Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }

    // Overriding toString()
    public String toString() {
        return "Student [Name=" + name + ", Age=" + age +
               ", Roll No=" + rollNo + ", Course=" + course + "]";
    }
}

// Main class
public class PersonOR {
    public static void main(String[] args) {

        Person p = new Person("Shivangi", 21);
        Student s = new Student("Aman", 20, 101, "BCA");

        // Printing objects (automatically calls toString())
        System.out.println(p);
        System.out.println(s);
    }
}