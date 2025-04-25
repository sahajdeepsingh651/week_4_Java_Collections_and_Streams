package Day5_Regex_Junit.Regex;

import java.util.regex.*;
import java.util.HashSet;
import java.util.Set;

public class RepeatingWordsFinder {
    public static void main(String[] args) {
        String input = "This is is a repeated repeated word test.";
        Set<String> repeatingWords = findRepeatingWords(input);

        System.out.println("Repeating Words: ");
        for (String word : repeatingWords) {
            System.out.println(word);
        }
    }

    // Method to find repeating words in a sentence
    public static Set<String> findRepeatingWords(String text) {
        Set<String> repeatingWords = new HashSet<>();

        // Regex pattern to match any word
        String regex = "\\b(\\w+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Set to store words and check for repetition
        Set<String> words = new HashSet<>();

        // Check for repeating words
        while (matcher.find()) {
            String word = matcher.group();
            if (words.contains(word)) {
                repeatingWords.add(word);
            } else {
                words.add(word);
            }
        }

        return repeatingWords;
    }
}
