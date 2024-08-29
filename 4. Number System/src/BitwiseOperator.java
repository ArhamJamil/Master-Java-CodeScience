public class BitwiseOperator {
    public static void main(String[] args) {


        // Bitwise operators in Java are used to perform bit-level operations on data.
        // These operators work on the binary representations of integers.


        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        /*
        1. Bitwise AND (&)
            Compares each bit of two integers and returns a new integer where each
            bit is 1 if both bits are 1, otherwise the bit is 0.
            Example:
            a = 0101
            b = 0011
            a & b = 0001 (Decimal: 1)
        */
        System.out.println("a & b = " + (a & b));  // Bitwise AND

        /*
        2. Bitwise OR (|)
            Compares each bit of two integers and returns a new integer where each
            bit is 1 if at least one of the bits is 1.
            Example:
            a = 0101
            b = 0011
            a | b = 0111 (Decimal: 7)
        */
        System.out.println("a | b = " + (a | b));  // Bitwise OR

        /*
        3. Bitwise XOR (^)
            Compares each bit of two integers and returns a new integer where each
            bit is 1 if the corresponding bits of the operands are different.
            Example:
            a = 0101
            b = 0011
            a ^ b = 0110 (Decimal: 6)
        */
        System.out.println("a ^ b = " + (a ^ b));  // Bitwise XOR

        /*
        4. Bitwise NOT (~)
            Inverts each bit of the integer, turning 1 to 0 and 0 to 1.
            Example:
            a = 0101
            ~a = 1010 (Decimal: -6 in two's complement form)
        */
        System.out.println("~a = " + (~a));        // Bitwise NOT

        /*
        5. Left Shift (<<)
            Shifts the bits of the number to the left by the specified number of positions.
            Zeros are shifted into the low-order bits.
            Example:
            a = 0101
            a << 1 = 1010 (Decimal: 10)
        */
        System.out.println("a << 1 = " + (a << 1)); // Left Shift

        /*
        6. Right Shift (>>)
            Shifts the bits of the number to the right by the specified number of positions.
            The sign bit is used to fill the high-order bits.
            Example:
            a = 0101
            a >> 1 = 0010 (Decimal: 2)
        */
        System.out.println("a >> 1 = " + (a >> 1)); // Right Shift

        /*
        7. Unsigned Right Shift (>>>)
            Shifts the bits of the number to the right by the specified number of positions.
            Zeros are shifted into the high-order bits, regardless of the sign bit.
            Example:
            a = 0101
            a >>> 1 = 0010 (Decimal: 2)
        */
        System.out.println("a >>> 1 = " + (a >>> 1)); // Unsigned Right Shift
    }
}
