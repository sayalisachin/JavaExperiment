package standard_code.stringmethods;

import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // charAt()
        char charAt = str.charAt(7);
        System.out.println("charAt: " + charAt);

        // length()
        int length = str.length();
        System.out.println("length: " + length);

        // format()
        String formattedString = String.format("Formatted String: %s", str);
        System.out.println("formattedString: " + formattedString);

        // format(Locale, format, args)
        String formattedStringWithLocale = String.format(Locale.US, "Formatted String: %s", str);
        System.out.println("formattedStringWithLocale: " + formattedStringWithLocale);

        // substring(beginIndex)
        String substring1 = str.substring(7);
        System.out.println("substring1: " + substring1);

        // substring(beginIndex, endIndex)
        String substring2 = str.substring(7, 12);
        System.out.println("substring2: " + substring2);

        // contains()
        boolean contains = str.contains("World");
        System.out.println("contains: " + contains);

        // join()
        String joinedString = String.join("-", "Hello", "World");
        System.out.println("joinedString: " + joinedString);

        // equals()
        boolean equals = str.equals("Hello, World!");
        System.out.println("equals: " + equals);

        // isEmpty()
        boolean isEmpty = str.isEmpty();
        System.out.println("isEmpty: " + isEmpty);

        // concat()
        String concatString = str.concat(" Welcome!");
        System.out.println("concatString: " + concatString);

        // replace()
        String replacedString = str.replace('o', 'x');
        System.out.println("replacedString: " + replacedString);

        // replace(CharSequence, CharSequence)
        String replacedString2 = str.replace("World", "Universe");
        System.out.println("replacedString2: " + replacedString2);

        // equalsIgnoreCase()
        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello, world!");
        System.out.println("equalsIgnoreCase: " + equalsIgnoreCase);

        // split()
        String[] splitString = str.split(", ");
        System.out.println("splitString: ");
        for (String s : splitString) {
            System.out.println(s);
        }

        // intern()
        String internedString = str.intern();
        System.out.println("internedString: " + internedString);

        // indexOf(char)
        int indexOfChar = str.indexOf('o');
        System.out.println("indexOfChar: " + indexOfChar);

        // indexOf(char, fromIndex)
        int indexOfCharFromIndex = str.indexOf('o', 5);
        System.out.println("indexOfCharFromIndex: " + indexOfCharFromIndex);

        // indexOf(String)
        int indexOfString = str.indexOf("World");
        System.out.println("indexOfString: " + indexOfString);

        // indexOf(String, fromIndex)
        int indexOfStringFromIndex = str.indexOf("World", 7);
        System.out.println("indexOfStringFromIndex: " + indexOfStringFromIndex);

        // toLowerCase()
        String lowercaseString = str.toLowerCase();
        System.out.println("lowercaseString: " + lowercaseString);

        // toLowerCase(Locale)
        String lowercaseStringWithLocale = str.toLowerCase(Locale.US);
        System.out.println("lowercaseStringWithLocale: " + lowercaseStringWithLocale);

        // toUpperCase()
        String uppercaseString = str.toUpperCase();
        System.out.println("uppercaseString: " + uppercaseString);

        // toUpperCase(Locale)
        String uppercaseStringWithLocale = str.toUpperCase(Locale.US);
        System.out.println("uppercaseStringWithLocale: " + uppercaseStringWithLocale);

        // trim()
        String trimmedString = "  Hello, World!   ".trim();
        System.out.println("trimmedString: " + trimmedString);

        // valueOf(int)
        String valueOfString = String.valueOf(12345);
        System.out.println("valueOfString: " + valueOfString);
    }
}
