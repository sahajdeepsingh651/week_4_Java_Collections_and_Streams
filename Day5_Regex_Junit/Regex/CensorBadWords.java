package Day5_Regex_Junit.Regex;

import java.util.Arrays;
import java.util.List;

public class CensorBadWords {
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";

        // List of bad words to censor
        List<String> badWords = Arrays.asList("damn", "stupid");

        String output = censorBadWords(input, badWords);

        System.out.println("Input Sentence: " + input);
        System.out.println("Censored Sentence: " + output);
    }

    // Method to replace bad words with ****
    public static String censorBadWords(String text, List<String> badWords) {
        // Iterate over each bad word in the list and replace it with "****"
        for (String badWord : badWords) {
            text = text.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }
        return text;
    }
}
