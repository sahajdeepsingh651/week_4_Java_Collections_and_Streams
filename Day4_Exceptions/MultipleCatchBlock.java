import java.util.Scanner;

public class MultipleCatchBlock {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = null;

        try{
            System.out.print("Do you want to initialize the array? (yes/no): ");
            String choice = input.next();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter the array size: ");
                int size = input.nextInt();
                arr = new int[size];

                System.out.println("Enter the elements in the array:");
                for (int i = 0; i < size; i++) {
                    arr[i] = input.nextInt();
                }
            }

            System.out.print("Enter the index to access: ");
            int index = input.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Invalid Index!");
        }
        catch (NullPointerException e) {
            System.out.println("Error: Array is not Initialized!");
        }
    }
}
