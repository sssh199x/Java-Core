package constructors.parameterized;

/**
 * Learning about Parameterized Constructors
 * Parameterized constructors accept parameters to initialize objects.
 */
public class Human {
    private String name;
    private int age;
    private static String type = "Mammal";

    // Default constructor delegates to parameterized constructor
    public Human() {
        this("Sandesh", 25);
    }

    /**
     * Construct a Human with a name and age.
     * @param name non-null, non-empty name
     * @param age non-negative age
     */
    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age cannot be negative");
        }
        this.age = age;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String newType) {
        if (newType == null || newType.isBlank()) {
            throw new IllegalArgumentException("type cannot be null or empty");
        }
        type = newType;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Type: %s", name, age, type);
    }
}
