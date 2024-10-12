import java.util.Objects;
import java.util.Scanner;

public class ConditionalLecture2 {
    public static void main(String[] args) {
        // Problem: Movie tickets are priced based on age: $12 for adults (18 and over),
        // $8 for children. Everyone gets a $2 discount on Wednesday.

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = userInput.nextInt();

        userInput.nextLine();

        System.out.print("Enter Day of purchasing: ");
        String day = userInput.nextLine();

        int price;

        // Determine the base price based on age
        if (age >= 18) {
            price = 12;
        } else {
            price = 8;
        }

//         Apply Wednesday discount if applicable


//        if(day == "wednesday"){
//            price -= 2;
//
//        The comparison if(day == "wednesday") in Java won't work as expected
//        when comparing strings. This is because the == operator compares object
//        references, not the content of the strings. In Java, strings should be
//        compared using the .equals() method or .equalsIgnoreCase() for
//        case-insensitive comparison.
//
//        }

        if (Objects.equals(day.toLowerCase(), "monday")) {
            price -= 4;
        }

        // Correct way to compare strings in Java
        if (day.equalsIgnoreCase("wednesday")) {
            price -= 2;
        }
        // day.equalsIgnoreCase("wednesday"): This method compares the string day
        // to "wednesday" without considering the case (i.e., it will match "wednesday",
        // "Wednesday", "WEDNESDAY", etc.).


        System.out.println("Price of ticket is: $" + price);
        userInput.close();
    }
}
