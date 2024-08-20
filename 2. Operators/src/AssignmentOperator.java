import java.util.Arrays;
import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        // Assignment operator ( = )
        // assign the right hand value to left hand

        //        int a = 5 ;   (correct)
        //        5 = int a ;   (wrong)

        // Make a program that Swap two numbers

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter Value 1: ");
        int Value1 = Integer.parseInt(userInput.nextLine());

        System.out.print("Enter Value 2: ");
        int Value2 = Integer.parseInt(userInput.nextLine());

        int Swap;

        Swap = Value2;
        Value2 = Value1;
        Value1 = Swap;

        System.out.println("Value 1 = " + Value1);
        System.out.println("Value 2 = " + Value2);




    }
}
