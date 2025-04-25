package Day5_Regex_Junit.Regex;

import java.util.regex.*;

public class SSNValidator {
    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidSSN("123-45-6789"));  // Valid SSN
        System.out.println(isValidSSN("123456789"));    // Invalid SSN (no dashes)
        System.out.println(isValidSSN("123-45-678"));   // Invalid SSN (incorrect length)
        System.out.println(isValidSSN("123-45-67a9"));  // Invalid SSN (contains non-digit character)
    }

    // Method to validate SSN (Social Security Number)
    public static boolean isValidSSN(String ssn) {
        // Regex pattern to validate SSN in the format XXX-XX-XXXX
        String regex = "^(?!000|666|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0000)\\d{4}$";

        // Check if the input matches the regex pattern
        return Pattern.matches(regex, ssn);
    }
}
