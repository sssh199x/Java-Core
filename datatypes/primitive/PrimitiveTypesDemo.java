package datatypes.primitive;

/**
 * Complete demonstration of all primitive data types
 * Shows default values and basic usage of each type.
 */
public class PrimitiveTypesDemo {
    public static void main(String[] args) {
        System.out.println("=== Primitive Data Types in Java ===\n");
        
        // Integer types
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        
        System.out.println("Integer Types:");
        System.out.println("  byte:   " + byteVar + " (8 bits)");
        System.out.println("  short:  " + shortVar + " (16 bits)");
        System.out.println("  int:    " + intVar + " (32 bits)");
        System.out.println("  long:   " + longVar + " (64 bits)");
        
        // Floating point types
        float floatVar = 3.14159f;
        double doubleVar = 3.141592653589793;
        
        System.out.println("\nFloating Point Types:");
        System.out.println("  float:  " + floatVar + " (32 bits)");
        System.out.println("  double: " + doubleVar + " (64 bits)");
        
        // Boolean
        boolean boolVar = true;
        System.out.println("\nBoolean Type:");
        System.out.println("  boolean: " + boolVar + " (1 bit)");
        
        // Character
        char charVar = 'J';
        System.out.println("\nCharacter Type:");
        System.out.println("  char: " + charVar + " (16 bits, Unicode)");
        
        // Default values (for instance variables)
        System.out.println("\n=== Default Values ===");
        System.out.println("Note: Default values shown here apply to instance variables.");
        System.out.println("Local variables must be initialized before use.");
    }
}

