package expressions_statements_blocks.methods.basic_methods;

/**
 * Identifying Palindromic Numbers For Enhanced Numeric Validation
 * 
 * This class demonstrates:
 * 1. Reversing a number using modulo and division
 * 2. Comparing original number with reversed number
 * 3. Handling negative numbers (they can also be palindromes)
 * 4. Using while loop for number reversal
 * 5. Preserving original number for comparison
 * 
 * A palindrome number is a number which when reversed is equal to the original number.
 * Examples: 121, 12321, 1001, -1221, 707
 */
public class PalindromeNumberChecker {

    /**
     * Checks if a number is a palindrome.
     * 
     * A palindrome number reads the same forwards and backwards.
     * This method reverses the number and compares it with the original.
     * 
     * @param number the number to check
     * @return true if the number is a palindrome, false otherwise
     * 
     * Examples:
     * isPalindrome(-1221); → returns true (reversed is -1221)
     * isPalindrome(707); → returns true (reversed is 707)
     * isPalindrome(11212); → returns false (reversed is 21211, not equal)
     * isPalindrome(121); → returns true
     * isPalindrome(-121); → returns true
     */
    public static boolean isPalindrome(int number) {
        // Store original number for comparison (we'll modify number during reversal)
        int originalNumber = number;
        
        // Initialize reverse variable to store the reversed number
        int reverse = 0;
        
        // Use while loop to reverse the number
        // Continue until number becomes 0
        while (number != 0) {
            // Extract the last digit using modulo division (remainder)
            // For negative numbers, we need to handle the sign
            // In Java, -1221 % 10 = -1, so we use Math.abs() to get positive digit
            int lastDigit = Math.abs(number % 10);
            
            // Increase the place value of reverse by one
            // Multiply reverse by 10 to shift digits left
            reverse = reverse * 10;
            
            // Add lastDigit to reverse
            reverse = reverse + lastDigit;
            
            // Remove the last digit from number
            // Divide by 10 to remove the last digit
            number = number / 10;
        }
        
        // Restore the sign of reverse if original was negative
        // If original was negative, make reverse negative too
        if (originalNumber < 0) {
            reverse = -reverse;
        }
        
        // Compare original number with reversed number
        // If both are the same, the number is a palindrome
        return originalNumber == reverse;
    }

    /**
     * Alternative implementation that handles negative numbers differently.
     * 
     * This version works with absolute value for reversal, then compares
     * considering the sign of the original number.
     * 
     * @param number the number to check
     * @return true if the number is a palindrome, false otherwise
     */
    public static boolean isPalindromeAlternative(int number) {
        // Work with absolute value for reversal
        int num = Math.abs(number);
        int originalNumber = number;
        int reverse = 0;
        
        // Reverse the absolute value
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        
        // If original was negative, make reverse negative
        if (originalNumber < 0) {
            reverse = -reverse;
        }
        
        // Compare original with reversed
        return originalNumber == reverse;
    }
}

