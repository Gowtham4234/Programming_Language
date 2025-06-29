package Java;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Set a password: ");
        String password = scanner.nextLine();

        // Validate password
        if (isValidPassword(password)) {
            System.out.println("Password is valid. Welcome, " + name + "!");
        } else {
            System.out.println("Invalid password. It must be at least 8 characters and include a number.");
        }

        scanner.close();
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasNumber = password.matches(".*\\d.*");
        return hasNumber;
    }
}

/*
Enter your name: Gowtham
Set a password: 24242424
Password is valid. Welcome, Gowtham!
 */