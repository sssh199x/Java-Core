package conditional_logic_loops_interactive.exercises;

/**
 * Simple Loop and Conditional Examples
 * 
 * This file contains simple working examples for practicing:
 * - Different types of loops
 * - Advanced conditional statements
 * - Basic interactive programming concepts
 * 
 * These are simple, working examples rather than exercises with TODOs.
 */
public class SimpleLoopAndConditionalExamples {

    /**
     * Prints numbers from 1 to 10 using a for loop.
     */
    public static void printOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Calculates the sum of numbers from 1 to n using a while loop.
     * 
     * @param n the upper limit
     * @return the sum
     */
    public static int sumWithWhile(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    /**
     * Prints a message at least once using do-while loop.
     * 
     * @param count the number of times to print
     */
    public static void printWithDoWhile(int count) {
        int i = 0;
        do {
            System.out.println("Message " + (i + 1));
            i++;
        } while (i < count);
    }

    /**
     * Prints all elements of an array using enhanced for loop.
     * 
     * @param numbers the array to print
     */
    public static void printArrayElements(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    /**
     * Uses switch statement to return day name.
     * 
     * @param dayNumber the day number (1-7)
     * @return the day name
     */
    public static String getDay(int dayNumber) {
        switch (dayNumber) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Invalid day";
        }
    }

    /**
     * Uses ternary operator to find maximum.
     * 
     * @param a first number
     * @param b second number
     * @return the maximum value
     */
    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * Checks if number is in valid range using boolean logic.
     * 
     * @param number the number to check
     * @param min minimum value
     * @param max maximum value
     * @return true if in range, false otherwise
     */
    public static boolean isValidRange(int number, int min, int max) {
        return (number >= min) && (number <= max);
    }
}

