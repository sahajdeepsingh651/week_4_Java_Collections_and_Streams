package Day5_Regex_Junit.Regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class DateExtractor {
    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> dates = extractDates(text);

        System.out.println("Extracted Dates:");
        for (String date : dates) {
            System.out.println(date);
        }
    }

    // Method to extract all dates in dd/mm/yyyy format
    public static List<String> extractDates(String text) {
        // List to store extracted dates
        List<String> dates = new ArrayList<>();

        // Regex pattern for dd/mm/yyyy format
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extracting all matches
        while (matcher.find()) {
            dates.add(matcher.group());
        }

        return dates;
    }
}