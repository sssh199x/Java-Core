package datatypes.reference;

/**
 * Learning about Arrays as Reference Types
 * Arrays are reference types that store multiple values.
 */
public class ArrayExample {
    public static void main(String[] args) {
        // Array declaration and initialization
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        
        System.out.println("--- Integer Array ---");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n\n--- String Array ---");
        for (String name : names) {
            System.out.println(name);
        }
        
        // Array as reference type
        System.out.println("\n--- Array Reference ---");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // arr2 references the same array as arr1
        
        System.out.println("arr1[0]: " + arr1[0]);
        System.out.println("arr2[0]: " + arr2[0]);
        
        arr2[0] = 100; // Modifying through arr2
        System.out.println("\nAfter modifying arr2[0] = 100:");
        System.out.println("arr1[0]: " + arr1[0]); // Also changed!
        System.out.println("arr2[0]: " + arr2[0]);
    }
}

