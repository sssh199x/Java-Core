package classes_and_objects.basic;

/**
 * Learning about Basic Classes
 * A class is a blueprint for creating objects.
 */
public class BasicClass {
    // Instance variables
    String name;
    int age;
    
    // Method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public static void main(String[] args) {
        // Creating an object (instance) of the class
        BasicClass person = new BasicClass();
        
        // Setting values
        person.name = "John";
        person.age = 25;
        
        // Calling method
        person.displayInfo();
    }
}

