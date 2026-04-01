class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance = 5000;

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        }
        balance -= amount;
        System.out.println("Withdraw successful. Balance: " + balance);
    }
}

public class CustomException {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        try {
            acc.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}