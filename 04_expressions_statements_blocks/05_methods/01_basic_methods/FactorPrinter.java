package expressions_statements_blocks.methods.basic_methods;

/**
 * Listing All Factors Of A Given Number
 * 
 * This class demonstrates:
 * 1. Finding factors of a number using loops
 * 2. Using modulo operator to check divisibility
 * 3. Input validation for edge cases
 * 4. Void methods with formatted output
 * 5. Iterating through possible divisors
 * 
 * A factor of a number is an integer which divides that number wholly
 * (i.e. without leaving a remainder). For example, 3 is a factor of 6
 * because 6 / 3 = 2 with no remainder.
 */
public class FactorPrinter {

    /**
     * Prints all factors of a given number.
     * 
     * A factor is a number that divides the given number without leaving
     * a remainder. The method iterates from 1 to the number and checks
     * if each value divides the number evenly.
     * 
     * @param number the number to find factors for (must be >= 1)
     * 
     * Examples:
     * printFactors(6); → prints: 1 2 3 6 (or each on separate line)
     * printFactors(32); → prints: 1 2 4 8 16 32
     * printFactors(10); → prints: 1 2 5 10
     * printFactors(-1); → prints: "Invalid Value"
     */
    public static void printFactors(int number) {
        // If number is < 1, print "Invalid Value"
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        
        // Use for loop to iterate from 1 to number
        // Check each value to see if it's a factor
        for (int i = 1; i <= number; i++) {
            // Check if i is a factor of number
            // A factor divides the number without leaving a remainder
            // Use modulo operator: if number % i == 0, then i is a factor
            if (number % i == 0) {
                // Print the factor (each on its own line)
                System.out.println(i);
            }
        }
    }

    /**
     * Alternative implementation that prints factors on one line separated by spaces.
     * 
     * This version prints all factors on a single line with spaces between them.
     * 
     * @param number the number to find factors for (must be >= 1)
     */
    public static void printFactorsInline(int number) {
        // Validate input
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        
        // Print factors separated by spaces
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i);
                // Add space after each factor (except possibly the last)
                // For simplicity, add space after all factors
                if (i < number) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println(); // New line after printing all factors
    }

    /**
     * Optimized version that only checks up to square root of number.
     * 
     * This is more efficient for large numbers, but prints factors in
     * a different order. For educational purposes, the basic version
     * is preferred for clarity.
     * 
     * @param number the number to find factors for (must be >= 1)
     */
    public static void printFactorsOptimized(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        
        // Print factors from 1 to sqrt(number)
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                // If i is not the square root, also print the corresponding factor
                if (i != number / i) {
                    System.out.println(number / i);
                }
            }
        }
    }
}

