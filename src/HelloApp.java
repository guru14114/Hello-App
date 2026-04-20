public class HelloApp {
    public static void main(String[] args) {

        // Case when no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String result = "Hello, ";

        // Enhanced for loop to concatenate names
        for (String name : args) {
            result += name + ", ";
        }

        // Remove trailing ", " using substring
        result = result.substring(0, result.length() - 2);

        // Print final result
        System.out.println(result + "!");
    }
}