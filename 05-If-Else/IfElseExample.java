public class IfElseExample {
    public static void main(String[] args) {
        // Example 1: Checking voting eligibility based on age
        int age = 19;
        System.out.println("Age: " + age);

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }

        // Example 2: Checking whether a number is even or odd
        int number = 15;
        System.out.println("Number: " + number);

        if (number % 2 == 0) {
            System.out.println(number + " is an EVEN number.");
        } else {
            System.out.println(number + " is an ODD number.");
        }

        // Example 3: Checking pass or fail status
        int score = 75;
        int passMark = 40;
        System.out.println("Score: " + score);

        if (score >= passMark) {
            System.out.println("Result: Passed!");
        } else {
            System.out.println("Result: Failed!");
        }
    }
}
