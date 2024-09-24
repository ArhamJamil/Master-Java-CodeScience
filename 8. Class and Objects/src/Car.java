import java.util.Scanner;

/**

 In Java, classes and objects are fundamental concepts of object-oriented programming (OOP).

 1. Classes :

    A class is a blueprint or template for creating objects. It defines properties (attributes)
    and behaviors (methods) that the objects created from the class will have.

    Class Definition: A class typically contains:

        * Fields (variables) that define the properties or state of the objects.

        * Methods (functions) that define the behaviors or actions the objects can perform.

        *Optionally, constructors to initialize objects when they are created

 **/

public class Car {
    String Car_Name ;
    int Car_Model ;
    String Car_Colour;
    int Car_fuel ;

    public int getCar_fuel() {
        return Car_fuel;
    }

    public void setCar_fuel(int car_fuel) {
        Car_fuel = car_fuel;
    }

    public void setCar_Colour(String car_Colour) {
        Car_Colour = car_Colour;
    }

    public String getCar_Colour() {
        return Car_Colour;
    }

    public void setCar_Name(String car_Name) {
        Car_Name = car_Name;
    }

    public String getCar_Name() {
        return Car_Name;
    }

    public void setCar_Model(int car_Model) {
        Car_Model = car_Model;
    }

    public int getCar_Model() {
        return Car_Model;
    }

    public void Drive_Car() {
        Scanner userInput = new Scanner(System.in);

        // Get 'To' and 'From' information
        System.out.print("To: ");
        String to = userInput.nextLine();  // Capturing the full line
        System.out.print("From: ");
        String from = userInput.nextLine();  // Capturing the full line

        // Check if the car is out of fuel
        if (getCar_fuel() == 0) {
            System.out.println("Car is out of fuel ! ! !");
        } else {
            // Get the distance from user
            System.out.print("How many Km: ");
            int distance = userInput.nextInt();

            // Simulating fuel consumption (assuming 1 unit of fuel per Km)
            int newFuel = getCar_fuel() - distance;

            // If fuel becomes less than 0, stop the car
            if (newFuel < 0) {
                System.out.println("Not enough fuel to cover the distance!");
            } else {
                // Set the new fuel level
                setCar_fuel(newFuel);

                System.out.println("Ok, Let's Go!!!");

                // Simulate driving by printing dots for each Km
                int count = 0;
                while (count < distance) {
                    count++;
                    System.out.print(".");
                }
                System.out.println("\nGood Bye!");

                // Show remaining fuel after the trip
                System.out.println("Remaining fuel: " + getCar_fuel() + " units");
            }
        }
        userInput.close();
    }
}
