import java.util.Scanner;

public class ReplaceWordWithRepeatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Input the word to replace
        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();

        // Input the repeating characters
        System.out.print("Enter the repeating characters: ");
        String repeatingCharacters = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Replace the word with repeating characters
        String replacedText = inputText.replaceAll(wordToReplace, repeatingCharacters);

        // Display the result
        System.out.println("Original Text:");
        System.out.println(inputText);

        System.out.println("\nText with Replaced Word:");
        System.out.println(replacedText);
    }
}

