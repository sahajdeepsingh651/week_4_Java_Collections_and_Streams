public class ThrowVsThrows {

    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if(amount < 0 || rate < 0){
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive!");
        }
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        try {
            long interest = (long) calculateInterest(15000, 7.5, 8);
            System.out.println("Interest: " + interest);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
