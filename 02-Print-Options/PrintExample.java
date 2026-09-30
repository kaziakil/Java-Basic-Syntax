public class PrintExample {
    public static void main(String[] args) {
        // 1. System.out.print() does NOT insert a newline at the end
        System.out.print("Hello ");
        System.out.print("World!");
        System.out.println(); // Prints an empty line to move to the next line

        // 2. System.out.println() inserts a newline automatically after printing
        System.out.println("First line");
        System.out.println("Second line");

        // 3. Escape sequences inside strings
        // \n creates a new line
        System.out.println("Line 1\nLine 2");

        // \t inserts a tab space
        System.out.println("Item\tPrice\tQty");
        System.out.println("Apple\t$1.50\t4");

        // \" allows printing literal double quotes
        System.out.println("He said, \"Learning Java is fun!\"");

        // 4. Printing numbers and text together (concatenation)
        System.out.println("My age is: " + 20);
        System.out.println("5 + 5 = " + (5 + 5));
    }
}
