package expressions_statements_blocks.control_flow.conditional_statements;

/**
 * Determining Word Representation Of Numbers Accurately
 * 
 * This class demonstrates:
 * 1. Converting numbers to their word representation
 * 2. Using switch statement for multiple value checks
 * 3. Handling edge cases (negative numbers, numbers > 9)
 * 4. Alternative implementation using if-else
 */
public class NumberInWord {

    /**
     * Prints the word representation of a number using switch statement.
     * 
     * Prints "ZERO", "ONE", "TWO", ..., "NINE" for numbers 0-9,
     * and "OTHER" for any other number including negative numbers.
     * 
     * @param number the whole number to convert to word
     * 
     * Examples:
     * printNumberInWord(0); → prints "ZERO"
     * printNumberInWord(5); → prints "FIVE"
     * printNumberInWord(9); → prints "NINE"
     * printNumberInWord(10); → prints "OTHER"
     * printNumberInWord(-1); → prints "OTHER"
     */
    public static void printNumberInWord(int number) {
        // Switch statement is ideal for multiple discrete values
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                // Handles numbers < 0, > 9, or any other value
                System.out.println("OTHER");
                break;
        }
    }

    /**
     * Alternative implementation using if-else statement.
     * 
     * This demonstrates that both approaches work, though switch
     * is generally preferred for multiple discrete value checks.
     * 
     * @param number the whole number to convert to word
     * 
     * Examples:
     * printNumberInWordIfElse(0); → prints "ZERO"
     * printNumberInWordIfElse(5); → prints "FIVE"
     * printNumberInWordIfElse(15); → prints "OTHER"
     */
    public static void printNumberInWordIfElse(int number) {
        // If-else chain for comparison (switch is cleaner for this use case)
        if (number == 0) {
            System.out.println("ZERO");
        } else if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else {
            // Handles all other cases (negative, > 9, etc.)
            System.out.println("OTHER");
        }
    }
}

