import java.io.*;
import java.util.SortedMap;

public class ReadUserInput {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("UserInput.txt")){

            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favourite Programming Language: ");
            String language = br.readLine();

            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Language: " + language + "\n");
            fw.close();
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }
}
