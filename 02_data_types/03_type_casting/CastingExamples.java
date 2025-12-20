package datatypes.casting;

/**
 * Practical Examples of Type Casting
 * Demonstrates real-world scenarios where casting is used.
 */
public class CastingExamples {
    public static void main(String[] args) {
        System.out.println("=== Practical Casting Examples ===\n");
        
        // Example 1: Calculating average (int to double)
        System.out.println("--- Example 1: Calculating Average ---");
        int sum = 95;
        int count = 3;
        double average = (double) sum / count; // Cast to get decimal result
        System.out.println("Sum: " + sum + ", Count: " + count);
        System.out.println("Average (without casting): " + (sum / count));
        System.out.println("Average (with casting): " + average);
        
        // Example 2: Percentage calculation
        System.out.println("\n--- Example 2: Percentage Calculation ---");
        int obtained = 75;
        int total = 100;
        double percentage = ((double) obtained / total) * 100;
        System.out.println("Obtained: " + obtained + "/" + total);
        System.out.println("Percentage: " + percentage + "%");
        
        // Example 3: Character to integer conversion
        System.out.println("\n--- Example 3: Character Operations ---");
        char digit = '5';
        int numericValue = digit - '0'; // Convert char digit to int
        System.out.println("Char '5' to int: " + numericValue);
        
        char letter = 'A';
        int asciiValue = (int) letter;
        System.out.println("Char 'A' ASCII value: " + asciiValue);
        
        // Example 4: Rounding using casting
        System.out.println("\n--- Example 4: Rounding ---");
        double preciseValue = 3.14159;
        int roundedValue = (int) (preciseValue + 0.5); // Round to nearest integer
        System.out.println("Original: " + preciseValue);
        System.out.println("Rounded: " + roundedValue);
        
        // Example 5: Safe conversion with range checking
        System.out.println("\n--- Example 5: Safe Conversion ---");
        int safeInt = 100;
        if (safeInt >= Byte.MIN_VALUE && safeInt <= Byte.MAX_VALUE) {
            byte safeByte = (byte) safeInt;
            System.out.println("Safe conversion: " + safeInt + " -> " + safeByte);
        } else {
            System.out.println("Cannot safely convert " + safeInt + " to byte");
        }
    }
}

