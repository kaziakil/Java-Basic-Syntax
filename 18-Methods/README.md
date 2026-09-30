# Topic 18: Methods (Functions) in Java

## What is it?
A method (often called a function in other languages) is a named, reusable block of code designed to perform a specific task. Methods break down complex programs into manageable, modular, and readable pieces.

## Important Concepts
- **DRY Principle:** "Don't Repeat Yourself" — write logic once in a method, then call it as many times as needed.
- **Return Type:** Indicates the data type of the value the method sends back to the caller. Use `void` if the method returns nothing.
- **Parameters vs. Arguments:**
  - **Parameters:** Variables defined in the method signature (e.g., `int a, int b`).
  - **Arguments:** Actual values passed into the method during invocation (e.g., `add(15, 35)`).
- **The `static` Keyword:** In basic Java console programs, helper methods declared as `static` inside the main class can be invoked directly from the `static main` method without creating class instances.
- **The `return` Statement:** Terminates method execution and passes the resulting value back to the calling statement.

## Syntax
```java
// Method declaration
public static returnType methodName(parameterType parameterName) {
    // method body
    return value; // (omitted if returnType is void)
}

// Method call
methodName(argumentValue);
```

## Example
The file `MethodExample.java` demonstrates:
- A `void` method with no parameters (`greet`).
- A `void` method accepting multiple parameters (`printGreeting`).
- An integer calculation method that returns a computed sum (`add`).
- A predicate method returning a boolean (`isEven`).

## Important Points
- Method names should follow `camelCase` and typically start with a verb (e.g., `calculateTotal`, `isEven`, `printReport`).
- If a method declares a return type other than `void`, every possible code path inside the method must encounter a `return` statement with a matching type.

## Common Mistakes
- Omitting the `static` keyword on helper methods when calling them from `public static void main`.
- Forgetting to return a value in a non-void method, or returning a value in a `void` method.
- Mismatch between parameter types and argument types.
