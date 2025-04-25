class TransactionException extends Exception {

    public TransactionException(String message) {
        super(message);
    }
}

class BankAccounts {

    private double balance;

    public BankAccounts(double amount) {
        this.balance = amount;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount) throws TransactionException {
        if(amount > balance) {
            throw new TransactionException("Transaction failed!");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
public class Problem5 {

    public static void main(String[] args) {
        BankAccounts account = new BankAccounts(1000);

        try {
            System.out.println("=======================================");
            System.out.println("Depositing $500");
            account.deposit(500);
            System.out.println("New Balance: $" + account.getBalance());
            System.out.println("=======================================");

            System.out.println("Withdrawing $750");
            account.withdraw(750);
            System.out.println("New Balance: $" + account.getBalance());
            System.out.println("=======================================");

            System.out.println("Withdrawing $1000");
            account.withdraw(1000);
            System.out.println("New Balance: $" + account.getBalance());
            System.out.println("=======================================");
        }
        catch (TransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
