import java.util.Scanner;

public class Problem2 {

    public static void performDivision(int numerator, int denominator) {
        try{
            System.out.println("Result: " + numerator / denominator);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by Zero!");
        }
    }

    public static void calculate(int numerator, int denominator) {
        try{
            performDivision(numerator, denominator);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by Zero!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter the numerator: ");
            int numerator = input.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = input.nextInt();

            calculate(numerator, denominator);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!" );
        }
    }
}
