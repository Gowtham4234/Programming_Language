package Java;
import java.util.*;

public class sortRemoveDuplicate{
    public static void main(String[] args) {

            // Using Scanner to get Input Array
            Scanner scan = new Scanner(System.in);
            //Length of the Array is User defined
            System.out.print("Enter the length of the array: ");
            int n = scan.nextInt();
            int[] arr = new int[n];
            
            //Enter the elements to the array
            System.out.print("Enter the elements: ");
            for(int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }
            
            //Printing the Original Array
            System.out.print("Given array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            //Remove Duplicate Elements in the Array
            System.err.println();
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        int shiftLeft = j;
                        for (int k = j+1; k < n; k++, shiftLeft++) {
                            arr[shiftLeft] = arr[k];
                        }
                        n--;
                        j--;
                    }
                }
            }

            //print the Elements without duplicate in array
            System.out.print("Array without Duplicate: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            // Sorting of the array in Ascending order
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }

            System.out.print("Array in ascending order : ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("------Program End------");
            
    }
}

/*
Output:

Enter the length of the array: 8
Enter the elements: 4
2
3
4
1
2
3
1
Given array: 4 2 3 4 1 2 3 1 
Array without Duplicate: 4 2 3 1 
Array in ascending order : 1 2 3 4 
------Program End------
 */