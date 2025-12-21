package constructors.default_constructor;

/**
 * Learning about Default Constructors
 * A default constructor has no parameters.
 * If you don't define any constructor, Java provides a default one.
 */
public class DefaultConstructor {
    String name;
    int age;
    
    // Default constructor (no parameters)
    public DefaultConstructor() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public static void main(String[] args) {
        // Creating object using default constructor
        DefaultConstructor obj = new DefaultConstructor();
        obj.displayInfo();
        
        // Modifying values after object creation
        obj.name = "John";
        obj.age = 25;
        obj.displayInfo();
    }
}

