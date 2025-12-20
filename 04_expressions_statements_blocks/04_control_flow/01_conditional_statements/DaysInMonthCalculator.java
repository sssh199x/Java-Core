package expressions_statements_blocks.control_flow.conditional_statements;

/**
 * Computing Month Length With Leap Year Consideration
 * 
 * This class demonstrates:
 * 1. Leap year calculation with range validation
 * 2. Days in month calculation using switch statement
 * 3. Combining multiple methods to solve a problem
 * 4. Input validation for both month and year
 * 5. Handling February's variable days based on leap year
 */
public class DaysInMonthCalculator {

    /**
     * Determines if a given year is a leap year.
     * 
     * Leap year rules:
     * - Year must be between 1 and 9999 (inclusive)
     * - A year is a leap year if:
     *   - It is divisible by 4 but not by 100, OR
     *   - It is divisible by 400
     * 
     * @param year the year to check (must be between 1 and 9999)
     * @return true if the year is a leap year, false otherwise
     * 
     * Examples:
     * isLeapYear(-1600); → returns false (not in range)
     * isLeapYear(1600); → returns true (divisible by 4, 100, and 400)
     * isLeapYear(2017); → returns false (not divisible by 4)
     * isLeapYear(2000); → returns true (divisible by 4, 100, and 400)
     */
    public static boolean isLeapYear(int year) {
        // Check if year is in valid range (1 to 9999)
        if (year < 1 || year > 9999) {
            return false;
        }
        
        // A leap year is:
        // - Divisible by 4 AND (NOT divisible by 100 OR divisible by 400)
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    /**
     * Returns the number of days in a given month and year.
     * 
     * Handles leap years for February (29 days in leap year, 28 otherwise).
     * Uses switch statement to determine days for each month.
     * 
     * @param month the month number (1-12, where 1=January, 12=December)
     * @param year the year (must be between 1 and 9999)
     * @return the number of days in the month, or -1 if parameters are invalid
     * 
     * Examples:
     * getDaysInMonth(1, 2020); → returns 31 (January has 31 days)
     * getDaysInMonth(2, 2020); → returns 29 (February in leap year)
     * getDaysInMonth(2, 2018); → returns 28 (February in non-leap year)
     * getDaysInMonth(-1, 2020); → returns -1 (invalid month)
     * getDaysInMonth(1, -2020); → returns -1 (invalid year)
     */
    public static int getDaysInMonth(int month, int year) {
        // Validate month: must be between 1 and 12
        if (month < 1 || month > 12) {
            return -1;
        }
        
        // Validate year: must be between 1 and 9999
        if (year < 1 || year > 9999) {
            return -1;
        }
        
        // Use switch statement to determine days in each month
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                // Months with 31 days: January, March, May, July, August, October, December
                return 31;
                
            case 4: case 6: case 9: case 11:
                // Months with 30 days: April, June, September, November
                return 30;
                
            case 2:
                // February: 29 days in leap year, 28 days otherwise
                // Check if year is a leap year using isLeapYear method
                if (isLeapYear(year)) {
                    return 29; // Leap year: February has 29 days
                } else {
                    return 28; // Non-leap year: February has 28 days
                }
                
            default:
                // This should never be reached due to validation above,
                // but included for completeness
                return -1;
        }
    }
}

