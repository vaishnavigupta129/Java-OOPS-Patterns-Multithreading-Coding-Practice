class Employee {
    String name;
    int id;
    String department;

    // 1. Constructor with one parameter
    Employee(String name) {
        // Chaining to the two-parameter constructor
        this(name, 0); 
        System.out.println("Called: Constructor with 1 argument");
    }

    // 2. Constructor with two parameters
    Employee(String name, int id) {
        // Chaining to the three-parameter constructor
        this(name, id, "General Pool");
        System.out.println("Called: Constructor with 2 arguments");
    }

    // 3. The "Master" Constructor (initializes all fields)
    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
        System.out.println("Called: Constructor with 3 arguments (The Master)");
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Dept: " + department);
    }

    public static void main(String[] args) {
        System.out.println("--- Creating Employee e1 ---");
        // We only provide the name; the rest is handled by chaining
        Employee e1 = new Employee("Alice");
        e1.display();
    }
}