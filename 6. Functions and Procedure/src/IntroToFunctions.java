import java.util.Scanner;

public class IntroToFunctions {
    public static void main(String[] args) {

        /*
            In Java, functions are called methods. Methods in Java are blocks of code that
            perform a specific task and are defined within a class. They can be called
            upon to execute that task whenever needed.


            Syntax Of DEFINING FUNCTIONS in JAVA :

                <modifier> <RETURN_datatype> <func_name> ( <datatype><Param1>, <datatype><Param2> ... )
                {
                    // body of function

                    return <value>
                }

        */

        Greeting("Arham Jamil");
//        PrintSecondPattern();
        PrintFirstPattern(3);

        int Number1 = SumOfNumber();
        int Number2 = SumOfNumber();

        int Sum = Number1 + Number2;

        System.out.println("Sum of Numbers is: " + Sum);


    }

    public static void Greeting(String name) {

        System.out.println("Hello " + name);
    }

    public static void PrintFirstPattern(int time) {

        int rows = 0;
        while (rows < time){
            System.out.print("*");
            int count = 0;
            while (count < rows){
                String Space = " ";
                System.out.print(Space + "*");
                count++;
            }
            System.out.println();
            rows = rows + 1;
        }
    }

    public static int SumOfNumber(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Number");
        int Number = userInput.nextInt();
        return Number;
    }

    public static void PrintSecondPattern(){
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }

}
