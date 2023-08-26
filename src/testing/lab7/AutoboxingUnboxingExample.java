package testing.lab7;

public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        // Autoboxing: Converting primitive to wrapper
        int primitiveInt = 42;
        Integer wrappedInt = primitiveInt; // Autoboxing

        System.out.println("Autoboxing:");
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);

        // Unboxing: Converting wrapper to primitive
        Double wrapperDouble = 3.14;
        double primitiveDouble = wrapperDouble; // Unboxing

        System.out.println("\nUnboxing:");
        System.out.println("Wrapped Double: " + wrapperDouble);
        System.out.println("Primitive double: " + primitiveDouble);
    }
}
