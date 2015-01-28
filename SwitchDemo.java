public class SwitchDemo {

    public static void main(String[] args) {
        try {
            // Parse the first argument (args[0]) into an integer.
            // If it can't, it will throw a NumberFormatException,
            // which the catch statement will handle down below.
            // If the length of args is 0, complain about the lack of args,
            // handle that with an if statement.
            if (args.length == 0) {
                System.out.println("What are you high? You forgot an argument.");
            } else {
                int month = Integer.parseInt(args[0]);
                String monthName = "";
                // Sets the String monthName to a month depending on the
                // value of the integer month, i.e., if month is 4, monthName
                // becomes April.
                switch (month) {
                    case 1:  monthName = "January";
                             break;
                    case 2:  monthName = "February";
                             break;
                    case 3:  monthName = "March";
                             break;
                    case 4:  monthName = "April";
                             break;
                    case 5:  monthName = "May";
                             break;
                    case 6:  monthName = "June";
                             break;
                    case 7:  monthName = "July";
                             break;
                    case 8:  monthName = "August";
                             break;
                    case 9:  monthName = "September";
                             break;
                    case 10: monthName = "October";
                             break;
                    case 11: monthName = "November";
                             break;
                    case 12: monthName = "December";
                    // Message if the month is any other number than 1-12.
                    default: System.out.println("What are you high? That's not a month.");
                             break;
                }
                // Otherwise print out whatever name we got.
                System.out.println(monthName);
            }
        } catch(NumberFormatException e) {
            // More accusations of recreational drug use if the args[0] is not a number.
            System.out.println("What are you high? That's not a number, bro.");
        }
    }
}
