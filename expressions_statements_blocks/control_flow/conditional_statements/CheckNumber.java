package expressions_statements_blocks.control_flow.conditional_statements;

/**
 * Comprehensive 'Positive, Negative, Or Zero' Assessment In Java
 * 
 * Write a method called checkNumber with an int parameter named number.
 * 
 * The method should not return any value, and it needs to print out:
 * - "positive" if the parameter number is > 0
 * - "negative" if the parameter number is < 0
 * - "zero" if the parameter number is equal to 0
 */
public class CheckNumber {
    
    /**
     * Checks if a number is positive, negative, or zero and prints the result.
     * 
     * @param number the integer to check
     */
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
    
}

