# Topic 19: Method Exercises and Practice

## What is it?
This topic puts together methods with previous programming building blocks (variables, conditional logic, loops, and arrays) to solve real computational problems in a clean, structured manner.

## Important Concepts
- **Problem Decomposition:** Breaking down a problem into separate, focused methods makes testing and debugging much simpler.
- **Passing Arrays to Methods:** An array can be passed as a method parameter (e.g., `int[] numbers`).
- **Accumulator Pattern in Methods:** Using a local accumulator variable (such as `result = 1` or `total = 0`) inside a loop and returning the computed value.
- **Returning Values from Conditionals:** Ensuring all conditional paths (`if` and `else`) return an appropriate value.

## Syntax
```java
// Method accepting an array parameter
public static int sumArray(int[] numbers) {
    int total = 0;
    for (int i = 0; i < numbers.length; i++) {
        total += numbers[i];
    }
    return total;
}
```

## Example
The file `MethodExercise.java` demonstrates three practical exercises:
1. `findMax(int num1, int num2)`: Uses an `if-else` statement to return the larger of two numbers.
2. `calculateFactorial(int n)`: Uses a `for` loop to compute the factorial product ($n! = 1 \times 2 \times \dots \times n$).
3. `sumArray(int[] numbers)`: Takes an integer array as a parameter and computes the sum of its elements using a loop.

## Important Points
- Always initialize your accumulator variable before starting the loop (`result = 1` for multiplication, `total = 0` for addition).
- For factorial calculations of larger numbers, return `long` instead of `int` to avoid integer overflow.

## Common Mistakes
- Initializing a multiplication accumulator with `0` instead of `1` (which results in `0` for any factorial).
- Missing a `return` statement in one of the branches of an `if-else` block.
