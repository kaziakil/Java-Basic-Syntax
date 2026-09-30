# Topic 04: Basic Data Types

## What is it?
Java is a strongly typed programming language. Every variable must have a declared data type. Java provides 8 primitive data types to store numbers, characters, and truth values directly in memory.

## Important Concepts
Java's primitive data types:
- **Integer Types:**
  - `byte`: 1 byte (8 bits), ranges from -128 to 127.
  - `short`: 2 bytes (16 bits), ranges from -32,768 to 32,767.
  - `int`: 4 bytes (32 bits), standard choice for whole numbers (up to ~2 billion).
  - `long`: 8 bytes (64 bits), for very large whole numbers; must end with `L` or `l`.
- **Floating-Point Types:**
  - `float`: 4 bytes (32 bits), single precision decimal; must end with `f` or `F`.
  - `double`: 8 bytes (64 bits), double precision decimal; default choice for decimals.
- **Character Type:**
  - `char`: 2 bytes (16 bits), stores a single character enclosed in single quotes `' '`.
- **Boolean Type:**
  - `boolean`: stores only `true` or `false`.

## Syntax
```java
byte b = 100;
short s = 20000;
int i = 500000;
long l = 10000000000L;

float f = 5.75f;
double d = 19.99;

char c = 'A';
boolean flag = true;
```

## Example
The file `DataTypesExample.java` demonstrates declaring, initializing, and displaying variables of every common primitive type.

## Important Points
- Integer literals are treated as `int` by default. Append `L` for `long` values exceeding standard `int` limits.
- Floating-point literals are treated as `double` by default. Append `f` for `float` values.
- `char` literals must be enclosed in single quotes `' '`, while `String` literals use double quotes `" "`.

## Common Mistakes
- Omitting the `f` suffix for `float` literals (e.g., `float x = 3.14;` fails to compile because `3.14` is a `double`).
- Omitting the `L` suffix for large `long` values.
- Enclosing `char` in double quotes (e.g., `char c = "A";` produces a type mismatch).
