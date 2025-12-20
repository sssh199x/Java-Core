package conditional_logic_loops_interactive.advanced_conditionals;

/**
 * Switch Statement Examples
 * 
 * This class demonstrates:
 * 1. Basic switch statement with cases
 * 2. Switch with break statements
 * 3. Switch with default case
 * 4. Switch with multiple cases
 * 5. Switch expression (Java 14+)
 */
public class SwitchStatementExample {

    /**
     * Returns the day name based on day number using switch statement.
     * 
     * @param dayNumber the day number (1-7)
     * @return the name of the day, or "Invalid day" if out of range
     * 
     * Examples:
     * getDayName(1); → returns "Monday"
     * getDayName(7); → returns "Sunday"
     * getDayName(8); → returns "Invalid day"
     */
    public static String getDayName(int dayNumber) {
        String dayName;
        
        // Switch statement: evaluates dayNumber and matches to case
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break; // Exit switch after this case
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default: // Executes if no case matches
                dayName = "Invalid day";
                break;
        }
        
        return dayName;
    }

    /**
     * Returns the number of days in a month using switch statement.
     * 
     * @param month the month number (1-12)
     * @return the number of days in the month, or -1 if invalid
     * 
     * Examples:
     * getDaysInMonth(2); → returns 28 (assuming non-leap year)
     * getDaysInMonth(4); → returns 30
     * getDaysInMonth(1); → returns 31
     */
    public static int getDaysInMonth(int month) {
        int days;
        
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                // Multiple cases can share the same code
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = 28; // Simplified: doesn't account for leap years
                break;
            default:
                days = -1; // Invalid month
                break;
        }
        
        return days;
    }

    /**
     * Returns a grade description based on letter grade.
     * 
     * @param grade the letter grade (A, B, C, D, F)
     * @return the grade description
     * 
     * Examples:
     * getGradeDescription('A'); → returns "Excellent"
     * getGradeDescription('F'); → returns "Fail"
     */
    public static String getGradeDescription(char grade) {
        String description;
        
        // Switch with char type
        switch (grade) {
            case 'A':
                description = "Excellent";
                break;
            case 'B':
                description = "Good";
                break;
            case 'C':
                description = "Average";
                break;
            case 'D':
                description = "Below Average";
                break;
            case 'F':
                description = "Fail";
                break;
            default:
                description = "Invalid Grade";
                break;
        }
        
        return description;
    }

    /**
     * Performs a basic calculator operation using switch statement.
     * 
     * @param num1 the first number
     * @param num2 the second number
     * @param operator the operation (+, -, *, /)
     * @return the result of the operation, or Double.NaN if invalid
     * 
     * Examples:
     * calculate(10, 5, '+'); → returns 15.0
     * calculate(10, 5, '/'); → returns 2.0
     */
    public static double calculate(double num1, double num2, char operator) {
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    result = Double.NaN; // Division by zero
                }
                break;
            default:
                result = Double.NaN; // Invalid operator
                break;
        }
        
        return result;
    }
}

