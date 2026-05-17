import java.io.IOException;

public class IOExcept {

    // Method that throws IOException
    static void readFile() throws IOException {
        throw new IOException("File error occurred");
    }

    public static void main(String[] args) {

        try {
            readFile();   // Calling method
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}