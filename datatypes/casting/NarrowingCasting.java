package datatypes.casting;

/**
 * Learning about Narrowing Casting (Explicit Type Conversion)
 * Converting a larger type to a smaller type - requires explicit casting.
 */
public class NarrowingCasting {
    public static void main(String[] args) {
        System.out.println("=== Narrowing Casting (Manual/Explicit) ===\n");
        
        // double to float
        double doubleValue = 9.78;
        float floatValue = (float) doubleValue; // Explicit casting required
        System.out.println("double -> float: " + doubleValue + " -> " + floatValue);
        
        // float to long
        long longValue = (long) floatValue; // Explicit casting required
        System.out.println("float -> long: " + floatValue + " -> " + longValue);
        
        // long to int
        int intValue = (int) longValue; // Explicit casting required
        System.out.println("long -> int: " + longValue + " -> " + intValue);
        
        // int to short
        short shortValue = (short) intValue; // Explicit casting required
        System.out.println("int -> short: " + intValue + " -> " + shortValue);
        
        // short to byte
        byte byteValue = (byte) shortValue; // Explicit casting required
        System.out.println("short -> byte: " + shortValue + " -> " + byteValue);
        
        // double to int (loses decimal part)
        double price = 99.99;
        int priceInt = (int) price; // Truncates decimal part
        System.out.println("\ndouble -> int: " + price + " -> " + priceInt);
        
        // int to char
        int asciiValue = 65;
        char charValue = (char) asciiValue; // Explicit casting
        System.out.println("int -> char: " + asciiValue + " -> '" + charValue + "'");
        
        // Potential data loss warning
        System.out.println("\n--- Warning: Data Loss ---");
        long bigNumber = 2147483648L; // Larger than int max value
        int smallNumber = (int) bigNumber; // Data loss occurs!
        System.out.println("long: " + bigNumber);
        System.out.println("int (after casting): " + smallNumber);
        System.out.println("Note: Data loss occurred because long value exceeds int range!");
    }
}

