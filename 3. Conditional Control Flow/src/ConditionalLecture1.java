import java.util.Scanner;

public class ConditionalLecture1 {
    public static void main(String[] args) {
        // Question : Classify a person's age group: Child (< 13),
        // Teenager (13-19), Adult (20-59), Senior (60+).

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter Your Age (1-100): ");
        int age = userInput.nextInt();

        if (age < 13) {
            System.out.println("you're A child");
        } else if (age < 20) {
            System.out.println("You're A Teenager");
        } else if (age < 60) {
            System.out.println("You're Adult");
        }else {
            System.out.println("You're Senior");
        }

    }
}

