package expressions_statements_blocks.methods.basic_methods;

/**
 * Constructing A Diagonal Star Pattern With Loops
 * 
 * This class demonstrates:
 * 1. Nested loops for 2D patterns
 * 2. Conditional logic for pattern generation
 * 3. Printing patterns with stars and spaces
 * 4. Using print() vs println() for formatting
 * 5. Complex pattern logic with multiple conditions
 * 
 * The pattern consists of stars (*) arranged in a square with diagonal lines.
 * Stars are printed based on four conditions:
 * - First or last row
 * - First or last column
 * - Row equals column (main diagonal)
 * - Column equals (rowCount - currentRow + 1) (anti-diagonal)
 */
public class DiagonalStarPattern {

    /**
     * Prints a diagonal star pattern of the specified size.
     * 
     * The pattern is a square grid where stars are printed based on:
     * 1. First or last row
     * 2. First or last column
     * 3. When row number equals column number (main diagonal)
     * 4. When column number equals (rowCount - currentRow + 1) (anti-diagonal)
     * 
     * @param number the size of the square pattern (must be >= 5)
     * 
     * Examples:
     * printSquareStar(5); → prints 5x5 diagonal star pattern
     * printSquareStar(8); → prints 8x8 diagonal star pattern
     * printSquareStar(4); → prints "Invalid Value"
     */
    public static void printSquareStar(int number) {
        // If number is < 5, print "Invalid Value"
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        
        // Use nested loops: outer loop for rows, inner loop for columns
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                // Determine if we should print a star based on four conditions:
                
                // Condition 1: First or last row
                boolean isFirstOrLastRow = (row == 1 || row == number);
                
                // Condition 2: First or last column
                boolean isFirstOrLastCol = (col == 1 || col == number);
                
                // Condition 3: Row number equals column number (main diagonal)
                boolean isMainDiagonal = (row == col);
                
                // Condition 4: Column equals (rowCount - currentRow + 1) (anti-diagonal)
                boolean isAntiDiagonal = (col == (number - row + 1));
                
                // Print star if any condition is true
                if (isFirstOrLastRow || isFirstOrLastCol || isMainDiagonal || isAntiDiagonal) {
                    System.out.print("*");
                } else {
                    // Print space if no condition is met
                    System.out.print(" ");
                }
            }
            // Move to next line after each row
            System.out.println();
        }
    }

    /**
     * Alternative implementation with more compact condition checking.
     * 
     * This version combines all conditions in a single if statement.
     * 
     * @param number the size of the square pattern (must be >= 5)
     */
    public static void printSquareStarAlternative(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                // Combined condition: print star if any of the four conditions is true
                if (row == 1 || row == number ||           // First or last row
                    col == 1 || col == number ||           // First or last column
                    row == col ||                           // Main diagonal
                    col == (number - row + 1)) {           // Anti-diagonal
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

