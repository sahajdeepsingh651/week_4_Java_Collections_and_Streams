import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the number 1: ");
            int num1 = input.nextInt();

            System.out.print("Enter the number 2: ");
            int num2 = input.nextInt();

            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero!");
            } else {
                double result = (double) num1 / num2;
                System.out.println("Result: " + result);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operation Completed!");
            input.close();
        }
    }
}
