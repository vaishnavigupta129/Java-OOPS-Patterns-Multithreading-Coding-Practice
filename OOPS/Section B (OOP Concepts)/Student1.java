// Student class
class Student {
    // Private fields
    private String name;
    private int rollNo;
    private double marks;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for roll number
    public int getRollNo() {
        return rollNo;
    }

    // Setter for roll number
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter for marks
    public double getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

// Main class
public class Student1 {
    public static void main(String[] args) {
        // Create object
        Student s = new Student();

        // Set values using setters
        s.setName("Shivangi");
        s.setRollNo(101);
        s.setMarks(85.5);

        // Display values using method
        s.display();
    }
}