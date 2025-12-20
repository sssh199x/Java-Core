package datatypes.primitive;

/**
 * Learning about Integer Types in Java
 * Demonstrates byte, short, int, and long data types.
 */
public class IntegerTypes {
    public static void main(String[] args) {
        // 1. byte: 8-bit signed integer (-128 to 127)
        byte byteValue = 100;
        System.out.println("byte value: " + byteValue);
        System.out.println("byte range: -128 to 127");
        
        // 2. short: 16-bit signed integer (-32,768 to 32,767)
        short shortValue = 10000;
        System.out.println("\nshort value: " + shortValue);
        System.out.println("short range: -32,768 to 32,767");
        
        // 3. int: 32-bit signed integer (most commonly used)
        int intValue = 100000;
        System.out.println("\nint value: " + intValue);
        System.out.println("int range: -2,147,483,648 to 2,147,483,647");
        
        // 4. long: 64-bit signed integer (use L suffix)
        long longValue = 100000L;
        System.out.println("\nlong value: " + longValue);
        System.out.println("long range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        
        // Operations with integer types
        System.out.println("\n--- Operations ---");
        int a = 10;
        int b = 20;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        
        // Type conversion (widening)
        byte smallByte = 50;
        int convertedInt = smallByte; // Automatic conversion
        System.out.println("\nbyte to int (automatic): " + convertedInt);
    }
}

