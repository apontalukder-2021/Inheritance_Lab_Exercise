
public class BankAccount18 {
    private double balance;
    public BankAccount18(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public double getBalance() {
        return balance;
    }
}
