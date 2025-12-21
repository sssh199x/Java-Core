package expressions_statements_blocks.methods.basic_methods;

/**
 * Creating An Equal Sum Checker For Strengthening Arithmetic And Comparison Operations
 * 
 * This class demonstrates:
 * 1. Basic arithmetic operations (addition)
 * 2. Comparison operations (equality)
 * 3. Method with boolean return type
 * 4. Multiple parameters
 * 
 * The method checks if the sum of the first two parameters equals the third parameter.
 */
public class EqualSumChecker {
    
    /**
     * Checks if the sum of the first two parameters equals the third parameter.
     * 
     * @param first the first integer
     * @param second the second integer
     * @param third the third integer to compare against the sum
     * @return true if first + second equals third, false otherwise
     * 
     * Examples:
     * hasEqualSum(1, 1, 1); → should return false since 1 + 1 is not equal to 1
     * hasEqualSum(1, 1, 2); → should return true since 1 + 1 is equal to 2
     * hasEqualSum(1, -1, 0); → should return true since 1 + (-1) is 1 - 1 and is equal to 0
     */
    public static boolean hasEqualSum(int first, int second, int third) {
        // Calculate the sum of first and second parameters
        int sum = first + second;
        
        // Check if the sum equals the third parameter
        // Return true if equal, false otherwise
        return sum == third;
    }
}

