# Topic 13: Arrays (1D)

## What is it?
An array in Java is a data structure that holds a fixed number of values of a single, uniform data type. Elements are stored in contiguous memory locations.

## Important Concepts
- **Fixed Size:** Once an array is instantiated, its length cannot be changed.
- **Zero-Based Indexing:** Array indices range from `0` to `array.length - 1`.
- **Length Property:** Use `.length` (without parentheses) to get the total number of elements in an array.
- **Default Values:** When created with `new int[N]`, numeric arrays are populated automatically with zeros (`0`), boolean arrays with `false`, and object arrays with `null`.
- **Traversal:** A `for` loop from `i = 0` to `i < array.length` is standard for inspecting or modifying array elements.

## Syntax
```java
// Declaration & memory allocation
int[] arr = new int[5];

// Direct initialization with literal
int[] numbers = {10, 20, 30, 40};

// Access and modification
int first = numbers[0];
numbers[1] = 99;

// Array length
int size = numbers.length;
```

## Example
The file `ArrayExample.java` demonstrates:
- Allocating an array with `new int[4]` and assigning values by index.
- Array literal initialization `{10, 20, 30, 40, 50}`.
- Updating an element at a specific index.
- Traversing with a `for` loop to print indices and values.
- Calculating the sum and average of all array elements.

## Important Points
- Attempting to access an index `< 0` or `>= array.length` results in an `ArrayIndexOutOfBoundsException`.
- Remember that `.length` on an array is a field/property, not a method (`arr.length`, NOT `arr.length()`).

## Common Mistakes
- Off-by-one error when looping: using `i <= array.length` instead of `i < array.length`.
- Trying to access index `array.length` (the valid last index is always `array.length - 1`).
- Thinking an array can hold mixed data types (e.g., both integers and strings).
