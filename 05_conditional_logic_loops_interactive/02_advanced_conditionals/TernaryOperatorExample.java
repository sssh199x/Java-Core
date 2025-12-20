package conditional_logic_loops_interactive.advanced_conditionals;

/**
 * Ternary Operator Examples
 * 
 * This class demonstrates:
 * 1. Basic ternary operator syntax
 * 2. Nested ternary operators
 * 3. Using ternary for assignment
 * 4. Using ternary in return statements
 * 5. When to use ternary vs if-else
 */
public class TernaryOperatorExample {

    /**
     * Returns the maximum of two numbers using ternary operator.
     * 
     * Syntax: condition ? valueIfTrue : valueIfFalse
     * 
     * @param a the first number
     * @param b the second number
     * @return the maximum of a and b
     * 
     * Examples:
     * max(5, 10); → returns 10
     * max(-3, -1); → returns -1
     */
    public static int max(int a, int b) {
        // Ternary operator: if a > b, return a, else return b
        return (a > b) ? a : b;
    }

    /**
     * Returns the minimum of two numbers using ternary operator.
     * 
     * @param a the first number
     * @param b the second number
     * @return the minimum of a and b
     * 
     * Examples:
     * min(5, 10); → returns 5
     */
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    /**
     * Returns "Even" or "Odd" based on the number using ternary operator.
     * 
     * @param number the number to check
     * @return "Even" if number is even, "Odd" otherwise
     * 
     * Examples:
     * evenOrOdd(4); → returns "Even"
     * evenOrOdd(7); → returns "Odd"
     */
    public static String evenOrOdd(int number) {
        // Check if remainder when divided by 2 is 0
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    /**
     * Returns the absolute value of a number using ternary operator.
     * 
     * @param number the number
     * @return the absolute value
     * 
     * Examples:
     * absoluteValue(-5); → returns 5
     * absoluteValue(5); → returns 5
     */
    public static int absoluteValue(int number) {
        // If number is negative, return -number (which makes it positive), else return number
        return (number < 0) ? -number : number;
    }

    /**
     * Returns a grade letter based on score using nested ternary operators.
     * 
     * @param score the score (0-100)
     * @return the grade letter (A, B, C, D, F)
     * 
     * Examples:
     * getGrade(95); → returns 'A'
     * getGrade(75); → returns 'C'
     * getGrade(50); → returns 'F'
     */
    public static char getGrade(int score) {
        // Nested ternary: check score ranges
        return (score >= 90) ? 'A' :
               (score >= 80) ? 'B' :
               (score >= 70) ? 'C' :
               (score >= 60) ? 'D' : 'F';
    }

    /**
     * Returns a status message based on age using ternary operator.
     * 
     * @param age the age
     * @return status message
     * 
     * Examples:
     * getStatus(15); → returns "Minor"
     * getStatus(25); → returns "Adult"
     * getStatus(70); → returns "Senior"
     */
    public static String getStatus(int age) {
        // Nested ternary for multiple conditions
        return (age < 18) ? "Minor" :
               (age < 65) ? "Adult" : "Senior";
    }

    /**
     * Determines if a number is positive, negative, or zero using nested ternary.
     * 
     * @param number the number to check
     * @return "Positive", "Negative", or "Zero"
     * 
     * Examples:
     * numberType(5); → returns "Positive"
     * numberType(-3); → returns "Negative"
     * numberType(0); → returns "Zero"
     */
    public static String numberType(int number) {
        return (number > 0) ? "Positive" :
               (number < 0) ? "Negative" : "Zero";
    }
}

