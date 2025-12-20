package constructors.exercises;

/**
 * Simple Constructor Examples
 * Working code examples demonstrating different types of constructors.
 */
public class SimpleConstructorExamples {
    
    // Example 1: Book class with default and parameterized constructors
    static class Book {
        String title;
        String author;
        int pages;
        
        // Default constructor
        Book() {
            this.title = "Unknown";
            this.author = "Unknown";
            this.pages = 0;
        }
        
        // Parameterized constructor
        Book(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }
        
        void displayInfo() {
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
        }
    }
    
    // Example 2: Rectangle class with constructor chaining
    static class Rectangle {
        int width;
        int height;
        
        // Default constructor (chains to parameterized)
        Rectangle() {
            this(1, 1);  // Constructor chaining
        }
        
        // Parameterized constructor
        Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
        
        int getArea() {
            return width * height;
        }
        
        void displayInfo() {
            System.out.println("Width: " + width + ", Height: " + height + ", Area: " + getArea());
        }
    }
    
    // Example 3: Person class with multiple constructors
    static class Person {
        String name;
        int age;
        String city;
        
        // Constructor 1: No parameters
        Person() {
            this("Unknown", 0, "Unknown");
        }
        
        // Constructor 2: Name only
        Person(String name) {
            this(name, 0, "Unknown");
        }
        
        // Constructor 3: Name and age
        Person(String name, int age) {
            this(name, age, "Unknown");
        }
        
        // Constructor 4: All parameters (main constructor)
        Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }
        
        void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
        }
    }
    
    public static void main(String[] args) {
        // Example 1: Book
        System.out.println("=== Example 1: Book Class ===");
        Book book1 = new Book();  // Default constructor
        book1.displayInfo();
        
        Book book2 = new Book("Java Programming", "John Doe", 500);  // Parameterized
        book2.displayInfo();
        
        // Example 2: Rectangle
        System.out.println("\n=== Example 2: Rectangle Class ===");
        Rectangle rect1 = new Rectangle();  // Default (1x1)
        rect1.displayInfo();
        
        Rectangle rect2 = new Rectangle(5, 10);  // Parameterized
        rect2.displayInfo();
        
        // Example 3: Person
        System.out.println("\n=== Example 3: Person Class ===");
        Person p1 = new Person();  // No parameters
        p1.displayInfo();
        
        Person p2 = new Person("Alice");  // Name only
        p2.displayInfo();
        
        Person p3 = new Person("Bob", 25);  // Name and age
        p3.displayInfo();
        
        Person p4 = new Person("Charlie", 30, "New York");  // All parameters
        p4.displayInfo();
    }
}

