public class Division {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;   // This will cause exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}