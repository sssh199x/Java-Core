package variables.exercises;

/**
 * Simple Variable Examples
 * Working code examples demonstrating different types of variables.
 */
public class SimpleVariableExamples {
    // Instance variable
    String instanceName = "Instance Variable";
    
    // Static variable
    static int staticCount = 0;
    
    public SimpleVariableExamples() {
        staticCount++;  // Increment static variable
    }
    
    public static void main(String[] args) {
        // Example 1: Local variables
        System.out.println("=== Example 1: Local Variables ===");
        String name = "John";
        int age = 25;
        String city = "New York";
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        
        // Example 2: Instance variables
        System.out.println("\n=== Example 2: Instance Variables ===");
        SimpleVariableExamples obj1 = new SimpleVariableExamples();
        SimpleVariableExamples obj2 = new SimpleVariableExamples();
        
        System.out.println("obj1.instanceName: " + obj1.instanceName);
        System.out.println("obj2.instanceName: " + obj2.instanceName);
        
        obj1.instanceName = "Modified";
        System.out.println("\nAfter modifying obj1:");
        System.out.println("obj1.instanceName: " + obj1.instanceName);
        System.out.println("obj2.instanceName: " + obj2.instanceName);  // Unchanged
        
        // Example 3: Static variables
        System.out.println("\n=== Example 3: Static Variables ===");
        System.out.println("Initial staticCount: " + SimpleVariableExamples.staticCount);
        
        SimpleVariableExamples obj3 = new SimpleVariableExamples();
        SimpleVariableExamples obj4 = new SimpleVariableExamples();
        
        System.out.println("After creating objects:");
        System.out.println("staticCount: " + SimpleVariableExamples.staticCount);
        System.out.println("obj3.staticCount: " + obj3.staticCount);
        System.out.println("obj4.staticCount: " + obj4.staticCount);  // All share same value
        
        // Example 4: Variable scope
        System.out.println("\n=== Example 4: Variable Scope ===");
        int outerVar = 100;
        System.out.println("outerVar: " + outerVar);
        
        {
            int innerVar = 200;
            System.out.println("innerVar (inside block): " + innerVar);
            System.out.println("outerVar (inside block): " + outerVar);  // Can access outer
        }
        // System.out.println(innerVar);  // Error: innerVar is out of scope
        System.out.println("outerVar (outside block): " + outerVar);
    }
}

