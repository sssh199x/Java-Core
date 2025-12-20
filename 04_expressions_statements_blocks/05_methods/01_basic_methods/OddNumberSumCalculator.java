package expressions_statements_blocks.methods.basic_methods;

/**
 * Summing Odd Numbers In A Specified Range
 * 
 * This class demonstrates:
 * 1. Helper methods (isOdd) used by main method (sumOdd)
 * 2. Input validation and range checking
 * 3. Using for loops to iterate through a range
 * 4. Using remainder operator to check for odd numbers
 * 5. Accumulating sum in a loop
 */
public class OddNumberSumCalculator {

    /**
     * Checks if a number is odd and positive.
     * 
     * @param number the number to check
     * @return true if number is positive and odd, false otherwise
     * 
     * Examples:
     * isOdd(1); → returns true (1 is positive and odd)
     * isOdd(2); → returns false (2 is even)
     * isOdd(-1); → returns false (negative number)
     * isOdd(0); → returns false (not > 0)
     */
    public static boolean isOdd(int number) {
        // Check that number is > 0, if not return false
        if (number <= 0) {
            return false;
        }
        
        // Use remainder operator to check if number is odd
        // Odd numbers have remainder 1 when divided by 2
        return (number % 2 != 0);
    }

    /**
     * Sums all odd numbers in a specified range (inclusive).
     * 
     * Uses a for loop to iterate through the range and calls isOdd()
     * to check if each number is odd before adding it to the sum.
     * 
     * @param start the starting number of the range (must be > 0)
     * @param end the ending number of the range (must be >= start and > 0)
     * @return the sum of all odd numbers in the range, or -1 if input is invalid
     * 
     * Examples:
     * sumOdd(1, 100); → returns 2500
     * sumOdd(-1, 100); → returns -1 (start is invalid)
     * sumOdd(100, 100); → returns 0 (100 is even, so no odd numbers)
     * sumOdd(13, 13); → returns 13 (13 is odd)
     * sumOdd(100, -100); → returns -1 (end is invalid)
     * sumOdd(100, 1000); → returns 247500
     */
    public static int sumOdd(int start, int end) {
        // Validate input parameters
        // Both start and end must be greater than 0
        if (start <= 0 || end <= 0) {
            return -1; // Invalid input indicator
        }
        
        // End must be greater than or equal to start
        if (end < start) {
            return -1; // Invalid input indicator
        }
        
        // Initialize sum accumulator
        int sum = 0;
        
        // Use for loop to iterate through the range (inclusive)
        // Loop from start to end (inclusive)
        for (int i = start; i <= end; i++) {
            // Check if current number is odd using isOdd helper method
            if (isOdd(i)) {
                // Add odd number to sum
                sum += i;
            }
        }
        
        return sum;
    }
}

