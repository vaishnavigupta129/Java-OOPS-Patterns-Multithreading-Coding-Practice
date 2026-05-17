import java.io.FileReader;
import java.io.IOException;

public class Final {
    public static void main(String[] args) {

        FileReader file = null;

        try {
            file = new FileReader("test.txt");  // File may or may not exist
            int ch;

            while ((ch = file.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());

        } finally {
            try {
                if (file != null) {
                    file.close();   // Always executed
                    System.out.println("\nFile closed successfully");
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}