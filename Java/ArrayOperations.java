package Java;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 2: Declare the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Step 3: Get array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Step 4: Find largest and smallest numbers
        int largest = array[0];
        int smallest = array[0];
        for (int num : array) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }

        // Step 5: Sort the array in ascending order
        Arrays.sort(array);
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(array));

        // Step 6: Sort the array in descending order
        Integer[] descArray = Arrays.stream(array)
                                     .boxed()
                                     .sorted((a, b) -> b - a)
                                     .toArray(Integer[]::new);
        System.out.println("Sorted Array (Descending): " + Arrays.toString(descArray));

        // Step 7: Generate Fibonacci series
        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();
        System.out.print("Fibonacci Series: ");
        int a = 0, b = 1;
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();

        // Step 8: Check for prime numbers
        System.out.print("Check if a number is prime (enter number): ");
        int checkNum = scanner.nextInt();
        boolean isPrime = true;
        if (checkNum <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(checkNum); i++) {
                if (checkNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(checkNum + " is prime: " + isPrime);

        // Output largest and smallest
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        
        scanner.close();
    }
}

//Output
/*
Enter the number of elements: 5
Enter 5 integers:
55
99
33
77
55
Sorted Array (Ascending): [33, 55, 55, 77, 99]
Sorted Array (Descending): [99, 77, 55, 55, 33]
Enter the limit for Fibonacci series: 20
Fibonacci Series: 0 1 1 2 3 5 8 13
Check if a number is prime (enter number): 97
97 is prime: true
Largest: 99
Smallest: 33
 
 */