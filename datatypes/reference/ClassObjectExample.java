package datatypes.reference;

/**
 * Learning about Class Objects as Reference Types
 * Demonstrates how objects are reference types.
 */
public class ClassObjectExample {
    // Inner class for demonstration
    static class Person {
        String name;
        int age;
        
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
    
    public static void main(String[] args) {
        // Creating objects (reference types)
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        
        System.out.println("--- Object Creation ---");
        person1.displayInfo();
        person2.displayInfo();
        
        // Reference assignment
        System.out.println("\n--- Reference Assignment ---");
        Person person3 = person1; // person3 references the same object as person1
        
        System.out.println("Before modification:");
        person1.displayInfo();
        person3.displayInfo();
        
        person3.name = "Charlie"; // Modifying through person3
        System.out.println("\nAfter modifying person3.name = 'Charlie':");
        person1.displayInfo(); // person1 also changed!
        person3.displayInfo();
        
        // Null reference
        System.out.println("\n--- Null Reference ---");
        Person person4 = null;
        System.out.println("person4 is null: " + (person4 == null));
        // person4.displayInfo(); // This would cause NullPointerException
    }
}

