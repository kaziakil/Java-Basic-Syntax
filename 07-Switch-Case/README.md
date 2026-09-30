# Topic 07: Switch-Case Statement

## What is it?
The `switch` statement selects one of many code blocks to execute based on the value of a single variable or expression. It often provides a cleaner, more readable alternative to a long `if-else-if` ladder when testing for specific discrete values.

## Important Concepts
- **Matching Expression:** The value inside `switch(expression)` is compared against each `case` value.
- **`case` Value:** Must be a constant literal or compile-time constant of a compatible type.
- **`break` Statement:** Immediately terminates the `switch` block. If `break` is omitted, execution "falls through" into the next `case` block regardless of whether it matches.
- **`default` Statement:** Executes if none of the `case` values match (similar to the final `else` in an `if-else-if` chain).
- **Supported Types:** `byte`, `short`, `char`, `int`, `String`, and `enum`. (Note: `float` and `double` are NOT supported in `switch`).

## Syntax
```java
switch (variable) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    default:
        // code block if no match
        break;
}
```

## Example
The file `SwitchExample.java` demonstrates:
- Mapping numeric values (1 to 7) to days of the week.
- Using `switch` with `String` literals for role-based authorization check.
- Proper usage of `break` and fallback `default` cases.

## Important Points
- Always include `break` statements unless you intentionally want "fall-through" behavior.
- The `default` case can be placed anywhere, but by convention, it is placed at the end.

## Common Mistakes
- Forgetting `break`, causing unintentional fall-through where multiple cases run.
- Attempting to use `float`, `double`, or `boolean` in a `switch` condition.
- Attempting to use variable expressions (e.g., `case x > 5:`) instead of constant values in `case` labels.
