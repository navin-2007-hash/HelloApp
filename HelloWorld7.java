public class HelloWorld7 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join names with comma and space
            String names = String.join(", ", args);

            // Print final greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}