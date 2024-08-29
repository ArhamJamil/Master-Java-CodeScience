public class WhileLoopIteration {
    public static void main(String[] args) {

        // Loops in Java allow you to execute a block of code repeatedly based on a condition.

        /*
            2. while Loop
                The while loop is used when you want to repeat a block of code an
                unknown number of times, as long as a condition is true.

                while (condition) {
                    // code to be executed
                }
        */

        int count = 1;

        while (count <= 10){
            System.out.println(count);
            //count = count + 1;
            count+=2;
        }

    }
}
