public class NumberRecursion {
    public static void main(String[] args) {
        PrintNumber(1);
    }

    public static void PrintNumber(int num) {
        // Base case to stop recursion when n reaches 6
        if ( num > 5){
            return;
        }
        // Print the current value of n
        System.out.println(num);
        // Recursive call to print the next number
        PrintNumber(num+1);
    }
}
