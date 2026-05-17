public class NullPtr {
    public static void main(String[] args) {

        String str = null;

        try {
            // Manually throwing NullPointerException
            if (str == null) {
                throw new NullPointerException("String is null");
            }

        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}