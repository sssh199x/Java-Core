package expressions_statements_blocks.methods.basic_methods;

/**
 * Confirming Perfect Numbers Through Sum Of Proper Divisors
 * 
 * This class demonstrates:
 * 1. Finding proper divisors of a number
 * 2. Summing divisors to check for perfect numbers
 * 3. Using loops and modulo operator for divisibility checks
 * 4. Input validation for edge cases
 * 
 * A perfect number is a positive integer which is equal to the sum of its
 * proper positive divisors. Proper positive divisors are positive integers
 * that fully divide the perfect number without leaving a remainder and
 * exclude the perfect number itself.
 * 
 * Example: 6 is perfect because its proper divisors are 1, 2, 3 and 1+2+3=6
 */
public class PerfectNumberChecker {

    /**
     * Checks if a number is a perfect number.
     * 
     * A perfect number equals the sum of its proper divisors (excluding itself).
     * The method finds all proper divisors, sums them, and compares with the number.
     * 
     * @param number the number to check (must be >= 1)
     * @return true if the number is perfect, false otherwise
     * 
     * Examples:
     * isPerfectNumber(6); → returns true (proper divisors: 1, 2, 3, sum = 6)
     * isPerfectNumber(28); → returns true (proper divisors: 1, 2, 4, 7, 14, sum = 28)
     * isPerfectNumber(5); → returns false (proper divisors: 1, sum = 1, not 5)
     * isPerfectNumber(-1); → returns false (number < 1)
     */
    public static boolean isPerfectNumber(int number) {
        // If number is < 1, return false
        if (number < 1) {
            return false;
        }
        
        // Initialize sum accumulator for proper divisors
        int sum = 0;
        
        // Use for loop to find all proper divisors
        // Proper divisors are from 1 to number-1 (excluding the number itself)
        for (int i = 1; i < number; i++) {
            // Check if i is a proper divisor using remainder operator
            // If number % i == 0, then i divides number evenly
            if (number % i == 0) {
                // Add the proper divisor to the sum
                sum += i;
            }
        }
        
        // A perfect number equals the sum of its proper divisors
        // Return true if sum equals the number, false otherwise
        return sum == number;
    }

    /**
     * Alternative implementation with early optimization.
     * 
     * This version only checks divisors up to number/2 since no divisor
     * can be greater than half of the number (except the number itself,
     * which we exclude).
     * 
     * @param number the number to check (must be >= 1)
     * @return true if the number is perfect, false otherwise
     */
    public static boolean isPerfectNumberOptimized(int number) {
        // Validate input
        if (number < 1) {
            return false;
        }
        
        int sum = 0;
        
        // Only check up to number/2 (optimization)
        // No proper divisor can be greater than number/2
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum == number;
    }
}

