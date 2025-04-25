package Day5_Regex_Junit.Regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class CurrencyExtractor {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> currencyValues = extractCurrencyValues(text);

        System.out.println("Extracted Currency Values:");
        for (String value : currencyValues) {
            System.out.println(value);
        }
    }

    // Method to extract currency values from the text
    public static List<String> extractCurrencyValues(String text) {
        List<String> currencyValues = new ArrayList<>();

        // Regex pattern to match currency values (with or without a dollar sign)
        String regex = "(\\$?\\d+\\.\\d{2}|\\d+\\.\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extracting all matches
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        return currencyValues;
    }
}
