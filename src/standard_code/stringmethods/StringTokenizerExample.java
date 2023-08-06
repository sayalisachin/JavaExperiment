package standard_code.stringmethods;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String sentence = "Hello, World! Welcome to Java Programming";
        StringTokenizer tokenizer = new StringTokenizer(sentence, ", ");

        // hasMoreTokens()
        while (tokenizer.hasMoreTokens()) {
            // nextToken()
            String token = tokenizer.nextToken();
            System.out.println("Token: " + token);
        }

        // countTokens()
        int tokenCount = tokenizer.countTokens();
        System.out.println("Total Tokens: " + tokenCount);

        // Reset the tokenizer
        tokenizer = new StringTokenizer(sentence);

        // hasMoreElements()
        while (tokenizer.hasMoreElements()) {
            // nextElement()
            Object element = tokenizer.nextElement();
            System.out.println("Element: " + element);
        }
    }
}
