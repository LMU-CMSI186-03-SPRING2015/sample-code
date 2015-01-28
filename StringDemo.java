public class StringDemo {
    public static void main(String[] args) {
        String testString = "Nice weather.";
        // Calls the method (function) canadianize on
        // the test string and prints it.
        System.out.println(canadianize(testString));
    }

    /**
     *  Function that adds " eh?" to the end of any string
     *  and replaces periods with commas.
     */
    public static String canadianize(String text) {
        String newText = text + " eh?";
        return newText.replace('.', ',');
    }
}
