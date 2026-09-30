# Topic 06: If-Else-If Ladder

## What is it?
The `if-else-if` ladder is used when you need to test multiple conditions in sequence. It allows a program to choose between three or more possible execution paths.

## Important Concepts
- **Sequential Evaluation:** Conditions are checked in order from top to bottom.
- **Short-circuiting Decision:** The moment a condition evaluates to `true`, its corresponding block executes, and Java skips all subsequent `else if` and `else` branches.
- **Default Else:** An optional final `else` block executes only if none of the preceding conditions were met.

## Syntax
```java
if (condition1) {
    // executes if condition1 is true
} else if (condition2) {
    // executes if condition1 is false and condition2 is true
} else if (condition3) {
    // executes if condition1 & condition2 are false and condition3 is true
} else {
    // executes if none of the conditions are true
}
```

## Example
The file `IfElseIfExample.java` demonstrates:
- A letter grading system converting numeric marks (e.g., 82) into grades (A+, A, B, etc.).
- Categorizing a number as positive, negative, or zero.

## Important Points
- Order of conditions matters! Place more specific or higher-threshold conditions at the top.
- If you write `marks >= 60` before `marks >= 80`, an 85 will match the `>= 60` block first and incorrectly output Grade B.

## Common Mistakes
- Incorrect condition order leading to unintended branches matching early.
- Writing redundant conditions (e.g., `else if (marks >= 70 && marks < 80)` when `marks >= 80` was already tested above).
