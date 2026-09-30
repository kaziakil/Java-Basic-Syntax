public class ArrayExample {
    public static void main(String[] args) {
        // 1. Array declaration and allocation with default values
        int[] scores = new int[4]; // creates an array of 4 integers (initialized to 0)
        scores[0] = 85;
        scores[1] = 92;
        scores[2] = 78;
        scores[3] = 90;

        System.out.println("Array length: " + scores.length);
        System.out.println("First element: " + scores[0]);
        System.out.println("Last element: " + scores[scores.length - 1]);

        // 2. Direct initialization with array literal
        int[] numbers = {10, 20, 30, 40, 50};

        // 3. Modifying an element
        numbers[1] = 25; // changes 20 to 25

        // 4. Traversing an array using a standard for loop
        System.out.println("\nIterating through numbers array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " -> Value: " + numbers[i]);
        }

        // 5. Calculating sum and average of array elements
        int totalSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            totalSum += numbers[i];
        }
        double average = (double) totalSum / numbers.length;

        System.out.println("\nSum of elements: " + totalSum);
        System.out.println("Average of elements: " + average);
    }
}
