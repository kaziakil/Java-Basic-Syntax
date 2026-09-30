public class StringSplitExample {
    public static void main(String[] args) {
        // 1. Splitting a sentence into words using space (" ") as delimiter
        String sentence = "Learning Java syntax is simple and fun";
        String[] words = sentence.split(" ");

        System.out.println("Original sentence: \"" + sentence + "\"");
        System.out.println("Total words: " + words.length);

        System.out.println("\nWords in sentence:");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word " + (i + 1) + ": " + words[i]);
        }

        // 2. Splitting comma-separated values (CSV)
        String fruitsCsv = "Apple,Banana,Orange,Mango,Grapes";
        String[] fruits = fruitsCsv.split(",");

        System.out.println("\nComma-separated list: " + fruitsCsv);
        System.out.println("Extracted fruits:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("- " + fruits[i]);
        }

        // 3. Splitting a date string by hyphen ("-")
        String dateString = "2026-09-30";
        String[] dateParts = dateString.split("-");

        System.out.println("\nDate string: " + dateString);
        System.out.println("Year:  " + dateParts[0]);
        System.out.println("Month: " + dateParts[1]);
        System.out.println("Day:   " + dateParts[2]);
    }
}
