public class Runner1 {
    public static void main(String[] args) {
        BasicAccount account = new BasicAccount(100); // Initial balance is 100

        System.out.println("Initial balance: " + account.getBalance());

        account.withdraw(50);
        System.out.println("Balance after withdrawing 50: " + account.getBalance());

        account.withdraw(60);
        System.out.println("Balance after attempting to withdraw 60: " + account.getBalance());
    }
}