public class VariablesExample {
    public static void main(String[] args) {
        // 1. Variable Declaration: specifying data type and variable name
        int age;

        // 2. Variable Initialization: assigning a value to the declared variable
        age = 21;
        System.out.println("Initial Age: " + age);

        // 3. Reassigning / Updating variable value
        age = 22;
        System.out.println("Updated Age: " + age);

        // 4. Combined Declaration and Initialization
        int studentId = 101;
        double gpa = 3.85;
        char grade = 'A';
        boolean isEnrolled = true;

        // Displaying variables
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("Enrolled: " + isEnrolled);

        // 5. Declaring multiple variables of the same type in one statement
        int x = 10, y = 20, z = 30;
        int total = x + y + z;
        System.out.println("Total of x, y, z: " + total);
    }
}
