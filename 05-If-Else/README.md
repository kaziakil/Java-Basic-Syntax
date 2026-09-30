# Topic 05: If-Else Statement

## What is it?
The `if-else` statement is a fundamental control flow structure in Java used for decision-making. It executes one block of code if a condition is `true`, and another block if the condition is `false`.

## Important Concepts
- **Condition:** An expression that evaluates strictly to a boolean value (`true` or `false`).
- **If block:** Executes only when the condition is `true`.
- **Else block:** Optional fallback block that executes when the condition is `false`.
- **Relational Operators:** Used to build conditions:
  - `>` : Greater than
  - `<` : Less than
  - `>=` : Greater than or equal to
  - `<=` : Less than or equal to
  - `==` : Equal to
  - `!=` : Not equal to

## Syntax
```java
if (condition) {
    // executes if condition is true
} else {
    // executes if condition is false
}
```

## Example
The file `IfElseExample.java` demonstrates:
- Checking eligibility (age `>= 18`).
- Checking even vs. odd numbers using the modulus operator (`number % 2 == 0`).
- Pass/fail decision based on a test score.

## Important Points
- The condition inside `if (...)` must always evaluate to a `boolean`.
- Always use curly braces `{}` around the body of `if` and `else` blocks to maintain clarity and avoid logic bugs.

## Common Mistakes
- Using single equals `=` (assignment) instead of double equals `==` (comparison).
- Placing a semicolon immediately after the `if` condition: `if (x > 5); { ... }` which terminates the condition prematurely.
