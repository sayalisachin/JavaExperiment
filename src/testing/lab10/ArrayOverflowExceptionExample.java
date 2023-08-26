package testing.lab10;
public class ArrayOverflowExceptionExample {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 };

        try {
            // Trying to access an element that is out of bounds
            int value = numbers[3];
            System.out.println("Value at index 3: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
