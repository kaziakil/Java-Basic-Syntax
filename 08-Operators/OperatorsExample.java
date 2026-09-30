public class OperatorsExample {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 15;
        int b = 4;
        System.out.println("--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b)); // Addition: 19
        System.out.println("a - b = " + (a - b)); // Subtraction: 11
        System.out.println("a * b = " + (a * b)); // Multiplication: 60
        System.out.println("a / b = " + (a / b)); // Integer Division: 3
        System.out.println("a % b = " + (a % b)); // Modulus (Remainder): 3

        // 2. Relational (Comparison) Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b:  " + (a > b));  // true
        System.out.println("a < b:  " + (a < b));  // false
        System.out.println("a >= b: " + (a >= b)); // true
        System.out.println("a <= b: " + (a <= b)); // false

        // 3. Logical Operators
        boolean isAdult = true;
        boolean hasLicense = false;
        System.out.println("\n--- Logical Operators ---");
        System.out.println("isAdult && hasLicense (AND): " + (isAdult && hasLicense)); // false
        System.out.println("isAdult || hasLicense (OR):  " + (isAdult || hasLicense)); // true
        System.out.println("!hasLicense (NOT):           " + (!hasLicense));           // true

        // 4. Assignment & Compound Operators
        int count = 10;
        count += 5; // count = count + 5 (15)
        count -= 3; // count = count - 3 (12)
        count *= 2; // count = count * 2 (24)
        count /= 4; // count = count / 4 (6)
        System.out.println("\n--- Compound Assignment ---");
        System.out.println("Final count: " + count);

        // 5. Unary Operators (Prefix vs Postfix)
        int num = 5;
        System.out.println("\n--- Unary Operators ---");
        System.out.println("Original num: " + num);
        System.out.println("Postfix num++: " + (num++)); // Prints 5, then num becomes 6
        System.out.println("After postfix: " + num);
        System.out.println("Prefix ++num: " + (++num));   // Increments to 7, then prints 7

        // 6. Precedence & Associativity
        int result = 10 + 5 * 2; // Multiplication happens first: 10 + 10 = 20
        int groupedResult = (10 + 5) * 2; // Parentheses first: 15 * 2 = 30
        System.out.println("\n--- Precedence ---");
        System.out.println("10 + 5 * 2 = " + result);
        System.out.println("(10 + 5) * 2 = " + groupedResult);
    }
}
