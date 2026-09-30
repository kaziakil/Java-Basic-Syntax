# Topic 17: Scanner and User Input

## What is it?
The `Scanner` class in Java (found in the `java.util` package) allows programs to read user input from the terminal or keyboard (`System.in`).

## Important Concepts
- **Import Statement:** Must import `java.util.Scanner` at the very top of your file before declaring your class.
- **Scanner Initialization:** `Scanner scanner = new Scanner(System.in);`
- **Input Methods:**
  - `nextLine()` : Reads a complete line of text as a `String` (including spaces).
  - `next()` : Reads only the next single word up to whitespace.
  - `nextInt()` : Reads the next whole number.
  - `nextDouble()` : Reads the next decimal number.
  - `nextBoolean()` : Reads a boolean (`true` or `false`).
- **Resource Management:** Call `scanner.close()` once you are finished taking input.

## Syntax
```java
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
    }
}
```

## How to Run This Example
Because this program is interactive, run it in your terminal as follows:
```bash
# 1. Compile the file
javac 17-Scanner-User-Input/ScannerExample.java

# 2. Run interactively (it will prompt you in the terminal)
java -cp 17-Scanner-User-Input ScannerExample
```

When prompted, type:
1. Your full name (e.g., `Jane Doe`) and press Enter.
2. Your age (e.g., `21`) and press Enter.
3. Your GPA (e.g., `3.85`) and press Enter.

Alternatively, you can pipe sample input directly:
```bash
printf "Jane Doe\n21\n3.85\n" | java -cp 17-Scanner-User-Input ScannerExample
```

## Important Points
- Always guide the user by printing a prompt (`System.out.print(...)`) before calling an input method so they know what to type.
- Be careful with `nextInt()` followed by `nextLine()`. The `nextInt()` reads the integer value but leaves the newline character `\n` in the input buffer. Calling `nextLine()` right after will immediately consume that leftover newline rather than waiting for new input. Adding an extra `scanner.nextLine();` clears this buffer.

## Common Mistakes
- Forgetting to write `import java.util.Scanner;` at the top of the file.
- Entering text when `nextInt()` or `nextDouble()` expects a numeric value, causing an `InputMismatchException`.
- Forgetting to close the scanner with `scanner.close()`.
