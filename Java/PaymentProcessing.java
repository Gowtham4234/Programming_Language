package Java;

import java.util.Scanner;

class Card {
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " using default card.");
    }
}

class DebitCard extends Card {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " using Debit Card.");
    }
}
class CreditCard extends Card {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " using Credit Card.");
    }
}

public class PaymentProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to process: ");
        double amount = scanner.nextDouble();

        System.out.print("Choose card type (1: Debit, 2: Credit): ");
        int choice = scanner.nextInt();
        
        Card card;
        if (choice == 1) {
            card = new DebitCard();
        } else {
            card = new CreditCard();
        }

        card.processPayment(amount);
        scanner.close();
    }
}
/*
Enter the amount to process: 150
Choose card type (1: Debit, 2: Credit): 1
Processing payment of $150.0 using Debit Card.

Enter the amount to process: 20
Choose card type (1: Debit, 2: Credit): 2
Processing payment of $20.0 using Credit Card.
 */