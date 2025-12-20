package constructors.parameterized;

/**
 * Demo class to demonstrate constructors
 * Shows how to create objects using different constructors.
 */
public class ConstructorDemo {
    public static void main(String[] args) {
        Human human1 = new Human("John", 25);
        System.out.println(human1);

        Human human2 = new Human("Doe", 30);
        System.out.println(human2);

        Human human3 = new Human(); // default constructor
        System.out.println(human3);

        // Demonstrating static variable behavior
        Human.setType("Homo sapiens");
        System.out.println("After changing type:");
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }
}
