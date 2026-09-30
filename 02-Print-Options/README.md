# Topic 02: Print Options

## What is it?
In Java, output is sent to the terminal using the `System.out` stream. Understanding the difference between printing on the same line and printing with a newline is a core basic skill.

## Important Concepts
- **`System.out.print()`:** Prints the given content without appending a newline at the end. Subsequent prints appear on the same line.
- **`System.out.println()`:** Prints the given content and immediately moves the cursor to the beginning of the next line.
- **Escape Sequences:** Special character combinations starting with a backslash (`\`) used to format output:
  - `\n` : Newline
  - `\t` : Tab space
  - `\"` : Double quotation mark
  - `\\` : Literal backslash
- **String Concatenation (`+`):** Combines strings and variables into a single output.

## Syntax
```java
System.out.print("Text on same line");
System.out.println("Text followed by newline");
System.out.println("Line 1\nLine 2");
```

## Example
The file `PrintExample.java` demonstrates:
- How `print()` keeps content on the same line.
- How `println()` creates distinct lines.
- Practical formatting using `\n`, `\t`, and `\"`.
- Combining text and arithmetic expressions using parentheses.

## Important Points
- Use parentheses `(5 + 5)` when adding numbers inside `println("..." + (5 + 5))`; otherwise, Java treats `+` as text concatenation.
- An empty `System.out.println();` simply prints a blank line.

## Common Mistakes
- Misspelling `println` as `printline` or `PrintLn`.
- Forgetting that `"5" + 5` produces `"55"` (text concatenation) rather than `10`.
