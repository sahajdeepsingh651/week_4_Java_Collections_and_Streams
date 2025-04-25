public class ExceptionPropagation {

    public static void method1(int n1, int n2) throws ArithmeticException {
        throw new ArithmeticException("Handled exception in main");
    }

    public static void method2(int n1, int n2) throws ArithmeticException {
        method1(n1, n2);
    }

    public static void main(String[] args) {
        try {
            method2(10, 0);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
