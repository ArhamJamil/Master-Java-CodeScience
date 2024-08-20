public class LogicalOperator {
    public static void main(String[] args) {
        /*
            Logical operators in Java are used to combine multiple boolean expressions
            or conditions. The result of a logical operation is a boolean value: true or false.
            These operators are crucial for decision-making in control flow structures like if,
            while, for, and do-while statements.

            Types of Logical Operators in Java
                Logical AND (&&)
                Logical OR (||)
                Logical NOT (!)
        */

        boolean a = true;
        boolean b = true;
        boolean c = false;

        System.out.println("a && b: " + (a && b)); // Output: true
        System.out.println("a && c: " + (a && c)); // Output: false

        System.out.println("a || b: " + (a || b)); // Output: true
        System.out.println("b || c: " + (b || c)); // Output: false

        System.out.println("!a: " + (!a)); // Output: false
        System.out.println("!c: " + (!c)); // Output: true

        // Combining multiple logical operators
        boolean result = (a && b) || (!a && !b);
        System.out.println("(a && b) || (!a && !b): " + result); // Output: true
    }
}
