# Constructors Reference Guide

This is a comprehensive reference guide for constructors in Java. Use this document for quick lookup and understanding of constructor concepts and best practices.

## Table of Contents
1. [Overview](#overview)
2. [Default Constructor](#default-constructor)
3. [Parameterized Constructor](#parameterized-constructor)
4. [Constructor Overloading](#constructor-overloading)
5. [Constructor Chaining](#constructor-chaining)
6. [Constructor Rules](#constructor-rules)
7. [Best Practices](#best-practices)
8. [Quick Reference](#quick-reference)

---

## Overview

A **constructor** is a special method used to initialize objects when they are created. It has the same name as the class and is called automatically when an object is instantiated.

### Key Characteristics

- **Same name as class**: Constructor name must match class name exactly
- **No return type**: Not even `void` (not a regular method)
- **Automatic invocation**: Called automatically when object is created
- **Can be overloaded**: Multiple constructors with different parameters
- **Can chain**: One constructor can call another using `this()`

### Constructor vs Method

| Aspect | Constructor | Method |
|--------|-------------|--------|
| **Name** | Same as class | Any valid name |
| **Return Type** | None | Required (void or type) |
| **Called** | Automatically | Explicitly |
| **Purpose** | Initialize object | Perform operation |
| **Inheritance** | Not inherited | Can be inherited |

### Constructor Syntax

```java
[access modifier] ClassName([parameters]) {
    // Constructor body
}
```

---

## Default Constructor

### Definition

A **default constructor** is a constructor with no parameters. It can be:
- **Provided by Java**: If you don't define any constructor
- **Explicitly defined**: You can create your own default constructor

### Java-Provided Default Constructor

If you don't define any constructor, Java automatically provides a default constructor:

```java
public class Person {
    String name;
    int age;
    // No constructor defined
}

// Java provides: public Person() { }
Person person = new Person();  // Uses default constructor
```

**Important**: Java only provides default constructor if **no constructors are defined**.

### Explicit Default Constructor

You can define your own default constructor:

```java
public class Person {
    String name;
    int age;
    
    // Explicit default constructor
    public Person() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called");
    }
}
```

### When Default Constructor is Not Provided

If you define any constructor, Java **does not** provide a default constructor:

```java
public class Person {
    String name;
    
    // Parameterized constructor defined
    public Person(String name) {
        this.name = name;
    }
    
    // No default constructor available
    // Person person = new Person();  // Compilation error!
    Person person = new Person("John");  // OK
}
```

### Use Cases for Default Constructor

1. **Simple initialization**: Set default values
2. **Optional parameters**: When some fields can have defaults
3. **Framework requirements**: Some frameworks require default constructor

```java
public class BankAccount {
    private double balance;
    private String accountNumber;
    
    // Default constructor with default values
    public BankAccount() {
        this.balance = 0.0;
        this.accountNumber = "UNKNOWN";
    }
}
```

---

## Parameterized Constructor

### Definition

A **parameterized constructor** accepts parameters to initialize object fields with specific values.

### Basic Parameterized Constructor

```java
public class Person {
    private String name;
    private int age;
    
    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Usage
Person person = new Person("John", 25);
```

### Benefits

1. **Initialization at creation**: Set values immediately
2. **Validation**: Validate parameters during construction
3. **Required fields**: Ensure required fields are set
4. **Immutability**: Set final fields

### With Validation

```java
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        // Validation
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        
        this.name = name;
        this.age = age;
    }
}
```

### Initializing Final Fields

```java
public class Person {
    private final String name;  // Final field
    private final int age;      // Final field
    
    // Must initialize final fields in constructor
    public Person(String name, int age) {
        this.name = name;  // Required
        this.age = age;    // Required
    }
    
    // Cannot have setter for final fields
}
```

### Multiple Parameterized Constructors

```java
public class Rectangle {
    private int width;
    private int height;
    
    // Constructor 1: Both dimensions
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    // Constructor 2: Square (same width and height)
    public Rectangle(int side) {
        this.width = side;
        this.height = side;
    }
}
```

---

## Constructor Overloading

### Definition

**Constructor overloading** is having multiple constructors in the same class with different parameter lists.

### Rules

1. **Same name**: All constructors must have the same name (class name)
2. **Different parameters**: Must differ in number, type, or order of parameters
3. **No return type**: Constructors don't have return types

### Examples

```java
public class Person {
    private String name;
    private int age;
    private String city;
    
    // Constructor 1: No parameters
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.city = "Unknown";
    }
    
    // Constructor 2: Name only
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.city = "Unknown";
    }
    
    // Constructor 3: Name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.city = "Unknown";
    }
    
    // Constructor 4: All parameters
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
```

### Different Parameter Types

```java
public class Book {
    private String title;
    private int pages;
    
    // Constructor 1: String and int
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    
    // Constructor 2: String only
    public Book(String title) {
        this.title = title;
        this.pages = 0;
    }
    
    // Constructor 3: Different order (if types differ)
    // Not possible here since both are String, int
}
```

### Benefits

- **Flexibility**: Create objects with different initializations
- **Convenience**: Provide convenient ways to create objects
- **Default values**: Allow some parameters to be optional

---

## Constructor Chaining

### Definition

**Constructor chaining** is calling one constructor from another constructor in the same class using `this()` keyword.

### Rules

1. **Must be first statement**: `this()` must be the first statement in constructor
2. **Cannot use this() and super()**: Can't use both in same constructor
3. **Prevents duplication**: Avoids code duplication

### Basic Chaining

```java
public class Person {
    private String name;
    private int age;
    private String city;
    
    // Constructor 1: No parameters - chains to Constructor 2
    public Person() {
        this("Unknown");  // Calls Constructor 2
    }
    
    // Constructor 2: Name only - chains to Constructor 3
    public Person(String name) {
        this(name, 0);  // Calls Constructor 3
    }
    
    // Constructor 3: Name and age - chains to Constructor 4
    public Person(String name, int age) {
        this(name, age, "Unknown");  // Calls Constructor 4
    }
    
    // Constructor 4: All parameters (main constructor)
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
```

### Execution Order

When constructor chaining is used, constructors execute in reverse order:

```java
Person p = new Person();  // Calls Constructor 1

// Execution order:
// 1. Constructor 4 executes (main constructor)
// 2. Constructor 3 executes
// 3. Constructor 2 executes
// 4. Constructor 1 executes
```

### Benefits

1. **Code reuse**: Avoid duplicating initialization code
2. **Maintainability**: Change initialization logic in one place
3. **Consistency**: Ensures consistent initialization

### Example with Validation

```java
public class BankAccount {
    private String accountNumber;
    private double balance;
    
    // Default constructor
    public BankAccount() {
        this("UNKNOWN", 0.0);  // Chain to parameterized
    }
    
    // Parameterized constructor with validation
    public BankAccount(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number required");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
```

---

## Constructor Rules

### 1. Name Must Match Class

```java
public class Person {
    // ✅ Correct
    public Person() { }
    
    // ❌ Wrong - compilation error
    // public person() { }  // Name doesn't match
}
```

### 2. No Return Type

```java
public class Person {
    // ✅ Correct
    public Person() { }
    
    // ❌ Wrong - this is a method, not a constructor
    // public void Person() { }  // This is a method!
}
```

### 3. Cannot Be Abstract, Final, or Static

```java
public class Person {
    // ❌ Cannot be abstract
    // public abstract Person();
    
    // ❌ Cannot be final
    // public final Person();
    
    // ❌ Cannot be static
    // public static Person();
}
```

### 4. Can Have Access Modifiers

```java
public class Person {
    public Person() { }      // Public
    protected Person() { }   // Protected
    Person() { }              // Package-private
    private Person() { }     // Private (singleton pattern)
}
```

### 5. Can Throw Exceptions

```java
public class Person {
    public Person(String name) throws IllegalArgumentException {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }
}
```

### 6. Cannot Be Inherited

```java
public class Person {
    public Person(String name) { }
}

public class Student extends Person {
    // Must call super constructor
    public Student(String name) {
        super(name);  // Call parent constructor
    }
}
```

### 7. this() Must Be First Statement

```java
public class Person {
    private String name;
    
    public Person() {
        // ✅ Correct: this() is first
        this("Unknown");
    }
    
    public Person(String name) {
        // ❌ Wrong: this() not first
        // System.out.println("Creating person");
        // this.name = name;  // Error if this() is not first
        this.name = name;
    }
}
```

---

## Best Practices

### 1. Initialize All Fields

```java
// ✅ Good: Initialize all fields
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// ❌ Less ideal: Leave fields uninitialized
public class Person {
    private String name;
    private int age;
    
    public Person(String name) {
        this.name = name;
        // age might be 0 (default), but not explicit
    }
}
```

### 2. Use Constructor Chaining

```java
// ✅ Good: Use chaining to avoid duplication
public class Person {
    private String name;
    private int age;
    
    public Person() {
        this("Unknown", 0);
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// ❌ Less ideal: Duplicated code
public class Person {
    private String name;
    private int age;
    
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

### 3. Validate Parameters

```java
// ✅ Good: Validate in constructor
public Person(String name, int age) {
    if (name == null || name.isBlank()) {
        throw new IllegalArgumentException("Name required");
    }
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
    }
    this.name = name;
    this.age = age;
}

// ❌ Less safe: No validation
public Person(String name, int age) {
    this.name = name;  // Could be null
    this.age = age;    // Could be negative
}
```

### 4. Use Private Constructors for Singleton

```java
// ✅ Good: Private constructor for singleton
public class DatabaseConnection {
    private static DatabaseConnection instance;
    
    private DatabaseConnection() {  // Private constructor
        // Initialize connection
    }
    
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
```

### 5. Provide Default Constructor When Needed

```java
// ✅ Good: Provide default constructor if needed
public class Person {
    private String name;
    
    public Person() {
        this.name = "Unknown";
    }
    
    public Person(String name) {
        this.name = name;
    }
}

// ❌ Problem: No default constructor, but framework needs it
public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    // Some frameworks require default constructor
}
```

### 6. Initialize Final Fields

```java
// ✅ Good: Initialize final fields in constructor
public class Person {
    private final String name;
    
    public Person(String name) {
        this.name = name;  // Required for final
    }
}

// ❌ Compilation error: Final field not initialized
public class Person {
    private final String name;
    
    public Person() {
        // name not initialized - compilation error!
    }
}
```

### 7. Keep Constructors Simple

```java
// ✅ Good: Simple constructor
public Person(String name, int age) {
    this.name = name;
    this.age = age;
}

// ❌ Less ideal: Complex logic in constructor
public Person(String name, int age) {
    // Too much logic
    this.name = name;
    this.age = age;
    // Complex calculations
    // Database calls
    // File operations
    // Better to use initialization methods
}
```

---

## Quick Reference

### Constructor Syntax

```java
[access modifier] ClassName([parameters]) {
    // body
}
```

### Types of Constructors

| Type | Example | Use Case |
|------|---------|----------|
| Default | `public Person() { }` | Simple initialization |
| Parameterized | `public Person(String name) { }` | Initialize with values |
| Chained | `this("Unknown");` | Call other constructor |

### Constructor Rules

| Rule | Description |
|------|-------------|
| **Name** | Must match class name exactly |
| **Return Type** | None (not even void) |
| **Called** | Automatically when object created |
| **this()** | Must be first statement |
| **Inheritance** | Not inherited, but must call super() |

### Common Patterns

```java
// Pattern 1: Default with chaining
public Person() {
    this("Unknown", 0);
}

// Pattern 2: Validation
public Person(String name) {
    if (name == null) throw new IllegalArgumentException();
    this.name = name;
}

// Pattern 3: Final fields
public Person(final String name) {
    this.name = name;  // Required
}

// Pattern 4: Multiple constructors
public Person() { }
public Person(String name) { }
public Person(String name, int age) { }
```

### Constructor vs Method

| Feature | Constructor | Method |
|---------|-------------|--------|
| **Name** | Class name | Any name |
| **Return** | None | Required |
| **Called** | Automatic | Explicit |
| **Purpose** | Initialize | Perform action |

---

## Related Files

- `01_default_constructor/DefaultConstructor.java` - Default constructor examples
- `02_parameterized_constructor/Human.java` - Parameterized constructor with validation
- `02_parameterized_constructor/ConstructorDemo.java` - Constructor usage examples
- `03_constructor_chaining/ConstructorChaining.java` - Constructor chaining examples
- `exercises/SimpleConstructorExamples.java` - Working examples

---

## Summary

### Key Takeaways

1. **Constructors initialize objects** when they are created
2. **Default constructor** - no parameters, provided by Java if none defined
3. **Parameterized constructor** - accepts parameters for initialization
4. **Constructor overloading** - multiple constructors with different parameters
5. **Constructor chaining** - one constructor calls another using `this()`
6. **Must initialize final fields** in constructor
7. **this() must be first statement** in constructor

### When to Use Each

- **Default constructor**: Simple initialization, optional parameters
- **Parameterized constructor**: Initialize with specific values, validation
- **Constructor chaining**: Avoid code duplication, maintain consistency
- **Multiple constructors**: Provide flexibility in object creation

### Common Mistakes

1. **Forgetting to initialize final fields**
2. **Not calling this() as first statement**
3. **Defining return type** (makes it a method, not constructor)
4. **Name mismatch** with class name
5. **Too much logic** in constructor (keep it simple)

---

**Last Updated**: This reference guide covers all constructor concepts in Java. Use it as a quick lookup for constructor syntax, rules, and best practices.

