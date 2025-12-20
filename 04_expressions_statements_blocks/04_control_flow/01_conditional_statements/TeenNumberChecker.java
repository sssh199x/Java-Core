package expressions_statements_blocks.control_flow.conditional_statements;

/**
 * Devising A Teen Number Checker For Mastery Of Conditional Range Checking
 * 
 * We'll say that a number is "teen" if it is in the range 13 - 19 (inclusive).
 * 
 * This class demonstrates:
 * 1. Range checking with conditional statements
 * 2. Multiple parameter validation
 * 3. Logical OR operations
 * 4. Method with boolean return type
 * 5. Reusable helper methods
 */
public class TeenNumberChecker {
    
    /**
     * Checks if at least one of the three parameters is in the teen range (13-19 inclusive).
     * 
     * @param first the first integer to check
     * @param second the second integer to check
     * @param third the third integer to check
     * @return true if at least one parameter is in range 13-19 (inclusive), false otherwise
     * 
     * Examples:
     * hasTeen(9, 99, 19); → should return true since 19 is in range 13 - 19
     * hasTeen(23, 15, 42); → should return true since 15 is in range 13 - 19
     * hasTeen(22, 23, 34); → should return false since numbers 22, 23, 34 are not in range 13-19
     */
    public static boolean hasTeen(int first, int second, int third) {
        // Check if at least one of the three parameters is in range 13-19 (inclusive)
        // Use logical OR (||) to check if any parameter is a teen
        return isTeen(first) || isTeen(second) || isTeen(third);
    }
    
    /**
     * Checks if a single number is in the teen range (13-19 inclusive).
     * 
     * @param number the integer to check
     * @return true if the parameter is in range 13-19 (inclusive), false otherwise
     * 
     * Examples:
     * isTeen(9); → should return false since 9 is not in range 13 - 19
     * isTeen(13); → should return true since 13 is in range 13 - 19
     */
    public static boolean isTeen(int number) {
        // Check if number is in range 13-19 (inclusive)
        // A number is a teen if: number >= 13 AND number <= 19
        return number >= 13 && number <= 19;
    }
}

