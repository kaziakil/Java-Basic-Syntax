public class StringExample {
    public static void main(String[] args) {
        // 1. Creating Strings
        String str1 = "Hello, Java";
        String str2 = "Programming";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length of a String: length() method (notice parentheses)
        System.out.println("Length of str1: " + str1.length());

        // 3. Accessing individual characters: charAt()
        System.out.println("Character at index 0: " + str1.charAt(0)); // 'H'
        System.out.println("Character at index 7: " + str1.charAt(7)); // 'J'

        // 4. Case conversion
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 5. String Concatenation
        String combined = str1 + " " + str2;
        System.out.println("Combined: " + combined);

        // 6. Substring check
        System.out.println("Contains 'Java'? " + str1.contains("Java"));

        // 7. Comparing Strings: equals() vs ==
        // ALWAYS use .equals() to compare string values in Java!
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("\n--- String Equality Comparison ---");
        System.out.println("s1 == s2 (same literal in pool): " + (s1 == s2));           // true
        System.out.println("s1 == s3 (different object references): " + (s1 == s3));   // false
        System.out.println("s1.equals(s3) (comparing contents): " + s1.equals(s3));     // true
        System.out.println("s1.equalsIgnoreCase(\"JAVA\"): " + s1.equalsIgnoreCase("JAVA")); // true
    }
}
