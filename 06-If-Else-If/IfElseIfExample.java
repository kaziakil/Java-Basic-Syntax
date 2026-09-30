public class IfElseIfExample {
    public static void main(String[] args) {
        // Example 1: Determining letter grade based on marks
        int marks = 82;
        System.out.println("Marks: " + marks);

        if (marks >= 80) {
            System.out.println("Grade: A+ (Outstanding)");
        } else if (marks >= 70) {
            System.out.println("Grade: A (Very Good)");
        } else if (marks >= 60) {
            System.out.println("Grade: B (Good)");
        } else if (marks >= 50) {
            System.out.println("Grade: C (Satisfactory)");
        } else if (marks >= 40) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        // Example 2: Classifying a number (positive, negative, or zero)
        int number = -12;
        System.out.println("Number: " + number);

        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}
