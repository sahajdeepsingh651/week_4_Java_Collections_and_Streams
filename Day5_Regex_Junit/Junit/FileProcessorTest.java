package Day5_Regex_Junit.Junit;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

public class FileProcessorTest {

    private FileProcessor fileProcessor = new FileProcessor();

    @Test
    void testWriteToFile() throws IOException {
        String filename = "testfile.txt";
        String content = "Hello, World!";
        fileProcessor.writeToFile(filename, content);

        File file = new File(filename);
        assertTrue(file.exists());

        String readContent = fileProcessor.readFromFile(filename);
        assertEquals(content, readContent);

        file.delete();
    }

    @Test
    void testIOExceptionForNonExistentFile() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistentfile.txt"));
    }
}
class FileProcessor {

    public void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }

    public String readFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.readLine();
        }
    }
}
