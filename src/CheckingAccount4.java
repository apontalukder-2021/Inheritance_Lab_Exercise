
public class CheckingAccount4 extends BankAccount4 {
    private int overdraftCount;
    private int currentMonth;

    public CheckingAccount4() {
        super();
        overdraftCount = 0;
        currentMonth = getCurrentMonth();
    }

    public CheckingAccount4(double initialBalance) {
        super(initialBalance);
        overdraftCount = 0;
        currentMonth = getCurrentMonth();
    }

    @Override
    public void withdraw(double amount) {
        // Check if we are in a new month and reset overdraft count if necessary
        int month = getCurrentMonth();
        if (month != currentMonth) {
            currentMonth = month;
            overdraftCount = 0;
        }

        // Perform the withdrawal
        if (amount > 0) {
            if (amount > getBalance()) {
                overdraftCount++;
                if (overdraftCount == 1) {
                    super.withdraw(amount + 20); // First overdraft penalty
                } else {
                    super.withdraw(amount + 30); // Subsequent overdraft penalty
                }
            } else {
                super.withdraw(amount);
            }
        }
    }

    private int getCurrentMonth() {
        // This method returns the current month as an integer (1 = January, 2 = February, etc.)
        // For simplicity, we will use the java.time library to get the current month
        return java.time.LocalDate.now().getMonthValue();
    }
}
