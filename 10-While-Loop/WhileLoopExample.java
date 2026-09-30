public class WhileLoopExample {
    public static void main(String[] args) {
        // 1. Basic while loop: Counting from 1 to 5
        System.out.println("Counting 1 to 5 with while loop:");
        int count = 1;
        while (count <= 5) {
            System.out.print(count + " ");
            count++; // Crucial: must increment to avoid infinite loop
        }
        System.out.println();

        // 2. Countdown while loop
        System.out.println("\nCountdown from 5 to 1:");
        int timer = 5;
        while (timer > 0) {
            System.out.println("T-minus: " + timer);
            timer--;
        }
        System.out.println("Liftoff!");

        // 3. Repeated doubling until a threshold is reached
        System.out.println("\nDoubling numbers until reaching 100:");
        int value = 1;
        while (value < 100) {
            System.out.print(value + " ");
            value *= 2;
        }
        System.out.println("\nFinal value exceeding threshold: " + value);
    }
}
