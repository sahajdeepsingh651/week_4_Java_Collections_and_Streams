package Day5_Regex_Junit.Regex;

import java.util.regex.*;

public class IPAddressValidator {
    public static void main(String[] args) {
        // Test examples
        System.out.println(isValidIPv4("192.168.0.1"));  // true
        System.out.println(isValidIPv4("255.255.255.255"));  // true
        System.out.println(isValidIPv4("256.256.256.256"));  // false (invalid)
        System.out.println(isValidIPv4("192.168.1.500"));  // false (out of range)
        System.out.println(isValidIPv4("192.168.01.1"));  // false (leading zero)
        System.out.println(isValidIPv4("192.168.1."));  // false (incomplete)
    }

    // Method to validate IPv4 address
    public static boolean isValidIPv4(String ip) {
        // Regex pattern for validating IPv4 address
        String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        // Check if the input matches the regex pattern
        return Pattern.matches(regex, ip);
    }
}
