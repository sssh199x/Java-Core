package arrays.multidimensional;

/**
 * Two-Dimensional Array Examples
 * Demonstrates various operations with 2D arrays.
 */
public class TwoDArrayExample {
    public static void main(String[] args) {
        // Creating a 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matrix (3x3):");
        printMatrix(matrix);
        
        // Accessing specific elements
        System.out.println("\nElement at [0][0]: " + matrix[0][0]);
        System.out.println("Element at [1][2]: " + matrix[1][2]);
        
        // Modifying elements
        matrix[0][0] = 10;
        System.out.println("\nAfter modifying [0][0] to 10:");
        printMatrix(matrix);
        
        // Creating a 2D array with different sizes
        int[][] irregular = new int[3][];
        irregular[0] = new int[2];
        irregular[1] = new int[3];
        irregular[2] = new int[4];
        
        System.out.println("\nIrregular 2D array:");
        for (int i = 0; i < irregular.length; i++) {
            for (int j = 0; j < irregular[i].length; j++) {
                irregular[i][j] = i + j;
                System.out.print(irregular[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Helper method to print a 2D array
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

