import java.util.Scanner;

public class StringOps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("a. Compare two strings");
            System.out.println("b. Convert case (upper to lower and vice versa)");
            System.out.println("c. Check if one string is a substring of the other");
            System.out.println("d. Replace substring with 'Hello'");
            System.out.println("e. Exit");

            System.out.print("Enter your choice (a/b/c/d/e): ");
            char choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 'a':
                    compareStrings(str1, str2);
                    break;
                case 'b':
                    convertCase(str1, str2);
                    break;
                case 'c':
                    checkSubstring(str1, str2);
                    break;
                case 'd':
                    replaceSubstring(str1, str2);
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

    private static void compareStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
    }

    private static void convertCase(String str1, String str2) {
        System.out.println("String 1 in lowercase: " + str1.toLowerCase());
        System.out.println("String 2 in lowercase: " + str2.toLowerCase());
        System.out.println("String 1 in uppercase: " + str1.toUpperCase());
        System.out.println("String 2 in uppercase: " + str2.toUpperCase());
    }

    private static void checkSubstring(String str1, String str2) {
        if (str1.contains(str2)) {
            System.out.println("String 2 is a substring of String 1.");
        } else if (str2.contains(str1)) {
            System.out.println("String 1 is a substring of String 2.");
        } else {
            System.out.println("Neither string is a substring of the other.");
        }
    }

    private static void replaceSubstring(String str1, String str2) {
        if (str1.contains(str2)) {
            String replacedString = str1.replace(str2, "Hello");
            System.out.println("Result after replacing substring: " + replacedString);
        } else if (str2.contains(str1)) {
            String replacedString = str2.replace(str1, "Hello");
            System.out.println("Result after replacing substring: " + replacedString);
        } else {
            System.out.println("Neither string is a substring of the other.");
        }
    }
}

