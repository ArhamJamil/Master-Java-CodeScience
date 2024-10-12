import java.util.Scanner;

public class TernaryOperator {
    /*
        The ternary operator in Java is a shorthand way of writing simple
        if-else statements. It's also known as the conditional operator

        Its syntax is:
            condition ? expression1 : expression2;

        * If condition evaluates to true, then expression1 is executed.
        * If condition evaluates to false, then expression2 is executed.


     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int Number_1 = userInput.nextInt();
        System.out.print("Enter Number 2: ");
        int Number_2 = userInput.nextInt();


        // Using ternary operator to check the numbers
        String result = (Number_1 > Number_2) ? "Num 1" : "Num 2";
        System.out.println(result + " is greater");
    }
}
