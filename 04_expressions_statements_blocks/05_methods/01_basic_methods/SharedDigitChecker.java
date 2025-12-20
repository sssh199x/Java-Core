package expressions_statements_blocks.methods.basic_methods;

/**
 * Checking For A Shared Digit Between Two Numbers
 * 
 * This class demonstrates:
 * 1. Range validation for input parameters
 * 2. Extracting digits from two-digit numbers
 * 3. Comparing digits between two numbers
 * 4. Returning boolean based on condition matching
 * 5. Handling edge cases and boundary values
 */
public class SharedDigitChecker {

    /**
     * Checks if two numbers share at least one common digit.
     * 
     * Both numbers must be in the range 10-99 (inclusive).
     * Extracts digits from each number and checks if any digit
     * appears in both numbers.
     * 
     * @param first the first number (must be 10-99)
     * @param second the second number (must be 10-99)
     * @return true if numbers share at least one digit, false otherwise
     * 
     * Examples:
     * hasSharedDigit(12, 23); → returns true (digit 2 appears in both)
     * hasSharedDigit(9, 99); → returns false (9 is not in range 10-99)
     * hasSharedDigit(15, 55); → returns true (digit 5 appears in both)
     * hasSharedDigit(12, 34); → returns false (no shared digits)
     */
    public static boolean hasSharedDigit(int first, int second) {
        // Validate that both numbers are within range 10-99 (inclusive)
        // If one of the numbers is not within the range, return false
        if (first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        }
        
        // Extract digits from first number
        // For two-digit numbers:
        // - First digit: divide by 10
        // - Second digit: modulo 10
        int firstDigit1 = first / 10;
        int firstDigit2 = first % 10;
        
        // Extract digits from second number
        int secondDigit1 = second / 10;
        int secondDigit2 = second % 10;
        
        // Check if any digit from first number matches any digit from second number
        // Compare all possible combinations:
        // - First digit of first number with both digits of second number
        // - Second digit of first number with both digits of second number
        return (firstDigit1 == secondDigit1) ||
               (firstDigit1 == secondDigit2) ||
               (firstDigit2 == secondDigit1) ||
               (firstDigit2 == secondDigit2);
    }

    /**
     * Alternative implementation using a more structured approach.
     * 
     * This version uses nested loops to compare digits, which is more
     * scalable but less efficient for two-digit numbers.
     * 
     * @param first the first number (must be 10-99)
     * @param second the second number (must be 10-99)
     * @return true if numbers share at least one digit, false otherwise
     */
    public static boolean hasSharedDigitAlternative(int first, int second) {
        // Validate range
        if (first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        }
        
        // Extract digits from first number
        int firstDigit1 = first / 10;
        int firstDigit2 = first % 10;
        
        // Extract digits from second number
        int secondDigit1 = second / 10;
        int secondDigit2 = second % 10;
        
        // Check each digit of first number against all digits of second number
        // Check first digit of first number
        if (firstDigit1 == secondDigit1 || firstDigit1 == secondDigit2) {
            return true;
        }
        
        // Check second digit of first number
        if (firstDigit2 == secondDigit1 || firstDigit2 == secondDigit2) {
            return true;
        }
        
        // No shared digits found
        return false;
    }
}

