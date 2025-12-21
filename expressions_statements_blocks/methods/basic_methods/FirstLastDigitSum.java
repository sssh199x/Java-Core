package expressions_statements_blocks.methods.basic_methods;

/**
 * Summing The First And Last Digits Of An Integer
 * 
 * This class demonstrates:
 * 1. Extracting the last digit using modulo operator
 * 2. Extracting the first digit using a loop and division
 * 3. Handling edge cases (single digit, zero, negative numbers)
 * 4. Using loops to process digits of a number
 */
public class FirstLastDigitSum {

    /**
     * Finds and sums the first and last digit of a number.
     * 
     * Uses a loop to find the first digit by repeatedly dividing by 10,
     * and modulo operator to get the last digit.
     * 
     * @param number the number to process (must be non-negative)
     * @return the sum of first and last digits, or -1 if number is negative
     * 
     * Examples:
     * sumFirstAndLastDigit(252); → returns 4 (first: 2, last: 2, sum: 4)
     * sumFirstAndLastDigit(257); → returns 9 (first: 2, last: 7, sum: 9)
     * sumFirstAndLastDigit(0); → returns 0 (first: 0, last: 0, sum: 0)
     * sumFirstAndLastDigit(5); → returns 10 (first: 5, last: 5, sum: 10)
     * sumFirstAndLastDigit(-10); → returns -1 (invalid: negative number)
     */
    public static int sumFirstAndLastDigit(int number) {
        // If the number is negative, return -1 to indicate invalid value
        if (number < 0) {
            return -1;
        }
        
        // Get the last digit using modulo operator
        // Last digit is the remainder when divided by 10
        int lastDigit = number % 10;
        
        // Find the first digit using a loop
        // Keep dividing by 10 until we get a single digit
        int firstDigit = number;
        
        // Use loop to extract first digit
        // Continue while number has more than one digit
        while (firstDigit >= 10) {
            // Divide by 10 to remove the last digit
            firstDigit = firstDigit / 10;
        }
        
        // When loop ends, firstDigit contains the first digit
        // (For single-digit numbers, firstDigit already equals the number)
        
        // Return the sum of first and last digits
        return firstDigit + lastDigit;
    }

    /**
     * Alternative implementation that preserves the original number.
     * 
     * This version works with a copy to avoid modifying the parameter,
     * though in this case it's not strictly necessary since we're not
     * using the original after extraction.
     * 
     * @param number the number to process (must be non-negative)
     * @return the sum of first and last digits, or -1 if number is negative
     */
    public static int sumFirstAndLastDigitAlternative(int number) {
        // Validate input
        if (number < 0) {
            return -1;
        }
        
        // Get last digit
        int lastDigit = number % 10;
        
        // Work with a copy to find first digit
        int temp = number;
        
        // Loop to find first digit
        while (temp >= 10) {
            temp = temp / 10;
        }
        
        int firstDigit = temp;
        
        return firstDigit + lastDigit;
    }
}

