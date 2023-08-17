package java_prog_daily;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 2, 1, 5, 6, 7};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to search: ");
        int searchValue = scanner.nextInt();
        scanner.close();

        System.out.print("The value is found at locations: ");
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == searchValue) {
                System.out.print("a[" + i + "] ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Value not found in the array.");
        }
    }
}

