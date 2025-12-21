package datatypes.primitive;

/**
 * Learning about Floating Point Types in Java
 * Demonstrates float and double data types.
 */
public class FloatingPointTypes {
    public static void main(String[] args) {
        // 1. float: 32-bit floating point (use f suffix)
        float floatValue = 234.5f;
        System.out.println("float value: " + floatValue);
        System.out.println("float precision: 6-7 decimal digits");
        
        // 2. double: 64-bit floating point (default for decimals)
        double doubleValue = 123.456789;
        System.out.println("\ndouble value: " + doubleValue);
        System.out.println("double precision: 15-16 decimal digits");
        
        // Operations with floating point types
        System.out.println("\n--- Operations ---");
        double x = 10.5;
        double y = 3.2;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        
        // Precision demonstration
        System.out.println("\n--- Precision Example ---");
        float f1 = 0.1f;
        float f2 = 0.2f;
        System.out.println("float: 0.1 + 0.2 = " + (f1 + f2));
        
        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println("double: 0.1 + 0.2 = " + (d1 + d2));
        
        // Scientific notation
        double scientific = 1.5e3; // 1.5 * 10^3 = 1500
        System.out.println("\nScientific notation: 1.5e3 = " + scientific);
    }
}

