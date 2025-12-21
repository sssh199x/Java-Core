package datatypes.exercises;

/**
 * Simple Data Type Examples
 * Working code examples demonstrating different data type operations.
 */
public class SimpleDataTypeExamples {
    
    public static void main(String[] args) {
        // Example 1: All primitive types
        System.out.println("=== Example 1: All Primitive Types ===");
        byte b = 50;
        short s = 1000;
        int i = 100000;
        long l = 1000000L;
        float f = 3.14f;
        double d = 3.14159;
        boolean bool = true;
        char c = 'A';
        
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + bool);
        System.out.println("char: " + c);
        
        // Example 2: Arithmetic operations
        System.out.println("\n=== Example 2: Arithmetic Operations ===");
        int a = 10;
        int b2 = 3;
        System.out.println("a = " + a + ", b = " + b2);
        System.out.println("Sum: " + (a + b2));
        System.out.println("Difference: " + (a - b2));
        System.out.println("Product: " + (a * b2));
        System.out.println("Quotient: " + (a / b2));
        System.out.println("Remainder: " + (a % b2));
        
        // Example 3: Type conversion
        System.out.println("\n=== Example 3: Type Conversion ===");
        int intValue = 100;
        double doubleValue = intValue;  // Automatic conversion
        System.out.println("int: " + intValue + " -> double: " + doubleValue);
        
        double price = 99.99;
        int priceInt = (int) price;  // Explicit casting
        System.out.println("double: " + price + " -> int: " + priceInt);
        
        // Example 4: String operations
        System.out.println("\n=== Example 4: String Operations ===");
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);
        System.out.println("Length: " + fullName.length());
        System.out.println("Uppercase: " + fullName.toUpperCase());
        
        // Example 5: Boolean and comparison
        System.out.println("\n=== Example 5: Boolean Logic ===");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 == num2: " + (num1 == num2));
        
        // Example 6: Character operations
        System.out.println("\n=== Example 6: Character Operations ===");
        char letter = 'A';
        int ascii = (int) letter;
        char nextLetter = (char) (letter + 1);
        System.out.println("Letter: " + letter);
        System.out.println("ASCII value: " + ascii);
        System.out.println("Next letter: " + nextLetter);
        
        // Example 7: Calculate circle area
        System.out.println("\n=== Example 7: Circle Area ===");
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        
        // Example 8: Temperature conversion
        System.out.println("\n=== Example 8: Temperature Conversion ===");
        double celsius = 25.0;
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}

