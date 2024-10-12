import java.util.Objects;
import java.util.Scanner;

public class DoWhileLoop {

    /*
        The do-while loop in Java is a control flow statement that allows code to be
        executed at least once and then repeatedly based on a given condition.
        The key difference between do-while and while is that in a do-while loop,
        the condition is checked after the code block executes, ensuring the code
        runs at least once, even if the condition is false.

        SYNTAX:

            do {
                // code block to be executed
            } while (condition);

    */
    public static void main(String[] args) {
        SetPassword();

    }

    public  static void SetPassword() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your Password:  ");
        String userPassword = userInput.nextLine();
        String re_enterPass = "";
        do {
            System.out.print("Re-Enter your password:   ");
            re_enterPass = userInput.nextLine();
        }
        while (!userPassword.equals(re_enterPass));

        System.out.println("Sucessfully password has been set ");

    }
}
