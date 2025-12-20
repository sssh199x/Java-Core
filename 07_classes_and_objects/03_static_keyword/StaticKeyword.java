package classes_and_objects.static_keyword;

/**
 * Learning about the Static Keyword
 * Static members belong to the class, not to any instance.
 */
public class StaticKeyword {
    // Instance variable
    String name;
    
    // Static variable - shared by all instances
    static int totalObjects = 0;
    static String school = "Java Academy";
    
    public StaticKeyword(String name) {
        this.name = name;
        totalObjects++; // Increment static counter
    }
    
    // Instance method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("School: " + school);
    }
    
    // Static method - can be called without creating an object
    public static void displayTotal() {
        System.out.println("Total objects created: " + totalObjects);
        // Cannot access instance variables in static method
        // System.out.println(name); // This would cause an error
    }
    
    // Static block - executed when class is first loaded
    static {
        System.out.println("Static block executed - class is being loaded");
        school = "Java Learning Academy";
    }
    
    public static void main(String[] args) {
        // Accessing static variable and method without creating object
        System.out.println("School: " + StaticKeyword.school);
        StaticKeyword.displayTotal();
        
        // Creating objects
        StaticKeyword obj1 = new StaticKeyword("Alice");
        StaticKeyword obj2 = new StaticKeyword("Bob");
        StaticKeyword obj3 = new StaticKeyword("Charlie");
        
        System.out.println("\nAfter creating objects:");
        StaticKeyword.displayTotal();
        
        // All objects share the same static variable
        System.out.println("\nAccessing static variable through objects:");
        System.out.println("obj1.school: " + obj1.school);
        System.out.println("obj2.school: " + obj2.school);
        
        // Changing static variable affects all objects
        StaticKeyword.school = "Advanced Java Academy";
        System.out.println("\nAfter changing school:");
        obj1.displayInfo();
        obj2.displayInfo();
    }
}

