class Singleton {

    // Static instance of the class
    private static Singleton instance;

    // Private constructor (cannot be accessed outside)
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Public method to provide access
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // Create only once
        }
        return instance;
    }

    // Sample method
    void showMessage() {
        System.out.println("Hello from Singleton class!");
    }
}

public class Singleton1 {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        // Check if both references point to same object
        System.out.println(obj1 == obj2);
    }
}