package constructors.constructor_chaining;

/**
 * Learning about Constructor Chaining
 * Constructor chaining is calling one constructor from another using 'this' keyword.
 */
public class ConstructorChaining {
    String name;
    int age;
    String city;
    
    // Constructor 1: No parameters
    public ConstructorChaining() {
        this("Unknown", 0, "Unknown");
        System.out.println("Constructor 1: No parameters");
    }
    
    // Constructor 2: One parameter
    public ConstructorChaining(String name) {
        this(name, 0, "Unknown");
        System.out.println("Constructor 2: One parameter");
    }
    
    // Constructor 3: Two parameters
    public ConstructorChaining(String name, int age) {
        this(name, age, "Unknown");
        System.out.println("Constructor 3: Two parameters");
    }
    
    // Constructor 4: Three parameters (main constructor)
    public ConstructorChaining(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        System.out.println("Constructor 4: Three parameters (main constructor)");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }
    
    public static void main(String[] args) {
        System.out.println("Creating object with no parameters:");
        ConstructorChaining obj1 = new ConstructorChaining();
        obj1.displayInfo();
        
        System.out.println("\nCreating object with one parameter:");
        ConstructorChaining obj2 = new ConstructorChaining("Alice");
        obj2.displayInfo();
        
        System.out.println("\nCreating object with two parameters:");
        ConstructorChaining obj3 = new ConstructorChaining("Bob", 25);
        obj3.displayInfo();
        
        System.out.println("\nCreating object with three parameters:");
        ConstructorChaining obj4 = new ConstructorChaining("Charlie", 30, "New York");
        obj4.displayInfo();
    }
}

