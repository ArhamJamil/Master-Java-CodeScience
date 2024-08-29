import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        long number = userInput.nextLong();
        System.out.println("Sum of Odd Number is: " + OddSum(number));
    }

    public static long OddSum(long num){
        long sum = 0;

        for (long i = 1; i <= num ; i++) {
            if (i % 2 != 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}
