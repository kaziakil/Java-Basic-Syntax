# Topic 10: While Loop

## What is it?
A `while` loop is a pre-test loop in Java that repeats a block of code as long as a specified boolean condition remains `true`. The condition is checked **before** entering the loop body.

## Important Concepts
- **Pre-test Nature:** If the condition evaluates to `false` initially, the loop body will not execute even once.
- **Loop Control Variable:** Must be initialized before the loop and updated inside the body.
- **When to Use:** Ideal when you do not know the exact number of iterations in advance, but know the condition under which looping should continue.

## Syntax
```java
// 1. Initialization
int i = 1;

// 2. Condition check
while (i <= 5) {
    // 3. Body code
    // 4. Update
    i++;
}
```

## Example
The file `WhileLoopExample.java` demonstrates:
- Counting from 1 to 5.
- Countdown timer from 5 to 1.
- Multiplying a number by 2 iteratively until it reaches or exceeds 100.

## Important Points
- Always ensure that the loop variable changes toward making the condition `false`.
- If the loop condition never becomes `false`, the program hangs in an infinite loop.

## Common Mistakes
- Forgetting the update statement (`i++`), leading to an infinite loop.
- Placing an unintended semicolon after `while (condition);` which traps execution in a tight empty infinite loop.
