import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number to calculate Factorial: ");
        int number = userInput.nextInt();
        System.out.println("The Factorial is: " + CalculateFactorial(number));
    }

    public static int CalculateFactorial(int value){
        if (value == 0){
            return 1;
        }
        return value * CalculateFactorial(value-1);
    }
}
