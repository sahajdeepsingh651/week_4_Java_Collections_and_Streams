import java.io.*;
import java.util.List;

public class Problem4 {

    public static void main(String[] args) {
        List<String> filePaths = List.of(
                "C:\\Users\\hp\\Downloads\\input.txt",
                "C:\\Users\\hp\\Downloads\\sample.txt");

        try(FileWriter writer = new FileWriter("Combined_File.txt")) {
            for(String path : filePaths) {
                try (BufferedReader reader = new BufferedReader(new FileReader(path))){
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line + "\n");
                    }
                }
                catch (IOException e) {
                    System.out.println("Error reading from file: " + path + " - " + e.getMessage());
                }
            }
            System.out.println("File combined Successfully!");
        }
        catch (IOException e) {
            System.out.println("Error writing to the Combined_File.txt: " + e.getMessage());
        }
    }
}
