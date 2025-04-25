class InsufficientBalanceException extends Exception {

    private double amount;

    public InsufficientBalanceException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double amount){
        this.balance = amount;
    }

    public void deposit (int amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public void withdraw (int amount) throws InsufficientBalanceException {
        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balacnce!", amount-balance);
        }
        balance-=amount;
    }

    public double getBalance() {
        return balance;
    }
}
public class BankTransactionSystem {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try{
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
        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Shortfall: $" + e.getAmount());
        }
    }
}
