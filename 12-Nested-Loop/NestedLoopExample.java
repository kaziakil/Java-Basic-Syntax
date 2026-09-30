public class NestedLoopExample {
    public static void main(String[] args) {
        // 1. Grid pattern of stars (3 rows x 4 columns)
        System.out.println("3x4 Star Grid:");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Moves to next line after inner loop completes
        }

        // 2. Right-angled triangle pattern
        System.out.println("\nRight-Angled Triangle Pattern:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 3. Mini Multiplication Table (1 to 3)
        System.out.println("\nMini Multiplication Table:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
