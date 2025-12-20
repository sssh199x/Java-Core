package expressions_statements_blocks.methods.basic_methods;

/**
 * Calculating The Sum Of All Even Digits In An Integer
 * 
 * This class demonstrates:
 * 1. Extracting digits from a number using modulo and division
 * 2. Checking if a digit is even using modulo operator
 * 3. Accumulating sum of digits that meet a condition
 * 4. Input validation for negative numbers
 * 5. Processing all digits of a number using a loop
 */
public class EvenDigitSum {

    /**
     * Calculates the sum of all even digits within a number.
     * 
     * Extracts each digit from the number, checks if it's even,
     * and accumulates the sum of all even digits.
     * 
     * @param number the number to process (must be non-negative)
     * @return the sum of all even digits, or -1 if number is negative
     * 
     * Examples:
     * getEvenDigitSum(123456789); → returns 20 (2 + 4 + 6 + 8 = 20)
     * getEvenDigitSum(252); → returns 4 (2 + 2 = 4)
     * getEvenDigitSum(-22); → returns -1 (invalid: negative number)
     * getEvenDigitSum(13579); → returns 0 (no even digits)
     */
    public static int getEvenDigitSum(int number) {
        // If the number is negative, return -1 to indicate invalid value
        if (number < 0) {
            return -1;
        }
        
        // Initialize sum accumulator
        int sum = 0;
        
        // Work with absolute value to handle processing
        // (though we already checked for negative, this ensures positive)
        int num = number;
        
        // Use loop to extract and process each digit
        // Continue until all digits are processed (number becomes 0)
        while (num > 0) {
            // Extract the last digit using modulo operator
            int digit = num % 10;
            
            // Check if the digit is even
            // A digit is even if it's divisible by 2 (remainder is 0)
            if (digit % 2 == 0) {
                // Add even digit to sum
                sum += digit;
            }
            
            // Remove the last digit by dividing by 10
            num = num / 10;
        }
        
        // Return the sum of all even digits
        return sum;
    }

    /**
     * Alternative implementation using Math.abs() for clarity.
     * 
     * This version explicitly uses Math.abs() to ensure we work with
     * positive number, though the validation already handles negatives.
     * 
     * @param number the number to process (must be non-negative)
     * @return the sum of all even digits, or -1 if number is negative
     */
    public static int getEvenDigitSumAlternative(int number) {
        // Validate input
        if (number < 0) {
            return -1;
        }
        
        int sum = 0;
        int num = Math.abs(number); // Ensure positive (redundant after validation)
        
        // Process each digit
        while (num > 0) {
            int digit = num % 10;
            
            // Check if digit is even and add to sum
            if (digit % 2 == 0) {
                sum += digit;
            }
            
            num /= 10; // Remove last digit
        }
        
        return sum;
    }
}

