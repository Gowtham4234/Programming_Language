package Java;

import java.util.Scanner;

class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accNumber = scanner.nextLine();
        Account account = new Account(accNumber, 1000.00); // Initial balance

        // Capture user's choice for transaction
        while (true) {
            System.out.print("\nChoose action (1: Deposit, 2: Withdraw, 3: Exit): ");
            int choice = scanner.nextInt();

            if (choice == 1) { // Deposit
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
            } else if (choice == 2) { // Withdraw
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();
                account.withdraw(withdrawalAmount);
            } else if (choice == 3) { // Exit
                System.out.println("Exiting the banking application.");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
            account.displayBalance();
        }
        scanner.close();
    }
}
/*
 Enter Account Number: CA1001

Choose action (1: Deposit, 2: Withdraw, 3: Exit): 1
Enter deposit amount: 5000
Deposited: 5000.0
Account Number: CA1001
Current Balance: 6000.0

Choose action (1: Deposit, 2: Withdraw, 3: Exit): 2
Enter withdrawal amount: 2500
Withdrawn: 2500.0
Account Number: CA1001
Current Balance: 3500.0

Choose action (1: Deposit, 2: Withdraw, 3: Exit): 3
Exiting the banking application.
 */