# Classes and Objects Reference Guide

This is a comprehensive reference guide for classes and objects in Java. Use this document for quick lookup and understanding of object-oriented programming concepts.

## Table of Contents
1. [Overview](#overview)
2. [Classes](#classes)
3. [Objects](#objects)
4. [Methods](#methods)
5. [Static Keyword](#static-keyword)
6. [Access Modifiers](#access-modifiers)
7. [this Keyword](#this-keyword)
8. [Best Practices](#best-practices)
9. [Quick Reference](#quick-reference)

---

## Overview

Java is an **object-oriented programming (OOP)** language. The two fundamental concepts are:

- **Class**: A blueprint or template for creating objects
- **Object**: An instance of a class (a concrete entity created from a class)

### Key Concepts

- **Encapsulation**: Bundling data and methods together
- **Abstraction**: Hiding implementation details
- **Inheritance**: Creating new classes from existing ones (covered later)
- **Polymorphism**: One interface, multiple implementations (covered later)

### Class vs Object

| Aspect | Class | Object |
|--------|-------|--------|
| **Definition** | Blueprint/template | Instance of a class |
| **Memory** | No memory allocated | Memory allocated in heap |
| **Quantity** | One definition | Multiple instances possible |
| **Example** | `class Car { }` | `Car myCar = new Car();` |

---

## Classes

### Definition

A **class** is a blueprint that defines the structure and behavior of objects. It contains:
- **Fields** (variables) - data/attributes
- **Methods** - behavior/actions
- **Constructors** - for object initialization

### Basic Class Structure

```java
public class Person {
    // Fields (instance variables)
    String name;
    int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Methods
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```

### Class Components

#### 1. Fields (Instance Variables)

```java
public class Student {
    String name;        // Field
    int rollNumber;     // Field
    double grade;       // Field
}
```

#### 2. Methods

```java
public class Calculator {
    public int add(int a, int b) {  // Method
        return a + b;
    }
}
```

#### 3. Constructors

```java
public class Person {
    String name;
    
    public Person(String name) {  // Constructor
        this.name = name;
    }
}
```

### Class Declaration Syntax

```java
[access modifier] class ClassName {
    // Fields
    // Constructors
    // Methods
}
```

### Naming Conventions

- **Class names**: PascalCase (first letter of each word capitalized)
- **Examples**: `Person`, `BankAccount`, `StudentRecord`

---

## Objects

### Definition

An **object** is an instance of a class. It's a concrete entity created from a class blueprint.

### Creating Objects

#### Using `new` Keyword

```java
// Syntax: ClassName objectName = new ClassName();
Person person = new Person();
```

#### With Constructor Parameters

```java
Person person = new Person("John", 25);
```

### Object Creation Process

1. **Declaration**: `Person person;` - Declares a reference variable
2. **Instantiation**: `new Person()` - Creates the object in heap memory
3. **Initialization**: Constructor is called to initialize the object
4. **Assignment**: Reference is assigned to the variable

```java
Person person;              // Step 1: Declaration
person = new Person();      // Steps 2-3: Instantiation & Initialization
// Step 4: Assignment (happens in same line)
```

### Accessing Object Members

```java
Person person = new Person("John", 25);

// Access fields
person.name = "Jane";           // Modify field
String name = person.name;      // Read field

// Call methods
person.displayInfo();           // Call method
```

### Multiple Objects

Each object has its own copy of instance variables:

```java
Person person1 = new Person("Alice", 25);
Person person2 = new Person("Bob", 30);

person1.name = "Alice Smith";  // Only affects person1
System.out.println(person2.name);  // Still "Bob"
```

### Object References

Objects are reference types - variables store references, not the object itself:

```java
Person person1 = new Person("John", 25);
Person person2 = person1;  // person2 references the same object

person2.name = "Jane";     // Modifies the same object
System.out.println(person1.name);  // Prints "Jane"
```

### Null References

```java
Person person = null;  // No object created

// Checking for null
if (person != null) {
    person.displayInfo();
} else {
    System.out.println("Person is null");
}
```

---

## Methods

### Definition

A **method** is a block of code that performs a specific task. Methods define the behavior of a class.

### Method Syntax

```java
[access modifier] [static] returnType methodName([parameters]) {
    // Method body
    return value;  // If return type is not void
}
```

### Types of Methods

#### 1. Instance Methods

Belong to objects - require an object to call.

```java
public class Person {
    String name;
    
    // Instance method
    public void displayName() {
        System.out.println(name);
    }
}

// Usage
Person person = new Person();
person.displayName();  // Call via object
```

#### 2. Static Methods

Belong to the class - can be called without creating an object.

```java
public class MathUtils {
    // Static method
    public static int add(int a, int b) {
        return a + b;
    }
}

// Usage
int sum = MathUtils.add(5, 3);  // Call via class name
```

### Method Components

#### Return Type

```java
// void - no return value
public void displayInfo() {
    System.out.println("Info");
}

// Primitive type
public int getAge() {
    return age;
}

// Reference type
public String getName() {
    return name;
}
```

#### Parameters

```java
// No parameters
public void greet() {
    System.out.println("Hello!");
}

// Single parameter
public void greet(String name) {
    System.out.println("Hello, " + name + "!");
}

// Multiple parameters
public void setInfo(String name, int age, String city) {
    this.name = name;
    this.age = age;
    this.city = city;
}
```

#### Method Body

```java
public int calculateSum(int a, int b) {
    int sum = a + b;      // Local variable
    return sum;           // Return statement
}
```

### Method Overloading

Multiple methods with the same name but different parameters:

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

### Method Calling

```java
// Instance method
Person person = new Person();
person.displayInfo();

// Static method
MathUtils.add(5, 3);

// Method with return value
int result = calculator.add(10, 20);

// Method chaining (if method returns object)
String result = "Hello".toUpperCase().substring(0, 3);
```

---

## Static Keyword

### Definition

The `static` keyword indicates that a member (variable or method) belongs to the class itself, not to any instance of the class.

### Static Variables

Shared by all instances of the class.

```java
public class Counter {
    static int count = 0;  // Static variable
    
    public Counter() {
        count++;  // All objects share this counter
    }
}

Counter c1 = new Counter();  // count = 1
Counter c2 = new Counter();  // count = 2
Counter c3 = new Counter();  // count = 3
```

### Static Methods

Can be called without creating an object.

```java
public class MathUtils {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}

// Call without object
int result = MathUtils.max(10, 20);
```

### Static Block

Executed when the class is first loaded (before any objects are created).

```java
public class Example {
    static int value;
    
    static {
        // Static block - executed once when class loads
        value = 100;
        System.out.println("Static block executed");
    }
}
```

### Static vs Instance

| Feature | Static | Instance |
|---------|--------|----------|
| **Belongs to** | Class | Object |
| **Memory** | One copy for all objects | One copy per object |
| **Access** | Via class name | Via object |
| **Can access static** | Yes | Yes |
| **Can access instance** | No | Yes |

### Rules for Static

1. **Static methods cannot access instance variables**
```java
public class Example {
    int instanceVar = 10;
    static int staticVar = 20;
    
    public static void staticMethod() {
        // System.out.println(instanceVar);  // Error!
        System.out.println(staticVar);     // OK
    }
}
```

2. **Static methods cannot call instance methods directly**
```java
public class Example {
    public void instanceMethod() { }
    
    public static void staticMethod() {
        // instanceMethod();  // Error!
        // Need to create object first
    }
}
```

3. **Instance methods can access static members**
```java
public class Example {
    static int staticVar = 10;
    
    public void instanceMethod() {
        System.out.println(staticVar);  // OK
    }
}
```

---

## Access Modifiers

### Types

| Modifier | Class | Package | Subclass | World |
|----------|-------|---------|----------|-------|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| (default/package) | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

### Public

Accessible from anywhere.

```java
public class Person {
    public String name;  // Accessible everywhere
    
    public void displayInfo() {  // Accessible everywhere
        System.out.println(name);
    }
}
```

### Private

Only accessible within the same class.

```java
public class Person {
    private String name;  // Only accessible in this class
    
    private void helperMethod() {  // Only accessible in this class
        // ...
    }
}
```

### Protected

Accessible within package and subclasses.

```java
public class Person {
    protected String name;  // Accessible in package and subclasses
}
```

### Default (Package-Private)

Accessible only within the same package.

```java
class Person {  // Default access
    String name;  // Default access - package-private
}
```

### Best Practice: Encapsulation

Use private fields with public getters/setters:

```java
public class Person {
    private String name;  // Private field
    private int age;      // Private field
    
    // Public getter
    public String getName() {
        return name;
    }
    
    // Public setter
    public void setName(String name) {
        this.name = name;
    }
}
```

---

## this Keyword

### Definition

`this` is a reference to the current object. It's used to:
- Refer to instance variables when there's a name conflict
- Call other constructors (constructor chaining)
- Pass current object as parameter

### Referring to Instance Variables

```java
public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;  // this.name refers to instance variable
    }
}
```

### Constructor Chaining

```java
public class Person {
    private String name;
    private int age;
    
    public Person() {
        this("Unknown", 0);  // Call other constructor
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

### Passing Current Object

```java
public class Person {
    public void displayInfo() {
        printPerson(this);  // Pass current object
    }
}
```

---

## Best Practices

### 1. Use Meaningful Class Names

```java
// ✅ Good
class BankAccount { }
class StudentRecord { }

// ❌ Bad
class BA { }
class SR { }
```

### 2. Encapsulate Fields

```java
// ✅ Good: Private fields with getters/setters
public class Person {
    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}

// ❌ Less ideal: Public fields
public class Person {
    public String name;  // Direct access
}
```

### 3. Use Static for Class-Level Data

```java
// ✅ Good: Static for shared data
static int objectCount = 0;
static final double PI = 3.14159;

// ❌ Bad: Instance variable for shared data
int objectCount = 0;  // Each object has its own copy
```

### 4. Initialize Objects Properly

```java
// ✅ Good: Use constructors
Person person = new Person("John", 25);

// ❌ Less ideal: Default constructor then setters
Person person = new Person();
person.setName("John");
person.setAge(25);
```

### 5. Check for Null

```java
// ✅ Good: Null check
if (person != null) {
    person.displayInfo();
}

// ❌ Bad: May cause NullPointerException
person.displayInfo();  // Unsafe
```

### 6. One Class Per File

```java
// ✅ Good: Person.java contains only Person class
public class Person { }

// ❌ Less ideal: Multiple public classes in one file
public class Person { }
public class Student { }  // Should be in separate file
```

### 7. Use Appropriate Access Modifiers

```java
// ✅ Good: Private fields, public methods
private String name;
public String getName() { return name; }

// ❌ Less secure: Public fields
public String name;  // Can be modified directly
```

---

## Quick Reference

### Class Declaration

```java
[public] class ClassName {
    // Fields
    // Constructors
    // Methods
}
```

### Object Creation

```java
ClassName objectName = new ClassName();
ClassName objectName = new ClassName(arguments);
```

### Method Declaration

```java
[access] [static] returnType methodName([params]) {
    // body
    return value;  // if not void
}
```

### Static vs Instance

| Aspect | Static | Instance |
|--------|--------|----------|
| **Variable** | `static int count;` | `int count;` |
| **Method** | `static void method()` | `void method()` |
| **Access** | `ClassName.member` | `object.member` |
| **Memory** | One copy | One per object |

### Access Modifiers

| Modifier | Visibility |
|----------|------------|
| `public` | Everywhere |
| `protected` | Package + Subclasses |
| (default) | Package only |
| `private` | Class only |

### Common Patterns

```java
// Encapsulation pattern
private field;
public getter();
public setter();

// Static utility pattern
public static returnType utilityMethod() { }

// Object creation pattern
ClassName obj = new ClassName();
obj.method();
```

---

## Related Files

- `01_basic_class/BasicClass.java` - Basic class examples
- `01_basic_class/DemoClass.java` - Class and object fundamentals
- `02_methods/MethodsExample.java` - Method examples
- `03_static_keyword/StaticKeyword.java` - Static keyword examples
- `exercises/SimpleClassExamples.java` - Working examples

---

## Summary

### Key Takeaways

1. **Class** is a blueprint, **Object** is an instance
2. **Instance members** belong to objects, **static members** belong to class
3. **Encapsulation** - use private fields with public methods
4. **this keyword** - refers to current object
5. **Access modifiers** - control visibility
6. **Methods** - define behavior, can be instance or static
7. **Objects** - created with `new` keyword, stored in heap

### When to Use Static

- **Constants**: `static final double PI = 3.14159;`
- **Utility methods**: `Math.max()`, `Arrays.sort()`
- **Counters**: Track number of objects created
- **Shared configuration**: Class-level settings

### When to Use Instance

- **Object-specific data**: Each object has its own values
- **Object behavior**: Methods that operate on object data
- **State management**: Fields that change per object

---

**Last Updated**: This reference guide covers classes and objects in Java. Use it as a quick lookup for OOP concepts, syntax, and best practices.

