public class IntroToVariables {
    public static void main(String[] args) {
         /*
            What are Variables ?
                Variables are like containers that can Store DATA in program

            Declaring (Creating) Variables:

                <datatype> <variable_name> = <value> ;

            The general rules for naming variables are:

                * Names can contain letters, digits, underscores, and dollar signs
                * Names must begin with a letter
                * Names should start with a lowercase letter, and cannot contain whitespace
                * Names can also begin with $ and _ (but we will not use it in this tutorial)
                * Names are case-sensitive ("myVar" and "myvar" are different variables)
                * Reserved words (like Java keywords, such as int or boolean) cannot be used as names
        */

        String name = "Arham Jamil";
        System.out.println(name);

        int age = 20;
        System.out.println(name + " your age is: " + age);

        String myFirstName;
        String myLastName;

        myFirstName = "Arham";
        myLastName = "Jamil";

        System.out.println(myFirstName + " " + myLastName);

        int Number1 = 895;
        int Number2 = 1000;

        System.out.println("Sum Of Two numbers is :");
        System.out.println(Number1 + Number2);

    }
}
