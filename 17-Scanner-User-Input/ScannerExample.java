import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // 1. Create a Scanner object connected to standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== User Input Demonstration ===");

        // 2. Reading a String (entire line)
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        // 3. Reading an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // 4. Reading a decimal (double)
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // Displaying the gathered input
        System.out.println("\n--- User Information Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Age:  " + age);
        System.out.println("GPA:  " + gpa);

        // Simple condition based on user input
        if (age >= 18) {
            System.out.println("Status: Adult");
        } else {
            System.out.println("Status: Minor");
        }

        // 5. Close the scanner to release resources
        scanner.close();
    }
}
