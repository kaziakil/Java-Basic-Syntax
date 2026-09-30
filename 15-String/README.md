# Topic 15: String in Java

## What is it?
In Java, a `String` is a non-primitive (reference) data type that represents an ordered sequence of characters. Unlike primitive types, `String` is an object with built-in methods for manipulation.

## Important Concepts
- **String Immutability:** Strings cannot be modified after creation. Operations that seem to alter a string (like `toUpperCase()`) actually return a brand-new `String` object.
- **String Literal vs. `new String()`:**
  - String literals (`"text"`) are stored in the String Constant Pool to conserve memory.
  - Creating strings with `new String("text")` allocates a new object in general heap memory.
- **Crucial Equality Rule:**
  - `==` compares whether two references point to the exact same memory address.
  - `.equals()` compares the actual text contents of the two strings.
  - **Always** use `.equals()` or `.equalsIgnoreCase()` to compare string contents!
- **Common Methods:**
  - `.length()`: returns string length (requires parentheses).
  - `.charAt(index)`: returns the character at a zero-based index.
  - `.toUpperCase()` / `.toLowerCase()`: case modification.
  - `.contains(CharSequence)`: checks for presence of a substring.

## Syntax
```java
String name = "Java";
int len = name.length();
char first = name.charAt(0);
boolean same = name.equals("Java");
```

## Example
The file `StringExample.java` demonstrates:
- String creation and length determination.
- Character access using `charAt()`.
- Transforming case with `toUpperCase()` and `toLowerCase()`.
- String concatenation using `+`.
- Clear difference between `==` and `.equals()`.

## Important Points
- Remember that array length is a property (`arr.length`), but String length is a method call (`str.length()`).
- Strings use 0-based indexing just like arrays.

## Common Mistakes
- Using `==` to compare String values, which fails when one of the strings was created dynamically or with `new String()`.
- Forgetting that Strings are immutable and expecting `str.toUpperCase()` to change `str` in-place without reassigning the result.
