public class HelloApp {
    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Join all names with comma
        String names = String.join(", ", args);

        // Print final output
        System.out.println("Hello, " + names + "!");
    }
}