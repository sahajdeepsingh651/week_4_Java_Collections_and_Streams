package Day5_Regex_Junit.Regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class CapitalizedWordsExtractor {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> capitalizedWords = extractCapitalizedWords(text);

        // Print the extracted capitalized words
        System.out.println("Extracted Capitalized Words:");
        for (String word : capitalizedWords) {
            System.out.print(word + ", ");
        }
    }

    // Method to extract capitalized words from the text
    public static List<String> extractCapitalizedWords(String text) {
        List<String> capitalizedWords = new ArrayList<>();

        // Regex pattern to match capitalized words (words starting with an uppercase letter)
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extracting all matches
        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }

        return capitalizedWords;
    }
}
