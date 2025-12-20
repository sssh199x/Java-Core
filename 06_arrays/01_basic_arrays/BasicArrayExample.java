package arrays.basic;

/**
 * Basic Array Operations
 * This example demonstrates fundamental array operations in Java.
 */
public class BasicArrayExample {
    public static void main(String[] args) {
        // 1. Array Declaration and Initialization
        int[] numbers = {10, 20, 30, 40, 50};
        
        // 2. Accessing array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        
        // 3. Array length
        System.out.println("Array length: " + numbers.length);
        
        // 4. Modifying array elements
        numbers[2] = 35;
        System.out.println("After modification: " + numbers[2]);
        
        // 5. Iterating through array - Traditional for loop
        System.out.println("\nUsing traditional for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        // 6. Iterating through array - Enhanced for loop (for-each)
        System.out.println("\nUsing enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

