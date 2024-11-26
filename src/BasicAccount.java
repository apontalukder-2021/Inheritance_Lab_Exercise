
public class BasicAccount extends BankAccount {

    // Constructor
    public BasicAccount(double initialBalance) {
        super(initialBalance);
    }

    // Override the withdraw method to prevent overdrawing
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied: insufficient funds.");
        }
    }
}
