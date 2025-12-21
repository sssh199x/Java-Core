package datatypes.casting;

/**
 * Learning about Widening Casting (Automatic Type Conversion)
 * Converting a smaller type to a larger type - done automatically by Java.
 */
public class WideningCasting {
    public static void main(String[] args) {
        System.out.println("=== Widening Casting (Automatic) ===\n");
        
        // byte to short
        byte byteValue = 100;
        short shortValue = byteValue; // Automatic conversion
        System.out.println("byte -> short: " + byteValue + " -> " + shortValue);
        
        // short to int
        int intValue = shortValue; // Automatic conversion
        System.out.println("short -> int: " + shortValue + " -> " + intValue);
        
        // int to long
        long longValue = intValue; // Automatic conversion
        System.out.println("int -> long: " + intValue + " -> " + longValue);
        
        // int to float
        float floatValue = intValue; // Automatic conversion
        System.out.println("int -> float: " + intValue + " -> " + floatValue);
        
        // float to double
        double doubleValue = floatValue; // Automatic conversion
        System.out.println("float -> double: " + floatValue + " -> " + doubleValue);
        
        // char to int
        char charValue = 'A';
        int charToInt = charValue; // Automatic conversion (ASCII value)
        System.out.println("\nchar -> int: '" + charValue + "' -> " + charToInt);
        
        // Complete chain: byte -> short -> int -> long -> float -> double
        System.out.println("\n--- Complete Chain ---");
        byte b = 50;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("byte(" + b + ") -> short -> int -> long -> float -> double(" + d + ")");
    }
}

