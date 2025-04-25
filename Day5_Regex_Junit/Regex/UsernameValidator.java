
package Day5_Regex_Junit.Regex;

import java.util.regex.*;
public class UsernameValidator {
    public static void main(String[] args) {
        // Test examples
        System.out.println(isValidUsername("user_123")); // true
        System.out.println(isValidUsername("123user"));  // false
        System.out.println(isValidUsername("us"));       // false
    }

    // Method to validate the username
    public static boolean isValidUsername(String username) {
        // Regex pattern
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        // Compiling regex
        Pattern pattern = Pattern.compile(regex);
        // Matching input with regex
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
}

