import java.util.Arrays;
import java.util.Scanner;

public class SortStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of strings in the array
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to store the strings
        String[] stringArray = new String[n];

        // Input the strings
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            stringArray[i] = scanner.nextLine();
        }

        // Sort the array in alphabetical order
        Arrays.sort(stringArray);

        // Display the sorted array
        System.out.println("\nStrings in alphabetical order:");
        for (String str : stringArray) {
            System.out.println(str);
        }

        // Close the scanner
        scanner.close();
    }
}
