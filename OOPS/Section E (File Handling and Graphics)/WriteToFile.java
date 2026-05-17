import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to write into file: ");
        String input = sc.nextLine();

        try {
            FileWriter writer = new FileWriter("output.txt"); // file name

            writer.write(input); // writing data
            writer.close(); // closing file

            System.out.println("Data successfully written to file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        sc.close();
    }
}