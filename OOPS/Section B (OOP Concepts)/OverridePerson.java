import java.util.Objects;

class Person {
    private String name;
    private int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;              // Same object
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;
        return age == person.age &&
               Objects.equals(name, person.name);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class OverridePerson {
    public static void main(String[] args) {

        Person p1 = new Person("Shivangi", 20);
        Person p2 = new Person("Shivangi", 20);
        Person p3 = new Person("Rahul", 22);

        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));

        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
        System.out.println("p3 hashCode: " + p3.hashCode());
    }
}