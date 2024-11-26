
import java.util.Scanner;
public class CheckingAccountrunner {
    public static void main(String[] args) {
        CheckingAccount18 account = new CheckingAccount18(100); // Initial balance $100
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 'd' for deposit, 'w' for withdraw, 'e' for end of month, 'q' to quit:");
            String action = scanner.nextLine();

            switch (action) {
                case "d":
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Balance after deposit: " + account.getBalance());
                    break;
                case "w":
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("Balance after withdrawal: " + account.getBalance());
                    break;
                case "e":
                    account.endOfMonth();
                    System.out.println("End of month. Transaction count reset.");
                    break;
                case "q":
                    System.out.println("Quitting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid action. Please try again.");
            }
            scanner.nextLine(); // Consume newline
        }
    }
}
