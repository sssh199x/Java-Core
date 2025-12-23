# Java Data Types Guide

Java is a statically-typed language with two categories of data types:
1. **Primitive Data Types**
2. **Reference Data Types**

## 1. Primitive Data Types

These are the most basic data types available in Java. They are stored directly in memory and are generally more efficient.

### Numeric Types

For signed integer types, the general range formula is:
**-2^(n-1) to 2^(n-1) - 1**, where n is the number of bits

#### Integer Types:

1. **byte**: 8-bit signed two's complement integer
   - Range: -2^7 to 2^7 - 1 (-128 to 127)
   - Default: 0
   - Use case: When you need to save memory in large arrays

2. **short**: 16-bit signed two's complement integer
   - Range: -2^15 to 2^15 - 1 (-32,768 to 32,767)
   - Default: 0
   - Use case: Similar to byte, can also be used to save memory

3. **int**: 32-bit signed two's complement integer
   - Range: -2^31 to 2^31 - 1 (-2,147,483,648 to 2,147,483,647)
   - Default: 0
   - Use case: Most commonly used integer type

4. **long**: 64-bit signed two's complement integer
   - Range: -2^63 to 2^63 - 1 (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
   - Default: 0L
   - Use case: When int is not large enough

#### Floating Point Types:

1. **float**: 32-bit IEEE 754 floating point
   - Range: approximately -3.4E38 to 3.4E38 (6-7 significant decimal digits)
   - Default: 0.0f
   - Use case: When you need fractional values but memory is a concern

2. **double**: 64-bit IEEE 754 floating point
   - Range: approximately -1.8E308 to 1.8E308 (15-16 significant decimal digits)
   - Default: 0.0d
   - Use case: Most commonly used floating point type

#### Non-numeric Types:

1. **boolean**: represents true or false
   - Size: 1 bit of information
   - Default: false
   - Use case: For logical conditions

2. **char**: 16-bit Unicode character
   - Range: '\u0000' (0) to '\uffff' (65,535)
   - Default: '\u0000'
   - Use case: For storing single characters

## 2. Reference Data Types

These are used to store complex values and reference a location in memory. Reference types store addresses (typically 32 or 64 bits) of objects in memory.

### Types of Reference Data:

1. **Class objects**: user-defined types
   - Size depends on the class definition
   - Example: `MyClass obj = new MyClass();`

2. **Arrays**: store multiple values of the same type
   - Size depends on the array length and type of elements
   - Example: `int[] numbers = {1, 2, 3, 4, 5};`

3. **Interfaces**: defined methods for classes to implement
   - Size depends on the implementing class
   - Example: `List<String> list = new ArrayList<>();`

4. **String**: although technically a class, often thought of as a primitive type
   - Size depends on the string length
   - Example: `String text = "Hello, World!";`

### Understanding `List<String> list = new ArrayList<>();`

This line is declaring and initializing a variable that will hold a list of strings:

1. **`List<String>`**:
   - `List` is an interface in Java, part of the Java Collections Framework
   - `<String>` is using generics to specify that this List will contain String objects
   - Using the interface type (List) rather than the concrete class (ArrayList) for the variable declaration is a common practice known as "programming to an interface"

2. **`list`**: This is the name of the variable being declared

3. **`new ArrayList<>()`**:
   - `new` is the keyword used to create a new instance of a class
   - `ArrayList<>()` is creating a new instance of the ArrayList class
   - The empty diamond operator `<>` is using type inference (introduced in Java 7). It means "use the type argument from the left side of the assignment"

**Key points:**
- `List` is an interface, while `ArrayList` is a concrete class that implements the `List` interface
- Using the interface type for the variable allows for more flexibility
- This approach supports the principle of "programming to an interface, not an implementation"
- The use of generics (`<String>`) ensures type safety

## Key Points to Remember

1. Primitive types are stored directly in memory and are generally more efficient
2. Reference types store addresses (typically 32 or 64 bits) of objects in memory
3. Primitive types have lowercase names, reference types start with a capital letter
4. Each primitive type has a corresponding wrapper class (e.g., Integer for int)
5. For integer types, the range is always -(2^(n-1)) to (2^(n-1) - 1), where n is the number of bits

## Type Casting

### 1. Widening Casting (automatic)
Converting a smaller type to a larger type:
```
byte -> short -> char -> int -> long -> float -> double
```

### 2. Narrowing Casting (manual)
Converting a larger type to a smaller type:
```
double -> float -> long -> int -> char -> short -> byte
```

**Examples:**
```java
int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double

double anotherDouble = 9.78d;
int anotherInt = (int) anotherDouble; // Manual casting: double to int
```

Understanding these data types, their sizes, and characteristics is crucial for efficient Java programming and memory management.

