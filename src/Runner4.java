
public class Runner4 {
    public static void main(String[] args) {
        CheckingAccount4 account = new CheckingAccount4(100); // Initial balance is 100

        System.out.println("Initial balance: " + account.getBalance());

        // Withdraw more than the balance to trigger overdrafts
        account.withdraw(150);
        System.out.println("Balance after first overdraft: " + account.getBalance());

        account.withdraw(150);
        System.out.println("Balance after second overdraft: " + account.getBalance());

        // Simulate a new month by manually changing the month value (for testing purposes)
        account.withdraw(150);
        System.out.println("Balance after third overdraft: " + account.getBalance());
    }
}
