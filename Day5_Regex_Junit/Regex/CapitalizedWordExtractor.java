package Day5_Regex_Junit.Regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class CapitalizedWordExtractor {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> capitalizedWords = extractCapitalizedWords(text);

        System.out.println("Extracted Capitalized Words:");
        for (String word : capitalizedWords) {
            System.out.println(word);
        }
    }

    // Method to extract all capitalized words from the text
    public static List<String> extractCapitalizedWords(String text) {
        // List to store extracted words
        List<String> words = new ArrayList<>();

        // Regex pattern for capitalized words
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extracting all matches
        while (matcher.find()) {
            words.add(matcher.group());
        }

        return words;
    }
}