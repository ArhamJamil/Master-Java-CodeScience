public class TypeConversion {
    public static void main(String[] args) {
        /*

        In Java, type conversion and type casting are methods to change a variable
        from one data type to another. Though they sound similar, they serve
        different purposes and work in distinct ways.

        1. Type Conversion
            Type conversion is the process of converting one data type to
            another automatically (implicitly) or manually (explicitly).
            There are two main types of type conversion in Java:

            a. Implicit Type Conversion (Widening)
                What is it?

                    Implicit type conversion, also known as widening
                    conversion, happens automatically when a smaller data
                    type is converted into a larger data type.
                    This conversion is safe and there is no data loss.
                    Examples:

                    byte → short → int → long → float → double
                    char → int

            b. Explicit Type Conversion (Narrowing)
                What is it?

                    Explicit type conversion, also known as narrowing
                    conversion, is when you manually convert a larger data
                    type into a smaller one.This conversion is not automatic
                    because it might result in data loss or truncation.
                    Therefore, it requires explicit casting.

                    Examples:

                    double → float → long → int → short → byte
                    int → char

        */

        int intVal = 100;
        double doubleVal = intVal;  // int to double conversion

        System.out.println("Integer value: " + intVal);
        System.out.println("Double value after implicit conversion: " + doubleVal);

        float floatVal = 100.04f;
        long longVal = (long) floatVal;  // double to int conversion (narrowing)

        System.out.println("Float value: " + floatVal);
        System.out.println("Long value after explicit conversion: " + longVal);


    }
}
