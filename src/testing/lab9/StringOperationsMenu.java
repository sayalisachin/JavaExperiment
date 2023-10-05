import java.util.Scanner;

public class StringOperationsMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("a. Check palindrome");
            System.out.println("b. Write in alphabetical order");
            System.out.println("c. Reverse the string");
            System.out.println("d. Concatenate with the reversed string");
            System.out.println("e. Exit");

            System.out.print("Enter your choice (a/b/c/d/e): ");
            char choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 'a':
                    checkPalindrome(inputString);
                    break;
                case 'b':
                    sortAlphabetically(inputString);
                    break;
                case 'c':
                    reverseString(inputString);
                    break;
                case 'd':
                    concatenateWithReversedString(inputString);
                    break;
                case 'e':
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void checkPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        boolean isPalindrome = str.equals(reversedStr);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    private static void sortAlphabetically(String str) {
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println("String in alphabetical order: " + sortedString);
    }

    private static void reverseString(String str) {
        String reversedString = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversedString);
    }

    private static void concatenateWithReversedString(String str) {
        String reversedString = new StringBuilder(str).reverse().toString();
        String concatenatedString = str + reversedString;
        System.out.println("Concatenated string: " + concatenatedString);
    }
}
