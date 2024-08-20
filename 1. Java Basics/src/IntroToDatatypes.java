public class IntroToDatatypes {
    public static void main(String[] args) {

        /*
            Data types are divided into two groups:

            Primitive data types - includes byte, short, int, long, float, double, boolean and char
            Non-primitive data types - such as String, Arrays and Classes

        */
        // Data Types with byte sizes and examples

        /*
         * Primitive Data Types:
         *
         * 1. byte: 1 byte (8 bits)
         *    Example: byte smallNumber = 10;
         *
         * 2. short: 2 bytes (16 bits)
         *    Example: short mediumNumber = 1000;
         *
         * 3. int: 4 bytes (32 bits)
         *    Example: int number = 123456;
         *
         * 4. long: 8 bytes (64 bits)
         *    Example: long largeNumber = 123456789L;
         *
         * 5. float: 4 bytes (32 bits)
         *    Example: float decimalNumber = 3.14f;
         *
         * 6. double: 8 bytes (64 bits)
         *    Example: double preciseDecimalNumber = 3.141592653589793;
         *
         * 7. char: 2 bytes (16 bits)
         *    Example: char letter = 'A';
         *
         * 8. boolean: 1 bit (but size is JVM dependent, typically 1 byte)
         *    Example: boolean isJavaFun = true;
         */

        // Examples of different data types

        // byte example
        byte smallNumber = 10;
        System.out.println("Byte example: " + smallNumber);

        // short example
        short mediumNumber = 1000;
        System.out.println("Short example: " + mediumNumber);

        // int example
        int number = 123456;
        System.out.println("Int example: " + number);

        // long example
        long largeNumber = 123456789L;
        System.out.println("Long example: " + largeNumber);

        // float example
        float decimalNumber = 3.14f;
        System.out.println("Float example: " + decimalNumber);

        // double example
        double preciseDecimalNumber = 3.141592653589793;
        System.out.println("Double example: " + preciseDecimalNumber);

        // char example
        char letter = 'A';
        System.out.println("Char example: " + letter);

        // boolean example
        boolean isJavaFun = true;
        System.out.println("Boolean example: " + isJavaFun);
    }
}
