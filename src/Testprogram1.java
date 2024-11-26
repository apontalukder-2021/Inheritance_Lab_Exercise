public class Testprogram1 {
    public static void main(String[] args) {
        // Create a BasicAccount object
        BasicAccount account = new BasicAccount(100.0);

        System.out.println("Initial Balance: " + account.getBalance());

        // Test deposit
        account.deposit(50.0);
        System.out.println("Balance after deposit of $50: " + account.getBalance());

        // Test valid withdrawal
        account.withdraw(30.0);
        System.out.println("Balance after withdrawal of $30: " + account.getBalance());

        // Test invalid withdrawal (more than current balance)
        account.withdraw(150.0);
        System.out.println("Balance after attempted withdrawal of $150: " + account.getBalance());
    }
}
