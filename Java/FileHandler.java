package Java;

import java.io.*;
import java.util.Scanner;

public class FileHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = scanner.nextLine();

        // Writing to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            System.out.println("Enter text to write to file (type 'exit' to stop):");
            String line;
            while (!(line = scanner.nextLine()).equals("exit")) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from file
        System.out.println("\nContents of the file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}

/*
Enter filename: user.txt
Enter text to write to file (type 'exit' to stop):
Hi!! Hello World!!
exit

Contents of the file:
Hi!! Hello World!!
 */