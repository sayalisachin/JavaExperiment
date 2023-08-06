package standard_code.wrapper_class.Boolean_Class;
/* In this example, we create two Boolean objects, booleanObj1 and booleanObj2, using valueOf method. Then, we demonstrate the usage of the mentioned Boolean class methods:

booleanValue(): Retrieve the primitive boolean value from the Boolean objects.
compare(): Compare two Boolean values.
compareTo(): Compare two Boolean instances.
equals(): Compare if two Boolean objects represent the same value.
getBoolean(): Retrieve the Boolean value of the system property.
hashCode(): Retrieve the hash code of the Boolean object.
logicalAnd(): Implement logical AND operation on boolean operands.
logicalOr(): Implement logical OR operation on boolean operands.
logicalXor(): Implement logical XOR operation on boolean operands.
parseBoolean(): Parse a string argument into a Boolean value.
toString(): Convert the Boolean object to a String.
valueOf(): Retrieve a Boolean object representing the specified Boolean or string value.
Each method is illustrated with a specific example, and the output is displayed using System.out.println() statements.

This example provides a comprehensive demonstration of the methods available in the Boolean class, showcasing their usage and functionality. */
public class BooleanExample {
    public static void main(String[] args) {
        Boolean booleanObj1 = Boolean.valueOf(true);
        Boolean booleanObj2 = Boolean.valueOf("false");

        // booleanValue()
        boolean booleanValue1 = booleanObj1.booleanValue();
        boolean booleanValue2 = booleanObj2.booleanValue();
        System.out.println("booleanValue1: " + booleanValue1);
        System.out.println("booleanValue2: " + booleanValue2);

        // compare()
        int compareResult = Boolean.compare(booleanObj1, booleanObj2);
        System.out.println("compareResult: " + compareResult);

        // compareTo()
        int compareToResult = booleanObj1.compareTo(booleanObj2);
        System.out.println("compareToResult: " + compareToResult);

        // equals()
        boolean equalsResult = booleanObj1.equals(booleanObj2);
        System.out.println("equalsResult: " + equalsResult);

        // getBoolean()
        boolean systemProperty = Boolean.getBoolean("java.version");
        System.out.println("systemProperty: " + systemProperty);

        // hashCode()
        int hashCodeResult = booleanObj1.hashCode();
        System.out.println("hashCodeResult: " + hashCodeResult);

        // logicalAnd()
        boolean logicalAndResult = Boolean.logicalAnd(booleanObj1, booleanObj2);
        System.out.println("logicalAndResult: " + logicalAndResult);

        // logicalOr()
        boolean logicalOrResult = Boolean.logicalOr(booleanObj1, booleanObj2);
        System.out.println("logicalOrResult: " + logicalOrResult);

        // logicalXor()
        boolean logicalXorResult = Boolean.logicalXor(booleanObj1, booleanObj2);
        System.out.println("logicalXorResult: " + logicalXorResult);

        // parseBoolean()
        boolean parsedBoolean = Boolean.parseBoolean("true");
        System.out.println("parsedBoolean: " + parsedBoolean);

        // toString()
        String toStringResult = booleanObj1.toString();
        System.out.println("toStringResult: " + toStringResult);

        // valueOf()
        Boolean valueOfResult1 = Boolean.valueOf(true);
        Boolean valueOfResult2 = Boolean.valueOf("false");
        System.out.println("valueOfResult1: " + valueOfResult1);
        System.out.println("valueOfResult2: " + valueOfResult2);
    }
}
