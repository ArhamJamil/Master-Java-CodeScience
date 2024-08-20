public class EscapeSequences {
    public static void main(String[] args) {
        // Newline (\n)
        System.out.println("Hello\nWorld!");

        // Tab (\t)
        System.out.println("Hello\tWorld!");

        // Backslash (\\)
        System.out.println("Path to file: C:\\Users\\Arham");

        // Single quote (\')
        System.out.println("It's a beautiful day!");

        // Double quote (\")
        System.out.println("She said, \"Hello!\"");

        // Carriage return (\r)
        System.out.println("Hello\rWorld!"); // "World!" overwrites "Hello"

        // Backspace (\b)
        System.out.println("Hello\bWorld!"); // "o" is removed from "Hello"

        // Form feed (\f)
        System.out.println("Hello\fWorld!"); // Uncommon, effect depends on environment

        // Unicode character (uXXXX)
        System.out.println("Unicode character: \u0041"); // Outputs "A"
    }
}
