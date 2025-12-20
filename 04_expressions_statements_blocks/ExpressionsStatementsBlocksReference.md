# Expressions, Statements, and Code Blocks Reference Guide

This is a comprehensive reference guide for expressions, statements, and code blocks in Java. These are fundamental building blocks of Java programs.

## Table of Contents
1. [Overview](#overview)
2. [Expressions](#expressions)
3. [Statements](#statements)
4. [Code Blocks](#code-blocks)
5. [Key Differences](#key-differences)
6. [Best Practices](#best-practices)
7. [Quick Reference](#quick-reference)

---

## Overview

Understanding expressions, statements, and code blocks is essential for writing Java programs:

- **Expression**: A combination of variables, operators, and method calls that evaluates to a single value
- **Statement**: A complete unit of execution that performs an action
- **Code Block**: A group of zero or more statements enclosed in curly braces `{}`

### Relationship

```
Code Block
  └── Contains Statements
        └── Statements contain Expressions
```

---

## Expressions

### Definition

An **expression** is a combination of variables, operators, and method calls that evaluates to a **single value**. Expressions produce a result.

### Characteristics

- Evaluates to a value
- Can be used as part of larger expressions
- Can be assigned to variables
- Can be used in method calls

### Types of Expressions

#### 1. Arithmetic Expressions

Combine numeric values using arithmetic operators.

```java
int a = 10;
int b = 5;

int sum = a + b;           // Expression: evaluates to 15
int product = a * b;       // Expression: evaluates to 50
int result = (a + b) * 2;  // Complex expression: evaluates to 30
```

**Operators**: `+`, `-`, `*`, `/`, `%`

#### 2. Boolean Expressions

Evaluate to `true` or `false`.

```java
int x = 10;
int y = 5;

boolean isGreater = x > y;        // Expression: evaluates to true
boolean isEqual = x == y;         // Expression: evaluates to false
boolean logical = (x > 5) && (y < 10);  // Expression: evaluates to true
```

**Operators**: `>`, `<`, `>=`, `<=`, `==`, `!=`, `&&`, `||`, `!`

#### 3. String Expressions

String concatenation and operations.

```java
String firstName = "John";
String lastName = "Doe";

String fullName = firstName + " " + lastName;  // Expression: "John Doe"
int length = fullName.length();                 // Expression: method call
String upper = fullName.toUpperCase();          // Expression: method call
```

#### 4. Assignment Expressions

Assign values to variables.

```java
int x = 10;      // Expression: assignment
x += 5;          // Expression: compound assignment (x = x + 5)
x *= 2;          // Expression: compound assignment (x = x * 2)
```

**Compound Assignment Operators**: `+=`, `-=`, `*=`, `/=`, `%=`

#### 5. Method Call Expressions

Calls to methods that return values.

```java
int result = Math.max(10, 20);        // Expression: method call
String text = "Hello".toUpperCase();  // Expression: method call
int length = "Java".length();         // Expression: method call
```

#### 6. Conditional Expressions (Ternary Operator)

`condition ? valueIfTrue : valueIfFalse`

```java
int a = 10;
int b = 5;

int max = (a > b) ? a : b;  // Expression: if a > b, return a, else b
String message = (a > b) ? "a is greater" : "b is greater";
```

#### 7. Increment/Decrement Expressions

```java
int x = 10;
x++;    // Expression: post-increment (returns 10, then increments)
++x;    // Expression: pre-increment (increments, then returns 12)
x--;    // Expression: post-decrement
--x;    // Expression: pre-decrement
```

### Expression Evaluation Order

Expressions are evaluated according to operator precedence:

1. Parentheses `()`
2. Unary operators (`++`, `--`, `!`, `-`)
3. Multiplicative (`*`, `/`, `%`)
4. Additive (`+`, `-`)
5. Relational (`<`, `>`, `<=`, `>=`)
6. Equality (`==`, `!=`)
7. Logical AND (`&&`)
8. Logical OR (`||`)
9. Ternary (`? :`)
10. Assignment (`=`, `+=`, `-=`, etc.)

```java
int result = 2 + 3 * 4;        // Evaluates to 14 (not 20)
int result2 = (2 + 3) * 4;     // Evaluates to 20
```

---

## Statements

### Definition

A **statement** is a complete unit of execution that performs an action. Statements don't necessarily produce a value, but they do something.

### Characteristics

- Performs an action
- Ends with a semicolon `;` (except block statements)
- Executes in sequence
- Can contain expressions

### Types of Statements

#### 1. Declaration Statements

Declare variables.

```java
int number;              // Declaration statement
String name;             // Declaration statement
double price = 19.99;    // Declaration with initialization
```

#### 2. Expression Statements

Expressions followed by a semicolon.

```java
int x = 10;              // Expression statement (assignment)
x++;                     // Expression statement (increment)
System.out.println(x);   // Expression statement (method call)
```

#### 3. Assignment Statements

Assign values to variables.

```java
int x = 10;      // Assignment statement
x = 20;          // Assignment statement
x += 5;          // Compound assignment statement
```

#### 4. Control Flow Statements

Control the flow of program execution.

**If Statement:**
```java
if (condition) {
    // statements
} else if (condition2) {
    // statements
} else {
    // statements
}
```

**Switch Statement:**
```java
switch (variable) {
    case value1:
        // statements
        break;
    case value2:
        // statements
        break;
    default:
        // statements
}
```

**For Loop:**
```java
for (initialization; condition; update) {
    // statements
}
```

**While Loop:**
```java
while (condition) {
    // statements
}
```

**Do-While Loop:**
```java
do {
    // statements
} while (condition);
```

#### 5. Jump Statements

Alter the normal flow of execution.

**Return Statement:**
```java
public int calculate() {
    return 10 + 20;  // Return statement
}
```

**Break Statement:**
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;  // Exit loop
    }
}
```

**Continue Statement:**
```java
for (int i = 0; i < 10; i++) {
    if (i == 3) {
        continue;  // Skip this iteration
    }
    System.out.println(i);
}
```

#### 6. Empty Statement

A semicolon with nothing before it.

```java
;  // Empty statement (rarely used)
```

### Statement vs Expression

| Aspect | Expression | Statement |
|--------|------------|-----------|
| **Produces Value** | Yes | Not necessarily |
| **Semicolon** | Optional (unless used as statement) | Required |
| **Can Stand Alone** | No (unless expression statement) | Yes |
| **Example** | `a + b` | `int x = a + b;` |

---

## Code Blocks

### Definition

A **code block** (also called a compound statement) is a group of zero or more statements enclosed in curly braces `{}`.

### Characteristics

- Enclosed in curly braces `{}`
- Creates a new scope
- Can be nested
- Variables declared in a block are local to that block

### Types of Code Blocks

#### 1. Class Block

The entire class definition.

```java
public class MyClass {  // Class block starts
    // Class members
}  // Class block ends
```

#### 2. Method Block

The body of a method.

```java
public void myMethod() {  // Method block starts
    int x = 10;
    System.out.println(x);
}  // Method block ends
```

#### 3. Static Block

Executed when the class is first loaded.

```java
public class Example {
    static {
        // Static block - executed once when class loads
        System.out.println("Class loaded");
    }
}
```

#### 4. Instance Initialization Block

Executed before the constructor for each object.

```java
public class Example {
    {
        // Instance initialization block
        System.out.println("Instance created");
    }
    
    public Example() {
        System.out.println("Constructor");
    }
}
```

#### 5. Control Flow Blocks

Blocks used with control flow statements.

```java
if (condition) {  // Block starts
    int x = 10;
    System.out.println(x);
}  // Block ends

for (int i = 0; i < 5; i++) {  // Block starts
    System.out.println(i);
}  // Block ends
```

#### 6. Simple Block

A standalone block (creates scope).

```java
{
    int blockVariable = 10;
    System.out.println(blockVariable);
}
// blockVariable is not accessible here
```

#### 7. Try-Catch Block

Exception handling blocks.

```java
try {  // Try block
    int result = 10 / 0;
} catch (ArithmeticException e) {  // Catch block
    System.out.println("Error: " + e.getMessage());
} finally {  // Finally block (optional)
    System.out.println("Cleanup");
}
```

### Block Scope

Variables declared in a block are only accessible within that block and nested blocks.

```java
public void method() {
    int outer = 10;  // Accessible in entire method
    
    {
        int inner = 20;  // Only accessible in this block
        System.out.println(outer);  // OK: can access outer
        System.out.println(inner);  // OK: in same block
    }
    
    // System.out.println(inner);  // Error: inner is out of scope
    System.out.println(outer);  // OK: still in scope
}
```

### Nested Blocks

Blocks can be nested, and inner blocks can access variables from outer blocks.

```java
{
    int level1 = 1;
    
    {
        int level2 = 2;
        
        {
            int level3 = 3;
            // Can access: level1, level2, level3
        }
        // Can access: level1, level2
        // Cannot access: level3
    }
    // Can access: level1
    // Cannot access: level2, level3
}
```

### Execution Order

For objects, blocks execute in this order:

1. Static blocks (when class is first loaded)
2. Instance initialization blocks
3. Constructor

```java
public class Example {
    static {
        System.out.println("1. Static block");
    }
    
    {
        System.out.println("2. Instance block");
    }
    
    public Example() {
        System.out.println("3. Constructor");
    }
}
```

---

## Key Differences

### Expression vs Statement

```java
// Expression (produces a value)
int result = 10 + 20;  // The expression "10 + 20" evaluates to 30

// Statement (performs an action)
int x = 10;            // Statement: declares and assigns
x++;                   // Statement: increments x
System.out.println(x); // Statement: prints x
```

### Statement vs Block

```java
// Single statement
if (x > 5) System.out.println("Greater");

// Block (multiple statements)
if (x > 5) {
    System.out.println("Greater");
    System.out.println("x is: " + x);
}
```

### Quick Comparison

| Feature | Expression | Statement | Block |
|---------|------------|-----------|-------|
| **Produces Value** | Yes | Not necessarily | No |
| **Performs Action** | No | Yes | Yes (contains statements) |
| **Semicolon** | Optional | Required | Not needed |
| **Curly Braces** | No | No | Yes |
| **Creates Scope** | No | No | Yes |
| **Example** | `a + b` | `int x = 10;` | `{ int x = 10; }` |

---

## Best Practices

### 1. Use Parentheses for Clarity

```java
// ✅ Good: Clear precedence
int result = (a + b) * (c - d);

// ❌ Less clear: Relies on operator precedence
int result = a + b * c - d;
```

### 2. Break Complex Expressions

```java
// ✅ Good: Readable
int sum = a + b;
int product = c * d;
int result = sum + product;

// ❌ Less readable: Too complex
int result = (a + b) + (c * d);
```

### 3. Use Meaningful Variable Names in Blocks

```java
// ✅ Good: Clear scope
{
    int tempResult = calculate();
    process(tempResult);
}

// ❌ Less clear: Generic names
{
    int x = calculate();
    process(x);
}
```

### 4. Minimize Block Scope

```java
// ✅ Good: Declare close to use
for (int i = 0; i < 10; i++) {
    int result = i * 2;
    System.out.println(result);
}

// ❌ Less ideal: Declare outside loop
int result;
for (int i = 0; i < 10; i++) {
    result = i * 2;
    System.out.println(result);
}
```

### 5. Use Blocks for Multiple Statements

```java
// ✅ Good: Clear block
if (condition) {
    doSomething();
    doSomethingElse();
}

// ❌ Less clear: Missing braces (though valid for single statement)
if (condition)
    doSomething();
```

### 6. Avoid Deep Nesting

```java
// ✅ Good: Flattened logic
if (!condition1) return;
if (!condition2) return;
process();

// ❌ Less readable: Deep nesting
if (condition1) {
    if (condition2) {
        process();
    }
}
```

---

## Quick Reference

### Expression Types

| Type | Example | Evaluates To |
|------|---------|--------------|
| Arithmetic | `10 + 5` | `15` |
| Boolean | `x > 5` | `true` or `false` |
| String | `"Hello" + "World"` | `"HelloWorld"` |
| Assignment | `x = 10` | `10` |
| Method Call | `Math.max(5, 10)` | `10` |
| Ternary | `x > 0 ? x : 0` | Value based on condition |

### Statement Types

| Type | Example |
|------|---------|
| Declaration | `int x;` |
| Assignment | `x = 10;` |
| Expression | `x++;` |
| Control Flow | `if (x > 5) { }` |
| Jump | `return x;` |

### Block Types

| Type | Example |
|------|---------|
| Class | `class MyClass { }` |
| Method | `void method() { }` |
| Static | `static { }` |
| Instance Init | `{ }` |
| Control Flow | `if (condition) { }` |
| Simple | `{ int x = 10; }` |

### Operator Precedence (High to Low)

1. `()` (parentheses)
2. `++`, `--`, `!`, `-` (unary)
3. `*`, `/`, `%` (multiplicative)
4. `+`, `-` (additive)
5. `<`, `>`, `<=`, `>=` (relational)
6. `==`, `!=` (equality)
7. `&&` (logical AND)
8. `||` (logical OR)
9. `? :` (ternary)
10. `=`, `+=`, `-=`, etc. (assignment)

---

## Related Files

- `01_expressions/ExpressionsExample.java` - Working examples with expressions
- `02_statements/StatementsExample.java` - Working examples with statements
- `03_code_blocks/CodeBlocksExample.java` - Working examples with code blocks
- `exercises/SimpleExpressionsStatementsExamples.java` - Simple working examples

---

## Summary

### Key Takeaways

1. **Expressions** produce values and can be used in larger expressions
2. **Statements** perform actions and end with semicolons (except blocks)
3. **Code Blocks** group statements and create scope
4. **Scope** determines where variables are accessible
5. **Precedence** determines order of evaluation in expressions
6. **Blocks** can be nested, and inner blocks can access outer variables

### When to Use Each

- **Expressions**: When you need a value (calculations, conditions, method calls)
- **Statements**: When you need to perform an action (assign, print, control flow)
- **Blocks**: When you need to group statements or create scope

---

**Last Updated**: This reference guide covers expressions, statements, and code blocks in Java. Use it as a quick lookup for these fundamental programming concepts.

