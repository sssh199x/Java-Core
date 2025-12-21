package expressions_statements_blocks.control_flow.conditional_statements;

/**
 * Implementing A Precise Leap Year Calculator To Enhance Conditional Reasoning
 * 
 * This class demonstrates:
 * 1. Complex conditional logic with multiple conditions
 * 2. Input validation and range checking
 * 3. Divisibility checks using modulo operator
 * 4. Nested if-else statements
 * 
 * Leap Year Rules:
 * 1. Year must be between 1 and 9999 (inclusive)
 * 2. A year is a leap year if:
 *    - It's divisible by 4 AND
 *    - (It's NOT divisible by 100 OR it IS divisible by 400)
 * 
 * Simplified:
 * - Divisible by 4? 
 *   - Yes: Divisible by 100?
 *     - Yes: Must be divisible by 400 to be leap year
 *     - No: It's a leap year
 *   - No: Not a leap year
 */
public class LeapYearCalculator {
    
    /**
     * Determines if a given year is a leap year.
     * 
     * @param year the year to check (must be between 1 and 9999)
     * @return true if the year is a leap year, false otherwise
     * 
     * Examples:
     * isLeapYear(-1600); → should return false (not in range)
     * isLeapYear(1600); → should return true (divisible by 4, 100, and 400)
     * isLeapYear(2017); → should return false (not divisible by 4)
     * isLeapYear(2000); → should return true (divisible by 4, 100, and 400)
     */
    public static boolean isLeapYear(int year) {
        // Step 1: Check if year is in valid range (1 to 9999)
        // If the parameter is not in that range return false
        if (year < 1 || year > 9999) {
            return false;
        }
        
        // Step 2: Check if year is evenly divisible by 4
        // If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
        if (year % 4 == 0) {
            // Step 3: Check if year is evenly divisible by 100
            // If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
            if (year % 100 == 0) {
                // Step 4: Check if year is evenly divisible by 400
                // If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
                if (year % 400 == 0) {
                    // Step 4: The year is a leap year (it has 366 days)
                    return true;
                } else {
                    // Step 5: The year is not a leap year (it has 365 days)
                    return false;
                }
            } else {
                // Step 4: The year is a leap year (divisible by 4 but not by 100)
                return true;
            }
        } else {
            // Step 5: The year is not a leap year (not divisible by 4)
            return false;
        }
    }
    
    /**
     * Alternative implementation using simplified logic.
     * A leap year is divisible by 4 but not 100, OR divisible by 400.
     * 
     * @param year the year to check (must be between 1 and 9999)
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isLeapYearAlternative(int year) {
        // Check if year is in valid range
        if (year < 1 || year > 9999) {
            return false;
        }
        
        // A leap year is:
        // - Divisible by 4 AND (NOT divisible by 100 OR divisible by 400)
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}

