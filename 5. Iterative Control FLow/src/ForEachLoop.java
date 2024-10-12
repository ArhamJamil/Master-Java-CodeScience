public class ForEachLoop {

    // The enhanced for-EACH loop is mainly used to iterate over arrays or collections
    // like ArrayList. It simplifies the iteration by eliminating the need for an
    // index variable.

    /*
        for (type variable : array/collection) {
            // Code to be executed
}

     */

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Enhanced for loop to iterate through an array
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}
