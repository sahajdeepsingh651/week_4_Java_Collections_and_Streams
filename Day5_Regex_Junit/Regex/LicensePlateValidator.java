package Day5_Regex_Junit.Regex;

import java.util.regex.*;

public class LicensePlateValidator {
    public static void main(String[] args) {
        // Test examples
        System.out.println(isValidLicensePlate("AB1234")); // true
        System.out.println(isValidLicensePlate("A12345")); // false
        System.out.println(isValidLicensePlate("ABCD12")); // false
        System.out.println(isValidLicensePlate("XY0000")); // true
    }

    // Method to validate the license plate
    public static boolean isValidLicensePlate(String plate) {
        // Regex pattern for license plate
        String regex = "^[A-Z]{2}\\d{4}$";
        // Matching input with regex
        return Pattern.matches(regex, plate);
    }
}