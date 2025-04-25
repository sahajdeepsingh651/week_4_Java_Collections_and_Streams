import java.io.*;
import java.nio.file.Files;

public class ByteArrayStream {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\hp\\Downloads\\Model.png";
        String outputPath = "Model_copy.png";

        try{
            byte[] imageBytes = Files.readAllBytes(new File(inputPath).toPath());

            ByteArrayOutputStream boas = new ByteArrayOutputStream();
            boas.write(imageBytes);

            ByteArrayInputStream bais = new ByteArrayInputStream(boas.toByteArray());

            FileOutputStream fos = new FileOutputStream(outputPath);

            int data;

            while ((data = bais.read(imageBytes)) != -1) {
                fos.write(data);
            }

            fos.close();
            boas.close();
            bais.close();

            System.out.println("Image copied successfully as byte array!");
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
