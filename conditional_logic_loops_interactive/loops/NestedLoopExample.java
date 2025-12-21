package conditional_logic_loops_interactive.loops;

/**
 * Nested Loop Examples
 * 
 * This class demonstrates:
 * 1. Nested for loops
 * 2. Patterns and shapes
 * 3. Two-dimensional array iteration
 * 4. Multiplication tables
 * 5. Time complexity considerations
 */
public class NestedLoopExample {

    /**
     * Prints a rectangle pattern of asterisks.
     * 
     * @param rows the number of rows
     * @param cols the number of columns
     * 
     * Examples:
     * printRectangle(3, 5); → prints a 3x5 rectangle of asterisks
     */
    public static void printRectangle(int rows, int cols) {
        // Outer loop: controls rows
        for (int i = 0; i < rows; i++) {
            // Inner loop: controls columns
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println(); // New line after each row
        }
    }

    /**
     * Prints a right triangle pattern.
     * 
     * @param size the number of rows
     * 
     * Examples:
     * printRightTriangle(5); → prints increasing rows of asterisks
     */
    public static void printRightTriangle(int size) {
        // Outer loop: each row
        for (int i = 1; i <= size; i++) {
            // Inner loop: number of asterisks equals row number
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Prints a complete multiplication table from 1 to n.
     * 
     * @param n the size of the multiplication table
     * 
     * Examples:
     * printMultiplicationTable(5); → prints 5x5 multiplication table
     */
    public static void printMultiplicationTable(int n) {
        // Outer loop: rows (multiplicand)
        for (int i = 1; i <= n; i++) {
            // Inner loop: columns (multiplier)
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j); // Format with spacing
            }
            System.out.println();
        }
    }

    /**
     * Finds all pairs of numbers in an array that sum to a target value.
     * 
     * @param numbers the array of integers
     * @param target the target sum
     * 
     * Examples:
     * findPairs(new int[]{1, 2, 3, 4, 5}, 5); → prints pairs that sum to 5
     */
    public static void findPairs(int[] numbers, int target) {
        // Outer loop: first number
        for (int i = 0; i < numbers.length; i++) {
            // Inner loop: second number (starts from i+1 to avoid duplicates)
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("Pair: " + numbers[i] + " + " + numbers[j] + " = " + target);
                }
            }
        }
    }

    /**
     * Prints a pyramid pattern.
     * 
     * @param height the height of the pyramid
     * 
     * Examples:
     * printPyramid(5); → prints a pyramid with 5 rows
     */
    public static void printPyramid(int height) {
        // Outer loop: each row
        for (int i = 1; i <= height; i++) {
            // First inner loop: print spaces (decreasing)
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Second inner loop: print asterisks (increasing)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Iterates through a 2D array and prints all elements.
     * 
     * @param matrix the 2D array to print
     * 
     * Examples:
     * print2DArray(new int[][]{{1,2,3}, {4,5,6}}); → prints the matrix
     */
    public static void print2DArray(int[][] matrix) {
        // Outer loop: rows
        for (int i = 0; i < matrix.length; i++) {
            // Inner loop: columns
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

