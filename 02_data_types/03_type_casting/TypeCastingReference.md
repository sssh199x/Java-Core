# Type Casting Reference Guide

This is a comprehensive reference guide for type casting in Java. Use this document for quick lookup and understanding of type conversions.

## Table of Contents
1. [Overview](#overview)
2. [Widening Casting (Automatic)](#widening-casting-automatic)
3. [Narrowing Casting (Explicit)](#narrowing-casting-explicit)
4. [Casting Rules and Hierarchy](#casting-rules-and-hierarchy)
5. [Common Casting Scenarios](#common-casting-scenarios)
6. [Potential Issues and Pitfalls](#potential-issues-and-pitfalls)
7. [Best Practices](#best-practices)
8. [Quick Reference](#quick-reference)

---

## Overview

Type casting is the process of converting a value from one data type to another. Java supports two types of casting:

1. **Widening Casting (Automatic/Implicit)** - Converting smaller type to larger type
2. **Narrowing Casting (Manual/Explicit)** - Converting larger type to smaller type

### Key Concepts

- **Widening**: Safe conversion, no data loss, done automatically
- **Narrowing**: May cause data loss, requires explicit cast operator `(type)`
- **Type Promotion**: Automatic conversion in expressions

---

## Widening Casting (Automatic)

Widening casting converts a smaller type to a larger type. Java performs this automatically - no explicit cast is needed.

### Widening Hierarchy

```
byte → short → int → long → float → double
         ↓
        char → int → long → float → double
```

### Rules for Widening Casting

1. **Automatic**: No cast operator needed
2. **Safe**: No data loss occurs
3. **Direction**: Always smaller to larger
4. **Compatible Types**: Must be in the widening hierarchy

### Integer Widening

```java
// byte to short
byte byteValue = 100;
short shortValue = byteValue;  // Automatic conversion
System.out.println(shortValue); // 100

// short to int
int intValue = shortValue;  // Automatic conversion
System.out.println(intValue); // 100

// int to long
long longValue = intValue;  // Automatic conversion
System.out.println(longValue); // 100

// Complete chain
byte b = 50;
short s = b;    // byte → short
int i = s;      // short → int
long l = i;     // int → long
```

### Floating Point Widening

```java
// int to float
int intValue = 100;
float floatValue = intValue;  // Automatic conversion
System.out.println(floatValue); // 100.0

// float to double
double doubleValue = floatValue;  // Automatic conversion
System.out.println(doubleValue); // 100.0

// int to double (direct)
int num = 42;
double decimal = num;  // Automatic conversion
System.out.println(decimal); // 42.0
```

### Character Widening

```java
// char to int (gets ASCII/Unicode value)
char letter = 'A';
int asciiValue = letter;  // Automatic conversion
System.out.println(asciiValue); // 65

// char to long
long longFromChar = letter;  // Automatic conversion
System.out.println(longFromChar); // 65

// char to float
float floatFromChar = letter;  // Automatic conversion
System.out.println(floatFromChar); // 65.0
```

### Complete Widening Examples

```java
// Example 1: Complete numeric chain
byte b = 100;
short s = b;
int i = s;
long l = i;
float f = l;
double d = f;
// All conversions are automatic and safe

// Example 2: Mixed types
int x = 10;
double y = x;  // int → double (automatic)
System.out.println(y); // 10.0

// Example 3: Character to numeric
char ch = 'Z';
int code = ch;        // char → int (automatic)
long codeLong = ch;   // char → long (automatic)
double codeDouble = ch; // char → double (automatic)
```

---

## Narrowing Casting (Explicit)

Narrowing casting converts a larger type to a smaller type. This requires an explicit cast operator and may result in data loss.

### Narrowing Hierarchy

```
double → float → long → int → char → short → byte
```

### Rules for Narrowing Casting

1. **Explicit**: Must use cast operator `(type)`
2. **Potential Data Loss**: May lose precision or value
3. **Direction**: Always larger to smaller
4. **Required**: Compiler will not do this automatically

### Floating Point to Integer Narrowing

```java
// double to float
double doubleValue = 9.78;
float floatValue = (float) doubleValue;  // Explicit cast required
System.out.println(floatValue); // 9.78

// float to long
float f = 123.456f;
long l = (long) f;  // Explicit cast, loses decimal part
System.out.println(l); // 123

// double to int
double price = 99.99;
int priceInt = (int) price;  // Explicit cast, truncates decimal
System.out.println(priceInt); // 99 (not 100!)
```

### Integer Narrowing

```java
// long to int
long bigNumber = 2147483647L;
int intValue = (int) bigNumber;  // Explicit cast
System.out.println(intValue); // 2147483647

// int to short
int largeInt = 32767;
short shortValue = (short) largeInt;  // Explicit cast
System.out.println(shortValue); // 32767

// short to byte
short s = 127;
byte b = (byte) s;  // Explicit cast
System.out.println(b); // 127
```

### Character Narrowing

```java
// int to char
int asciiValue = 65;
char letter = (char) asciiValue;  // Explicit cast
System.out.println(letter); // 'A'

// double to char
double d = 66.5;
char ch = (char) d;  // Explicit cast, truncates to 66
System.out.println(ch); // 'B'
```

### Data Loss Examples

```java
// Example 1: Decimal truncation
double precise = 3.14159;
int truncated = (int) precise;
System.out.println(truncated); // 3 (decimal part lost)

// Example 2: Overflow (value exceeds target type range)
long veryBig = 2147483648L;  // Larger than int max
int overflowed = (int) veryBig;
System.out.println(overflowed); // -2147483648 (wrapped around!)

// Example 3: Precision loss
double d = 123.456789;
float f = (float) d;  // May lose precision
System.out.println(f); // 123.45679 (rounded)
```

---

## Casting Rules and Hierarchy

### Numeric Type Hierarchy

```
byte (8 bits)
  ↓
short (16 bits)
  ↓
int (32 bits)
  ↓
long (64 bits)
  ↓
float (32 bits)
  ↓
double (64 bits)

char (16 bits) → int → long → float → double
```

### Important Notes

1. **char is special**: Can be widened to int, but int cannot be automatically narrowed to char
2. **float to double**: Even though float is 32 bits and double is 64 bits, float can be widened to double
3. **No direct conversion**: byte and char cannot be directly converted to each other (must go through int)

### Type Promotion in Expressions

Java automatically promotes types in expressions:

```java
// Example 1: int + double = double
int a = 10;
double b = 3.5;
double result = a + b;  // a is promoted to double
System.out.println(result); // 13.5

// Example 2: byte + int = int
byte x = 5;
int y = 10;
int sum = x + y;  // x is promoted to int
System.out.println(sum); // 15

// Example 3: char + int = int
char ch = 'A';
int num = 5;
int result2 = ch + num;  // ch is promoted to int
System.out.println(result2); // 70 (65 + 5)
```

---

## Common Casting Scenarios

### 1. Calculating Averages

```java
// Problem: Integer division gives integer result
int sum = 95;
int count = 3;
int average = sum / count;  // Result: 31 (not 31.67!)

// Solution: Cast to double
double averageCorrect = (double) sum / count;  // Result: 31.666...
System.out.println(averageCorrect); // 31.666666666666668
```

### 2. Percentage Calculations

```java
int obtained = 75;
int total = 100;

// Without casting: integer division
int percentage1 = (obtained / total) * 100;  // 0 (wrong!)

// With casting: proper decimal calculation
double percentage2 = ((double) obtained / total) * 100;  // 75.0 (correct!)
System.out.println(percentage2); // 75.0
```

### 3. Character to Integer Conversion

```java
// Convert char digit to int
char digit = '5';
int numericValue = digit - '0';  // 5 (not 53!)
System.out.println(numericValue);

// Get ASCII value
char letter = 'A';
int ascii = (int) letter;  // 65
System.out.println(ascii);

// Convert int to char
int code = 66;
char character = (char) code;  // 'B'
System.out.println(character);
```

### 4. Rounding Using Casting

```java
// Round to nearest integer
double value = 3.7;
int rounded = (int) (value + 0.5);  // 4
System.out.println(rounded);

double value2 = 3.4;
int rounded2 = (int) (value2 + 0.5);  // 3
System.out.println(rounded2);
```

### 5. Safe Conversion with Range Checking

```java
int value = 100;

// Check if value fits in byte range before casting
if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
    byte safeByte = (byte) value;
    System.out.println("Safe conversion: " + safeByte);
} else {
    System.out.println("Value out of byte range");
}

// Check if value fits in short range
if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
    short safeShort = (short) value;
    System.out.println("Safe conversion: " + safeShort);
}
```

### 6. Array Type Casting

```java
// Object array to specific type array
Object[] objects = {1, 2, 3, 4, 5};
Integer[] integers = new Integer[objects.length];
for (int i = 0; i < objects.length; i++) {
    integers[i] = (Integer) objects[i];
}
```

### 7. Method Parameter Casting

```java
// Method expects int, but you have long
long bigNumber = 100L;
processNumber((int) bigNumber);  // Explicit cast required

void processNumber(int num) {
    System.out.println(num);
}
```

---

## Potential Issues and Pitfalls

### 1. Integer Division

```java
// ❌ Problem: Integer division
int a = 10;
int b = 3;
int result = a / b;  // Result: 3 (not 3.33!)

// ✅ Solution: Cast to double
double result2 = (double) a / b;  // Result: 3.333...
```

### 2. Overflow in Narrowing

```java
// ❌ Problem: Value exceeds target type range
long big = 3000000000L;  // 3 billion
int small = (int) big;   // Overflow! Result: -1294967296
System.out.println(small); // Wrong value!

// ✅ Solution: Check range first
if (big >= Integer.MIN_VALUE && big <= Integer.MAX_VALUE) {
    int safe = (int) big;
} else {
    System.out.println("Value too large for int");
}
```

### 3. Precision Loss

```java
// ❌ Problem: Losing decimal precision
double precise = 3.141592653589793;
float lessPrecise = (float) precise;  // Loses precision
System.out.println(lessPrecise); // 3.1415927

// ✅ Solution: Keep as double if precision matters
double keptPrecise = precise;  // No casting needed
```

### 4. Truncation vs Rounding

```java
// Casting truncates, doesn't round
double value = 3.9;
int truncated = (int) value;  // 3 (not 4!)
System.out.println(truncated);

// For rounding, use Math.round()
int rounded = (int) Math.round(value);  // 4
System.out.println(rounded);
```

### 5. char and byte Conversion

```java
// ❌ Problem: Cannot directly convert char to byte
char ch = 'A';
// byte b = ch;  // Compilation error!

// ✅ Solution: Go through int
byte b = (byte) ch;  // Explicit cast through int
System.out.println(b); // 65
```

---

## Best Practices

### 1. Use Widening When Possible

```java
// ✅ Good: Let Java do automatic widening
int value = 100;
double result = value;  // Automatic, safe

// ❌ Unnecessary: Explicit cast not needed
double result2 = (double) value;  // Works but unnecessary
```

### 2. Always Check Ranges for Narrowing

```java
// ✅ Good: Check before narrowing
long bigValue = 2147483648L;
if (bigValue >= Integer.MIN_VALUE && bigValue <= Integer.MAX_VALUE) {
    int safe = (int) bigValue;
} else {
    // Handle error
}

// ❌ Bad: Blind casting
int unsafe = (int) bigValue;  // May cause overflow
```

### 3. Use Appropriate Types from Start

```java
// ✅ Good: Use double for calculations requiring decimals
double average = (double) sum / count;

// ❌ Less ideal: Using int then casting
int sum = 100;
int count = 3;
double average = (double) sum / count;  // Works but could use double from start
```

### 4. Be Explicit About Intent

```java
// ✅ Good: Clear intent with explicit cast
double price = 99.99;
int priceInCents = (int) (price * 100);  // Clear: converting to cents

// ❌ Less clear: Implicit conversion
int priceInCents2 = (int) price * 100;  // Different result! (99 * 100)
```

### 5. Handle Precision Carefully

```java
// ✅ Good: Use BigDecimal for exact decimal calculations
import java.math.BigDecimal;
BigDecimal price = new BigDecimal("19.99");
BigDecimal tax = price.multiply(new BigDecimal("0.08"));

// ❌ Problem: Floating point precision issues
double price2 = 19.99;
double tax2 = price2 * 0.08;  // May have precision errors
```

### 6. Document Non-Obvious Casts

```java
// ✅ Good: Comment explains why cast is needed
// Cast to double to get decimal result from integer division
double average = (double) sum / count;

// ✅ Good: Comment explains potential data loss
// Casting long to int - value is known to be within int range
int value = (int) longValue;
```

---

## Quick Reference

### Widening Casting (Automatic)

| From | To | Example |
|------|-----|---------|
| byte | short, int, long, float, double | `int i = b;` |
| short | int, long, float, double | `int i = s;` |
| int | long, float, double | `long l = i;` |
| long | float, double | `float f = l;` |
| float | double | `double d = f;` |
| char | int, long, float, double | `int i = ch;` |

### Narrowing Casting (Explicit)

| From | To | Example | Potential Issues |
|------|-----|---------|-----------------|
| double | float | `float f = (float) d;` | Precision loss |
| double | long, int, short, byte | `int i = (int) d;` | Truncation |
| float | long, int, short, byte | `int i = (int) f;` | Truncation |
| long | int, short, byte | `int i = (int) l;` | Overflow |
| int | short, byte | `short s = (short) i;` | Overflow |
| short | byte | `byte b = (byte) s;` | Overflow |
| int | char | `char ch = (char) i;` | Value check needed |

### Type Promotion in Expressions

| Operation | Result Type |
|-----------|-------------|
| byte + int | int |
| short + int | int |
| int + double | double |
| float + double | double |
| char + int | int |

### Common Patterns

```java
// Integer division to decimal
double result = (double) numerator / denominator;

// Rounding
int rounded = (int) (value + 0.5);

// Character conversion
int digit = charDigit - '0';
char letter = (char) (asciiValue);

// Safe narrowing
if (value >= MIN && value <= MAX) {
    targetType result = (targetType) value;
}
```

---

## Related Files

- `WideningCasting.java` - Working examples of automatic type conversion
- `NarrowingCasting.java` - Working examples of explicit type conversion
- `CastingExamples.java` - Practical casting scenarios

---

## Summary

### Key Takeaways

1. **Widening is automatic**: Smaller types automatically convert to larger types
2. **Narrowing requires explicit cast**: Use `(type)` operator, may lose data
3. **Check ranges**: Always verify values fit in target type before narrowing
4. **Beware of integer division**: Cast to double for decimal results
5. **Precision matters**: Use appropriate types from the start
6. **Document non-obvious casts**: Explain why casting is necessary

### When to Use Each

- **Widening**: When you need more precision or range (automatic)
- **Narrowing**: When you need to fit into a smaller type (explicit, check ranges)
- **Type Promotion**: Happens automatically in expressions

---

**Last Updated**: This reference guide covers all type casting scenarios in Java. Use it as a quick lookup for casting rules, common patterns, and best practices.

