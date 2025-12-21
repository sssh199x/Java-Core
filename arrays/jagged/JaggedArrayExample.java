package arrays.jagged;

/**
 * Jagged Array Examples
 * Demonstrates how to create and work with jagged arrays.
 */
public class JaggedArrayExample {
    public static void main(String[] args) {
        // Creating a jagged array
        int[][] jagged = new int[4][];
        
        // Each row can have different lengths
        jagged[0] = new int[1];
        jagged[1] = new int[2];
        jagged[2] = new int[3];
        jagged[3] = new int[4];
        
        // Initialize values
        int value = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = value++;
            }
        }
        
        // Print jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        
        // Another example: Creating a triangle pattern
        System.out.println("\nTriangle Pattern using Jagged Array:");
        int[][] triangle = new int[5][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = j + 1;
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

