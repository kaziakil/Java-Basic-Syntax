# Topic 01: IDE, Project, Package, and Class

## What is it?
In Java, every program is organized into projects, packages, and classes. An IDE (Integrated Development Environment) like VS Code or IntelliJ IDEA helps you write, compile, and run Java code easily.

## Important Concepts
- **JDK (Java Development Kit):** The full toolkit needed to develop and compile Java code (includes `javac`).
- **JRE (Java Runtime Environment):** The runtime environment needed to execute compiled Java bytecode (includes the JVM).
- **JVM (Java Virtual Machine):** The engine that executes Java bytecode, making Java platform-independent ("Write Once, Run Anywhere").
- **Project:** A workspace or folder containing all source files and resources for your program.
- **Package:** A folder/namespace mechanism used to group related classes together and avoid naming conflicts.
- **Class:** The blueprint of a program. In Java, all code must reside inside a class.
- **Main Method:** The entry point where Java begins executing the program.

## Syntax
```java
public class ClassName {
    public static void main(String[] args) {
        // Code to execute
    }
}
```

## Example
The file `Main.java` demonstrates the absolute minimum valid Java application structure:
- It declares a public class named `Main`.
- It defines the `main` method.
- It prints greeting messages to the console using `System.out.println()`.

## Important Points
- The name of the public class **must** match the `.java` filename exactly (case-sensitive).
- Java execution always starts at `public static void main(String[] args)`.
- Every Java statement must end with a semicolon (`;`).

## Common Mistakes
- Mismatch between the file name (`Main.java`) and the public class name (`public class main`).
- Forgetting the semicolon at the end of a statement.
- Misspelling `String` with a lowercase `s` or `System` with a lowercase `s`.
