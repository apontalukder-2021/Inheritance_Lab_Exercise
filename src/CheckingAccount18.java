
public class CheckingAccount18 extends BankAccount18 {
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 1.0;
    private int transactionCount;
    public CheckingAccount18(double initialBalance) {
        super(initialBalance);
        transactionCount = 0;
    }
    @Override
    public void deposit(double amount) {
        transactionCount++;
        super.deposit(amount);
        chargeFee();
    }
    @Override
    public void withdraw(double amount) {
        transactionCount++;
        super.withdraw(amount);
        chargeFee();
    }
    private void chargeFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            super.withdraw(TRANSACTION_FEE);
        }
    }
    public void endOfMonth() {
        transactionCount = 0;
    }
}
