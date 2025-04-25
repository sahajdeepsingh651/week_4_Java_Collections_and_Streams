import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Problem6 {

    public static void processData(String filename, int divisor) {

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("File processed successfully!");
        }
        catch (IOException e){
            System.out.println("File Not found!");
        }

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number to divide: ");
            int num = input.nextInt();

            System.out.println("Result: " + num/divisor);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        try {
            processData("C:\\Users\\hp\\Downloads\\input.txt", 0);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
