package Day5_Regex_Junit.Regex;

import java.util.regex.*;

public class CreditCardValidator {
    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidCreditCard("4111111111111111"));  // Visa - valid
        System.out.println(isValidCreditCard("5111111111111111"));  // MasterCard - valid
        System.out.println(isValidCreditCard("6111111111111111"));  // Invalid (doesn't start with 4 or 5)
        System.out.println(isValidCreditCard("41111111111111"));    // Invalid (not 16 digits)
        System.out.println(isValidCreditCard("5111 1111 1111 1111"));  // MasterCard with spaces - valid
    }

    // Method to validate Credit Card number
    public static boolean isValidCreditCard(String cardNumber) {
        // Regex pattern for Visa and MasterCard (16 digits, starts with 4 or 5)
        String regex = "^(4\\d{15}|5\\d{15})$";

        // Check if the input matches the regex pattern
        return Pattern.matches(regex, cardNumber.replaceAll("\\s", ""));
    }
}
