package expressions_statements_blocks.control_flow.conditional_statements;

/**
 * Crafting An Equality Printer To Explore Multiple Conditional Checks In Java
 * 
 * This class demonstrates:
 * 1. Multiple conditional checks with if-else statements
 * 2. Input validation (checking for negative values)
 * 3. Comparing multiple values for equality
 * 4. Logical conditions for "all equal", "all different", and "neither"
 * 5. Void methods with formatted output
 */
public class EqualityPrinter {

    /**
     * Compares three integers and prints a message based on their equality.
     * 
     * The method checks:
     * - If any parameter is negative → prints "Invalid Value"
     * - If all numbers are equal → prints "All numbers are equal"
     * - If all numbers are different → prints "All numbers are different"
     * - Otherwise → prints "Neither all are equal or different"
     * 
     * @param first the first integer to compare
     * @param second the second integer to compare
     * @param third the third integer to compare
     * 
     * Examples:
     * printEqual(1, 1, 1); → prints "All numbers are equal"
     * printEqual(1, 1, 2); → prints "Neither all are equal or different"
     * printEqual(-1, -1, -1); → prints "Invalid Value"
     * printEqual(1, 2, 3); → prints "All numbers are different"
     */
    public static void printEqual(int first, int second, int third) {
        // Validate input: check if any parameter is negative
        if (first < 0 || second < 0 || third < 0) {
            System.out.println("Invalid Value");
            return;
        }
        
        // Check if all numbers are equal
        // All three must be equal to each other
        if (first == second && second == third) {
            System.out.println("All numbers are equal");
        }
        // Check if all numbers are different
        // All three must be different from each other
        else if (first != second && first != third && second != third) {
            System.out.println("All numbers are different");
        }
        // Otherwise, some are equal and some are different
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}

