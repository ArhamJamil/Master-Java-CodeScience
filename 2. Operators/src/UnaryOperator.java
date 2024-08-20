public class UnaryOperator {
    public static void main(String[] args) {
        // In Java, unary operators are operators that operate on a single
        // operand to produce a new value. They are often used to increment,
        // decrement, or change the sign of a value, among other tasks.
        // Unary operators are typically simple but powerful tools in programming.

        /*
        Types of Unary Operators in Java
            Unary Plus (+)
            Unary Minus (-)
            Increment (++)
            Decrement (--)
            Logical Complement (!)
            Bitwise Complement (~)
         */

        // 1. Unary Plus (+)
        // Purpose: Indicates that a value is positive. It's usually redundant since numbers are positive by default.

        int a = +5;
        System.out.println("Unary plus: " + a); // Output: 5

        // 2. Unary Minus (-)
        // Purpose: Negates a value, making positive values negative and vice versa.

        int b = -a;
        System.out.println("Unary minus: " + b); // Output: -5

        // 3. Increment (++)
        /*
            Purpose: Increases the value of an operand by 1.

            Pre-increment (++a): Increments the value first, then uses it.

            Post-increment (a++): Uses the value first, then increments it.
        */
        int x = 6;
        // Pre-increment
        System.out.println("Pre-increment: " + (++x)); // Output: 7

        // Post-increment
        System.out.println("Post-increment: " + (x++)); // Output: 7
        System.out.println("Value after post-increment: " + x); // Output: 8

        // 4. Decrement (--)
        /*
            Purpose: Decreases the value of an operand by 1.

            Pre-Decrement (--a): Decreases the value first, then uses it.

            Post-Decrement (a--): Uses the value first, then Decreases it.
         */

        int y = 6;
        // Pre-Decrement
        System.out.println("Pre-Decrement: " + (--y)); // Output: 5

        // Post-Decrement
        System.out.println("Post-Decrement: " + (y--)); // Output: 5
        System.out.println("Value after Post-Decrement: " + y); // Output: 4


        // 5. Logical Complement (!)
        // Purpose: Reverses the value of a boolean. If the boolean is true, it becomes false,
        // and if it's false, it becomes true.

        boolean flag = true;
        System.out.println("Original: " + flag);          // Output: true
        System.out.println("Logical complement: " + !flag); // Output: false

        // 6. Bitwise Complement (~)
        /* Purpose: Inverts all the bits of a number, changing each 1 to 0 and
                    each 0 to 1. This operation is performed on integers and treats the
                    operand as a binary number.*/

        int val1 = 5;   // Binary: 00000000 00000000 00000000 00000101
        int val2 = ~val1;  // Binary: 11111111 11111111 11111111 11111010

        System.out.println("Original: " + val1);          // Output: 5
        System.out.println("Bitwise complement: " + val2); // Output: -6

    }
}
