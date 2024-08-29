import java.util.Scanner;

public class ConditionalLecture3 {
    public static void main(String[] args) {
        /* Create a Program that calculates grades based on
           marks.

           A -> above 90%
           B -> above 75%
           C -> above 60%
           D -> above 30%
           F -> Below 30%
           
        */


        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Maths Marks: ");
        float MathMarks = userInput.nextFloat();

        System.out.println("Enter English Marks: ");
        float EngMarks = userInput.nextFloat();

        System.out.println("Enter Computer Science Marks: ");
        float CompMarks = userInput.nextFloat();

        float TotalMarks = EngMarks + CompMarks + MathMarks;
        float Percentage = (TotalMarks / 300) * 100;

        if (Percentage >= 90) {
            System.out.println("Grade: A");
        } else if (Percentage >= 75) {
            System.out.println("Grade: B");
        } else if (Percentage >= 60) {
            System.out.println("Grade: C");
        } else if (Percentage >= 30) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        userInput.close();


    }
}
