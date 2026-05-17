import java.util.*;

public class ArrayLinkedList {
    public static void main(String[] args) {

        // Using ArrayList
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("ArrayList elements:");
        for (String item : list) {
            System.out.println(item);
        }

        // Switching to LinkedList (same reference type)
        list = new LinkedList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Elephant");

        System.out.println("\nLinkedList elements:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}