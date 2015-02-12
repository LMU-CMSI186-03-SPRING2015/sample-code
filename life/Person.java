package life;

/**
 * A simple class to act as a blueprint for a Person object.
 */
public class Person {

    // These are the fields (a.k.a. attributes) that every Person object will have.
    // It's standard practice in java for these to be private
    // in other words, only accessible in this file.
    private String firstName;
    private String lastName;
    private int energy;
    private int attractiveness;
    private Gender gender;


    /**
     * Constructor for a person object. It requies a firstname, lastname, gender
     * and attractiveness level.
     */
    public Person(String firstName, String lastName, Gender gender, int attractiveness) {
        // "this" refers to the object being created. this.firstName refers to the field
        // defined up above (same with the rest), whereas firstName
        this.firstName = firstName;
        this.lastName = lastName;
        this.attractiveness = attractiveness;
        this.energy = 0;
        this.gender = gender;
    }

    /**
     * Method to grab the first name of the person.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
    * Method to grab the last name of the person.
    */
    public String getLastName() {
        return this.lastName;
    }

    /**
    * Method to grab the attractiveness of the person.
    */
    public int getAttractiveness() {
        return this.attractiveness;
    }

    /**
    * Method to grab the energy of the person.
    */
    public int getEnergy() {
        return this.energy;
    }

    /**
     * Method to grab the gender of the person.
     */
    public Gender getGender() {
        return this.gender;
    }

    /**
     * Decreases the energy field based on the passed integer.
     */
    public void exercise(int caloriesBurned) {
        this.energy -= caloriesBurned;
    }

    /**
     * Increases energy based on the given food object's calories.
     */
    public void eat(Food food) {
        this.energy += food.getCalories();
    }

    /**
     * Overrides the default toString() method all objects have.
     * Returns a the name of the person.
     */
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * The main method is mainly for exhibition purposes. Creates a person object
     * and uses it's methods and prints out the results.
     */
    public static void main(String[] args) {
        // Defines a variable called paul of type Person.
        // assigns it a new Person object calling the constrcutor defined above.
        Person paul = new Person("Paul", "McCartney", Gender.MALE, 5);
        // Calls the eat method on a new Food object with 1200 calories, 9 tastiness,
        // and a name ("Burger and Fries")
        paul.eat(new Food(1200, 9, "Burger and Fries"));
        // Burns off some calories.
        paul.exercise(200);
        System.out.println(paul);
        System.out.println("Hotness: " + paul.getAttractiveness());
        System.out.println("Energy Level: " + paul.getEnergy());
        System.out.println(paul.getGender());
    }
}
