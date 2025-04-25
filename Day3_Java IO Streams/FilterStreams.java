import java.io.*;

public class FilterStreams {

    public static void main(String[] args) {

        String inputFile = "C:\\Users\\hp\\Downloads\\input.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter("FilterStreams.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                bw.write(line.toLowerCase());
                bw.newLine();
            }
            System.out.println("File copied successfully!");
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
