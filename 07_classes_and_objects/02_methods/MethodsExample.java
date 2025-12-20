package classes_and_objects.methods;

/**
 * Learning about Methods in Java
 * Methods define the behavior of a class.
 */
public class MethodsExample {
    // Instance method - requires an object to call
    public void instanceMethod() {
        System.out.println("This is an instance method");
    }
    
    // Static method - can be called without creating an object
    public static void staticMethod() {
        System.out.println("This is a static method");
    }
    
    // Method with parameters
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    // Method with return value
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method with multiple parameters
    public void displayInfo(String name, int age, String city) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
    
    public static void main(String[] args) {
        // Calling static method - no object needed
        staticMethod();
        
        // Creating object to call instance methods
        MethodsExample obj = new MethodsExample();
        obj.instanceMethod();
        obj.greet("Alice");
        
        int result = obj.add(10, 20);
        System.out.println("Sum: " + result);
        
        obj.displayInfo("Bob", 25, "New York");
    }
}

