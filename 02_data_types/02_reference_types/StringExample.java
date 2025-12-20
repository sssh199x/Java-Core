package datatypes.reference;

/**
 * Learning about String Type in Java
 * String is a reference type (class) but often used like a primitive.
 */
public class StringExample {
    public static void main(String[] args) {
        // String declaration and initialization
        String greeting = "Hello, World!";
        String name = new String("Java");
        
        System.out.println("greeting: " + greeting);
        System.out.println("name: " + name);
        
        // String concatenation
        System.out.println("\n--- String Concatenation ---");
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);
        
        // String methods
        System.out.println("\n--- String Methods ---");
        String text = "Java Programming";
        System.out.println("Original: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Substring (0-4): " + text.substring(0, 4));
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Index of 'P': " + text.indexOf('P'));
        
        // String comparison
        System.out.println("\n--- String Comparison ---");
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println("str1 == str2: " + (str1 == str2)); // true (same reference)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (different references)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (same content)
        
        // String immutability
        System.out.println("\n--- String Immutability ---");
        String original = "Hello";
        String modified = original.concat(" World");
        System.out.println("Original: " + original); // Still "Hello"
        System.out.println("Modified: " + modified); // "Hello World"
    }
}

