import java.util.Scanner;

public class ShorthandOperator {
    public static void main(String[] args) {
        int val1 = 8;
        int val2 = 8;
        int val3 = 8;
        int val4 = 8;
        int val5 = 8;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int x1 = Integer.parseInt(userInput.nextLine());
        //val1 = val1 + x1;
        val1 += x1;
        val2 -= x1;
        val3 *= x1;
        val4 /= x1;
        val5 %= x1;
        System.out.println("sum : " + val1);
        System.out.println("Difference: " + val2);
        System.out.println("Product: " + val3);
        System.out.println("Quotient: " + val4);
        System.out.println("Remainder: " + val5);

        System.out.print("Enter number 2: ");
        int x2 = Integer.parseInt(userInput.nextLine());
        //val1 = val1 + x2;
        val1 += x2;
        val2 -= x2;
        val3 *= x2;
        val4 /= x2;
        val5 %= x2;
        System.out.println("sum : " + val1);
        System.out.println("Difference: " + val2);
        System.out.println("Product: " + val3);
        System.out.println("Quotient: " + val4);
        System.out.println("Remainder: " + val5);

        System.out.print("Enter number 3: ");
        int x3 = Integer.parseInt(userInput.nextLine());
        //val1 = val1 + x3;
        val1 += x3;
        val2 -= x3;
        val3 *= x3;
        val4 /= x3;
        val5 %= x3;
        System.out.println("sum : " + val1);
        System.out.println("Difference: " + val2);
        System.out.println("Product: " + val3);
        System.out.println("Quotient: " + val4);
        System.out.println("Remainder: " + val5);

        System.out.print("Enter number 4: ");
        int x4 = Integer.parseInt(userInput.nextLine());
        //val1 = val1 + x4;
        val1 += x4;
        val2 -= x4;
        val3 *= x4;
        val4 /= x4;
        val5 %= x4;
        System.out.println("sum : " + val1);
        System.out.println("Difference: " + val2);
        System.out.println("Product: " + val3);
        System.out.println("Quotient: " + val4);
        System.out.println("Remainder: " + val5);
    }
}
