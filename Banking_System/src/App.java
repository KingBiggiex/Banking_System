import java.util.*;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Customer customer = createCustomer();
        int choice;
        
        do {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    depositMoney(customer);
                    break;
                case 2:
                    withdrawMoney(customer);
                    break;
                case 3:
                    checkBalance(customer);
                    break;
                case 4:
                    System.out.println("Thank you for using the banking system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    // Create a customer
    private static Customer createCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.next();
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        return new Customer(name, accountNumber);
    }

    // Deposit money
    private static void depositMoney(Customer customer) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        customer.getBankAccount().deposit(amount);
    }

    // Withdraw money
    private static void withdrawMoney(Customer customer) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        customer.getBankAccount().withdraw(amount);
    }

    // Check balance
    private static void checkBalance(Customer customer) {
        double balance = customer.getBankAccount().getBalance();
        System.out.println("Current balance: " + balance);
    }
}
