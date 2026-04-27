public class HelloWorld6 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String greeting = "Hello, ";

            // Build string using enhanced for loop
            for (String name : args) {
                greeting += name + ", ";
            }

            // Remove trailing ", " using substring
            greeting = greeting.substring(0, greeting.length() - 2);

            // Add exclamation mark
            greeting += "!";

            System.out.println(greeting);
        }
    }
}