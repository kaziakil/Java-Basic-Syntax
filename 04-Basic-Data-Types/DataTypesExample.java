public class DataTypesExample {
    public static void main(String[] args) {
        // --- 1. Integer Types ---
        // byte: 1 byte (8 bits), range: -128 to 127
        byte smallNumber = 100;

        // short: 2 bytes (16 bits), range: -32,768 to 32,767
        short mediumNumber = 25000;

        // int: 4 bytes (32 bits), standard choice for whole numbers
        int regularNumber = 1500000;

        // long: 8 bytes (64 bits), requires 'L' or 'l' suffix for large numbers
        long bigNumber = 9876543210L;

        // --- 2. Floating-Point Types ---
        // float: 4 bytes (32 bits), requires 'f' or 'F' suffix
        float price = 19.99f;

        // double: 8 bytes (64 bits), default type for decimal numbers
        double pi = 3.141592653589793;

        // --- 3. Character Type ---
        // char: 2 bytes (16 bits), holds a single Unicode character in single quotes
        char letter = 'J';

        // --- 4. Boolean Type ---
        // boolean: holds either true or false
        boolean isJavaAwesome = true;

        // Printing all data types
        System.out.println("byte value: " + smallNumber);
        System.out.println("short value: " + mediumNumber);
        System.out.println("int value: " + regularNumber);
        System.out.println("long value: " + bigNumber);
        System.out.println("float value: " + price);
        System.out.println("double value: " + pi);
        System.out.println("char value: " + letter);
        System.out.println("boolean value: " + isJavaAwesome);
    }
}
