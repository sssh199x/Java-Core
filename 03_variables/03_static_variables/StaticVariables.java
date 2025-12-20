package variables.static_vars;

/**
 * Learning about Static Variables
 * Static variables belong to the class, not to any instance.
 * All instances share the same static variable.
 */
public class StaticVariables {
    // Instance variable - each object has its own copy
    String name;
    
    // Static variable - shared by all objects
    static int count = 0;
    static String company = "Tech Corp";
    
    public StaticVariables(String name) {
        this.name = name;
        count++; // Increment static variable
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Company: " + company); // Accessing static variable
        System.out.println("Total objects created: " + count);
    }
    
    public static void main(String[] args) {
        System.out.println("Company (accessed via class): " + StaticVariables.company);
        System.out.println("Initial count: " + StaticVariables.count);
        
        StaticVariables obj1 = new StaticVariables("Alice");
        StaticVariables obj2 = new StaticVariables("Bob");
        StaticVariables obj3 = new StaticVariables("Charlie");
        
        System.out.println("\nAfter creating 3 objects:");
        obj1.displayInfo();
        
        // Changing static variable affects all objects
        StaticVariables.company = "New Tech Corp";
        System.out.println("\nAfter changing company name:");
        obj1.displayInfo();
        obj2.displayInfo();
        
        // Static variable can be accessed without creating an object
        System.out.println("\nCount accessed directly: " + StaticVariables.count);
    }
}

