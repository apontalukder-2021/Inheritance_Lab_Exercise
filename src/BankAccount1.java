public class BankAccount1 {
    private double balance;

    public BankAccount1() {
        balance = 0;
    }

    public BankAccount1(double initialBalance) {
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

