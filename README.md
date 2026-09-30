# Java-Basic-Syntax

A structured, beginner-friendly practice repository covering the core fundamentals of Java programming.

## Project Description
This repository contains organized, step-by-step code examples and concise study notes for beginners learning Java syntax. Every topic is isolated in its own dedicated directory containing working Java source code and a conceptual `README.md` guide.

## Purpose of the Project
The goal of this project is to build a rock-solid foundation in Java's basic syntax and procedural programming concepts—such as variables, primitive types, decision-making, loops, arrays, string manipulation, user input, and methods—before advancing to Object-Oriented Programming (OOP) and complex frameworks.

## Playlist Reference
The practice exercises and notes in this repository are based on the YouTube playlist:
- **Course Playlist:** [Java Basic Syntax Bangla Tutorial (by Bangla Coding Tutor)](https://www.youtube.com/playlist?list=PLdl6zXgLsy3xCae1uL6rJ8Ay9sIiyBy5I)

> **Note:** This repository specifically focuses on beginner Java practice based on the topics taught in the playlist above. No advanced OOP, collections, or external frameworks are introduced prematurely.

---

## List of Topics Covered
1. **01-IDE-Project-Package-Class:** Java environment (JDK, JRE, JVM), project structure, class declarations, and the `main` method.
2. **02-Print-Options:** Outputting text via `print()`, `println()`, escape sequences (`\n`, `\t`, `\"`), and concatenation.
3. **03-Data-Type-Variables:** Variable declaration, memory allocation, value initialization, and naming rules.
4. **04-Basic-Data-Types:** Java's primitive types (`byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`).
5. **05-If-Else:** Conditional logic and binary decision-making.
6. **06-If-Else-If:** Multi-branch conditional chains and precedence.
7. **07-Switch-Case:** Discrete value matching with `switch`, `case`, `break`, and `default`.
8. **08-Operators:** Arithmetic, relational, logical (`&&`, `||`, `!`), compound assignment, unary (`++`, `--`), and operator precedence.
9. **09-For-Loop:** Counter-controlled iteration, counting up, counting down, and calculating series.
10. **10-While-Loop:** Pre-test loops executing repeatedly based on dynamic conditions.
11. **11-Do-While-Loop:** Post-test loops guaranteed to execute at least once.
12. **12-Nested-Loop:** Multidimensional loops for printing tables, grids, and geometric patterns.
13. **13-Array:** Single-dimensional arrays, zero-based indexing, `.length` property, and array traversal.
14. **14-2D-Array:** Two-dimensional matrices (rows and columns) and nested traversal.
15. **15-String:** String creation, immutability, essential string methods, and content comparison with `.equals()`.
16. **16-String-Split:** Tokenizing and splitting text with delimiters into string arrays using `.split()`.
17. **17-Scanner-User-Input:** Taking interactive keyboard input from `System.in` using `java.util.Scanner`.
18. **18-Methods:** Modular programming, methods with parameters, return types, and the `static` keyword.
19. **19-Method-Exercise:** Practical algorithmic problem solving using methods (maximum finding, factorial calculation, array summation).
20. **20-Summary:** Review of all foundational lessons and guidance on next steps (OOP, Collections, Exceptions).

---

## Folder Structure
```
Java-Basic-Syntax/
│
├── 01-IDE-Project-Package-Class/
│   ├── Main.java
│   └── README.md
│
├── 02-Print-Options/
│   ├── PrintExample.java
│   └── README.md
│
├── 03-Data-Type-Variables/
│   ├── VariablesExample.java
│   └── README.md
│
├── 04-Basic-Data-Types/
│   ├── DataTypesExample.java
│   └── README.md
│
├── 05-If-Else/
│   ├── IfElseExample.java
│   └── README.md
│
├── 06-If-Else-If/
│   ├── IfElseIfExample.java
│   └── README.md
│
├── 07-Switch-Case/
│   ├── SwitchExample.java
│   └── README.md
│
├── 08-Operators/
│   ├── OperatorsExample.java
│   └── README.md
│
├── 09-For-Loop/
│   ├── ForLoopExample.java
│   └── README.md
│
├── 10-While-Loop/
│   ├── WhileLoopExample.java
│   └── README.md
│
├── 11-Do-While-Loop/
│   ├── DoWhileExample.java
│   └── README.md
│
├── 12-Nested-Loop/
│   ├── NestedLoopExample.java
│   └── README.md
│
├── 13-Array/
│   ├── ArrayExample.java
│   └── README.md
│
├── 14-2D-Array/
│   ├── TwoDArrayExample.java
│   └── README.md
│
├── 15-String/
│   ├── StringExample.java
│   └── README.md
│
├── 16-String-Split/
│   ├── StringSplitExample.java
│   └── README.md
│
├── 17-Scanner-User-Input/
│   ├── ScannerExample.java
│   └── README.md
│
├── 18-Methods/
│   ├── MethodExample.java
│   └── README.md
│
├── 19-Method-Exercise/
│   ├── MethodExercise.java
│   └── README.md
│
├── 20-Summary/
│   └── README.md
│
├── .gitignore
└── README.md
```

---

## How to Compile and Run a Java File

Make sure you have the Java Development Kit (JDK) installed (`javac -version`).

### General Command
Navigate to the root directory `Java-Basic-Syntax/` in your terminal:

```bash
# 1. Compile the Java file
javac <Folder-Name>/<FileName>.java

# 2. Run the compiled class (using classpath flag -cp)
java -cp <Folder-Name> <ClassName>
```

### Examples
To run the `01-IDE-Project-Package-Class` example:
```bash
javac 01-IDE-Project-Package-Class/Main.java
java -cp 01-IDE-Project-Package-Class Main
```

To run the interactive `17-Scanner-User-Input` example:
```bash
javac 17-Scanner-User-Input/ScannerExample.java
java -cp 17-Scanner-User-Input ScannerExample
```

---

## Basic Git and GitHub Workflow

To clone, update, or push your own changes to GitHub, use standard Git commands:

```bash
# 1. Initialize local repository and set default branch
git init
git branch -M main

# 2. Add remote GitHub repository
git remote add origin <YOUR_GITHUB_REPOSITORY_URL>

# 3. Stage and commit specific files
git add <file-path>
git commit -m "Your commit message"

# 4. Push changes to GitHub
git push -u origin main
```
