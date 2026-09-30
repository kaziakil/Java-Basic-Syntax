public class TwoDArrayExample {
    public static void main(String[] args) {
        // 1. Declaration and initialization of a 2D array with a literal
        // Represents 3 rows and 3 columns (a 3x3 matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 2. Accessing dimensions
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        System.out.println("Matrix dimensions: " + rowCount + " rows x " + colCount + " columns");

        // 3. Accessing individual elements: matrix[rowIndex][colIndex]
        System.out.println("Element at row 0, col 2: " + matrix[0][2]); // 3
        System.out.println("Element at row 1, col 1: " + matrix[1][1]); // 5

        // 4. Modifying an element
        matrix[0][0] = 10;

        // 5. Printing the 2D array in matrix/table format using nested loops
        System.out.println("\nMatrix contents:");
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println(); // move to next line after each row
        }

        // 6. Calculating the total sum of all elements in the 2D array
        int sum = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                sum += matrix[r][c];
            }
        }
        System.out.println("\nTotal sum of all elements in matrix: " + sum);
    }
}
