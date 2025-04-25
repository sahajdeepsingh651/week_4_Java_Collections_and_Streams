package Day5_Regex_Junit.Regex;

import java.util.regex.*;

public class HexColorValidator {
    public static void main(String[] args) {
        // Test examples
        System.out.println(isValidHexColor("#1A2B3C")); // true
        System.out.println(isValidHexColor("#ABCDEF")); // true
        System.out.println(isValidHexColor("#123456")); // true
        System.out.println(isValidHexColor("#123ABG")); // false (Invalid character 'G')
        System.out.println(isValidHexColor("123456"));  // false (Missing '#')
        System.out.println(isValidHexColor("#1A2B3"));  // false (Only 5 characters)
    }

    // Method to validate the hex color code
    public static boolean isValidHexColor(String color) {
        // Regex pattern for hex color
        String regex = "^#[0-9A-Fa-f]{6}$";
        // Matching input with regex
        return Pattern.matches(regex, color);
    }
}