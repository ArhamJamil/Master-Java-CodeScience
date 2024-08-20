import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = userInput.nextLine();

        System.out.print("Enter your Age: ");
        int age = userInput.nextInt();

        System.out.print("Enter your GPA: ");
        float gpa = userInput.nextFloat();

        System.out.print("Are you a full-time student? (true/false): ");
        boolean isFullTime = userInput.nextBoolean();

        System.out.println("\nSummary:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Full-time student: " + isFullTime);

        // Close the scanner to avoid resource leaks
        userInput.close();
    }

}
