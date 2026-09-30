# Topic 11: Do-While Loop

## What is it?
A `do-while` loop is a post-test loop in Java. Unlike `for` and `while` loops which evaluate conditions first, a `do-while` loop executes its body first and checks the condition at the end.

## Important Concepts
- **Guaranteed Execution:** The loop body runs **at least once**, regardless of whether the condition is `true` or `false` at the start.
- **Semicolon Requirement:** A `do-while` loop statement terminates with a semicolon after the closing parenthesis: `while (condition);`.
- **When to Use:** Ideal for interactive prompts or menu-driven programs where you must display options or perform an action at least once before checking if the user wants to continue.

## Syntax
```java
do {
    // code block to execute
    // update statement
} while (condition);
```

## Example
The file `DoWhileExample.java` demonstrates:
- A standard counting loop from 1 to 5.
- A demonstration of a loop where the condition starts out `false` (`100 < 50`), proving the body executes exactly once.

## Important Points
- Remember the semicolon at the end of the `while (condition);` line.
- The condition must evaluate to a boolean expression.

## Common Mistakes
- Forgetting the trailing semicolon after `while (condition);`, which causes a syntax error.
- Forgetting to increment the loop variable inside the `do` block, resulting in an infinite loop.
