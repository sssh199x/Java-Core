package variables.instance;

/**
 * Learning about Instance Variables
 * Instance variables are declared in a class, outside any method.
 * Each object has its own copy of instance variables.
 */
public class InstanceVariables {
    // Instance variables
    String name;
    int age;
    double salary;
    
    public InstanceVariables(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
    
    public static void main(String[] args) {
        // Each object has its own copy of instance variables
        InstanceVariables person1 = new InstanceVariables("Alice", 25, 50000.0);
        InstanceVariables person2 = new InstanceVariables("Bob", 30, 60000.0);
        
        System.out.println("Person 1:");
        person1.displayInfo();
        
        System.out.println("\nPerson 2:");
        person2.displayInfo();
        
        // Modifying instance variable
        person1.salary = 55000.0;
        System.out.println("\nAfter modifying person1's salary:");
        person1.displayInfo();
        person2.displayInfo(); // person2's salary remains unchanged
    }
}

