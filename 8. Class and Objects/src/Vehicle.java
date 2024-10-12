/**

 # Constructors in Java :
    A constructor is a special method that is called when an object is instantiated (created)
    from a class. It is used to initialize the object's state
    (assign values to the object’s fields).

    Characteristics of Constructors:
        * Name: A constructor must have the same name as the class.

        * No Return Type: It does not return a value, not even void.

        * Automatic Invocation: It is automatically invoked when a new object is
                                using the new keyword.

        * Types:

            -Default Constructor: If no constructor is provided, Java supplies a default
                constructor that initializes object fields to default values (e.g., 0, null).

            -Parameterized Constructor: You can define constructors that accept parameters
                                        to initialize the object with custom values.



 */

public class Vehicle {
    String VehicleName;
    String VehicleType;
    String VehicleBrand;
    int VehicleModel;
    String VehicleColor;

    // Constructor 1: Parameterized constructor

    public Vehicle(String Vname, String Vtype, String Vbrand, int Vmodel, String Vcolor){
        /**
           The this Keyword, In Java, this is a reference variable that refers to the
           current object (the object whose method or constructor is being invoked).

            It is mainly used to:

            * Differentiate between instance variables and parameters when they have
              the same name.

            * Invoke other constructors within the same class.

            * Return the current instance from a method.

         */

        this.VehicleName = Vname;
        this.VehicleType = Vtype;
        this.VehicleBrand = Vbrand;
        this.VehicleModel = Vmodel;
        this.VehicleColor = Vcolor;

    }

    // Constructor 2: Calls Constructor 1 with default values
    public Vehicle(){
        this("", "", "", 0, "" );
    }

    public void displayInfo() {
        System.out.println("Vehicle Name: " + this.VehicleName);
        System.out.println("Vehicle Type: " + this.VehicleType);
        System.out.println("Vehicle Brand: " + this.VehicleBrand);
        System.out.println("Vehicle Model: " + this.VehicleModel);
        System.out.println("Vehicle Color: " + this.VehicleColor);
    }

    public Vehicle myCurrentVehicleInstance(){
        // Returning the Current Instance: You can use this to return the
        // current class instance from a method, which is useful for method chaining.
        return this;
    }

}
