# Topic 03: Data Types and Variables

## What is it?
A variable is a named storage container in computer memory used to store data that can change during program execution. Every variable in Java must have a declared data type.

## Important Concepts
- **Declaration:** Informs Java about the variable's name and type before storing any value (e.g., `int age;`).
- **Initialization:** Giving a variable its initial value using the assignment operator `=` (e.g., `age = 21;`).
- **Reassignment:** Storing a new value inside an existing variable (overwriting the previous value).
- **Naming Rules:**
  - Names can contain letters, numbers, underscores (`_`), and dollar signs (`$`).
  - Cannot begin with a number (e.g., `1number` is invalid).
  - Cannot use reserved Java keywords (e.g., `class`, `void`, `int`).
  - Java is case-sensitive (`myVar` and `myvar` are different variables).
- **Naming Convention:** Use `camelCase` for variable names (e.g., `studentId`, `itemPrice`).

## Syntax
```java
// Declaration
dataType variableName;

// Initialization
variableName = value;

// Combined
dataType variableName = value;
```

## Example
The file `VariablesExample.java` demonstrates:
- Separate declaration and initialization.
- Updating an existing variable.
- Declaring and initializing multiple variable types (`int`, `double`, `char`, `boolean`).
- Declaring multiple variables of the same type on one line.

## Important Points
- In Java, a local variable must be initialized before it is read/used.
- Java is statically typed: once a variable is declared with a type, it cannot store a value of an incompatible type.

## Common Mistakes
- Trying to use a local variable before assigning a value to it.
- Redeclaring an existing variable with its data type (e.g., writing `int age = 20;` and then `int age = 22;` in the same scope).
- Beginning a variable name with a digit.
