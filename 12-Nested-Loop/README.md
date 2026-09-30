# Topic 12: Nested Loops

## What is it?
A nested loop is a loop situated inside the body of another loop. Nested loops are primarily used to process multi-dimensional data, generate grids, and print geometric patterns.

## Important Concepts
- **Outer vs. Inner Loop:** The outer loop controls the primary iteration (often rows), while the inner loop runs completely for every single step of the outer loop (often columns).
- **Total Iterations:** If the outer loop runs $M$ times and the inner loop runs $N$ times, the inner loop's body will execute $M \times N$ times in total.
- **Line Breaks:** Calling `System.out.println()` after the inner loop finishes ensures that each row prints on a new line.

## Syntax
```java
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= cols; j++) {
        // executes (rows * cols) times
    }
    System.out.println(); // moves to next line after inner loop completes
}
```

## Example
The file `NestedLoopExample.java` demonstrates:
- A $3 \times 4$ rectangular grid of asterisks (`*`).
- A right-angled number triangle where the inner loop limit depends on the outer loop counter (`j <= i`).
- A formatted mini multiplication table using tab spaces (`\t`).

## Important Points
- Use distinct variable names for outer and inner loop counters (commonly `i` and `j`, or `row` and `col`).
- Keep nesting levels minimal (rarely more than 2 or 3) to keep code understandable and performant.

## Common Mistakes
- Accidental variable collision (e.g., using `i` for both the outer and inner loop counters).
- Forgetting to print a newline (`System.out.println()`) between rows, causing all output to print on a single continuous line.
