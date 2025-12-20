package expressions_statements_blocks.methods.basic_methods;

/**
 * Evaluating The Last Digit For Multiple Integer Comparisons
 * 
 * This class demonstrates:
 * 1. Helper methods for validation (isValid)
 * 2. Extracting last digit using modulo operator
 * 3. Comparing last digits of multiple numbers
 * 4. Range validation (10-1000 inclusive)
 * 5. Checking if at least two numbers share a common property
 */
public class LastDigitComparator {

    /**
     * Validates if a number is within the specified range.
     * 
     * @param number the number to validate
     * @return true if number is in range 10-1000 (inclusive), false otherwise
     * 
     * Examples:
     * isValid(10); → returns true (10 is within range)
     * isValid(468); → returns true (468 is within range)
     * isValid(1051); → returns false (1051 is not within range)
     * isValid(9); → returns false (9 is below range)
     */
    public static boolean isValid(int number) {
        // Check if number is in range 10 (inclusive) - 1000 (inclusive)
        return number >= 10 && number <= 1000;
    }

    /**
     * Checks if at least two of three numbers share the same rightmost (last) digit.
     * 
     * All three numbers must be in the range 10-1000 (inclusive).
     * If any number is out of range, returns false.
     * 
     * @param first the first number (must be 10-1000)
     * @param second the second number (must be 10-1000)
     * @param third the third number (must be 10-1000)
     * @return true if at least two numbers share the same last digit, false otherwise
     * 
     * Examples:
     * hasSameLastDigit(41, 22, 71); → returns true (41 and 71 both end in 1)
     * hasSameLastDigit(23, 32, 42); → returns true (32 and 42 both end in 2)
     * hasSameLastDigit(9, 99, 999); → returns false (9 is not in range 10-1000)
     * hasSameLastDigit(11, 22, 33); → returns false (all have different last digits)
     */
    public static boolean hasSameLastDigit(int first, int second, int third) {
        // Validate that all three numbers are within range 10-1000 (inclusive)
        // If one of the numbers is not within the range, return false
        if (!isValid(first) || !isValid(second) || !isValid(third)) {
            return false;
        }
        
        // Extract the last (rightmost) digit from each number using modulo operator
        // Last digit is the remainder when divided by 10
        int lastDigit1 = first % 10;
        int lastDigit2 = second % 10;
        int lastDigit3 = third % 10;
        
        // Check if at least two numbers share the same last digit
        // Compare all possible pairs:
        // - First and second
        // - First and third
        // - Second and third
        return (lastDigit1 == lastDigit2) ||
               (lastDigit1 == lastDigit3) ||
               (lastDigit2 == lastDigit3);
    }

    /**
     * Alternative implementation with explicit pair checking.
     * 
     * This version checks each pair explicitly for clarity.
     * 
     * @param first the first number (must be 10-1000)
     * @param second the second number (must be 10-1000)
     * @param third the third number (must be 10-1000)
     * @return true if at least two numbers share the same last digit, false otherwise
     */
    public static boolean hasSameLastDigitAlternative(int first, int second, int third) {
        // Validate all numbers
        if (!isValid(first) || !isValid(second) || !isValid(third)) {
            return false;
        }
        
        // Extract last digits
        int lastDigit1 = first % 10;
        int lastDigit2 = second % 10;
        int lastDigit3 = third % 10;
        
        // Check each pair explicitly
        // First and second share last digit
        if (lastDigit1 == lastDigit2) {
            return true;
        }
        
        // First and third share last digit
        if (lastDigit1 == lastDigit3) {
            return true;
        }
        
        // Second and third share last digit
        if (lastDigit2 == lastDigit3) {
            return true;
        }
        
        // No pair shares the same last digit
        return false;
    }
}

