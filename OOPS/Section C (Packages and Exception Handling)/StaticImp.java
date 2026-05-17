import static java.lang.Math.PI;

public class StaticImp {
    public static void main(String[] args) {

        double radius = 5;

        // Using PI directly without Math.
        double area = PI * radius * radius;

        System.out.println("Area of Circle: " + area);
    }
}