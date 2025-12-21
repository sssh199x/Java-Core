package arrays.basic;

/**
 * Different Ways to Initialize Arrays
 * Demonstrates various methods of array initialization in Java.
 */
public class ArrayInitialization {
    public static void main(String[] args) {
        // Method 1: Initialize with values
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Array 1: " + java.util.Arrays.toString(arr1));
        
        // Method 2: Declare then initialize with new keyword
        int[] arr2 = new int[5];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;
        arr2[4] = 50;
        System.out.println("Array 2: " + java.util.Arrays.toString(arr2));
        
        // Method 3: Declare and create in one line
        int[] arr3 = new int[5]; // All elements initialized to 0
        System.out.println("Array 3 (default values): " + java.util.Arrays.toString(arr3));
        
        // Method 4: Using a loop to initialize
        int[] arr4 = new int[5];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (i + 1) * 10;
        }
        System.out.println("Array 4 (initialized with loop): " + java.util.Arrays.toString(arr4));
        
        // Different data types
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("String array: " + java.util.Arrays.toString(names));
        
        double[] prices = {19.99, 29.99, 39.99};
        System.out.println("Double array: " + java.util.Arrays.toString(prices));
        
        boolean[] flags = {true, false, true};
        System.out.println("Boolean array: " + java.util.Arrays.toString(flags));
    }
}

