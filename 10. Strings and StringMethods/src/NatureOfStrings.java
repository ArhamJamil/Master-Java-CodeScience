public class NatureOfStrings {
    public static void main(String[] args) {
        String myStr1 = "abcd"; // String literal
        String myStr2 = "abcd"; // Another string literal with the same value

        String myStr3 = new String("abcd"); // Creates a new String object

        System.out.println("myStr1 == myStr2: " + (myStr1 == myStr2));
        System.out.println("myStr1 == myStr3: " + (myStr1 == myStr3));


        /*
           String Literals:

             String myStr1 = "abcd"; creates a string literal in the string pool.

             String myStr2 = "abcd"; refers to the same string literal in the string pool.
             Because of string interning in Java, both myStr1 and myStr2 point to the same
             memory location.

           Creating a New String Object:
             String myStr3 = new String("abcd"); creates a new String object in the heap
             memory, regardless of the string pool. This means myStr3 points to a different
             memory location from myStr1 and myStr2.

            Using == compares the reference (memory address) of the objects rather than their content.
            To compare the actual content of strings, you should use the .equals() method:

        */
    }
}
