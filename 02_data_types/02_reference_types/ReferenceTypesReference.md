# Reference Data Types Reference Guide

This is a comprehensive reference guide for all reference data types in Java. Use this document for quick lookup and understanding of reference types.

## Table of Contents
1. [Overview](#overview)
2. [String Type](#string-type)
3. [Arrays](#arrays)
4. [Class Objects](#class-objects)
5. [Interfaces](#interfaces)
6. [Key Differences: Primitive vs Reference](#key-differences-primitive-vs-reference)
7. [Memory Management](#memory-management)
8. [Common Operations](#common-operations)
9. [Best Practices](#best-practices)

---

## Overview

Reference types in Java store **references** (addresses) to objects in memory, rather than storing the actual data directly. All reference types are objects and are stored in the **heap memory**.

### Main Reference Types:
1. **String** - Sequence of characters
2. **Arrays** - Collections of elements
3. **Class Objects** - Instances of classes
4. **Interfaces** - References to implementing classes
5. **Wrapper Classes** - Object versions of primitives (Integer, Double, etc.)

### Key Characteristics:
- **Default Value**: `null` (for instance variables)
- **Memory Location**: Stored in heap memory
- **Size**: Depends on the object (reference is typically 32 or 64 bits)
- **Comparison**: Use `.equals()` for content comparison, `==` for reference comparison

---

## String Type

### Overview
`String` is a special reference type in Java. Although it's technically a class, it's often used like a primitive type. Strings are **immutable** in Java.

### Declaration and Initialization

```java
// Method 1: String literal (recommended)
String greeting = "Hello, World!";

// Method 2: Using new keyword
String name = new String("Java");

// Method 3: Empty string
String empty = "";

// Method 4: null reference
String nullString = null;
```

### String Immutability
Strings in Java are **immutable** - once created, they cannot be changed.

```java
String str = "Hello";
str.concat(" World");  // Creates new string, doesn't modify str
System.out.println(str);  // Still prints "Hello"

// To get the new string:
String newStr = str.concat(" World");  // "Hello World"
```

### String Concatenation

```java
// Using + operator
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName;  // "John Doe"

// Using concat() method
String greeting = "Hello".concat(" World");

// Concatenating with other types
int age = 25;
String message = "Age: " + age;  // "Age: 25"
```

### Common String Methods

#### Length and Character Access
```java
String text = "Java Programming";

int length = text.length();              // 16
char firstChar = text.charAt(0);          // 'J'
char lastChar = text.charAt(length - 1); // 'g'
```

#### Substring Operations
```java
String text = "Hello World";

String sub1 = text.substring(0, 5);      // "Hello"
String sub2 = text.substring(6);          // "World"
String sub3 = text.substring(0, 3);      // "Hel"
```

#### Case Conversion
```java
String text = "Java Programming";

String upper = text.toUpperCase();       // "JAVA PROGRAMMING"
String lower = text.toLowerCase();       // "java programming"
```

#### Searching
```java
String text = "Java Programming";

boolean contains = text.contains("Java");     // true
int index = text.indexOf('P');                // 5
int lastIndex = text.lastIndexOf('a');       // 10
boolean startsWith = text.startsWith("Java");  // true
boolean endsWith = text.endsWith("ing");      // true
```

#### Replacement
```java
String text = "Hello World";

String replaced = text.replace('l', 'L');      // "HeLLo WorLd"
String replaced2 = text.replace("World", "Java"); // "Hello Java"
```

#### Trimming and Whitespace
```java
String text = "  Hello World  ";

String trimmed = text.trim();                // "Hello World"
boolean isEmpty = "".isEmpty();              // true
boolean isBlank = "   ".isBlank();           // true (Java 11+)
```

#### Splitting
```java
String text = "apple,banana,orange";
String[] fruits = text.split(",");           // ["apple", "banana", "orange"]

String sentence = "Hello World Java";
String[] words = sentence.split(" ");        // ["Hello", "World", "Java"]
```

### String Comparison

**Important**: Use `.equals()` for content comparison, not `==`.

```java
String str1 = "Hello";
String str2 = "Hello";
String str3 = new String("Hello");

// Reference comparison (==)
System.out.println(str1 == str2);        // true (same reference in string pool)
System.out.println(str1 == str3);        // false (different references)

// Content comparison (.equals())
System.out.println(str1.equals(str2));   // true
System.out.println(str1.equals(str3));   // true

// Case-insensitive comparison
System.out.println("Hello".equalsIgnoreCase("hello")); // true
```

### String Pool
Java maintains a **string pool** for string literals to optimize memory usage.

```java
String s1 = "Hello";
String s2 = "Hello";
String s3 = new String("Hello");

System.out.println(s1 == s2);  // true (both reference same object in pool)
System.out.println(s1 == s3);  // false (s3 is new object, not in pool)
```

### StringBuilder and StringBuffer
For efficient string manipulation (when you need to modify strings frequently):

```java
// StringBuilder (not thread-safe, faster)
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("World");
String result = sb.toString();  // "Hello World"

// StringBuffer (thread-safe, slower)
StringBuffer sbf = new StringBuffer();
sbf.append("Hello");
sbf.append(" World");
String result2 = sbf.toString();
```

---

## Arrays

### Overview
Arrays are reference types that store multiple values of the same type. Arrays have a **fixed size** once created.

### Declaration and Initialization

```java
// Method 1: Declare and initialize
int[] numbers = {1, 2, 3, 4, 5};

// Method 2: Declare then create
int[] numbers2 = new int[5];  // All elements initialized to 0

// Method 3: Declare then initialize
int[] numbers3;
numbers3 = new int[]{1, 2, 3, 4, 5};

// Method 4: Initialize with loop
int[] numbers4 = new int[5];
for (int i = 0; i < numbers4.length; i++) {
    numbers4[i] = i + 1;
}
```

### Array Characteristics

```java
int[] arr = {10, 20, 30, 40, 50};

// Length
int length = arr.length;  // 5 (not a method, it's a field)

// Accessing elements
int first = arr[0];      // 10
int last = arr[arr.length - 1];  // 50

// Modifying elements
arr[0] = 100;  // Changes first element to 100
```

### Array Types

```java
// Integer array
int[] integers = {1, 2, 3, 4, 5};

// String array
String[] names = {"Alice", "Bob", "Charlie"};

// Double array
double[] prices = {19.99, 29.99, 39.99};

// Boolean array
boolean[] flags = {true, false, true};

// Character array
char[] letters = {'A', 'B', 'C'};
```

### Iterating Through Arrays

```java
int[] numbers = {1, 2, 3, 4, 5};

// Traditional for loop
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// Enhanced for loop (for-each)
for (int num : numbers) {
    System.out.println(num);
}
```

### Arrays as Reference Types

Arrays are reference types, so assigning one array to another creates a reference, not a copy.

```java
int[] arr1 = {1, 2, 3};
int[] arr2 = arr1;  // arr2 references the same array as arr1

arr2[0] = 100;  // Modifies the same array
System.out.println(arr1[0]);  // Prints 100 (not 1!)

// To create a copy:
int[] arr3 = arr1.clone();  // Creates a copy
// or
int[] arr4 = Arrays.copyOf(arr1, arr1.length);
```

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
int[] intArr = new int[5];        // [0, 0, 0, 0, 0]
double[] doubleArr = new double[3]; // [0.0, 0.0, 0.0]
boolean[] boolArr = new boolean[2];  // [false, false]
String[] strArr = new String[3];    // [null, null, null]
```

---

## Class Objects

### Overview
When you create an instance of a class, you're creating an object (reference type). Objects are stored in heap memory.

### Creating Objects

```java
// Class definition
class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Creating objects
Person person1 = new Person("Alice", 25);
Person person2 = new Person("Bob", 30);
```

### Reference Assignment

```java
Person person1 = new Person("Alice", 25);
Person person2 = person1;  // person2 references the same object

person2.name = "Charlie";  // Modifies the same object
person1.displayInfo();     // Prints "Name: Charlie, Age: 25"
```

### Null References

```java
Person person = null;  // No object created, just a null reference

// Checking for null
if (person != null) {
    person.displayInfo();
} else {
    System.out.println("Person is null");
}

// NullPointerException
// person.displayInfo();  // Would throw NullPointerException
```

### Object Comparison

```java
Person p1 = new Person("Alice", 25);
Person p2 = new Person("Alice", 25);
Person p3 = p1;

// Reference comparison
System.out.println(p1 == p2);  // false (different objects)
System.out.println(p1 == p3);  // true (same reference)

// Content comparison (requires overriding equals())
// System.out.println(p1.equals(p2));  // Depends on equals() implementation
```

---

## Interfaces

### Overview
Interfaces are reference types that define contracts for classes. Variables of interface type can reference objects of classes that implement the interface.

### Interface as Reference Type

```java
// Interface definition
interface Animal {
    void makeSound();
}

// Implementing class
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Using interface as reference type
Animal animal = new Dog();  // Interface reference to Dog object
animal.makeSound();         // "Woof!"

// Programming to interface (best practice)
List<String> list = new ArrayList<>();  // Interface reference
Set<Integer> set = new HashSet<>();     // Interface reference
```

### Benefits of Interface References

1. **Flexibility**: Can change implementation without changing code
2. **Polymorphism**: Can use different implementations interchangeably
3. **Abstraction**: Focus on what, not how

```java
// Can easily switch implementations
List<String> list1 = new ArrayList<>();
List<String> list2 = new LinkedList<>();
List<String> list3 = new Vector<>();

// All can be used the same way
list1.add("Hello");
list2.add("Hello");
list3.add("Hello");
```

### Understanding `List<String> list = new ArrayList<>();`

This line demonstrates several important concepts:

1. **`List<String>`**: Interface type with generic type parameter
2. **`list`**: Variable name
3. **`new ArrayList<>()`**: Creating ArrayList instance
4. **`<>`**: Diamond operator (type inference, Java 7+)

**Key Points**:
- `List` is an interface, `ArrayList` is a concrete class
- Using interface type allows flexibility
- Generics (`<String>`) ensure type safety
- Diamond operator infers type from left side

---

## Key Differences: Primitive vs Reference

| Aspect | Primitive Types | Reference Types |
|--------|----------------|------------------|
| **Storage** | Direct value in stack | Reference (address) in stack, object in heap |
| **Default Value** | Type-specific (0, false, etc.) | `null` |
| **Size** | Fixed (1-8 bytes) | Variable (reference is 32/64 bits) |
| **Comparison** | `==` compares values | `==` compares references, use `.equals()` for content |
| **Assignment** | Copies value | Copies reference |
| **Memory** | Stack memory | Heap memory |
| **Null** | Cannot be null | Can be null |
| **Performance** | Faster | Slower (indirect access) |

### Example Comparison

```java
// Primitive types
int a = 10;
int b = a;      // b gets a copy of a's value
b = 20;         // a is still 10

// Reference types
int[] arr1 = {1, 2, 3};
int[] arr2 = arr1;  // arr2 references the same array
arr2[0] = 100;      // arr1[0] is also 100!
```

---

## Memory Management

### Stack vs Heap

```java
// Primitive - stored in stack
int number = 10;

// Reference - reference in stack, object in heap
String text = "Hello";
int[] numbers = {1, 2, 3};
Person person = new Person("Alice", 25);
```

### Garbage Collection

Objects in heap are automatically garbage collected when no longer referenced.

```java
Person person = new Person("Alice", 25);
person = null;  // Object becomes eligible for garbage collection
// No explicit memory deallocation needed
```

### Memory Leaks

Be careful with references to avoid memory leaks:

```java
// Bad: Keeping unnecessary references
List<Object> bigList = new ArrayList<>();
// ... add many objects
bigList = null;  // Good: Release reference when done
```

---

## Common Operations

### Null Checking

```java
String text = getString();  // May return null

// Safe access
if (text != null) {
    System.out.println(text.length());
}

// Java 8+ Optional (better approach)
Optional<String> optional = Optional.ofNullable(text);
optional.ifPresent(s -> System.out.println(s.length()));
```

### Type Checking

```java
Object obj = "Hello";

// instanceof operator
if (obj instanceof String) {
    String str = (String) obj;  // Safe cast
    System.out.println(str.toUpperCase());
}
```

### Cloning and Copying

```java
// Array cloning
int[] original = {1, 2, 3};
int[] copy = original.clone();

// String copying (strings are immutable, so assignment is safe)
String originalStr = "Hello";
String copyStr = originalStr;  // Both reference same object (safe due to immutability)
```

---

## Best Practices

### 1. String Comparison
```java
// ✅ Good: Use .equals()
if (str1.equals(str2)) { }

// ❌ Bad: Using == for content comparison
if (str1 == str2) { }  // Compares references, not content
```

### 2. Null Safety
```java
// ✅ Good: Check for null
if (obj != null) {
    obj.method();
}

// ✅ Better: Use Optional (Java 8+)
Optional<Object> opt = Optional.ofNullable(obj);
opt.ifPresent(o -> o.method());
```

### 3. Array Initialization
```java
// ✅ Good: Initialize with values
int[] numbers = {1, 2, 3, 4, 5};

// ✅ Good: Initialize with known size
int[] numbers = new int[5];

// ❌ Bad: Uninitialized array
int[] numbers;  // Must initialize before use
```

### 4. Interface References
```java
// ✅ Good: Program to interface
List<String> list = new ArrayList<>();

// ❌ Less flexible: Program to implementation
ArrayList<String> list = new ArrayList<>();
```

### 5. String Manipulation
```java
// ✅ Good: Use StringBuilder for multiple concatenations
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 100; i++) {
    sb.append(i);
}

// ❌ Bad: Multiple string concatenations in loop
String result = "";
for (int i = 0; i < 100; i++) {
    result += i;  // Creates new string each time
}
```

### 6. Array Copying
```java
// ✅ Good: Create copy when needed
int[] copy = original.clone();
// or
int[] copy = Arrays.copyOf(original, original.length);

// ❌ Bad: Assuming assignment creates copy
int[] copy = original;  // Just creates reference, not copy
```

---

## Quick Reference Table

| Type | Default Value | Memory | Comparison | Example |
|------|---------------|--------|------------|---------|
| String | null | Heap | `.equals()` | `String s = "Hello";` |
| Array | null | Heap | `Arrays.equals()` | `int[] arr = {1,2,3};` |
| Class Object | null | Heap | `.equals()` | `Person p = new Person();` |
| Interface | null | Heap | `.equals()` | `List<String> list = new ArrayList<>();` |

---

## Related Files

- `StringExample.java` - Working examples with String type
- `ArrayExample.java` - Working examples with arrays
- `ClassObjectExample.java` - Working examples with class objects

---

**Last Updated**: This reference guide covers all reference data types in Java. Use it as a quick lookup for type specifications, operations, and best practices.

