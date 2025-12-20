package expressions_statements_blocks.methods.basic_methods;

/**
 * Converting Digits Into Words And Handling Edge Cases
 * 
 * This class demonstrates:
 * 1. Converting digits to words using switch statement
 * 2. Reversing numbers to process digits in correct order
 * 3. Counting digits in a number
 * 4. Handling leading zeros in reversed numbers
 * 5. Multiple helper methods working together
 * 6. Complex method composition
 */
public class NumberToWordsConverter {

    /**
     * Counts the number of digits in a number.
     * 
     * @param number the number to count digits for
     * @return the count of digits, or -1 if number is negative
     * 
     * Examples:
     * getDigitCount(0); → returns 1 (0 has 1 digit)
     * getDigitCount(123); → returns 3
     * getDigitCount(-12); → returns -1 (negative number)
     * getDigitCount(5200); → returns 4
     */
    public static int getDigitCount(int number) {
        // If the number is negative, return -1 to indicate invalid value
        if (number < 0) {
            return -1;
        }
        
        // Handle zero as a special case (it has 1 digit)
        if (number == 0) {
            return 1;
        }
        
        // Count digits by repeatedly dividing by 10
        int count = 0;
        int num = number;
        
        while (num > 0) {
            count++;
            num = num / 10;
        }
        
        return count;
    }

    /**
     * Reverses a number.
     * 
     * Extracts digits from the number and builds the reversed number.
     * Also handles negative numbers by preserving the sign.
     * 
     * @param number the number to reverse
     * @return the reversed number
     * 
     * Examples:
     * reverse(-121); → returns -121
     * reverse(1212); → returns 2121
     * reverse(1234); → returns 4321
     * reverse(100); → returns 1 (leading zeros are lost)
     */
    public static int reverse(int number) {
        // Store original number to preserve sign
        int originalNumber = number;
        
        // Work with absolute value for reversal
        int num = Math.abs(number);
        int reversed = 0;
        
        // Reverse the number by extracting digits
        while (num > 0) {
            // Extract last digit
            int lastDigit = num % 10;
            
            // Build reversed number
            reversed = reversed * 10 + lastDigit;
            
            // Remove last digit
            num = num / 10;
        }
        
        // Restore sign if original was negative
        if (originalNumber < 0) {
            reversed = -reversed;
        }
        
        return reversed;
    }

    /**
     * Converts a digit to its word representation.
     * 
     * @param digit the digit (0-9)
     * 
     * Examples:
     * printDigitWord(0); → prints "Zero"
     * printDigitWord(5); → prints "Five"
     */
    private static void printDigitWord(int digit) {
        // Use switch statement to convert digit to word
        switch (digit) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                // Should not reach here for valid digits
                break;
        }
    }

    /**
     * Prints a number using words for each digit.
     * 
     * The method reverses the number first to process digits in correct order,
     * then handles leading zeros that were lost during reversal.
     * 
     * @param number the number to convert to words
     * 
     * Examples:
     * numberToWords(123); → prints "One", "Two", "Three"
     * numberToWords(1010); → prints "One", "Zero", "One", "Zero"
     * numberToWords(1000); → prints "One", "Zero", "Zero", "Zero"
     * numberToWords(-12); → prints "Invalid Value"
     */
    public static void numberToWords(int number) {
        // If the number is negative, print "Invalid Value"
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        
        // Get the digit count of the original number
        // This is needed to handle leading zeros after reversal
        int originalDigitCount = getDigitCount(number);
        
        // Reverse the number to process digits in correct order
        int reversedNumber = reverse(number);
        
        // Get the digit count of the reversed number
        int reversedDigitCount = getDigitCount(reversedNumber);
        
        // Process the reversed number digit by digit
        // This will print digits in the correct order (left to right of original)
        int num = reversedNumber;
        
        // Handle the case where reversed number is 0
        if (num == 0) {
            printDigitWord(0);
        } else {
            // Extract and print each digit from reversed number
            while (num > 0) {
                int digit = num % 10;
                printDigitWord(digit);
                num = num / 10;
            }
        }
        
        // Handle leading zeros that were lost during reversal
        // The difference between original and reversed digit counts
        // tells us how many trailing zeros were in the original number
        // (which become leading zeros in the reversed number and get lost)
        int zeroCount = originalDigitCount - reversedDigitCount;
        
        // Print the missing zeros
        for (int i = 0; i < zeroCount; i++) {
            printDigitWord(0);
        }
    }
}

