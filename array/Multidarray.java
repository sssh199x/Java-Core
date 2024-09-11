package array;

public class Multidarray {
    public static void main(String args[]) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int[] num : matrix) {
            for (int m : num) {
                System.out.print(m + " ");
                System.out.println();
            }
        }

        double[][] doubleMatrix = new double[4][4];
        for (int i = 0; i < doubleMatrix.length; i++) {
            for (int j = 0; j < doubleMatrix[i].length; j++) {
                doubleMatrix[i][j] = Math.random() * 100;
                System.out.print(doubleMatrix[i][j] + " ");

            }
            System.out.println();
        }
    }

}

// Multidimensional Arrays:
// Java supports multidimensional arrays, which are arrays of arrays. The most
// common type is the two-dimensional array:
// int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
// int[][] matrix = new int[3][3];

// Common Operations:
// 1. Length: The length of an array can be obtained using the .length
// attribute.
// 2. Copying: Arrays can be copied using methods like System.arraycopy() or
// Arrays.copyOf().
// 3. Sorting: Arrays can be sorted using the Arrays.sort() method.

// Arrays are a fundamental data structure in Java, providing a way to store and
// manipulate collections of data efficiently. Understanding arrays is crucial
// for effective programming in Java, as they form the basis for more complex
// data structures and algorithms.
