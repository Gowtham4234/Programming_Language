package Java;

import java.util.Scanner;

class TicketBooking {
    private int availableTickets = 5;

    public void bookTicket(int tickets) throws Exception {
        if (tickets > availableTickets) {
            throw new Exception("Not enough tickets available!");
        }
        availableTickets -= tickets;
        System.out.println("Successfully booked " + tickets + " tickets.");
    }
}

class ATM {
    private double balance = 1000.0;

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance in ATM.");
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: $" + amount);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketBooking booking = new TicketBooking();
        ATM atm = new ATM();

        // Ticket Booking
        try {
            System.out.print("Enter number of tickets to book: ");
            int tickets = scanner.nextInt();
            booking.bookTicket(tickets);
        } catch (Exception e) {
            System.out.println("Booking Error: " + e.getMessage());
        }

        // ATM Withdrawal
        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            atm.withdraw(amount);
        } catch (Exception e) {
            System.out.println("ATM Error: " + e.getMessage());
        }

        scanner.close();
    }
}

/*
Enter number of tickets to book: 3
Successfully booked 3 tickets.
Enter amount to withdraw: 300 
Successfully withdrawn: $300.0
 */