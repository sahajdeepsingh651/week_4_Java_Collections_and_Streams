import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class FileProcessor {

    public void processFiles(List<String> filePaths){
        for(String path : filePaths) {
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {

        List<String> filePaths = new ArrayList<>();
        filePaths.add("C:\\Users\\hp\\Downloads\\input.txt");
        filePaths.add("C:\\Users\\hp\\Downloads\\sample.txt");
        filePaths.add("file.txt");

        FileProcessor fp = new FileProcessor();
        fp.processFiles(filePaths);
    }
}
