import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = 1;

            // spaces for formatting
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // print numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }

        sc.close();
    }
}