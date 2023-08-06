package standard_code.wrapper_class.CharacterClass;

public class CharacterExample {
    public static void main(String[] args) {
        char ch = 'A';

        // charCount()
        int charCount = Character.charCount(ch);
        System.out.println("charCount: " + charCount);

        // charValue()
        char charValue = Character.valueOf(ch);
        System.out.println("charValue: " + charValue);

        // codePointAt()
        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        int codePointAt = Character.codePointAt(charArray, 1);
        System.out.println("codePointAt: " + codePointAt);

        // codePointBefore()
        int codePointBefore = Character.codePointBefore(charArray, 4);
        System.out.println("codePointBefore: " + codePointBefore);

        // codePointCount()
        int codePointCount = Character.codePointCount(charArray, 0, 5);
        System.out.println("codePointCount: " + codePointCount);

        // compare()
        int compareResult = Character.compare('A', 'B');
        System.out.println("compareResult: " + compareResult);

        // compareTo()
        int compareToResult = Character.valueOf('A').compareTo(Character.valueOf('B'));
        System.out.println("compareToResult: " + compareToResult);

        // digit()
        int digit = Character.digit('5', 10);
        System.out.println("digit: " + digit);

        // equals()
        boolean equalsResult = Character.valueOf('A').equals(Character.valueOf('B'));
        System.out.println("equalsResult: " + equalsResult);

        // getNumericValue()
        int numericValue = Character.getNumericValue('9');
        System.out.println("numericValue: " + numericValue);

        // getType()
        //byte type = Character.getType('A');
        //System.out.println("type: " + type);

        // hashcode()
        int hashCodeResult = Character.hashCode(ch);
        System.out.println("hashCodeResult: " + hashCodeResult);

        // isAlphabetic()
        boolean isAlphabetic = Character.isAlphabetic('A');
        System.out.println("isAlphabetic: " + isAlphabetic);

        // isDigit()
        boolean isDigit = Character.isDigit('5');
        System.out.println("isDigit: " + isDigit);

        // isLowerCase()
        boolean isLowerCase = Character.isLowerCase('a');
        System.out.println("isLowerCase: " + isLowerCase);

        // isUpperCase()
        boolean isUpperCase = Character.isUpperCase('A');
        System.out.println("isUpperCase: " + isUpperCase);

        // isWhitespace()
        boolean isWhitespace = Character.isWhitespace(' ');
        System.out.println("isWhitespace: " + isWhitespace);

        // reverseBytes()
        char reversedBytes = Character.reverseBytes(ch);
        System.out.println("reversedBytes: " + reversedBytes);

        // toLowerCase()
        char toLowerCase = Character.toLowerCase('A');
        System.out.println("toLowerCase: " + toLowerCase);

        // toUpperCase()
        char toUpperCase = Character.toUpperCase('a');
        System.out.println("toUpperCase: " + toUpperCase);

        // toString()
        String toStringResult = Character.toString(ch);
        System.out.println("toStringResult: " + toStringResult);

        // valueOf()
        Character valueOfResult = Character.valueOf('A');
        System.out.println("valueOfResult: " + valueOfResult);
    }
}

