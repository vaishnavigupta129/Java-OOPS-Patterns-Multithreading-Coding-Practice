import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryFile {
    public static void main(String[] args) {

        // Try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}