public class Main {
    public static void main(String[] args) {

        /*
            2. Objects
                An object is an instance of a class. When you create an object, you allocate memory for it and
                set its properties based on the class definition.

                Creating an Object: You create an object using the new keyword followed by a call to
                the class's constructor.

                Syntax :
                    <class_name> <object_reference_identifier> = new <class_constructor>
        */

        Car myCar_1 = new Car();
        myCar_1.setCar_fuel(10);
        myCar_1.setCar_Model(2024);
        myCar_1.setCar_Name("Audi");
        myCar_1.setCar_Colour("Black");
        myCar_1.Drive_Car();


    }
}