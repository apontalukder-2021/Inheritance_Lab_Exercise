
public class BasicAccount1 extends BankAccount1 {

    public BasicAccount1() {
        super();
    }

    public BasicAccount1(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds current balance.");
        }
    }
}
