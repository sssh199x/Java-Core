package arrays.exercises;

import java.util.Arrays;

/**
 * Simple Array Examples
 * Working code examples demonstrating common array operations.
 */
public class SimpleArrayExamples {
    
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};
        System.out.println("Array: " + Arrays.toString(numbers));
        
        // Example 1: Find maximum
        System.out.println("\n=== Example 1: Find Maximum ===");
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum: " + max);
        
        // Example 2: Find minimum
        System.out.println("\n=== Example 2: Find Minimum ===");
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum: " + min);
        
        // Example 3: Calculate sum
        System.out.println("\n=== Example 3: Calculate Sum ===");
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
        
        // Example 4: Calculate average
        System.out.println("\n=== Example 4: Calculate Average ===");
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
        
        // Example 5: Reverse array
        System.out.println("\n=== Example 5: Reverse Array ===");
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Reversed: " + Arrays.toString(reversed));
        
        // Example 6: Search element
        System.out.println("\n=== Example 6: Search Element ===");
        int target = 8;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Found " + target + " at index: " + index);
        } else {
            System.out.println(target + " not found");
        }
        
        // Example 7: Count occurrences
        System.out.println("\n=== Example 7: Count Occurrences ===");
        int[] testArray = {1, 2, 3, 2, 4, 2, 5};
        int target2 = 2;
        int count = 0;
        for (int num : testArray) {
            if (num == target2) {
                count++;
            }
        }
        System.out.println("Array: " + Arrays.toString(testArray));
        System.out.println("Occurrences of " + target2 + ": " + count);
        
        // Example 8: Copy array
        System.out.println("\n=== Example 8: Copy Array ===");
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = original.clone();
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));
        
        copy[0] = 100;
        System.out.println("\nAfter modifying copy[0] = 100:");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));
    }
}

