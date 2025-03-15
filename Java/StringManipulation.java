package Java;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("Enter your choice: String or StringBuilder:");
        String choice = scanner.nextLine();

        switch (choice) {
            case "String":
                System.out.println("---------------------------------------------");
                System.out.println("Performing String manipulations...");
                System.out.println("---------------------------------------------");
                String str = "Hello, World!";
                System.out.println("Original String: " + str);
                System.out.println("Length: " + str.length());
                System.out.println("Uppercase: " + str.toUpperCase());
                System.out.println("Lowercase: " + str.toLowerCase());
                System.out.println("Substring (0-5): " + str.substring(0, 5));
                System.out.println("Character at index 7: " + str.charAt(7));
                System.out.println("Index of 'World': " + str.indexOf("World"));
                System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
                System.out.println("Concatenation: " + str.concat(" Let's learn Java."));
                System.out.println("Trim: " + "   Java Programming   ".trim());
                System.out.println("Equals check: " + str.equals("Hello, World!"));
                System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase("hello, world!"));
                System.out.println("---------------------------------------------");
                break;

            case "StringBuilder":
                System.out.println("---------------------------------------------");
                System.out.println("Performing StringBuilder manipulations...");
                System.out.println("---------------------------------------------");
                StringBuilder sb = new StringBuilder("Hello");
                System.out.println("Original StringBuilder: " + sb);
                sb.append(" World");
                System.out.println("Append: " + sb);
                sb.insert(5, ",");
                System.out.println("Insert: " + sb);
                sb.replace(6, 11, "Java");
                System.out.println("Replace: " + sb);
                sb.delete(6, 10);
                System.out.println("Delete: " + sb);
                sb.reverse();
                System.out.println("Reverse: " + sb);
                sb.reverse(); // Reverting back
                System.out.println("Capacity: " + sb.capacity());
                sb.ensureCapacity(50);
                System.out.println("New Capacity: " + sb.capacity());
                sb.setLength(5);
                System.out.println("Set Length to 5: " + sb);
                System.out.println("---------------------------------------------");
                break;

            default:
                System.out.println("Invalid choice! Please enter either 'String' or 'StringBuilder'.");
                break;
        }

        scanner.close();
    }
}

/*
 *Output
---------------------------------------------
Enter your choice: String or StringBuilder:
String
---------------------------------------------
Performing String manipulations...
---------------------------------------------
Original String: Hello, World!
Length: 13
Uppercase: HELLO, WORLD!
Lowercase: hello, world!
Substring (0-5): Hello
Character at index 7: W
Index of 'World': 7
Replace 'World' with 'Java': Hello, Java!
Concatenation: Hello, World! Let's learn Java.
Trim: Java Programming
Equals check: true
Equals Ignore Case: true
---------------------------------------------
 */
/*
 Output
---------------------------------------------
Enter your choice: String or StringBuilder:
StringBuilder
---------------------------------------------
Performing StringBuilder manipulations...
---------------------------------------------
Original StringBuilder: Hello
Append: Hello World
Insert: Hello, World
Replace: Hello,Javad
Delete: Hello,d
Reverse: d,olleH
Capacity: 21
New Capacity: 50
Set Length to 5: Hello
---------------------------------------------
 */