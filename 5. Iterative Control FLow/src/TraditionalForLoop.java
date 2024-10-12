public class TraditionalForLoop {
    //    1. Traditional for Loop
    //          The traditional for loop is used when you know in advance how many times
    //          you want to iterate over a block of code. It consists of three parts:
    //
    //          * Initialization: Initializes a variable, typically a counter.
    //          * Condition: The loop runs as long as this condition is true.
    //          * Increment/Decrement: Updates the counter after each iteration.

    /*
        for (initialization; condition; update) {
            // Code to be executed
        }
    */

    public static void main(String[] args) {
        // Loop that prints numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }


        // Break and Continue in for Loops
        //  break: Exits the loop entirely.
        //  continue: Skips the current iteration and proceeds to the next iteration of the loop.
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue; // Skip when i == 3
            }
            if (i == 5) {
                break; // Exit the loop when i == 5
            }
            System.out.println("i = " + i);
        }
    }
}
