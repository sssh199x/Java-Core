# Method Overloading Reference Guide

This is a comprehensive reference guide for method overloading in Java. Use this document for quick lookup and understanding of method overloading concepts and best practices.

## Table of Contents
1. [Overview](#overview)
2. [What is Method Overloading](#what-is-method-overloading)
3. [Rules for Method Overloading](#rules-for-method-overloading)
4. [Types of Method Overloading](#types-of-method-overloading)
5. [Method Resolution](#method-resolution)
6. [Common Scenarios](#common-scenarios)
7. [Best Practices](#best-practices)
8. [Quick Reference](#quick-reference)

---

## Overview

**Method overloading** is a feature in Java that allows a class to have multiple methods with the same name but different parameter lists. It's a form of compile-time polymorphism.

### Key Characteristics

- **Same method name**: All overloaded methods must have the same name
- **Different parameters**: Must differ in number, type, or order of parameters
- **Compile-time resolution**: Java determines which method to call at compile time
- **Return type**: Can be different, but alone is not sufficient for overloading

### Benefits

1. **Flexibility**: Provide multiple ways to call a method
2. **Convenience**: Different parameter combinations for different use cases
3. **Readability**: Intuitive method names for similar operations
4. **Code reuse**: Avoid creating methods with different names

---

## What is Method Overloading

### Definition

Method overloading occurs when two or more methods in the same class have:
- The **same name**
- **Different parameter lists** (number, type, or order)

### Basic Example

```java
public class Calculator {
    // Method 1: Two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method 2: Three integers (different number of parameters)
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method 3: Two doubles (different parameter types)
    public double add(double a, double b) {
        return a + b;
    }
}

// Usage
Calculator calc = new Calculator();
calc.add(10, 20);        // Calls Method 1
calc.add(10, 20, 30);    // Calls Method 2
calc.add(10.5, 20.5);    // Calls Method 3
```

### Method Overloading vs Method Overriding

| Aspect | Method Overloading | Method Overriding |
|--------|-------------------|-------------------|
| **Location** | Same class | Different classes (inheritance) |
| **Method name** | Same | Same |
| **Parameters** | Must differ | Must be same |
| **Return type** | Can differ | Must be compatible |
| **Resolution** | Compile-time | Runtime |
| **Access modifier** | Can differ | Cannot be more restrictive |

---

## Rules for Method Overloading

### Rule 1: Same Method Name

All overloaded methods must have exactly the same name.

```java
// ✅ Correct
public void print(int x) { }
public void print(String s) { }

// ❌ Wrong - different names
public void print(int x) { }
public void display(int x) { }  // Not overloading
```

### Rule 2: Different Parameter Lists

Methods must differ in:
- **Number of parameters**, OR
- **Type of parameters**, OR
- **Order of parameters** (if types differ)

```java
// ✅ Correct: Different number
public void method(int a) { }
public void method(int a, int b) { }

// ✅ Correct: Different types
public void method(int a) { }
public void method(String s) { }

// ✅ Correct: Different order
public void method(int a, String s) { }
public void method(String s, int a) { }

// ❌ Wrong: Same parameters
public int method(int a) { }
public double method(int a) { }  // Compilation error!
```

### Rule 3: Return Type Alone is Not Sufficient

You cannot overload methods based solely on return type.

```java
// ❌ Compilation Error
public int add(int a, int b) {
    return a + b;
}

public double add(int a, int b) {  // Same parameters!
    return (double)(a + b);
}
```

**Why?** The compiler cannot determine which method to call based on return type alone.

```java
add(5, 10);  // Which method should be called? Ambiguous!
```

### Rule 4: Access Modifiers Can Differ

Access modifiers don't affect overloading.

```java
// ✅ Valid overloading
public void method(int a) { }
private void method(String s) { }
protected void method(double d) { }
```

### Rule 5: Static and Non-Static Can Overload

Static and instance methods can overload each other.

```java
// ✅ Valid overloading
public void method(int a) { }
public static void method(String s) { }
```

### Rule 6: Varargs Can Overload

Methods with varargs can be overloaded.

```java
// ✅ Valid overloading
public void method(int a) { }
public void method(int... numbers) { }
```

**Note**: Be careful with varargs - can cause ambiguity.

---

## Types of Method Overloading

### 1. Overloading by Number of Parameters

Methods differ in the number of parameters.

```java
public class Printer {
    public void print() {
        System.out.println("No parameters");
    }
    
    public void print(String text) {
        System.out.println(text);
    }
    
    public void print(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
}

// Usage
Printer printer = new Printer();
printer.print();                    // No parameters
printer.print("Hello");            // One parameter
printer.print("Hello", 3);         // Two parameters
```

### 2. Overloading by Type of Parameters

Methods differ in the type of parameters.

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public String add(String a, String b) {
        return a + b;  // String concatenation
    }
}

// Usage
Calculator calc = new Calculator();
calc.add(5, 10);              // int version
calc.add(5.5, 10.5);           // double version
calc.add("Hello", "World");    // String version
```

### 3. Overloading by Parameter Order

Methods differ in the order of parameters (when types differ).

```java
public class Person {
    public void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public void displayInfo(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}

// Usage
Person person = new Person();
person.displayInfo("John", 25);    // String, int
person.displayInfo(25, "John");    // int, String
```

**Note**: Order matters only when parameter types are different.

### 4. Overloading with Arrays

Methods can be overloaded with different array types.

```java
public class Processor {
    public void process(int[] numbers) {
        System.out.println("Processing integer array");
    }
    
    public void process(String[] words) {
        System.out.println("Processing string array");
    }
    
    public void process(double[] values) {
        System.out.println("Processing double array");
    }
}

// Usage
Processor proc = new Processor();
proc.process(new int[]{1, 2, 3});
proc.process(new String[]{"hello", "world"});
proc.process(new double[]{1.5, 2.5});
```

### 5. Overloading with Varargs

Methods with varargs can be overloaded.

```java
public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    
    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}

// Usage
Calculator calc = new Calculator();
calc.sum(5, 10);           // Calls two-parameter version
calc.sum(1, 2, 3, 4, 5);   // Calls varargs version
```

**Warning**: Varargs can cause ambiguity:

```java
public void method(int a) { }
public void method(int... numbers) { }

method(5);  // Ambiguous! Could call either
```

---

## Method Resolution

### How Java Chooses Which Method to Call

Java determines which overloaded method to call based on:

1. **Exact match**: If exact parameter types match
2. **Widening conversion**: If no exact match, tries automatic type promotion
3. **Varargs**: If no match found, tries varargs
4. **Compilation error**: If ambiguous or no match found

### Resolution Process

```java
public class Example {
    public void method(int a) {
        System.out.println("int version");
    }
    
    public void method(double a) {
        System.out.println("double version");
    }
    
    public void method(String a) {
        System.out.println("String version");
    }
}

Example obj = new Example();
obj.method(5);      // Calls int version (exact match)
obj.method(5.0);    // Calls double version (exact match)
obj.method('A');    // Calls int version (char widens to int)
obj.method("Hello"); // Calls String version (exact match)
```

### Type Promotion Order

When no exact match, Java tries widening conversions:

```
byte → short → int → long → float → double
char → int → long → float → double
```

```java
public class Example {
    public void method(int a) { }
    public void method(double a) { }
}

Example obj = new Example();
obj.method(5);    // int - exact match
obj.method(5L);    // long - widens to double (no int version for long)
obj.method(5.0f);  // float - widens to double
```

### Ambiguous Method Calls

If the compiler cannot determine which method to call, it's an error:

```java
public class Example {
    public void method(int a, double b) { }
    public void method(double a, int b) { }
}

Example obj = new Example();
obj.method(5, 5);  // Ambiguous! Could call either
// Compilation error: reference to method is ambiguous
```

---

## Common Scenarios

### Scenario 1: Mathematical Operations

```java
public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
```

### Scenario 2: Print Methods

```java
public class Printer {
    public void print() {
        System.out.println();
    }
    
    public void print(String text) {
        System.out.println(text);
    }
    
    public void print(int number) {
        System.out.println(number);
    }
    
    public void print(double number) {
        System.out.println(number);
    }
    
    public void print(String format, Object... args) {
        System.out.printf(format, args);
    }
}
```

### Scenario 3: Constructor Overloading

Constructors can also be overloaded (same concept):

```java
public class Person {
    private String name;
    private int age;
    
    public Person() {
        this("Unknown", 0);
    }
    
    public Person(String name) {
        this(name, 0);
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

### Scenario 4: Utility Methods

```java
public class StringUtils {
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
    
    public static boolean isEmpty(String[] array) {
        return array == null || array.length == 0;
    }
    
    public static boolean isEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }
}
```

---

## Best Practices

### 1. Keep Overloaded Methods Consistent

```java
// ✅ Good: Consistent behavior
public int add(int a, int b) {
    return a + b;
}

public int add(int a, int b, int c) {
    return a + b + c;
}

// ❌ Less ideal: Inconsistent behavior
public int add(int a, int b) {
    return a + b;
}

public int add(int a, int b, int c) {
    return a * b * c;  // Different operation!
}
```

### 2. Avoid Ambiguity

```java
// ✅ Good: Clear distinction
public void process(int value) { }
public void process(String text) { }

// ❌ Problem: Ambiguous
public void process(int a, double b) { }
public void process(double a, int b) { }
// process(5, 5) is ambiguous
```

### 3. Use Meaningful Parameter Names

```java
// ✅ Good: Clear parameter names
public void setInfo(String name, int age) { }
public void setInfo(String firstName, String lastName) { }

// ❌ Less clear: Generic names
public void setInfo(String a, int b) { }
public void setInfo(String x, String y) { }
```

### 4. Document Overloaded Methods

```java
/**
 * Adds two integers.
 * @param a first integer
 * @param b second integer
 * @return sum of a and b
 */
public int add(int a, int b) {
    return a + b;
}

/**
 * Adds three integers.
 * @param a first integer
 * @param b second integer
 * @param c third integer
 * @return sum of a, b, and c
 */
public int add(int a, int b, int c) {
    return a + b + c;
}
```

### 5. Prefer Overloading Over Different Names

```java
// ✅ Good: Overloading
public void print(int value) { }
public void print(String text) { }

// ❌ Less ideal: Different names
public void printInt(int value) { }
public void printString(String text) { }
```

### 6. Be Careful with Varargs

```java
// ✅ Good: Clear distinction
public void method(int a, int b) { }
public void method(int... numbers) { }

// ⚠️ Warning: Can be ambiguous
public void method(int a) { }
public void method(int... numbers) { }
// method(5) is ambiguous
```

### 7. Consider Using Builder Pattern for Complex Cases

For many parameters, consider builder pattern instead of many overloaded methods:

```java
// Instead of many overloaded constructors:
Person p1 = new Person("John");
Person p2 = new Person("John", 25);
Person p3 = new Person("John", 25, "NYC");
// ... many more

// Consider builder:
Person person = new Person.Builder()
    .name("John")
    .age(25)
    .city("NYC")
    .build();
```

---

## Quick Reference

### Method Overloading Rules

| Rule | Description |
|------|-------------|
| **Same Name** | All methods must have same name |
| **Different Parameters** | Must differ in number, type, or order |
| **Return Type** | Can differ, but alone is not sufficient |
| **Access Modifier** | Can differ |
| **Static** | Static and instance can overload each other |

### Valid Overloading Examples

```java
// ✅ Different number
void method(int a) { }
void method(int a, int b) { }

// ✅ Different types
void method(int a) { }
void method(String s) { }

// ✅ Different order
void method(int a, String s) { }
void method(String s, int a) { }

// ✅ Different return types (with different params)
int method(int a) { }
double method(double a) { }
```

### Invalid Overloading Examples

```java
// ❌ Same parameters, different return type
int method(int a) { }
double method(int a) { }  // Compilation error

// ❌ Same parameters, different access modifier only
public void method(int a) { }
private void method(int a) { }  // Compilation error
```

### Method Resolution Priority

1. **Exact match** - Same parameter types
2. **Widening conversion** - Automatic type promotion
3. **Varargs** - Variable arguments
4. **Error** - If ambiguous or no match

### Common Patterns

```java
// Pattern 1: Number of parameters
void method() { }
void method(int a) { }
void method(int a, int b) { }

// Pattern 2: Type of parameters
void method(int a) { }
void method(double a) { }
void method(String a) { }

// Pattern 3: Convenience methods
void process(int value) { }
void process(int[] values) { }
void process(int... values) { }
```

---

## Related Files

- `examples/MethodOverloading.java` - Basic method overloading examples
- `examples/OverloadingExamples.java` - Advanced overloading scenarios
- `exercises/SimpleOverloadingExamples.java` - Working examples

---

## Summary

### Key Takeaways

1. **Method overloading** allows multiple methods with same name but different parameters
2. **Parameters must differ** in number, type, or order
3. **Return type alone** is not sufficient for overloading
4. **Compile-time resolution** - Java determines which method at compile time
5. **Type promotion** - Java automatically widens types if no exact match
6. **Avoid ambiguity** - Ensure method calls are unambiguous
7. **Keep consistent** - Overloaded methods should have similar behavior

### When to Use Method Overloading

- **Similar operations** with different parameter types
- **Convenience methods** with different numbers of parameters
- **Flexible APIs** that accept different input types
- **Mathematical operations** that work with different numeric types

### Common Mistakes

1. **Trying to overload by return type only**
2. **Creating ambiguous method calls**
3. **Inconsistent behavior** between overloaded methods
4. **Too many overloaded methods** (consider builder pattern)

---

**Last Updated**: This reference guide covers all method overloading concepts in Java. Use it as a quick lookup for overloading rules, examples, and best practices.

