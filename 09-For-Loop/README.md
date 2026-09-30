# Topic 09: For Loop

## What is it?
A `for` loop is a control flow statement used to execute a block of code repeatedly for a specific number of times. It is ideal when you know in advance how many iterations are required.

## Important Concepts
A standard `for` loop contains three parts separated by semicolons:
1. **Initialization:** Sets the starting value of the counter variable (runs once at the beginning).
2. **Condition:** Evaluated before every iteration. If `true`, the loop body runs; if `false`, the loop stops.
3. **Update (Increment/Decrement):** Modifies the counter variable after each iteration.

## Syntax
```java
for (initialization; condition; update) {
    // code executed in each iteration
}
```

## Example
The file `ForLoopExample.java` demonstrates:
- Counting upward from 1 to 5 (`i++`).
- Counting downward from 5 to 1 (`i--`).
- Accumulating a running total (sum of 1 to 10).
- Custom step increment (`i += 2`) to output even numbers.

## Important Points
- The loop counter variable declared inside `for(int i = 0; ...)` is local to the loop and cannot be accessed outside it.
- Ensure the condition will eventually evaluate to `false`; otherwise, the loop runs infinitely.

## Common Mistakes
- **Off-by-one errors:** Using `<` instead of `<=` (or vice versa), causing the loop to run one time too few or too many.
- Forgetting to update the loop counter or updating it in the wrong direction, resulting in an infinite loop.
- Placing a semicolon after the loop header: `for (int i = 0; i < 5; i++);` which creates an empty loop body.
