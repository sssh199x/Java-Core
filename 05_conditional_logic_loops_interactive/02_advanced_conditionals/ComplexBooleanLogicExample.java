package conditional_logic_loops_interactive.advanced_conditionals;

/**
 * Complex Boolean Logic Examples
 * 
 * This class demonstrates:
 * 1. Combining multiple conditions with && (AND)
 * 2. Combining multiple conditions with || (OR)
 * 3. Using ! (NOT) operator
 * 4. Operator precedence
 * 5. Short-circuit evaluation
 * 6. Complex nested conditions
 */
public class ComplexBooleanLogicExample {

    /**
     * Checks if a number is in a valid range (inclusive).
     * 
     * @param number the number to check
     * @param min the minimum value (inclusive)
     * @param max the maximum value (inclusive)
     * @return true if number is between min and max, false otherwise
     * 
     * Examples:
     * isInRange(5, 1, 10); → returns true
     * isInRange(15, 1, 10); → returns false
     */
    public static boolean isInRange(int number, int min, int max) {
        // AND operator: both conditions must be true
        return (number >= min) && (number <= max);
    }

    /**
     * Checks if a year is a leap year.
     * 
     * Leap year rules:
     * - Divisible by 4 AND not divisible by 100, OR
     * - Divisible by 400
     * 
     * @param year the year to check
     * @return true if leap year, false otherwise
     * 
     * Examples:
     * isLeapYear(2020); → returns true
     * isLeapYear(1900); → returns false
     * isLeapYear(2000); → returns true
     */
    public static boolean isLeapYear(int year) {
        // Complex boolean logic: (divisible by 4 AND not divisible by 100) OR divisible by 400
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    /**
     * Checks if a character is a vowel (a, e, i, o, u).
     * 
     * @param ch the character to check
     * @return true if vowel, false otherwise
     * 
     * Examples:
     * isVowel('a'); → returns true
     * isVowel('b'); → returns false
     */
    public static boolean isVowel(char ch) {
        // Convert to lowercase for case-insensitive check
        char lowerCh = Character.toLowerCase(ch);
        // OR operator: any one condition being true makes the whole expression true
        return (lowerCh == 'a') || (lowerCh == 'e') || (lowerCh == 'i') || 
               (lowerCh == 'o') || (lowerCh == 'u');
    }

    /**
     * Checks if a number is positive and even.
     * 
     * @param number the number to check
     * @return true if number is positive and even, false otherwise
     * 
     * Examples:
     * isPositiveAndEven(4); → returns true
     * isPositiveAndEven(-4); → returns false
     * isPositiveAndEven(3); → returns false
     */
    public static boolean isPositiveAndEven(int number) {
        // AND: both conditions must be true
        return (number > 0) && (number % 2 == 0);
    }

    /**
     * Checks if a number is negative or odd.
     * 
     * @param number the number to check
     * @return true if number is negative or odd, false otherwise
     * 
     * Examples:
     * isNegativeOrOdd(-3); → returns true
     * isNegativeOrOdd(3); → returns true
     * isNegativeOrOdd(4); → returns false
     */
    public static boolean isNegativeOrOdd(int number) {
        // OR: either condition being true makes the whole expression true
        return (number < 0) || (number % 2 != 0);
    }

    /**
     * Validates a password based on multiple criteria.
     * 
     * Password must:
     * - Be at least 8 characters long
     * - Contain at least one uppercase letter
     * - Contain at least one lowercase letter
     * - Contain at least one digit
     * 
     * @param password the password to validate
     * @return true if password meets all criteria, false otherwise
     * 
     * Examples:
     * isValidPassword("Password1"); → returns true
     * isValidPassword("password"); → returns false (no uppercase, no digit)
     */
    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        
        // Check each character
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        
        // All conditions must be true (AND)
        return hasUpperCase && hasLowerCase && hasDigit;
    }

    /**
     * Checks if a triangle is valid based on side lengths.
     * 
     * Triangle is valid if sum of any two sides is greater than the third side.
     * 
     * @param a first side length
     * @param b second side length
     * @param c third side length
     * @return true if valid triangle, false otherwise
     * 
     * Examples:
     * isValidTriangle(3, 4, 5); → returns true
     * isValidTriangle(1, 2, 5); → returns false
     */
    public static boolean isValidTriangle(double a, double b, double c) {
        // All three conditions must be true (AND)
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    /**
     * Determines if a number is not in a specific range using NOT operator.
     * 
     * @param number the number to check
     * @param min the minimum value
     * @param max the maximum value
     * @return true if number is NOT in range, false otherwise
     * 
     * Examples:
     * isNotInRange(5, 1, 10); → returns false (5 is in range)
     * isNotInRange(15, 1, 10); → returns true (15 is not in range)
     */
    public static boolean isNotInRange(int number, int min, int max) {
        // NOT operator: negates the condition
        return !((number >= min) && (number <= max));
    }
}

