import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();   // May cause InputMismatchException
            int b = sc.nextInt();

            int result = a / b;     // May cause ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid integers");

        } catch (Exception e) {
            System.out.println("General Exception occurred");
        }

        System.out.println("Program continues...");
        sc.close();
    }
}