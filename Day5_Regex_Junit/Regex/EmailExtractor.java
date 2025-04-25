package Day5_Regex_Junit.Regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class EmailExtractor {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org. Also, reach sales@shop.com";
        List<String> emails = extractEmails(text);

        System.out.println("Extracted Email Addresses:");
        for (String email : emails) {
            System.out.println(email);
        }
    }

    // Method to extract all email addresses from the text
    public static List<String> extractEmails(String text) {
        // List to store extracted emails
        List<String> emails = new ArrayList<>();

        // Regex pattern for email addresses
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extracting all matches
        while (matcher.find()) {
            emails.add(matcher.group());
        }

        return emails;
    }
}
