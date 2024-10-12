public class SwitchCaseStatements {
    public static void main(String[] args) {
        /*
           In Java, the switch statement is used to execute one block of code from
           multiple options based on the value of a variable. It is an alternative to
           using a series of if-else statements and improves readability when dealing
           with multiple conditions.

           switch (expression) {
                case value1:
                    // code block for value1
                    break;
                case value2:
                    // code block for value2
                    break;
                case value3:
                    // code block for value3
                    break;

                default:
                    // code block if no case matches
            }

            break Statement: A break is used to exit the switch block after a matching case
            is found and executed. Without break, execution will continue to the next case
            (known as fall-through).

         */
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }



        Day day = Day.TUESDAY;

        switch (day) {
                    case MONDAY:
                        System.out.println("Start of the week");
                        break;

                    case TUESDAY:
                    case WEDNESDAY:
                    case THURSDAY:
                        System.out.println("Mid-week");
                        break;
                    case FRIDAY:
                        System.out.println("Almost weekend");
                        break;
                    case SATURDAY:
                    case SUNDAY:
                        System.out.println("Weekend");
                        break;
                }


    }
}
