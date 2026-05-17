import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;
        int num = 1;

        while (top <= bottom && left <= right) {

            // Top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        // Print matrix
        System.out.println("Spiral Pattern:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}