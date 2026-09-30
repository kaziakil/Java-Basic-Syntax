# Topic 16: String Split in Java

## What is it?
The `split()` method belongs to the `String` class. It divides a string into multiple pieces based on a given delimiter (separator) and returns those pieces as an array of strings (`String[]`).

## Important Concepts
- **Delimiter:** The character or sequence used to decide where to divide the string (e.g., `" "`, `","`, `"-"`).
- **Return Type:** Always returns an array of strings: `String[]`.
- **Regex Awareness:** The delimiter argument is interpreted as a regular expression. For basic characters like spaces or commas, it behaves as a simple literal separator.

## Syntax
```java
String text = "red,green,blue";
String[] colors = text.split(",");
// colors[0] is "red", colors[1] is "green", colors[2] is "blue"
```

## Example
The file `StringSplitExample.java` demonstrates:
- Splitting an English sentence by whitespace (`" "`) to extract individual words.
- Splitting a comma-separated values (CSV) list of fruits (`","`).
- Parsing a date string (`"YYYY-MM-DD"`) using a hyphen delimiter (`"-"`).

## Important Points
- If the delimiter is not found in the string, `split()` returns an array with a single element containing the entire original string.
- The returned array has a `.length` property that tells you how many segments were extracted.

## Common Mistakes
- Expecting `split()` to modify the original string (Strings are immutable; `split()` returns a brand new `String[]`).
- Using special regex characters like `.` or `|` directly without escaping them (e.g., using `split("\\.")` when splitting by period).
