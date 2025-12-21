# Conditional Logic, Loops, and Interactive Applications Reference Guide

This is a comprehensive reference guide for conditional logic, loops, and interactive Java applications. Use this document for quick lookup and understanding of these concepts and best practices.

## Table of Contents
1. [Overview](#overview)
2. [Loops](#loops)
3. [Advanced Conditionals](#advanced-conditionals)
4. [Interactive Applications](#interactive-applications)
5. [Best Practices](#best-practices)
6. [Quick Reference](#quick-reference)
7. [Related Files](#related-files)

---

## Overview

This section covers advanced control flow mechanisms in Java, including different types of loops, advanced conditional statements, and building interactive applications with user input.

### Key Concepts

- **Loops**: Repetitive execution of code blocks
- **Advanced Conditionals**: Switch statements, ternary operators, complex boolean logic
- **Interactive Applications**: User input, validation, menu-driven programs

---

## Loops

Loops allow you to execute a block of code repeatedly. Java provides several types of loops for different scenarios.

### For Loop

The `for` loop is ideal when you know how many times you want to iterate.

#### Syntax

```java
for (initialization; condition; increment/decrement) {
    // code to execute
}
```

#### Basic Example

```java
// Print numbers from 1 to 10
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

#### Key Points

- **Initialization**: Executes once at the start
- **Condition**: Checked before each iteration
- **Increment/Decrement**: Executes after each iteration
- Loop continues while condition is `true`

#### Common Patterns

```java
// Count up
for (int i = 0; i < 10; i++) { }

// Count down
for (int i = 10; i > 0; i--) { }

// Step by 2
for (int i = 0; i < 10; i += 2) { }

// Multiple variables
for (int i = 0, j = 10; i < j; i++, j--) { }
```

**Related Files:**
- `01_loops/ForLoopExample.java`

---

### While Loop

The `while` loop continues as long as a condition is true. Use when the number of iterations is unknown.

#### Syntax

```java
while (condition) {
    // code to execute
}
```

#### Basic Example

```java
int count = 0;
while (count < 5) {
    System.out.println(count);
    count++;
}
```

#### Key Points

- Condition is checked **before** each iteration
- May not execute at all if condition is false initially
- Must modify loop variable to avoid infinite loops

#### Common Use Cases

- Input validation
- Processing until condition is met
- Reading data until end of file

**Related Files:**
- `01_loops/WhileLoopExample.java`

---

### Do-While Loop

The `do-while` loop executes at least once, then checks the condition.

#### Syntax

```java
do {
    // code to execute
} while (condition);
```

#### Basic Example

```java
int count = 0;
do {
    System.out.println(count);
    count++;
} while (count < 5);
```

#### Key Points

- Body executes **at least once**
- Condition is checked **after** each iteration
- Ideal for menu-driven programs

#### When to Use

- Menu systems (show menu at least once)
- Input validation (prompt at least once)
- Post-condition checks

**Related Files:**
- `01_loops/DoWhileLoopExample.java`

---

### Enhanced For Loop (For-Each)

The enhanced for loop simplifies iteration over arrays and collections.

#### Syntax

```java
for (elementType variable : array) {
    // code to execute
}
```

#### Basic Example

```java
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println(number);
}
```

#### Key Points

- Simpler syntax than traditional for loop
- Automatically iterates through all elements
- **Read-only**: Cannot modify array during iteration
- No index access (use traditional for loop if needed)

#### When to Use

- Iterating through all elements
- When index is not needed
- Cleaner, more readable code

**Related Files:**
- `01_loops/EnhancedForLoopExample.java`

---

### Nested Loops

Nested loops are loops inside other loops, useful for 2D arrays, patterns, and combinations.

#### Basic Example

```java
// Print a 3x3 grid
for (int i = 0; i < 3; i++) {        // Outer loop: rows
    for (int j = 0; j < 3; j++) {    // Inner loop: columns
        System.out.print("* ");
    }
    System.out.println();
}
```

#### Common Use Cases

- 2D array iteration
- Pattern printing (triangles, rectangles, pyramids)
- Finding pairs/combinations
- Multiplication tables

#### Performance Consideration

- Time complexity: O(n²) for nested loops
- Inner loop executes completely for each outer loop iteration

**Related Files:**
- `01_loops/NestedLoopExample.java`

---

### Loop Control Statements

#### Break Statement

Exits the loop immediately.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Exit loop when i is 5
    }
    System.out.println(i);
}
```

#### Continue Statement

Skips the current iteration and continues with the next.

```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue; // Skip even numbers
    }
    System.out.println(i); // Only prints odd numbers
}
```

---

## Advanced Conditionals

### Switch Statement

The `switch` statement provides multi-way branching based on a value.

#### Syntax

```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
        break;
}
```

#### Basic Example

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
        break;
}
```

#### Key Points

- Expression must be: `byte`, `short`, `int`, `char`, `String`, or enum
- `break` prevents fall-through to next case
- `default` case is optional
- Multiple cases can share code

#### Fall-Through Example

```java
switch (month) {
    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        days = 31;
        break;
    case 4: case 6: case 9: case 11:
        days = 30;
        break;
    case 2:
        days = 28;
        break;
}
```

**Related Files:**
- `02_advanced_conditionals/SwitchStatementExample.java`

---

### Ternary Operator

The ternary operator provides a compact way to write if-else statements.

#### Syntax

```java
condition ? valueIfTrue : valueIfFalse
```

#### Basic Example

```java
int max = (a > b) ? a : b;
```

#### Equivalent If-Else

```java
int max;
if (a > b) {
    max = a;
} else {
    max = b;
}
```

#### Nested Ternary

```java
String result = (score >= 90) ? "A" :
               (score >= 80) ? "B" :
               (score >= 70) ? "C" : "F";
```

#### When to Use

- Simple conditional assignments
- Return statements
- Avoid for complex logic (use if-else instead)

**Related Files:**
- `02_advanced_conditionals/TernaryOperatorExample.java`

---

### Complex Boolean Logic

Combining multiple conditions using logical operators.

#### Logical Operators

| Operator | Name | Description |
|----------|------|-------------|
| `&&` | AND | Both conditions must be true |
| `||` | OR | At least one condition must be true |
| `!` | NOT | Negates the condition |

#### Examples

```java
// AND: Both must be true
if (age >= 18 && age <= 65) {
    System.out.println("Working age");
}

// OR: At least one must be true
if (grade == 'A' || grade == 'B') {
    System.out.println("Good grade");
}

// NOT: Negates condition
if (!isValid) {
    System.out.println("Invalid");
}

// Complex combination
if ((age >= 18 && age <= 65) || isStudent) {
    System.out.println("Eligible");
}
```

#### Operator Precedence

1. `!` (NOT) - highest
2. `&&` (AND)
3. `||` (OR) - lowest

Use parentheses to clarify intent:

```java
// Clear intent
if ((age >= 18 && age <= 65) || isStudent) { }

// Without parentheses (same result, less clear)
if (age >= 18 && age <= 65 || isStudent) { }
```

#### Short-Circuit Evaluation

- `&&`: Stops if first condition is false
- `||`: Stops if first condition is true

```java
// Safe: second condition only evaluated if first is true
if (array != null && array.length > 0) {
    // Process array
}
```

**Related Files:**
- `02_advanced_conditionals/ComplexBooleanLogicExample.java`

---

## Interactive Applications

### Scanner Class

The `Scanner` class is used to read user input from the console.

#### Import Statement

```java
import java.util.Scanner;
```

#### Creating Scanner

```java
Scanner scanner = new Scanner(System.in);
```

#### Reading Different Types

```java
// Read integer
int number = scanner.nextInt();

// Read double
double decimal = scanner.nextDouble();

// Read string (one word)
String word = scanner.next();

// Read entire line
String line = scanner.nextLine();

// Read character (workaround)
char ch = scanner.next().charAt(0);
```

#### Important Notes

- After `nextInt()` or `nextDouble()`, call `nextLine()` to consume newline
- `next()` reads until whitespace
- `nextLine()` reads entire line including spaces

**Related Files:**
- `03_interactive_applications/ScannerInputExample.java`

---

### Input Validation

Always validate user input to ensure program correctness.

#### Basic Validation Pattern

```java
int number;
while (true) {
    System.out.print("Enter a positive number: ");
    if (scanner.hasNextInt()) {
        number = scanner.nextInt();
        if (number > 0) {
            break; // Valid input
        } else {
            System.out.println("Error: Must be positive");
        }
    } else {
        System.out.println("Error: Invalid input");
        scanner.next(); // Consume invalid input
    }
}
```

#### Common Validation Checks

- **Type validation**: `hasNextInt()`, `hasNextDouble()`
- **Range validation**: Check if value is within bounds
- **Format validation**: Check string patterns
- **Non-empty validation**: Ensure string is not empty

**Related Files:**
- `03_interactive_applications/InputValidationExample.java`

---

### Menu-Driven Programs

Menu-driven programs provide a user-friendly interface with options.

#### Basic Menu Pattern

```java
int choice;
do {
    System.out.println("\n=== Menu ===");
    System.out.println("1. Option One");
    System.out.println("2. Option Two");
    System.out.println("3. Exit");
    System.out.print("Enter choice: ");
    
    choice = scanner.nextInt();
    
    switch (choice) {
        case 1:
            // Handle option 1
            break;
        case 2:
            // Handle option 2
            break;
        case 3:
            System.out.println("Exiting...");
            break;
        default:
            System.out.println("Invalid choice");
            break;
    }
} while (choice != 3);
```

#### Best Practices

- Clear menu display
- Validate user input
- Provide exit option
- Handle invalid choices gracefully
- Use do-while for menus (show at least once)

**Related Files:**
- `03_interactive_applications/InteractiveMenuExample.java`

---

## Best Practices

### Loops

1. **Choose the right loop type**
   - `for`: Known number of iterations
   - `while`: Unknown iterations, condition-based
   - `do-while`: Execute at least once
   - Enhanced for: Iterate over collections

2. **Avoid infinite loops**
   - Always modify loop variable
   - Ensure condition can become false
   - Use `break` when appropriate

3. **Keep loops simple**
   - Avoid deeply nested loops when possible
   - Extract complex logic to methods

4. **Performance considerations**
   - Nested loops have O(n²) complexity
   - Consider algorithm efficiency

### Conditionals

1. **Use switch for multiple values**
   - More readable than long if-else chains
   - Remember `break` statements

2. **Ternary for simple assignments**
   - Keep it simple and readable
   - Avoid deeply nested ternary

3. **Complex boolean logic**
   - Use parentheses for clarity
   - Break complex conditions into variables
   - Use meaningful variable names

### Interactive Applications

1. **Always validate input**
   - Check type before reading
   - Validate ranges and formats
   - Provide clear error messages

2. **User-friendly interfaces**
   - Clear prompts and messages
   - Consistent formatting
   - Helpful error messages

3. **Handle edge cases**
   - Empty input
   - Invalid types
   - Boundary values

4. **Resource management**
   - Close Scanner when done (in real applications)
   - Handle exceptions appropriately

---

## Quick Reference

### Loop Comparison

| Loop Type | When to Use | Executes At Least Once? |
|-----------|-------------|------------------------|
| `for` | Known iterations | No |
| `while` | Unknown iterations | No |
| `do-while` | Unknown iterations, need at least one | Yes |
| Enhanced for | Iterate collections | No |

### Conditional Comparison

| Statement | Best For | Example |
|-----------|----------|---------|
| `if-else` | 2-3 conditions | `if (x > 0) { }` |
| `switch` | Multiple values | `switch (day) { case 1: ... }` |
| Ternary | Simple assignment | `max = (a > b) ? a : b` |

### Scanner Methods

| Method | Reads | Notes |
|--------|-------|-------|
| `nextInt()` | Integer | Consume newline after |
| `nextDouble()` | Double | Consume newline after |
| `next()` | One word | Until whitespace |
| `nextLine()` | Entire line | Includes spaces |
| `hasNextInt()` | Check if int | Doesn't consume input |

---

## Related Files

### Loop Examples
- `01_loops/ForLoopExample.java` - For loop demonstrations
- `01_loops/WhileLoopExample.java` - While loop demonstrations
- `01_loops/DoWhileLoopExample.java` - Do-while loop demonstrations
- `01_loops/EnhancedForLoopExample.java` - Enhanced for loop demonstrations
- `01_loops/NestedLoopExample.java` - Nested loop patterns

### Advanced Conditionals
- `02_advanced_conditionals/SwitchStatementExample.java` - Switch statement examples
- `02_advanced_conditionals/TernaryOperatorExample.java` - Ternary operator examples
- `02_advanced_conditionals/ComplexBooleanLogicExample.java` - Complex boolean logic

### Interactive Applications
- `03_interactive_applications/ScannerInputExample.java` - Scanner usage examples
- `03_interactive_applications/InputValidationExample.java` - Input validation patterns
- `03_interactive_applications/InteractiveMenuExample.java` - Menu-driven program examples

### Exercises
- `exercises/SimpleLoopAndConditionalExamples.java` - Simple working examples

---

**Last Updated**: This guide covers loops, advanced conditionals, and interactive applications in Java. Use it as a reference when working with these concepts.

