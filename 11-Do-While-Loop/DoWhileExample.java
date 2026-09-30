public class DoWhileExample {
    public static void main(String[] args) {
        // 1. Standard do-while loop: Counting from 1 to 5
        System.out.println("Counting 1 to 5 with do-while loop:");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println();

        // 2. Proving that do-while executes at least once even if condition is initially false
        System.out.println("\nExecuting with initially false condition:");
        int number = 100;
        do {
            System.out.println("This prints even though number (" + number + ") > 50!");
            number++;
        } while (number < 50);

        System.out.println("Loop terminated immediately after one iteration.");
    }
}
