public class SwitchExample {
    public static void main(String[] args) {
        // Example 1: Day of the week based on number (1 to 7)
        int day = 3;
        System.out.println("Day number: " + day);

        switch (day) {
            case 1:
                System.out.println("Monday - Start of the work week.");
                break;
            case 2:
                System.out.println("Tuesday - Keep pushing.");
                break;
            case 3:
                System.out.println("Wednesday - Midweek checkpoint.");
                break;
            case 4:
                System.out.println("Thursday - Almost there.");
                break;
            case 5:
                System.out.println("Friday - Weekend is near!");
                break;
            case 6:
                System.out.println("Saturday - Weekend!");
                break;
            case 7:
                System.out.println("Sunday - Rest and recharge.");
                break;
            default:
                System.out.println("Invalid day number! Please choose 1-7.");
                break;
        }

        // Example 2: Switch with String (Menu Selection)
        String role = "admin";
        System.out.println("User role: " + role);

        switch (role) {
            case "admin":
                System.out.println("Access level: Full administrative privileges.");
                break;
            case "editor":
                System.out.println("Access level: Can edit and publish content.");
                break;
            case "viewer":
                System.out.println("Access level: Read-only access.");
                break;
            default:
                System.out.println("Access level: Unknown role.");
                break;
        }
    }
}
