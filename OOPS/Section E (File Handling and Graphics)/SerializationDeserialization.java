import java.io.*;

// Step 1: Serializable class
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Main class
public class SerializationDeserialization {
    public static void main(String[] args) {

        // 🔹 Serialization
        try {
            Student s1 = new Student(101, "Shivangi");

            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.close();
            fos.close();

            System.out.println("Object serialized successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 🔹 Deserialization
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Object deserialized successfully!");
            System.out.println("ID: " + s2.id);
            System.out.println("Name: " + s2.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}