package expressions_statements_blocks.methods.basic_methods;

/**
 * Implementing A Minutes-To-Years-And-Days Calculator For Advanced Time Conversions
 * 
 * This class demonstrates:
 * 1. Void method with formatted output
 * 2. Time unit conversions using arithmetic operations
 * 3. Using the remainder operator for calculations
 * 4. Input validation and error handling
 * 5. String formatting for output
 */
public class MinutesToYearsAndDaysCalculator {

    /**
     * Calculates and prints the years and days from the given minutes.
     * 
     * Conversion factors:
     * - 1 hour = 60 minutes
     * - 1 day = 24 hours = 1440 minutes
     * - 1 year = 365 days = 525600 minutes
     * 
     * @param minutes the number of minutes to convert (must be non-negative)
     * 
     * Examples:
     * printYearsAndDays(525600);  → prints "525600 min = 1 y and 0 d"
     * printYearsAndDays(1051200); → prints "1051200 min = 2 y and 0 d"
     * printYearsAndDays(561600);  → prints "561600 min = 1 y and 25 d"
     * printYearsAndDays(-1);      → prints "Invalid Value"
     */
    public static void printYearsAndDays(long minutes) {
        // Validate input: minutes must be non-negative
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        
        // Conversion constants
        // 1 year = 365 days = 365 * 24 * 60 = 525600 minutes
        final long MINUTES_PER_YEAR = 525600L;
        // 1 day = 24 hours = 24 * 60 = 1440 minutes
        final long MINUTES_PER_DAY = 1440L;
        
        // Calculate years: total minutes divided by minutes per year
        long years = minutes / MINUTES_PER_YEAR;
        
        // Calculate remaining minutes after extracting years
        // Use remainder operator to get leftover minutes
        long remainingMinutes = minutes % MINUTES_PER_YEAR;
        
        // Calculate days from remaining minutes
        long days = remainingMinutes / MINUTES_PER_DAY;
        
        // Print in format: "XX min = YY y and ZZ d"
        // Be careful about spaces - exactly one space before and after "=", 
        // one space before "y", one space before and after "and", one space before "d"
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}

