import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 3};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        // Sorting the array
        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}