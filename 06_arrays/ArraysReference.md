# Arrays Reference Guide

This is a comprehensive reference guide for arrays in Java. Use this document for quick lookup and understanding of array concepts and operations.

## Table of Contents
1. [Overview](#overview)
2. [Basic Arrays](#basic-arrays)
3. [Multidimensional Arrays](#multidimensional-arrays)
4. [Jagged Arrays](#jagged-arrays)
5. [Common Array Operations](#common-array-operations)
6. [Array Utilities](#array-utilities)
7. [Best Practices](#best-practices)
8. [Quick Reference](#quick-reference)

---

## Overview

An **array** in Java is a data structure that stores a fixed-size sequential collection of elements of the same type. Arrays are reference types stored in heap memory.

### Key Characteristics

- **Fixed Size**: Once created, size cannot be changed
- **Homogeneous**: All elements must be of the same type
- **Indexed Access**: Zero-based indexing (first element at index 0)
- **Contiguous Memory**: Elements stored in consecutive memory locations
- **Reference Type**: Arrays are objects, stored in heap memory

### Array Declaration Syntax

```java
// Syntax 1: Type followed by brackets
int[] numbers;

// Syntax 2: Brackets after variable name (less common)
int numbers[];

// Recommended: Use syntax 1 (type[] name)
```

---

## Basic Arrays

### Declaration and Initialization

#### Method 1: Declare and Initialize with Values

```java
int[] numbers = {1, 2, 3, 4, 5};
String[] names = {"Alice", "Bob", "Charlie"};
double[] prices = {19.99, 29.99, 39.99};
```

#### Method 2: Declare then Create

```java
int[] numbers;
numbers = new int[5];  // Creates array with 5 elements, all initialized to 0
```

#### Method 3: Declare and Create in One Line

```java
int[] numbers = new int[5];  // All elements initialized to 0
String[] names = new String[3];  // All elements initialized to null
```

#### Method 4: Initialize with Loop

```java
int[] numbers = new int[5];
for (int i = 0; i < numbers.length; i++) {
    numbers[i] = i + 1;  // Initialize with values 1, 2, 3, 4, 5
}
```

### Accessing Array Elements

```java
int[] numbers = {10, 20, 30, 40, 50};

// Access first element
int first = numbers[0];  // 10

// Access last element
int last = numbers[numbers.length - 1];  // 50

// Access middle element
int middle = numbers[2];  // 30
```

### Modifying Array Elements

```java
int[] numbers = {10, 20, 30, 40, 50};

// Modify an element
numbers[2] = 35;  // Changes 30 to 35

// Array is now: {10, 20, 35, 40, 50}
```

### Array Length

```java
int[] numbers = {1, 2, 3, 4, 5};

int length = numbers.length;  // 5 (not a method, it's a field)
System.out.println("Array length: " + length);
```

**Important**: `length` is a **field**, not a method. No parentheses!

### Default Values

When arrays are created, elements are initialized to default values:

| Type | Default Value |
|------|---------------|
| byte, short, int, long | 0 |
| float, double | 0.0 |
| boolean | false |
| char | '\u0000' |
| Reference types | null |

```java
int[] intArray = new int[5];        // [0, 0, 0, 0, 0]
double[] doubleArray = new double[3]; // [0.0, 0.0, 0.0]
boolean[] boolArray = new boolean[2]; // [false, false]
String[] strArray = new String[3];    // [null, null, null]
```

### Iterating Through Arrays

#### Traditional For Loop

```java
int[] numbers = {1, 2, 3, 4, 5};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

#### Enhanced For Loop (For-Each)

```java
int[] numbers = {1, 2, 3, 4, 5};

for (int num : numbers) {
    System.out.println(num);
}
```

**When to use each:**
- **Traditional for loop**: When you need the index
- **Enhanced for loop**: When you only need the values

### Array Types

Arrays can hold any data type:

```java
// Primitive types
int[] integers = {1, 2, 3};
double[] decimals = {1.5, 2.5, 3.5};
boolean[] flags = {true, false, true};
char[] letters = {'A', 'B', 'C'};

// Reference types
String[] names = {"Alice", "Bob"};
Object[] objects = {new Object(), new Object()};
```

### Arrays as Reference Types

Arrays are reference types, so assignment creates a reference, not a copy:

```java
int[] arr1 = {1, 2, 3};
int[] arr2 = arr1;  // arr2 references the same array as arr1

arr2[0] = 100;  // Modifies the same array
System.out.println(arr1[0]);  // Prints 100 (not 1!)
```

---

## Multidimensional Arrays

### Definition

Multidimensional arrays are **arrays of arrays**. The most common is the two-dimensional array (2D array).

### 2D Array Declaration

```java
// Method 1: Initialize with values
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Method 2: Declare and create
int[][] matrix = new int[3][3];  // 3 rows, 3 columns

// Method 3: Declare then create
int[][] matrix;
matrix = new int[3][3];
```

### Accessing 2D Array Elements

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

int element = matrix[0][0];  // First row, first column: 1
int element2 = matrix[1][2]; // Second row, third column: 6
int element3 = matrix[2][1]; // Third row, second column: 8
```

### Iterating Through 2D Arrays

#### Nested For Loops

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

#### Enhanced For Loops

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for (int[] row : matrix) {
    for (int element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
```

### 2D Array Length

```java
int[][] matrix = new int[3][4];

int rows = matrix.length;        // Number of rows: 3
int cols = matrix[0].length;    // Number of columns: 4
```

### 3D and Higher Dimensions

```java
// 3D array
int[][][] cube = new int[3][3][3];

// Accessing 3D array
int value = cube[0][1][2];  // First dimension, second row, third column
```

---

## Jagged Arrays

### Definition

A **jagged array** (also called "ragged array" or "array of arrays") is an array where each row can have a different length.

### Creating Jagged Arrays

```java
// Method 1: Declare then create rows separately
int[][] jagged = new int[3][];
jagged[0] = new int[1];  // First row has 1 element
jagged[1] = new int[2];  // Second row has 2 elements
jagged[2] = new int[3];  // Third row has 3 elements

// Method 2: Initialize with different lengths
int[][] jagged = {
    {1},
    {2, 3},
    {4, 5, 6}
};
```

### Accessing Jagged Arrays

```java
int[][] jagged = {
    {1},
    {2, 3},
    {4, 5, 6}
};

System.out.println(jagged[0][0]);  // 1
System.out.println(jagged[1][1]);  // 3
System.out.println(jagged[2][2]);  // 6
```

### Iterating Through Jagged Arrays

```java
int[][] jagged = {
    {1},
    {2, 3},
    {4, 5, 6}
};

for (int i = 0; i < jagged.length; i++) {
    for (int j = 0; j < jagged[i].length; j++) {
        System.out.print(jagged[i][j] + " ");
    }
    System.out.println();
}
```

### When to Use Jagged Arrays

- When rows have different lengths naturally
- Memory efficiency (only allocate what you need)
- Flexibility in data structure

---

## Common Array Operations

### Finding Maximum Value

```java
int[] numbers = {5, 2, 8, 1, 9, 3};

int max = numbers[0];
for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
    }
}
System.out.println("Maximum: " + max);
```

### Finding Minimum Value

```java
int[] numbers = {5, 2, 8, 1, 9, 3};

int min = numbers[0];
for (int num : numbers) {
    if (num < min) {
        min = num;
    }
}
System.out.println("Minimum: " + min);
```

### Calculating Sum

```java
int[] numbers = {1, 2, 3, 4, 5};

int sum = 0;
for (int num : numbers) {
    sum += num;
}
System.out.println("Sum: " + sum);
```

### Calculating Average

```java
int[] numbers = {1, 2, 3, 4, 5};

int sum = 0;
for (int num : numbers) {
    sum += num;
}
double average = (double) sum / numbers.length;
System.out.println("Average: " + average);
```

### Searching for an Element

```java
int[] numbers = {5, 2, 8, 1, 9, 3};
int target = 8;

int index = -1;
for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == target) {
        index = i;
        break;
    }
}

if (index != -1) {
    System.out.println("Found at index: " + index);
} else {
    System.out.println("Not found");
}
```

### Reversing an Array

```java
int[] numbers = {1, 2, 3, 4, 5};

for (int i = 0; i < numbers.length / 2; i++) {
    int temp = numbers[i];
    numbers[i] = numbers[numbers.length - 1 - i];
    numbers[numbers.length - 1 - i] = temp;
}
```

### Counting Occurrences

```java
int[] numbers = {1, 2, 3, 2, 4, 2, 5};
int target = 2;

int count = 0;
for (int num : numbers) {
    if (num == target) {
        count++;
    }
}
System.out.println("Occurrences of " + target + ": " + count);
```

---

## Array Utilities

### Using Arrays Class

Java provides the `Arrays` utility class with helpful methods:

```java
import java.util.Arrays;

int[] numbers = {5, 2, 8, 1, 9, 3};

// Sorting
Arrays.sort(numbers);  // Sorts in place: [1, 2, 3, 5, 8, 9]

// Searching (array must be sorted)
int index = Arrays.binarySearch(numbers, 5);  // Returns index

// Copying
int[] copy = Arrays.copyOf(numbers, numbers.length);
int[] copy2 = Arrays.copyOfRange(numbers, 0, 3);  // Copy first 3 elements

// Filling
Arrays.fill(numbers, 0);  // Fill all elements with 0

// Comparing
boolean equal = Arrays.equals(arr1, arr2);

// Converting to string
String str = Arrays.toString(numbers);  // "[1, 2, 3, 5, 8, 9]"

// Deep operations for multidimensional arrays
int[][] matrix1 = {{1, 2}, {3, 4}};
int[][] matrix2 = {{1, 2}, {3, 4}};
boolean deepEqual = Arrays.deepEquals(matrix1, matrix2);
String deepStr = Arrays.deepToString(matrix1);
```

### System.arraycopy()

```java
int[] source = {1, 2, 3, 4, 5};
int[] destination = new int[5];

System.arraycopy(source, 0, destination, 0, source.length);
// Parameters: source, srcPos, dest, destPos, length
```

---

## Best Practices

### 1. Use Enhanced For Loop When Possible

```java
// ✅ Good: When you don't need the index
for (int num : numbers) {
    System.out.println(num);
}

// ✅ Good: When you need the index
for (int i = 0; i < numbers.length; i++) {
    System.out.println("Index " + i + ": " + numbers[i]);
}
```

### 2. Check Array Bounds

```java
// ✅ Good: Check bounds before accessing
if (index >= 0 && index < array.length) {
    int value = array[index];
}

// ❌ Bad: May cause ArrayIndexOutOfBoundsException
int value = array[index];  // Unsafe
```

### 3. Use Arrays Utilities

```java
// ✅ Good: Use Arrays class methods
Arrays.sort(numbers);
Arrays.fill(numbers, 0);

// ❌ Less efficient: Manual implementation
// (unless you need custom logic)
```

### 4. Initialize Arrays Properly

```java
// ✅ Good: Initialize with known values
int[] numbers = {1, 2, 3, 4, 5};

// ✅ Good: Initialize with size
int[] numbers = new int[5];

// ❌ Bad: Uninitialized array
int[] numbers;  // Must initialize before use
```

### 5. Use Descriptive Names

```java
// ✅ Good: Descriptive names
int[] studentScores;
String[] customerNames;

// ❌ Bad: Generic names
int[] arr;
String[] str;
```

### 6. Copy Arrays When Needed

```java
// ✅ Good: Create copy when you need independent array
int[] copy = Arrays.copyOf(original, original.length);

// ❌ Bad: Reference assignment (shares same array)
int[] copy = original;  // Both reference same array
```

### 7. Handle Null Arrays

```java
// ✅ Good: Check for null
if (array != null && array.length > 0) {
    // Process array
}

// ❌ Bad: May cause NullPointerException
int length = array.length;  // Unsafe
```

---

## Quick Reference

### Array Declaration

| Syntax | Example |
|--------|---------|
| `type[] name` | `int[] numbers;` |
| `type name[]` | `int numbers[];` (less common) |

### Array Initialization

| Method | Example |
|--------|---------|
| With values | `int[] arr = {1, 2, 3};` |
| With size | `int[] arr = new int[5];` |
| Declare then create | `int[] arr; arr = new int[5];` |

### Array Access

| Operation | Syntax |
|-----------|--------|
| Get element | `arr[index]` |
| Set element | `arr[index] = value;` |
| Get length | `arr.length` |
| First element | `arr[0]` |
| Last element | `arr[arr.length - 1]` |

### Common Operations

| Operation | Code |
|-----------|------|
| Find max | `Arrays.stream(arr).max().getAsInt()` |
| Find min | `Arrays.stream(arr).min().getAsInt()` |
| Sum | `Arrays.stream(arr).sum()` |
| Sort | `Arrays.sort(arr)` |
| Copy | `Arrays.copyOf(arr, length)` |
| Fill | `Arrays.fill(arr, value)` |
| Search | `Arrays.binarySearch(arr, key)` |

### Multidimensional Arrays

| Type | Declaration | Example |
|------|-------------|---------|
| 2D | `type[][]` | `int[][] matrix = new int[3][3];` |
| 3D | `type[][][]` | `int[][][] cube = new int[3][3][3];` |
| Jagged | `type[][]` | `int[][] jagged = new int[3][];` |

### Default Values

| Type | Default |
|------|---------|
| Numeric | `0` or `0.0` |
| boolean | `false` |
| char | `'\u0000'` |
| Reference | `null` |

---

## Related Files

- `01_basic_arrays/ArrayDemo.java` - Basic array examples
- `01_basic_arrays/BasicArrayExample.java` - Fundamental operations
- `01_basic_arrays/ArrayInitialization.java` - Initialization methods
- `02_multidimensional_arrays/MultiDimensionalArray.java` - 2D array examples
- `02_multidimensional_arrays/TwoDArrayExample.java` - Advanced 2D operations
- `03_jagged_arrays/JaggedArray.java` - Jagged array basics
- `03_jagged_arrays/JaggedArrayExample.java` - Jagged array examples
- `exercises/SimpleArrayExamples.java` - Working examples

---

## Summary

### Key Takeaways

1. **Arrays are fixed-size** collections of the same type
2. **Zero-based indexing** - first element at index 0
3. **Reference types** - assignment creates reference, not copy
4. **Default values** - elements initialized to type defaults
5. **Multidimensional** - arrays of arrays
6. **Jagged arrays** - rows can have different lengths
7. **Use Arrays class** for common operations

### When to Use Arrays

- **Fixed size collections** - when size is known
- **Same type elements** - homogeneous data
- **Index-based access** - when you need random access
- **Performance** - faster than ArrayList for fixed-size data

### Array Limitations

- **Fixed size** - cannot resize after creation
- **No built-in methods** - need to use Arrays utility class
- **Primitive arrays** - cannot use generics directly

---

**Last Updated**: This reference guide covers all array concepts in Java. Use it as a quick lookup for array operations, syntax, and best practices.

