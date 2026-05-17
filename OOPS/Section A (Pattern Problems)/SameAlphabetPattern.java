import java.util.Scanner;

public class SameAlphabetPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (max 26): ");
        int n = sc.nextInt();

        if (n > 26) {
            n = 26;
        }

        for (int i = 0; i < n; i++) {

            char ch = (char)('A' + i);

            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}