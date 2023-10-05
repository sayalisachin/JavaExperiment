import java.util.ArrayList;
import java.util.Scanner;

public class GenerateThreeLetterWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a five-letter word
        System.out.print("Enter a five-letter word: ");
        String word = scanner.nextLine();

        // Validate input
        if (word.length() != 5) {
            System.out.println("Please enter a valid five-letter word.");
        } else {
            ArrayList<String> threeLetterWords = generateThreeLetterWords(word);

            // Display the generated three-letter words
            System.out.println("\nThree-Letter Words:");
            for (String w : threeLetterWords) {
                System.out.println(w);
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Recursive method to generate three-letter words
    private static ArrayList<String> generateThreeLetterWords(String word) {
        ArrayList<String> result = new ArrayList<>();
        generateThreeLetterWordsHelper("", word, result);
        return result;
    }

    private static void generateThreeLetterWordsHelper(String prefix, String remaining, ArrayList<String> result) {
        if (prefix.length() == 3) {
            result.add(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char currentChar = remaining.charAt(i);
            String newPrefix = prefix + currentChar;
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            generateThreeLetterWordsHelper(newPrefix, newRemaining, result);
        }
    }
}
