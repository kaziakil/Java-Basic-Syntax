# Topic 14: Two-Dimensional (2D) Arrays

## What is it?
A two-dimensional (2D) array in Java is an "array of arrays", organized as a grid with rows and columns. It is widely used to represent matrices, chessboards, tables, and coordinate systems.

## Important Concepts
- **Dimensions:** The first index refers to the **row**, and the second index refers to the **column**: `matrix[rowIndex][colIndex]`.
- **Row Count:** Given by `matrix.length`.
- **Column Count:** Given by `matrix[rowIndex].length`.
- **Nested Loops:** Traversal requires nested loops: the outer loop iterates over rows, and the inner loop iterates over columns.

## Syntax
```java
// Declaration with row and column sizes
int[][] grid = new int[3][4]; // 3 rows, 4 columns

// Literal initialization
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

// Accessing an element
int val = matrix[0][1]; // row 0, col 1
```

## Example
The file `TwoDArrayExample.java` demonstrates:
- Declaring and populating a $3 \times 3$ integer matrix.
- Accessing row count (`matrix.length`) and column count (`matrix[0].length`).
- Accessing and modifying individual cells.
- Displaying matrix data in row/column format with tab formatting.
- Calculating the sum of all elements across the entire grid.

## Important Points
- In Java, 2D arrays are technically objects containing arrays as elements.
- Always use `matrix.length` for the outer row limit and `matrix[r].length` for the inner column limit.

## Common Mistakes
- Inverting rows and columns: writing `matrix[c][r]` instead of `matrix[r][c]`.
- Using `matrix.length` for both the outer and inner loops, which causes errors if the array is not square.
- Forgetting that indices start at 0 for both rows and columns.
