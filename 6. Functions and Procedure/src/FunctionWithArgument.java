import java.util.Scanner;

public class FunctionWithArgument {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter Number1: ");
        int num1 = userInput.nextInt();

        System.out.print("Enter Number2: ");
        int num2 = userInput.nextInt();

        System.out.println("Sum of Two Numbers is: " + SumOfNumber(num1,num2));
    }


    public static int SumOfNumber(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
