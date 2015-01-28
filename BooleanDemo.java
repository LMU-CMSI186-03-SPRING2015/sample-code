public class BooleanDemo {

    public static void main (String[] args) {

        boolean a = false;
        boolean b = true;
        boolean c = true;

        // && takes precedence over || so it is calculated first
        // true OR true AND false -> true OR false -> true
        System.out.println(b || c && a);
        // (true OR true) AND false -> (true) AND false -> false
        System.out.println((b || c) && a);

    }

}
