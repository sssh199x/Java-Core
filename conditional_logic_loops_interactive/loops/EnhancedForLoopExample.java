package conditional_logic_loops_interactive.loops;

/**
 * Enhanced For Loop (For-Each Loop) Examples
 * 
 * This class demonstrates:
 * 1. Enhanced for loop for arrays
 * 2. Iterating through array elements
 * 3. Read-only iteration (cannot modify array during iteration)
 * 4. Simpler syntax compared to traditional for loop
 */
public class EnhancedForLoopExample {

    /**
     * Prints all elements of an integer array using enhanced for loop.
     * 
     * @param numbers the array to print
     * 
     * Examples:
     * printArray(new int[]{1, 2, 3, 4, 5}); → prints: 1 2 3 4 5
     */
    public static void printArray(int[] numbers) {
        // Enhanced for loop: for (elementType variable : array)
        // Automatically iterates through all elements
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    /**
     * Calculates the sum of all elements in an array.
     * 
     * @param numbers the array of integers
     * @return the sum of all elements
     * 
     * Examples:
     * sumArray(new int[]{1, 2, 3, 4, 5}); → returns 15
     */
    public static int sumArray(int[] numbers) {
        int sum = 0;
        // Enhanced for loop simplifies iteration
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * Finds the maximum value in an array.
     * 
     * @param numbers the array of integers
     * @return the maximum value, or Integer.MIN_VALUE if array is empty
     * 
     * Examples:
     * findMax(new int[]{5, 2, 8, 1, 9}); → returns 9
     */
    public static int findMax(int[] numbers) {
        if (numbers.length == 0) {
            return Integer.MIN_VALUE;
        }
        
        int max = numbers[0];
        // Compare each element with current max
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    /**
     * Counts how many times a target value appears in an array.
     * 
     * @param numbers the array to search
     * @param target the value to count
     * @return the count of occurrences
     * 
     * Examples:
     * countOccurrences(new int[]{1, 2, 2, 3, 2}, 2); → returns 3
     */
    public static int countOccurrences(int[] numbers, int target) {
        int count = 0;
        // Enhanced for loop makes counting simple
        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }
        return count;
    }

    /**
     * Prints all elements of a String array.
     * 
     * @param words the array of strings
     * 
     * Examples:
     * printWords(new String[]{"Hello", "World", "Java"}); → prints: Hello World Java
     */
    public static void printWords(String[] words) {
        // Enhanced for loop works with any array type
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}

