# Java Core Learning Path

This repository contains Java learning materials organized in a progressive learning structure, from basic concepts to practical projects. Each concept is broken down into focused subfolders with multiple examples and exercises.

## 📚 Learning Structure

### 01_hello_world
- **HelloWorld.java** - Your first Java program
- Introduction to the `main` method and `System.out.println()`

### 02_data_types
- **DataTypes.java** - Comprehensive guide to Java data types
- Covers primitive types (int, double, boolean, char, etc.)
- Explains reference types and type casting

### 03_variables
Organized into subfolders covering different variable types:

- **01_local_variables/**
  - `LocalVariables.java` - Understanding local variables and scope
  - `Variables.java` - Basic variable operations
  
- **02_instance_variables/**
  - `InstanceVariables.java` - Instance variables and object-specific data
  
- **03_static_variables/**
  - `StaticVariables.java` - Static variables shared across all objects
  
- **exercises/**
  - `VariableExercises.java` - Practice problems for variables

### 04_expressions_statements_blocks
Fundamental building blocks of Java programs:
- **01_expressions/** - Understanding expressions
- **02_statements/** - Working with statements
- **03_code_blocks/** - Code block scope
- **04_control_flow/01_conditional_statements/** - If/else statements, boolean logic
- **05_methods/01_basic_methods/** - Method creation and usage
- **exercises/** - Practice problems

### 05_conditional_logic_loops_interactive
Mastering Conditional Logic, Loops, And Interactive Java Applications:
- **01_loops/** - for, while, do-while, enhanced for loops
- **02_advanced_conditionals/** - Switch statements, ternary operators, complex logic
- **03_interactive_applications/** - User input, interactive menus, input validation
- **exercises/** - Practice problems for loops and interactive applications

### 06_arrays
Comprehensive array learning with multiple examples:

- **01_basic_arrays/**
  - `ArrayDemo.java` - Introduction to arrays
  - `BasicArrayExample.java` - Basic array operations
  - `ArrayInitialization.java` - Different ways to initialize arrays
  
- **02_multidimensional_arrays/**
  - `MultiDimensionalArray.java` - Working with 2D arrays
  - `TwoDArrayExample.java` - Advanced 2D array operations
  
- **03_jagged_arrays/**
  - `JaggedArray.java` - Understanding jagged arrays
  - `JaggedArrayExample.java` - Practical jagged array examples
  
- **exercises/**
  - `ArrayExercises.java` - Practice problems (find max, min, sum, reverse, etc.)

### 07_classes_and_objects
Learn about classes and objects through multiple examples:

- **01_basic_class/**
  - `BasicClass.java` - Creating your first class
  - `DemoClass.java` - Class and object fundamentals
  
- **02_methods/**
  - `MethodsExample.java` - Instance methods, static methods, parameters, return values
  
- **03_static_keyword/**
  - `StaticKeyword.java` - Understanding static variables, methods, and blocks
  
- **exercises/**
  - `ClassExercises.java` - Practice creating Student, BankAccount, and Car classes

### 08_constructors
Master constructors with different types:

- **01_default_constructor/**
  - `DefaultConstructor.java` - Default constructors with no parameters
  
- **02_parameterized_constructor/**
  - `Human.java` - Parameterized constructors with validation
  - `ConstructorDemo.java` - Demonstrating constructor usage
  
- **03_constructor_chaining/**
  - `ConstructorChaining.java` - Calling one constructor from another using 'this'
  
- **exercises/**
  - `ConstructorExercises.java` - Practice creating Book, Rectangle, and Person classes

### 09_method_overloading
Learn method overloading through examples:

- **examples/**
  - `MethodOverloading.java` - Basic method overloading concepts
  - `OverloadingExamples.java` - Advanced overloading scenarios (by number, type, order)
  
- **exercises/**
  - `OverloadingExercises.java` - Practice creating MathUtils, Printer, and Calculator classes

### 10_memory_management
- **StackAndHeapMemory.md** - Understanding JVM memory structure
- Stack memory vs Heap memory
- How Java manages memory for variables and objects
- Detailed visualization of JVM memory structure

### 11_projects
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
   - **Numbered subfolders** - Organized learning progression
   - **Multiple examples** - Different scenarios and use cases
   - **Exercises folder** - Practice problems to test your understanding
3. Compile and run Java files using:
   ```bash
   javac *.java
   java ClassName
   ```

## 📝 Notes

- All `.class` files are excluded from version control (they're generated during compilation)
- Each concept builds upon previous ones
- Exercises are provided for hands-on practice
- The quiz project in `11_projects` demonstrates practical application of all concepts

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
