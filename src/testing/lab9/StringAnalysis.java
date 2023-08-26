package testing.lab9;
import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int charCount = input.length();
        int lineCount = input.split("\n").length;
        int wordCount = input.split("\\s+").length;
        int vowelCount = countVowels(input);

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}

