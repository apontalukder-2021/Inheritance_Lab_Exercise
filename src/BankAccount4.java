
public class BankAccount4 {
    private double balance;

    public BankAccount4() {
        balance = 0;
    }

    public BankAccount4(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
