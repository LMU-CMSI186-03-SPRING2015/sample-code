package life;

/**
 * A simple class for creating simple Food objects.
 */
public class Food {

    // A Food object has a calorie count, a taste-level, and a name.
    private int calories;
    private int taste;
    private String name;

    /**
     * Constructor for a Food object. Create it with Calories
     */
    public Food(int calories, int taste, String name) {
        this.calories = calories;
        this.taste = taste;
        this.name = name;
    }

    /**
     * Grabs the calorie count for this Food object.
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     * Grabs the name for this Food object.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Grabs the taste int for this Food object.
     */
    public int getTaste() {
        return this.taste;
    }
}
