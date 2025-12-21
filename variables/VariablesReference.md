# Variables Reference Guide

This is a comprehensive reference guide for variables in Java. Use this document for quick lookup and understanding of different variable types and their usage.

## Table of Contents
1. [Overview](#overview)
2. [Local Variables](#local-variables)
3. [Instance Variables](#instance-variables)
4. [Static Variables](#static-variables)
5. [Variable Scope](#variable-scope)
6. [Variable Naming Conventions](#variable-naming-conventions)
7. [Variable Initialization](#variable-initialization)
8. [Best Practices](#best-practices)
9. [Quick Reference](#quick-reference)

---

## Overview

Variables in Java are containers that store data values. Java has three main types of variables based on their scope and lifetime:

1. **Local Variables** - Declared inside methods, constructors, or blocks
2. **Instance Variables** - Declared in a class, outside any method
3. **Static Variables** - Declared with `static` keyword, belong to the class

### Key Characteristics

| Variable Type | Scope | Lifetime | Default Value | Memory Location |
|---------------|-------|----------|---------------|-----------------|
| Local | Method/Block | Method/Block execution | Must be initialized | Stack |
| Instance | Object | Object lifetime | Type-specific | Heap |
| Static | Class | Program lifetime | Type-specific | Method Area |

---

## Local Variables

### Definition
Local variables are declared inside methods, constructors, or blocks. They are only accessible within the scope where they are declared.

### Characteristics
- **Scope**: Limited to the method, constructor, or block where declared
- **Lifetime**: Exist only during execution of that method/block
- **Initialization**: **Must be initialized** before use (no default value)
- **Memory**: Stored in stack memory
- **Access Modifiers**: Cannot use access modifiers (public, private, etc.)

### Basic Example

```java
public void method() {
    int localVar = 10;  // Local variable
    System.out.println(localVar);
}
```

### Local Variables in Methods

```java
public class Example {
    public void calculateSum() {
        int num1 = 10;      // Local variable
        int num2 = 20;      // Local variable
        int sum = num1 + num2;  // Local variable
        System.out.println("Sum: " + sum);
    }
    
    public void anotherMethod() {
        // num1 and num2 are not accessible here
        // They are out of scope
    }
}
```

### Local Variables in Blocks

```java
public void demonstrateBlockScope() {
    int outerVar = 100;  // Local to method
    
    {
        int blockVar = 50;  // Local to block
        System.out.println(outerVar);  // Can access outer variable
        System.out.println(blockVar);   // Can access block variable
    }
    
    // blockVar is not accessible here - out of scope
    // System.out.println(blockVar);  // Compilation error!
    System.out.println(outerVar);  // Still accessible
}
```

### Local Variables in Loops

```java
public void loopExample() {
    for (int i = 0; i < 5; i++) {  // i is local to loop
        System.out.println(i);
    }
    // i is not accessible here - out of scope
    // System.out.println(i);  // Compilation error!
}
```

### Local Variables in Constructors

```java
public class Person {
    public Person(String name) {
        String localName = name;  // Local variable in constructor
        System.out.println("Creating person: " + localName);
    }
}
```

### Important Rules for Local Variables

1. **Must be initialized before use**
```java
public void example() {
    int x;  // Declared but not initialized
    // System.out.println(x);  // Compilation error!
    x = 10;  // Now initialized
    System.out.println(x);  // OK
}
```

2. **Cannot use access modifiers**
```java
public void example() {
    // public int x;  // Compilation error!
    // private int y; // Compilation error!
    int z;  // Correct
}
```

3. **Cannot be static**
```java
public void example() {
    // static int x;  // Compilation error!
    int y;  // Correct
}
```

---

## Instance Variables

### Definition
Instance variables are declared in a class, outside any method, constructor, or block. Each object (instance) of the class has its own copy of instance variables.

### Characteristics
- **Scope**: Accessible throughout the class and by object reference
- **Lifetime**: Exist as long as the object exists
- **Initialization**: Have default values (0, false, null, etc.)
- **Memory**: Stored in heap memory (with the object)
- **Access Modifiers**: Can use access modifiers (public, private, protected)

### Basic Example

```java
public class Student {
    String name;        // Instance variable
    int age;            // Instance variable
    double grade;       // Instance variable
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```

### Each Object Has Its Own Copy

```java
public class Person {
    String name;  // Instance variable
    int age;      // Instance variable
    
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 25;
        
        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 30;
        
        // Each object has its own copy
        System.out.println(person1.name);  // "Alice"
        System.out.println(person2.name);   // "Bob"
    }
}
```

### Default Values

Instance variables are automatically initialized to default values:

| Type | Default Value |
|------|---------------|
| byte, short, int, long | 0 |
| float, double | 0.0 |
| boolean | false |
| char | '\u0000' |
| Reference types | null |

```java
public class Example {
    int number;           // Default: 0
    double price;        // Default: 0.0
    boolean isActive;    // Default: false
    String name;         // Default: null
    
    public void displayDefaults() {
        System.out.println("number: " + number);      // 0
        System.out.println("price: " + price);        // 0.0
        System.out.println("isActive: " + isActive);  // false
        System.out.println("name: " + name);          // null
    }
}
```

### Accessing Instance Variables

```java
public class BankAccount {
    private double balance;  // Private instance variable
    
    public void deposit(double amount) {
        balance += amount;  // Accessing instance variable
    }
    
    public double getBalance() {
        return balance;  // Accessing instance variable
    }
}
```

### Modifying Instance Variables

```java
public class Counter {
    int count;  // Instance variable
    
    public void increment() {
        count++;  // Modifying instance variable
    }
    
    public void reset() {
        count = 0;  // Modifying instance variable
    }
}
```

---

## Static Variables

### Definition
Static variables are declared with the `static` keyword. They belong to the class, not to any instance. All objects of the class share the same static variable.

### Characteristics
- **Scope**: Accessible throughout the class and can be accessed via class name
- **Lifetime**: Exist for the entire program execution
- **Initialization**: Have default values, initialized when class is first loaded
- **Memory**: Stored in method area (part of heap)
- **Access**: Can be accessed without creating an object
- **Shared**: All instances share the same static variable

### Basic Example

```java
public class Counter {
    static int count = 0;  // Static variable
    
    public Counter() {
        count++;  // Increment shared counter
    }
    
    public static void main(String[] args) {
        System.out.println(Counter.count);  // Access without object
        new Counter();
        new Counter();
        System.out.println(Counter.count);  // 2
    }
}
```

### Shared Across All Instances

```java
public class Student {
    String name;           // Instance variable
    static String school;  // Static variable (shared)
    
    public Student(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
        Student.school = "Java Academy";  // Set static variable
        
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        
        System.out.println(s1.name + " goes to " + s1.school);
        System.out.println(s2.name + " goes to " + s2.school);
        
        // Changing static variable affects all objects
        Student.school = "New Academy";
        System.out.println(s1.school);  // "New Academy"
        System.out.println(s2.school);  // "New Academy"
    }
}
```

### Accessing Static Variables

```java
public class Constants {
    static final double PI = 3.14159;
    static int counter = 0;
    
    public static void main(String[] args) {
        // Access via class name (recommended)
        System.out.println(Constants.PI);
        System.out.println(Constants.counter);
        
        // Access via object (not recommended but works)
        Constants obj = new Constants();
        System.out.println(obj.PI);  // Works but not recommended
    }
}
```

### Static Block

Static variables can be initialized in a static block:

```java
public class Example {
    static int value;
    static String name;
    
    // Static block - executed when class is first loaded
    static {
        value = 100;
        name = "Java";
        System.out.println("Static block executed");
    }
}
```

### Common Use Cases for Static Variables

1. **Constants**
```java
public class MathConstants {
    static final double PI = 3.14159;
    static final double E = 2.71828;
}
```

2. **Counters**
```java
public class ObjectCounter {
    static int count = 0;
    
    public ObjectCounter() {
        count++;
    }
    
    public static int getCount() {
        return count;
    }
}
```

3. **Shared Configuration**
```java
public class AppConfig {
    static String appName = "MyApp";
    static String version = "1.0";
}
```

---

## Variable Scope

### Scope Levels

1. **Class Scope**: Instance and static variables
2. **Method Scope**: Local variables in methods
3. **Block Scope**: Variables in blocks (if, for, while, etc.)

### Scope Rules

```java
public class ScopeExample {
    int instanceVar = 10;        // Class scope
    static int staticVar = 20;   // Class scope
    
    public void method() {
        int localVar = 30;       // Method scope
        
        {
            int blockVar = 40;   // Block scope
            // Can access: instanceVar, staticVar, localVar, blockVar
        }
        
        // Can access: instanceVar, staticVar, localVar
        // Cannot access: blockVar (out of scope)
    }
}
```

### Shadowing

When a local variable has the same name as an instance variable, it "shadows" the instance variable:

```java
public class ShadowExample {
    int value = 10;  // Instance variable
    
    public void method() {
        int value = 20;  // Local variable shadows instance variable
        System.out.println(value);      // 20 (local)
        System.out.println(this.value); // 10 (instance)
    }
}
```

### Variable Hiding

Static variables can be "hidden" by instance variables with the same name (not recommended):

```java
public class HideExample {
    static int count = 10;  // Static variable
    
    public void method() {
        int count = 20;  // Local variable hides static variable
        System.out.println(count);        // 20 (local)
        System.out.println(HideExample.count); // 10 (static)
    }
}
```

---

## Variable Naming Conventions

### Rules
1. Must start with a letter, underscore (_), or dollar sign ($)
2. Cannot be a Java keyword
3. Case-sensitive
4. Can contain letters, digits, underscore, and dollar sign
5. No spaces allowed

### Conventions
- **camelCase**: For variable names (first word lowercase, subsequent words capitalized)
- **UPPER_CASE**: For constants (static final variables)
- **Descriptive**: Names should describe the variable's purpose

### Examples

```java
// Good naming
String firstName;
int studentCount;
double averageGrade;
static final double PI = 3.14159;
static final int MAX_SIZE = 100;

// Bad naming
String fn;           // Too short
int x;              // Not descriptive
double avg;         // Abbreviation unclear
String first_name;  // Use camelCase, not snake_case
```

### Common Naming Patterns

```java
// Boolean variables (often start with is, has, can)
boolean isActive;
boolean hasPermission;
boolean canEdit;

// Counters
int count;
int totalCount;
int itemCount;

// Flags
boolean flag;  // Avoid - use descriptive name
boolean isComplete;  // Better
```

---

## Variable Initialization

### Local Variables
**Must be initialized before use** - no default values.

```java
public void example() {
    int x;
    // System.out.println(x);  // Error: variable might not have been initialized
    x = 10;
    System.out.println(x);  // OK
}
```

### Instance Variables
**Automatically initialized** to default values.

```java
public class Example {
    int number;  // Automatically initialized to 0
    
    public void display() {
        System.out.println(number);  // Prints 0
    }
}
```

### Static Variables
**Automatically initialized** to default values, or can be initialized in static block.

```java
public class Example {
    static int count;  // Default: 0
    
    static {
        count = 100;  // Can initialize in static block
    }
}
```

### Initialization Order

1. Static variables and static blocks (when class is loaded)
2. Instance variables and instance initialization blocks
3. Constructor

```java
public class InitOrder {
    static int staticVar = 1;  // 1st
    
    static {
        System.out.println("Static block: " + staticVar);  // 2nd
    }
    
    int instanceVar = 2;  // 3rd
    
    {
        System.out.println("Instance block: " + instanceVar);  // 4th
    }
    
    InitOrder() {
        System.out.println("Constructor");  // 5th
    }
}
```

---

## Best Practices

### 1. Initialize Variables Explicitly

```java
// ✅ Good: Explicit initialization
int count = 0;
String name = "";

// ❌ Less clear: Relying on defaults
int count;  // Default 0, but not clear
```

### 2. Use Descriptive Names

```java
// ✅ Good
int studentCount;
String customerName;
boolean isActive;

// ❌ Bad
int sc;
String cn;
boolean flag;
```

### 3. Minimize Variable Scope

```java
// ✅ Good: Declare close to use
public void method() {
    // ... code ...
    int result = calculate();
    System.out.println(result);
}

// ❌ Less ideal: Declare at top
public void method() {
    int result;  // Declared but not used yet
    // ... lots of code ...
    result = calculate();
}
```

### 4. Use final for Constants

```java
// ✅ Good: Use final for values that don't change
final int MAX_SIZE = 100;
final String APP_NAME = "MyApp";

// ❌ Bad: Non-final "constants"
int MAX_SIZE = 100;  // Can be changed
```

### 5. Avoid Shadowing

```java
// ✅ Good: Use different names
public class Example {
    int value = 10;
    
    public void method(int newValue) {
        System.out.println(newValue);
    }
}

// ❌ Confusing: Shadowing
public class Example {
    int value = 10;
    
    public void method(int value) {  // Shadows instance variable
        System.out.println(value);  // Which value?
    }
}
```

### 6. Use Static for Shared Data

```java
// ✅ Good: Use static for class-level data
static int objectCount = 0;
static final double PI = 3.14159;

// ❌ Bad: Instance variable for shared data
int objectCount = 0;  // Each object has its own copy
```

### 7. Initialize in Constructor

```java
// ✅ Good: Initialize in constructor
public class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

## Quick Reference

### Variable Types Comparison

| Feature | Local | Instance | Static |
|---------|-------|----------|--------|
| **Declaration** | Inside method/block | In class, outside method | In class, with `static` |
| **Scope** | Method/block | Object | Class |
| **Lifetime** | Method execution | Object lifetime | Program lifetime |
| **Default Value** | None (must initialize) | Type default | Type default |
| **Memory** | Stack | Heap | Method Area |
| **Access** | Within scope only | Via object | Via class or object |
| **Copies** | One per method call | One per object | One for all objects |

### Default Values

| Type | Default Value |
|------|---------------|
| byte, short, int, long | 0 |
| float, double | 0.0 |
| boolean | false |
| char | '\u0000' |
| Reference types | null |

### Access Modifiers

| Modifier | Local | Instance | Static |
|----------|-------|----------|--------|
| public | ❌ | ✅ | ✅ |
| private | ❌ | ✅ | ✅ |
| protected | ❌ | ✅ | ✅ |
| (none) | ✅ | ✅ | ✅ |
| static | ❌ | ❌ | ✅ |

---

## Related Files

- `01_local_variables/LocalVariables.java` - Working examples with local variables
- `02_instance_variables/InstanceVariables.java` - Working examples with instance variables
- `03_static_variables/StaticVariables.java` - Working examples with static variables
- `exercises/SimpleVariableExamples.java` - Simple working examples

---

## Summary

### Key Takeaways

1. **Local variables**: Declared in methods/blocks, must be initialized, scope-limited
2. **Instance variables**: One per object, have default values, stored in heap
3. **Static variables**: Shared by all objects, belong to class, can be accessed without object
4. **Scope matters**: Variables are only accessible within their scope
5. **Initialization**: Local variables must be initialized, instance/static have defaults
6. **Naming**: Use descriptive camelCase names, UPPER_CASE for constants

### When to Use Each

- **Local**: Temporary values within a method
- **Instance**: Object-specific data
- **Static**: Class-level shared data or constants

---

**Last Updated**: This reference guide covers all variable types in Java. Use it as a quick lookup for variable specifications, scope, and best practices.

