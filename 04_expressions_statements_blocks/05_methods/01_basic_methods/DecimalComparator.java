package expressions_statements_blocks.methods.basic_methods;

/**
 * Building A Decimal Comparator To Practice Floating-Point Comparisons In Java
 * 
 * This class demonstrates:
 * 1. Floating-point number comparison
 * 2. Type casting for precision control
 * 3. Working with decimal places
 * 4. Method with boolean return type
 * 
 * Strategy:
 * To compare two doubles up to three decimal places, we multiply each by 1000,
 * cast to int (truncates to 3 decimal places), and compare the integers.
 */
public class DecimalComparator {
    
    /**
     * Checks if two double numbers are equal up to three decimal places.
     * 
     * @param first the first double number to compare
     * @param second the second double number to compare
     * @return true if the numbers are equal up to three decimal places, false otherwise
     * 
     * Examples:
     * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → true (both are -3.175 up to 3 decimals)
     * areEqualByThreeDecimalPlaces(3.175, 3.176); → false (3.175 != 3.176)
     * areEqualByThreeDecimalPlaces(3.0, 3.0); → true (both are 3.000)
     * areEqualByThreeDecimalPlaces(-3.123, 3.123); → false (different signs)
     * 
     * How it works:
     * 1. Multiply each number by 1000 to shift decimal point 3 places right
     * 2. Cast to int (truncates, keeping only first 3 decimal places)
     * 3. Compare the two integers
     */
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        // Multiply by 1000 to shift decimal point 3 places to the right
        // Example: 3.1756 * 1000 = 3175.6
        int firstScaled = (int) (first * 1000);
        int secondScaled = (int) (second * 1000);
        
        // Casting to int truncates (removes decimal part)
        // Example: (int) 3175.6 = 3175 (keeps only first 3 decimal places)
        
        // Compare the scaled integers
        // If equal, the original numbers are equal up to 3 decimal places
        return firstScaled == secondScaled;
    }
}

