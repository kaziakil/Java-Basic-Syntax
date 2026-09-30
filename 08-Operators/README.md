# Topic 08: Operators

## What is it?
Operators are special symbols in Java that perform operations on variables and values (operands). Java provides operators for math, comparisons, logic, and assignments.

## Important Concepts
- **Arithmetic Operators:** `+` (addition), `-` (subtraction), `*` (multiplication), `/` (division), `%` (modulus / remainder).
- **Relational Operators:** `==`, `!=`, `>`, `<`, `>=`, `<=`. They always evaluate to a `boolean` (`true` or `false`).
- **Logical Operators:**
  - `&&` (Logical AND): true only if both operands are true.
  - `||` (Logical OR): true if at least one operand is true.
  - `!` (Logical NOT): reverses the boolean value.
- **Assignment & Compound Operators:** `=`, `+=`, `-=`, `*=`, `/=`, `%=`.
- **Unary Increment/Decrement:**
  - Postfix (`x++`, `x--`): uses current value first, then increments/decrements.
  - Prefix (`++x`, `--x`): increments/decrements first, then evaluates.
- **Precedence & Associativity:**
  - Parentheses `()` have highest precedence.
  - Multiplication, division, modulus before addition/subtraction.
  - Arithmetic before comparison; comparison before logical operators.

## Syntax
```java
int sum = a + b;
boolean isValid = (age >= 18) && hasId;
x += 5; // equivalent to x = x + 5
int next = ++count;
```

## Example
The file `OperatorsExample.java` demonstrates:
- Basic arithmetic operations including modulus.
- Comparisons and truth checks.
- Short-circuit logical expressions (`&&`, `||`, `!`).
- Compound assignments (`+=`, `-=`, `*=`, `/=`).
- Prefix vs postfix increment behavior.
- Order of operations and parentheses grouping.

## Important Points
- Integer division truncates decimals: `15 / 4` results in `3`, not `3.75`. To get decimal division, at least one operand must be a `double` (e.g., `15.0 / 4`).
- Logical `&&` and `||` use short-circuit evaluation: if the left operand determines the outcome, the right operand is not evaluated.

## Common Mistakes
- Confusing `=` (assignment) with `==` (equality comparison).
- Forgetting that integer division drops the remainder instead of rounding.
- Confusion over prefix vs postfix increment timing in expressions.
