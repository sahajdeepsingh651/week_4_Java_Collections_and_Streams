package Day5_Regex_Junit.Regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class LanguageExtractor {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> languages = extractLanguages(text);

        System.out.println("Extracted Programming Languages:");
        for (String language : languages) {
            System.out.println(language);
        }
    }

    // Method to extract programming language names
    public static List<String> extractLanguages(String text) {
        List<String> languages = new ArrayList<>();

        // Regex pattern for common programming languages (Java, Python, JavaScript, Go, etc.)
        String regex = "\\b(Java|Python|JavaScript|Go|C\\+\\+|C#|Ruby|PHP|Swift|Kotlin|Rust|TypeScript)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extracting all matches
        while (matcher.find()) {
            languages.add(matcher.group());
        }

        return languages;
    }
}
