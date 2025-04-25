package Day5_Regex_Junit.Regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class LinkExtractor {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> links = extractLinks(text);

        System.out.println("Extracted Links:");
        for (String link : links) {
            System.out.println(link);
        }
    }

    // Method to extract all links from the text
    public static List<String> extractLinks(String text) {
        // List to store extracted links
        List<String> links = new ArrayList<>();

        // Regex pattern for URLs
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+(?:\\.[a-zA-Z]{2,})+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extracting all matches
        while (matcher.find()) {
            links.add(matcher.group());
        }

        return links;
    }
}
