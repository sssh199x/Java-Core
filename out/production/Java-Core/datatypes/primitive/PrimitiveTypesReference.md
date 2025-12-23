# Primitive Data Types Reference Guide

This is a comprehensive reference guide for all primitive data types in Java. Use this document for quick lookup and understanding of primitive types.

## Table of Contents
1. [Overview](#overview)
2. [Integer Types](#integer-types)
3. [Floating Point Types](#floating-point-types)
4. [Boolean Type](#boolean-type)
5. [Character Type](#character-type)
6. [Default Values](#default-values)
7. [Common Operations](#common-operations)
8. [Best Practices](#best-practices)

---

## Overview

Java has **8 primitive data types** that are built into the language. These types are stored directly in memory and are more efficient than reference types.

### The 8 Primitive Types:
1. **byte** - 8-bit integer
2. **short** - 16-bit integer
3. **int** - 32-bit integer
4. **long** - 64-bit integer
5. **float** - 32-bit floating point
6. **double** - 64-bit floating point
7. **boolean** - true/false
8. **char** - 16-bit Unicode character

---

## Integer Types

### 1. byte
- **Size**: 8 bits (1 byte)
- **Range**: -128 to 127
- **Default Value**: 0
- **Use Case**: When you need to save memory in large arrays, or when working with raw binary data

```java
byte age = 25;
byte temperature = -10;
byte maxValue = 127;  // Maximum value
byte minValue = -128; // Minimum value
```

**When to use**: 
- Large arrays where memory is a concern
- Working with file I/O or network protocols
- When values are guaranteed to be within -128 to 127 range

---

### 2. short
- **Size**: 16 bits (2 bytes)
- **Range**: -32,768 to 32,767
- **Default Value**: 0
- **Use Case**: Similar to byte, but for slightly larger values

```java
short year = 2024;
short population = 15000;
short maxValue = 32767;  // Maximum value
short minValue = -32768; // Minimum value
```

**When to use**:
- Memory-constrained applications
- When values are guaranteed to be within -32,768 to 32,767 range
- Less common than int, but useful for specific scenarios

---

### 3. int
- **Size**: 32 bits (4 bytes)
- **Range**: -2,147,483,648 to 2,147,483,647
- **Default Value**: 0
- **Use Case**: **Most commonly used integer type** in Java

```java
int count = 100;
int temperature = -5;
int maxValue = 2147483647;  // Maximum value
int minValue = -2147483648; // Minimum value
```

**When to use**:
- Default choice for integer values
- Loop counters
- Array indices
- Most mathematical operations

**Note**: Integer literals in Java are `int` by default.

---

### 4. long
- **Size**: 64 bits (8 bytes)
- **Range**: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
- **Default Value**: 0L
- **Use Case**: When int is not large enough

```java
long population = 8000000000L;  // Note the 'L' suffix
long distance = 150000000000L;   // Distance in kilometers
long maxValue = 9223372036854775807L;  // Maximum value
long minValue = -9223372036854775808L; // Minimum value
```

**Important**: Always use `L` suffix for long literals (lowercase `l` is allowed but confusing).

**When to use**:
- Timestamps (milliseconds since epoch)
- Large numbers (population, distances, file sizes)
- When int range is insufficient

---

## Floating Point Types

### 5. float
- **Size**: 32 bits (4 bytes)
- **Range**: Approximately ±3.4 × 10^38
- **Precision**: 6-7 decimal digits
- **Default Value**: 0.0f
- **Use Case**: When you need fractional values but memory is a concern

```java
float price = 19.99f;      // Note the 'f' suffix
float temperature = -5.5f;
float pi = 3.14159f;
float maxValue = 3.4E38f;  // Scientific notation
```

**Important**: Always use `f` suffix for float literals.

**When to use**:
- Memory-constrained applications
- When 6-7 decimal precision is sufficient
- Graphics programming (often uses float)

**Precision Example**:
```java
float f1 = 0.1f;
float f2 = 0.2f;
float sum = f1 + f2;  // May not be exactly 0.3 due to precision
```

---

### 6. double
- **Size**: 64 bits (8 bytes)
- **Range**: Approximately ±1.7 × 10^308
- **Precision**: 15-16 decimal digits
- **Default Value**: 0.0d
- **Use Case**: **Default choice for floating point numbers** in Java

```java
double price = 19.99;           // No suffix needed (default)
double temperature = -5.5;
double pi = 3.141592653589793;
double largeNumber = 1.5e308;   // Scientific notation
```

**When to use**:
- Default choice for decimal numbers
- Mathematical calculations requiring precision
- Scientific computations
- Currency calculations (though BigDecimal is better for exact precision)

**Precision Example**:
```java
double d1 = 0.1;
double d2 = 0.2;
double sum = d1 + d2;  // More precise than float, but still may have rounding
```

---

## Boolean Type

### 7. boolean
- **Size**: Not precisely defined (typically 1 bit, but JVM-dependent)
- **Values**: `true` or `false`
- **Default Value**: false
- **Use Case**: Logical conditions and flags

```java
boolean isJavaFun = true;
boolean isLearning = false;
boolean isActive = true;
```

**Operations**:
```java
boolean a = true;
boolean b = false;

// Logical AND
boolean result1 = a && b;  // false

// Logical OR
boolean result2 = a || b;   // true

// Logical NOT
boolean result3 = !a;      // false

// Comparison operators return boolean
int x = 10;
int y = 20;
boolean isGreater = x > y;  // false
boolean isEqual = x == y;   // false
boolean isNotEqual = x != y; // true
```

**When to use**:
- Conditional statements (if, while, for)
- Flags and state indicators
- Method return values for yes/no questions
- Loop conditions

---

## Character Type

### 8. char
- **Size**: 16 bits (2 bytes)
- **Range**: '\u0000' (0) to '\uffff' (65,535)
- **Default Value**: '\u0000'
- **Use Case**: Storing single Unicode characters

```java
char letter = 'A';
char digit = '5';
char symbol = '@';
char space = ' ';
char newline = '\n';
char tab = '\t';
```

**Unicode Support**:
```java
char unicodeA = '\u0041';  // 'A' in Unicode
char unicodeHeart = '\u2665';  // ♥
char chinese = '中';  // Chinese character
```

**Character Operations**:
```java
char ch = 'A';

// Get ASCII/Unicode value
int asciiValue = (int) ch;  // 65

// Arithmetic operations
char nextChar = (char)(ch + 1);  // 'B'
char prevChar = (char)(ch - 1);  // '@'

// Character methods (using Character class)
boolean isLetter = Character.isLetter(ch);      // true
boolean isDigit = Character.isDigit('5');       // true
boolean isUpperCase = Character.isUpperCase(ch); // true
char lowerCase = Character.toLowerCase(ch);    // 'a'
```

**Escape Sequences**:
```java
char newline = '\n';    // New line
char tab = '\t';        // Tab
char backslash = '\\';  // Backslash
char singleQuote = '\''; // Single quote
char doubleQuote = '\"'; // Double quote
char carriageReturn = '\r'; // Carriage return
```

**When to use**:
- Single character storage
- Character manipulation
- Text processing
- Working with Unicode characters

---

## Default Values

Primitive types have default values **only for instance variables** (class fields). Local variables must be initialized before use.

| Type | Default Value |
|------|---------------|
| byte | 0 |
| short | 0 |
| int | 0 |
| long | 0L |
| float | 0.0f |
| double | 0.0d |
| boolean | false |
| char | '\u0000' |

**Example**:
```java
public class Example {
    int instanceVar;  // Default value: 0
    
    public void method() {
        int localVar;  // Must be initialized!
        // System.out.println(localVar); // Compilation error
        localVar = 10;  // Now it's initialized
    }
}
```

---

## Common Operations

### Arithmetic Operations
All numeric types support:
- Addition: `+`
- Subtraction: `-`
- Multiplication: `*`
- Division: `/`
- Modulus: `%`
- Increment: `++`
- Decrement: `--`

```java
int a = 10;
int b = 3;

int sum = a + b;        // 13
int difference = a - b; // 7
int product = a * b;    // 30
int quotient = a / b;   // 3 (integer division)
int remainder = a % b;  // 1

a++;  // a becomes 11
b--;  // b becomes 2
```

### Comparison Operations
Return boolean values:
- Greater than: `>`
- Less than: `<`
- Greater than or equal: `>=`
- Less than or equal: `<=`
- Equal to: `==`
- Not equal to: `!=`

```java
int x = 10;
int y = 20;

boolean isGreater = x > y;   // false
boolean isLess = x < y;      // true
boolean isEqual = x == y;    // false
boolean isNotEqual = x != y; // true
```

---

## Best Practices

### 1. Choose the Right Type
- Use `int` for most integer operations (default choice)
- Use `long` only when int is insufficient
- Use `double` for most floating point operations (default choice)
- Use `byte`/`short` only when memory is critical

### 2. Literal Suffixes
```java
long value1 = 100L;    // Use uppercase L (not lowercase l)
float value2 = 3.14f;  // Use lowercase f
double value3 = 3.14;  // No suffix needed (default)
```

### 3. Integer Division
```java
int a = 10;
int b = 3;
int result = a / b;  // Result is 3, not 3.33 (integer division)

// For decimal result, cast to double:
double result2 = (double) a / b;  // Result is 3.33...
```

### 4. Floating Point Precision
- Be aware that floating point arithmetic may have rounding errors
- For exact decimal calculations (like currency), use `BigDecimal`

### 5. Character vs String
```java
char single = 'A';           // Single character
String multiple = "Hello";    // Multiple characters
```

### 6. Boolean Naming
Use descriptive names that read like questions:
```java
boolean isActive = true;      // Good
boolean hasPermission = false; // Good
boolean flag = true;          // Bad (not descriptive)
```

### 7. Type Conversion
- Prefer automatic (widening) conversion when possible
- Be careful with explicit (narrowing) conversion - may lose data

---

## Quick Reference Table

| Type | Size | Range | Default | Suffix |
|------|------|-------|----------|--------|
| byte | 8 bits | -128 to 127 | 0 | - |
| short | 16 bits | -32,768 to 32,767 | 0 | - |
| int | 32 bits | -2,147,483,648 to 2,147,483,647 | 0 | - |
| long | 64 bits | ±9.2 × 10^18 | 0L | L |
| float | 32 bits | ±3.4 × 10^38 | 0.0f | f |
| double | 64 bits | ±1.7 × 10^308 | 0.0d | d |
| boolean | 1 bit* | true/false | false | - |
| char | 16 bits | '\u0000' to '\uffff' | '\u0000' | - |

*Boolean size is JVM-dependent, typically 1 bit but may be stored as byte

---

## Related Files

- `IntegerTypes.java` - Working examples with integer types
- `FloatingPointTypes.java` - Working examples with float and double
- `BooleanAndChar.java` - Working examples with boolean and char
- `PrimitiveTypesDemo.java` - Complete demonstration of all primitive types

---

**Last Updated**: This reference guide covers all primitive data types in Java. Use it as a quick lookup for type specifications, ranges, and best practices.

