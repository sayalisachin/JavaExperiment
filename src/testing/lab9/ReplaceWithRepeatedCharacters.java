package testing.lab9;

import java.util.Scanner;

public class ReplaceWithRepeatedCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.next();

        System.out.print("Enter the replacement characters: ");
        String replacementCharacters = scanner.next();

        String replacedSentence = replaceWithRepeatedCharacters(sentence, wordToReplace, replacementCharacters);
        System.out.println("Replaced sentence: " + replacedSentence);

        scanner.close();
    }

    public static String replaceWithRepeatedCharacters(String sentence, String word, String replacement) {
        StringBuilder replaced = new StringBuilder();
        String[] words = sentence.split("\\s+");

        for (String w : words) {
            if (w.equals(word)) {
                replaced.append(replacement);
            } else {
                replaced.append(w);
            }
            replaced.append(" ");
        }

        return replaced.toString().trim();
    }
}

