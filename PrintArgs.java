/**
 * Straightforward class that spits out all the arguments right back at you.
 */
public class PrintArgs {

    public static void main(String[] args) {
        // This version of the for loop is a little more subtle than the normal
        // for(int i = 0; i < args.length; i++) version. What it does is,
        // for each String element, in the args array, it shoves it in the
        // temporary variable called arg, then prints it out.
        for(String arg : args) {
            System.out.println(arg);
        }
    }
}
