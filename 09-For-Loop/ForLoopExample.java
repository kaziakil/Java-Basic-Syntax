public class ForLoopExample {
    public static void main(String[] args) {
        // 1. Counting up: 1 to 5
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Counting down: 5 to 1
        System.out.println("\nCounting down from 5 to 1:");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3. Calculating the sum of numbers from 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("\nSum of 1 to 10: " + sum);

        // 4. Stepping by 2: Printing even numbers between 2 and 10
        System.out.println("\nEven numbers from 2 to 10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
