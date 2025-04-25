import org.w3c.dom.html.HTMLDivElement;

import java.util.InputMismatchException;
import java.util.Scanner;

class Divide extends Exception {

    public double divide(int num1, int num2) {
        if(num2 == 0) {
            throw new ArithmeticException();
        }
        return (double) num1 /num2;
    }
}

public class UncheckedException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Divide div = new Divide();
        try{
            System.out.print("Enter numerator: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int num2 = scanner.nextInt();

            double result = div.divide(num1, num2);
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Error:" + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Error: Please enter valid integers!");
        }
    }
}
