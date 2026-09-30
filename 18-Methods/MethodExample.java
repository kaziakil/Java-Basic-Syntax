public class MethodExample {
    // 1. Method with no return value (void) and no parameters
    public static void greet() {
        System.out.println("Hello! Welcome to Java methods.");
    }

    // 2. Method with parameters and no return value (void)
    public static void printGreeting(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    // 3. Method that takes parameters and returns an int value
    public static int add(int a, int b) {
        return a + b;
    }

    // 4. Method that checks a condition and returns a boolean
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Calling method 1
        greet();

        // Calling method 2 with arguments
        printGreeting("Alice", 20);
        printGreeting("Bob", 25);

        // Calling method 3 and capturing the returned result
        int sumResult = add(15, 35);
        System.out.println("Sum of 15 + 35 = " + sumResult);

        // Calling method 4 in a condition
        int testNumber = 8;
        if (isEven(testNumber)) {
            System.out.println(testNumber + " is an even number.");
        } else {
            System.out.println(testNumber + " is an odd number.");
        }
    }
}
