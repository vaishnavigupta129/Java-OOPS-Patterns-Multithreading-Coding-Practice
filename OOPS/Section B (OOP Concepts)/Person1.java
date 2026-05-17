// Base class
class Person {
    String name;
    int age;

    void getPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class (inherits Person)
class Employee extends Person {
    int empId;
    double salary;

    void getEmployeeDetails(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

// Derived class (inherits Employee)
class Manager extends Employee {
    String department;

    void getManagerDetails(String department) {
        this.department = department;
    }

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

// Main class
public class Person1 {
    public static void main(String[] args) {
        Manager m = new Manager();

        // Setting values
        m.getPersonDetails("Shivangi", 21);
        m.getEmployeeDetails(101, 50000);
        m.getManagerDetails("IT");

        // Displaying all details
        System.out.println("Manager Details:");
        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}