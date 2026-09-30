public class MethodExercise {

    // Exercise 1: Find and return the maximum of two numbers
    public static int findMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    // Exercise 2: Calculate the factorial of a positive integer (e.g., 5! = 5 * 4 * 3 * 2 * 1)
    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Exercise 3: Calculate the total sum of an integer array
    public static int sumArray(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("=== Method Practice Exercises ===");

        // Testing Exercise 1: Finding Maximum
        int a = 45, b = 78;
        int max = findMax(a, b);
        System.out.println("Maximum between " + a + " and " + b + " is: " + max);

        // Testing Exercise 2: Factorial Calculation
        int number = 5;
        long fact = calculateFactorial(number);
        System.out.println("Factorial of " + number + " (" + number + "!) is: " + fact);

        // Testing Exercise 3: Sum of Array
        int[] scores = {10, 20, 30, 40, 50};
        int totalSum = sumArray(scores);
        System.out.println("Sum of array elements: " + totalSum);
    }
}
