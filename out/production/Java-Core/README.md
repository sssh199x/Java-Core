# Java Core Learning Path

This repository contains Java learning materials organized in a progressive learning structure, from basic concepts to practical projects. Each concept is broken down into focused subfolders with multiple examples and exercises.

## 📚 Learning Structure

### helloworld
- **HelloWorld.java** - Your first Java program
- Introduction to the `main` method and `System.out.println()`

### datatypes
Comprehensive guide to Java data types:
- **primitive/** - Primitive types (int, double, boolean, char, etc.)
- **reference/** - Reference types (String, arrays, objects)
- **casting/** - Type casting (widening and narrowing)
- **DataTypesGuide.md** - Complete reference guide

### variables
Organized into subfolders covering different variable types:

- **local/**
  - `LocalVariables.java` - Understanding local variables and scope
  - `Variables.java` - Basic variable operations
  
- **instance/**
  - `InstanceVariables.java` - Instance variables and object-specific data
  
- **static_vars/**
  - `StaticVariables.java` - Static variables shared across all objects
  
- **exercises/**
  - `SimpleVariableExamples.java` - Practice problems for variables

### expressions_statements_blocks
Fundamental building blocks of Java programs:
- **expressions/** - Understanding expressions
- **statements/** - Working with statements
- **code_blocks/** - Code block scope
- **control_flow/conditional_statements/** - If/else statements, boolean logic
- **methods/basic_methods/** - Method creation and usage
- **exercises/** - Practice problems

### conditional_logic_loops_interactive
Mastering Conditional Logic, Loops, And Interactive Java Applications:
- **loops/** - for, while, do-while, enhanced for loops
- **advanced_conditionals/** - Switch statements, ternary operators, complex logic
- **interactive_applications/** - User input, interactive menus, input validation
- **exercises/** - Practice problems for loops and interactive applications

### arrays
Comprehensive array learning with multiple examples:

- **basic/**
  - `ArrayDemo.java` - Introduction to arrays
  - `BasicArrayExample.java` - Basic array operations
  - `ArrayInitialization.java` - Different ways to initialize arrays
  
- **multidimensional/**
  - `MultiDimensionalArray.java` - Working with 2D arrays
  - `TwoDArrayExample.java` - Advanced 2D array operations
  
- **jagged/**
  - `JaggedArray.java` - Understanding jagged arrays
  - `JaggedArrayExample.java` - Practical jagged array examples
  
- **exercises/**
  - `SimpleArrayExamples.java` - Practice problems (find max, min, sum, reverse, etc.)

### classes_and_objects
Learn about classes and objects through multiple examples:

- **basic/**
  - `BasicClass.java` - Creating your first class
  - `Car.java` - Car class example with encapsulation
  - `BankAccount.java` - Bank account class example
  - `Main.java` - Main class for running examples
  
- **methods/**
  - `MethodsExample.java` - Instance methods, static methods, parameters, return values
  
- **static_keyword/**
  - `StaticKeyword.java` - Understanding static variables, methods, and blocks
  
- **exercises/**
  - `SimpleClassExamples.java` - Practice creating classes
  - `Person.java` - Person class example
  - `SimpleCalculator.java` - Calculator class example

### constructors
Master constructors with different types:

- **default_constructor/**
  - `DefaultConstructor.java` - Default constructors with no parameters
  
- **parameterized/**
  - `Human.java` - Parameterized constructors with validation
  - `ConstructorDemo.java` - Demonstrating constructor usage
  
- **constructor_chaining/**
  - `ConstructorChaining.java` - Calling one constructor from another using 'this'
  
- **exercises/**
  - `SimpleConstructorExamples.java` - Practice creating constructors

### method_overloading
Learn method overloading through examples:

- **examples/**
  - `MethodOverloading.java` - Basic method overloading concepts
  - `OverloadingExamples.java` - Advanced overloading scenarios (by number, type, order)
  
- **exercises/**
  - `OverloadingExercises.java` - Practice creating MathUtils, Printer, and Calculator classes

### memory_management
- **StackAndHeapMemory.md** - Understanding JVM memory structure
- Stack memory vs Heap memory
- How Java manages memory for variables and objects
- Detailed visualization of JVM memory structure

### projects
- **quiz/** - Quiz Application
  - A practical project combining multiple Java concepts
  - Uses classes, arrays, user input, and methods
  - Demonstrates real-world application of learned concepts
  - `QuizApplication.java` - Main application
  - `Question.java` - Question model class
  - `QuestionService.java` - Business logic
  - `AnswerService.java` - Interface for future extensions

## 🚀 Getting Started

1. Navigate to any directory to explore the concepts
2. Each concept folder contains:
   - **Subfolders** - Organized by topic
   - **Multiple examples** - Different scenarios and use cases
   - **Exercises folder** - Practice problems to test your understanding
3. Compile and run Java files using:
   ```bash
   # From the project root
   javac path/to/ClassName.java
   java package.path.ClassName
   
   # Example:
   javac expressions_statements_blocks/methods/basic_methods/SpeedConverter.java
   java expressions_statements_blocks.methods.basic_methods.SpeedConverter
   ```

## 📝 Notes

- All `.class` files are excluded from version control (they're generated during compilation)
- Each concept builds upon previous ones
- Exercises are provided for hands-on practice
- The quiz project in `projects` demonstrates practical application of all concepts

## 🎯 Learning Path

Follow this order for best learning experience:

1. **Hello World** → Get familiar with Java syntax
2. **Data Types** → Understand what data you can work with
3. **Variables** → Learn to store and manipulate data
   - Start with local variables
   - Move to instance variables
   - Understand static variables
4. **Expressions, Statements & Blocks** → Fundamental building blocks
   - Understand expressions and statements
   - Learn about code blocks and scope
   - Master conditional statements (if/else)
   - Create and use methods
5. **Conditional Logic, Loops & Interactive Apps** → Advanced control flow
   - Master different types of loops (for, while, do-while)
   - Learn advanced conditional logic (switch, ternary)
   - Build interactive applications with user input
6. **Arrays** → Work with collections of data
   - Master basic arrays
   - Learn multidimensional arrays
   - Understand jagged arrays
   - Complete array exercises
7. **Classes & Objects** → Organize code into reusable components
   - Create basic classes
   - Learn about methods
   - Understand static keyword
   - Complete class exercises
8. **Constructors** → Initialize objects properly
   - Default constructors
   - Parameterized constructors
   - Constructor chaining
   - Complete constructor exercises
9. **Method Overloading** → Write flexible methods
   - Learn overloading concepts
   - Practice with examples
   - Complete overloading exercises
10. **Memory Management** → Understand how Java manages memory
11. **Projects** → Apply everything you've learned

## 💡 Tips for Learning

- **Read the examples** in each subfolder before attempting exercises
- **Try modifying** the example code to see what happens
- **Complete the exercises** to reinforce your understanding
- **Experiment** with the code - break things and fix them!
- **Build the quiz project** to see how everything comes together

Happy Learning! 🎓
