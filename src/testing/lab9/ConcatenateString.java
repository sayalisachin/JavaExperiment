import java.util.Scanner;

public class ConcatenateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an empty string to store the result
        String result = "";

        // Accept five strings separately and concatenate them
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter string " + i + ": ");
            String inputString = scanner.nextLine();
            result = result.concat(inputString);
        }

        // Display the concatenated string
        System.out.println("Concatenated String: " + result);

        // Close the scanner
        scanner.close();
    }
}

