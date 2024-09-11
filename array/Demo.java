package array;

public class Demo {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5 };
        int[] list1 = new int[5]; // Initial values in the array list1 : [0, 0, 0, 0, 0]
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        for (int i = 0; i < list1.length; i++) {
            System.out.println(list1[i]);
        }
        // Enhanced for loop...
        for (int n : list) {
            System.out.println(n);
        }

    }
}




// Arrays in Java:

// Definition:

// An array in Java is a data structure that stores a fixed-size sequential collection of elements of the same type. It is a container object that holds a fixed number of values of a single type.

// Characteristics:

//1. Fixed Size: Once an array is created, its size cannot be changed. The size is determined at the time of array creation.
//2. Homogeneous Elements: All elements in an array must be of the same type.
//3. Indexed Access: Elements in an array are accessed using an index. The index is zero-based, meaning the first element is at index 0.
//4. Memory Allocation: Arrays are allocated in contiguous memory locations, which allows for efficient access and manipulation of elements.



// To declare an array in Java, you specify the datatype of elements it will hold, followed by square brackets [], and then the array name. For example:
//  int[] numbers;

//  To create an array, you use the new keyword followed by the type and the size of the array:
// numbers = new int[5];

// You can also declare and initialize an array in one line:
// int[] numbers = {1, 2, 3, 4, 5};

// Accessing Elements:
// Elements in an array are accessed using the array name and the index in square brackets:
// int firstElement = numbers[0];


// You can iterate over arrays using loops, such as for loops or enhanced for loops:
// for (int i = 0; i < numbers.length; i++) {
//     System.out.println(numbers[i]);
// }

// for (int number : numbers) {
//     System.out.println(number);
// }


