import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("destination.txt");

            int ch;
            while ((ch = fr.read()) != -1) { // read till end of file
                fw.write(ch);               // write into destination
            }

            fr.close();
            fw.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}