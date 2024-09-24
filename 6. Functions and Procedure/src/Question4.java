import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Create a program that computes the sum of digit of number

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = userInput.nextInt();

        int sum = SumOfDigit(num);
        System.out.println("Sum of Digit of given number is: "+ sum);
    }

    public static int SumOfDigit(int num){
        int sumDigit = 0;
        while (num  > 0){
            int Digit = num % 10;
            sumDigit = sumDigit + Digit;
            num = num / 10;
        }

        return sumDigit;
    }
}
