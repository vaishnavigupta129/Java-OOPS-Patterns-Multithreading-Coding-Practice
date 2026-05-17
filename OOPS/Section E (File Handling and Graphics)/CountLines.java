import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {
    public static void main(String[] args) {
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            
            while (br.readLine() != null) {
                lineCount++;
            }

            System.out.println("Total number of lines: " + lineCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}