import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a multi-line text
        System.out.println("Enter a multi-line text (type 'end' on a separate line to finish):");
        StringBuilder text = new StringBuilder();
        String line;

        while (!(line = scanner.nextLine()).equalsIgnoreCase("end")) {
            text.append(line).append("\n");
        }

        // Close the scanner
        scanner.close();

        // Count characters, words, lines, and vowels
        String inputText = text.toString();

        int charCount = inputText.length();
        int wordCount = inputText.split("\\s+").length;
        int lineCount = inputText.split("\n").length;

        int vowelCount = 0;
        for (char c : inputText.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        // Display the results
        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
        System.out.println("Vowel count: " + vowelCount);
    }
}
