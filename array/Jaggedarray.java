package array;

public class Jaggedarray {

    public static void main(String[] args) {
        int[][] jaggedMatrix = new int[10][];
        for (int i = 0; i < jaggedMatrix.length; i++) {
            jaggedMatrix[i] = new int[i + 1]; // i = 0, 1, 2, 3 => 1, 2, 3, 4
            for (int j = 0; j < jaggedMatrix[i].length; j++) {

                System.out.print(jaggedMatrix[i][j] + " ");
            }
            System.out.println();

        }

        for (int i = 0; i < jaggedMatrix.length; i++) {
            jaggedMatrix[i] = new int[i + 1]; // i = 0, 1, 2, 3 => 1, 2, 3, 4
            for (int j = 0; j < jaggedMatrix[i].length; j++) {
                // jaggedMatrix[i][j] = i + 1;
                System.out.print(jaggedMatrix[i][j] + " ");
            }
            System.out.println();

        }
        for (int i = 0; i < jaggedMatrix.length; i++) {
            System.out.println(0);

        }

    }

}

// A jagged array, also known as an "array of arrays," is an array whose
// elements are arrays. The inner arrays can have different lengths, making the
// structure "jagged" rather than rectangular. This is in contrast to a
// multidimensional array where each inner array has the same length.

// Characteristics of Jagged Arrays
// Variable Length: Each row (or inner array) can have a different length.
// Memory Efficiency: Jagged arrays can be more memory-efficient if the data
// naturally fits a jagged structure.
// Flexibility: They provide flexibility in scenarios where the data does not
// fit into a regular grid.
