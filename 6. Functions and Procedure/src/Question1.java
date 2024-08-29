import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Create A Multiplication Table of Given Number
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter Number for which you want to generate Multiplication Table: ");
        long givenNumber = userInput.nextInt();

        System.out.print("Enter Range Till you want multiple: ");
        long givenRange = userInput.nextInt();

        MultiplyTable(givenNumber,givenRange);
    }

    public static void MultiplyTable(long TableFor, long TableTill){
        for (long i = 1; i <= TableTill ; i++) {
            System.out.println(TableFor + " x " + i + " = " + (TableFor * i));
        }
    }
}
