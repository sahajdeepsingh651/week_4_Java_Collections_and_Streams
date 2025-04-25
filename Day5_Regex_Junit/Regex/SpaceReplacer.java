package Day5_Regex_Junit.Regex;

public class SpaceReplacer {
    public static void main(String[] args) {
        String input = "This  is   an    example   with  multiple   spaces.";
        String output = replaceMultipleSpaces(input);

        System.out.println("Input String: " + input);
        System.out.println("Output String: " + output);
    }

    // Method to replace multiple spaces with a single space
    public static String replaceMultipleSpaces(String text) {
        // Regex pattern to match multiple spaces
        return text.replaceAll("\\s+", " ").trim();
    }
}
