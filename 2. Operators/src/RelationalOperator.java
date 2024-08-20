public class RelationalOperator {
    public static void main(String[] args) {
        /*

        Relational operators in Java are used to compare two values or
        expressions. The result of a relational operation is a boolean
        value: true or false. These operators are fundamental in controlling
        the flow of programs, especially within conditions like if statements,
        loops, and other control structures.


        List of Relational Operators in Java
            Equal to (==)
            Not equal to (!=)
            Greater than (>)
            Less than (<)
            Greater than or equal to (>=)
            Less than or equal to (<=)

        */

        int a = 10;
        int b = 20;

        System.out.println("a == b: " + (a == b));   // false
        System.out.println("a != b: " + (a != b));   // true
        System.out.println("a > b: " + (a > b));     // false
        System.out.println("a < b: " + (a < b));     // true
        System.out.println("a >= b: " + (a >= b));   // false
        System.out.println("a <= b: " + (a <= b));   // true
    }
}
