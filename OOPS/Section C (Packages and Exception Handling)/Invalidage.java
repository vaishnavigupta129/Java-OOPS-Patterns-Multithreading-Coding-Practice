// Custom Exception Class
class InvalidAgeException extends Exception {

    // Constructor
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Invalidage {

    // Method to check age
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);   // Change value to test
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}