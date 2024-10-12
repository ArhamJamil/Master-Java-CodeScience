import java.util.Scanner;

public class FactorialRecursive {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number: ");
        int Number = userInput.nextInt();
        long factorial = rescursiveFactorial(Number);
        iterativeFactorial(Number);
        System.out.print("Factorial of number is: " + factorial);
    }

    public static void iterativeFactorial(int num){
        long result = 1;
        for (int i = 1; i <= num ; i++) {
            result = result * i;

        }
        System.out.println("Factorial of number: " + result);
    }


    public static long rescursiveFactorial(int num){
        System.out.println("Function call : " + num);
        if(num == 1){
            return 1;
        }
        long result =  rescursiveFactorial(num -1);
        System.out.println("return value: " + result );
        return num * result;
    }
}
