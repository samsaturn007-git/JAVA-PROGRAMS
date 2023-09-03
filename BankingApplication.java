import java.util.Scanner;

class BankAccount {
    private String customerName;
    private int accountNumber;
    private double balance;
    private double interestRate;
    private String contactNumber;
    private String address;

    // Constructor
    public BankAccount(String name, int accNumber, double initialBalance, double rate, String contact, String addr) {
        customerName = name;
        accountNumber = accNumber;
        balance = initialBalance;
        interestRate = rate;
        contactNumber = contact;
        address = addr;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void computeInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }

    public void displayBalance() {
        System.out.println("Account Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Address: " + address);
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Banking Application!");

        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        int accNumber = scanner.nextInt();

        System.out.print("Enter Initial Balance: $");
        double initialBalance = scanner.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double rate = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Contact Number: ");
        String contact = scanner.nextLine();

        System.out.print("Enter Address: ");
        String addr = scanner.nextLine();

        BankAccount account = new BankAccount(name, accNumber, initialBalance, rate, contact, addr);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Compute Interest");
            System.out.println("5. Display Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Create Account
                    System.out.println("Account already created for " + name);
                    break;
                case 2:
                    // Deposit
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    // Withdraw
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    // Compute Interest
                    account.computeInterest();
                    break;
                case 5:
                    // Display Balance
                    account.displayBalance();
                    break;
                case 6:
                    // Exit
                    System.out.println("Thank you for using the Banking Application!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
