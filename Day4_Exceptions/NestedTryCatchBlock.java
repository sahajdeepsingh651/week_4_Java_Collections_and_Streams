import java.util.Scanner;

public class NestedTryCatchBlock {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Enter the array size: ");
            int size = input.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter the elements in the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }

            System.out.print("Enter the index to access: ");
            int index = input.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = input.nextInt();

            try {
                System.out.println("Value at index " + index + ": " + arr[index]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid array Index!" );
            }

            try {
                System.out.println("Result: " + arr[index]/divisor);
            }

            catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero!");
            }

        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
